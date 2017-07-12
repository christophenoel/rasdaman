"""
 *
 * This file is part of rasdaman community.
 *
 * Rasdaman community is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Rasdaman community is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU  General Public License for more details.
 *
 * You should have received a copy of the GNU  General Public License
 * along with rasdaman community.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2003 - 2015 Peter Baumann / rasdaman GmbH.
 *
 * For more information please see <http://www.rasdaman.org>
 * or contact Peter Baumann via <baumann@rasdaman.com>.
 *
"""
import copy
import pygrib
from lib import arrow
from util.time_util import DateTimeUtil
from util import list_util
from master.evaluator.evaluator_slice import GribMessageEvaluatorSlice
from master.evaluator.sentence_evaluator import SentenceEvaluator
from master.helper.point_pixel_adjuster import PointPixelAdjuster
from master.helper.user_axis import UserAxisType
from master.helper.user_axis import UserAxis
from master.helper.user_band import UserBand
from master.importer.axis_subset import AxisSubset
from master.importer.interval import Interval
from master.importer.slice import Slice
from master.provider.data.file_data_provider import FileDataProvider
from master.provider.metadata.coverage_axis import CoverageAxis
from master.provider.metadata.grid_axis import GridAxis
from master.provider.metadata.irregular_axis import IrregularAxis
from master.provider.metadata.regular_axis import RegularAxis
from master.helper.regular_user_axis import RegularUserAxis
from recipes.general_coverage.abstract_to_coverage_converter import AbstractToCoverageConverter
from master.error.runtime_exception import RuntimeException
from util.crs_util import CRSAxis
from util.file_obj import File


class GRIBMessage:
    def __init__(self, id, axes, message):
        """
        A representation of a grib message
        :param int id: the id of the message
        :param list[UserAxis] axes: the axes corresponding to this message
        :param pygrib.message message: the message as a pygrib data structure
        """
        self.id = id
        self.axes = axes
        self.message = message

    def to_json(self):
        """
        Translates the message to the petascope expected json dict
        :rtype: dict
        """
        axes = []
        for axis in self.axes:
            axes.append(axis.to_json())
        return {
            "messageId": self.id,
            "axes": axes
        }


class GRIBToCoverageConverter(AbstractToCoverageConverter):
    DEFAULT_DATA_TYPE = "Float64"
    MIMETYPE = "application/grib"
    RECIPE_TYPE = "grib"

    def __init__(self, recipe_type, sentence_evaluator, coverage_id, bands, files, crs, user_axes, tiling,
                 global_metadata_fields, local_metadata_fields, bands_metadata_fields, axes_metadata_fields,
                 metadata_type,
                 grid_coverage, pixel_is_point):
        """
        Converts a grib list of files to a coverage
        :param recipe_type: the type of recipe
        :param SentenceEvaluator sentence_evaluator: the evaluator for wcst sentences
        :param str coverage_id: the id of the coverage
        :param list[UserBand] bands: the name of the coverage band
        :param list[File] files: a list of grib files
        :param str crs: the crs of the coverage
        :param list[UserAxis] user_axes: a list with user axes
        :param str tiling: the tiling string to be passed to wcst
        :param dict global_metadata_fields: the global metadata fields
        :param dict local_metadata_fields: the local metadata fields
        :param dict bands_metadata_fields: the bands metadata fields
        :param dict axes_metadata_fields: the axes metadata fields
        :param str metadata_type: the metadata type
        :param boolean grid_coverage: check if user want to import grid coverage
        :param boolean pixel_is_point: check if netCDF should be adjusted by +/- 0.5 * resolution for each regular axes
        """
        AbstractToCoverageConverter.__init__(self, recipe_type, sentence_evaluator)
        self.sentence_evaluator = sentence_evaluator
        self.coverage_id = coverage_id
        self.bands = bands
        self.files = files
        self.crs = crs
        self.user_axes = user_axes
        self.tiling = tiling
        self.global_metadata_fields = global_metadata_fields
        self.local_metadata_fields = local_metadata_fields
        self.bands_metadata_fields = bands_metadata_fields
        self.axes_metadata_fields = axes_metadata_fields
        self.metadata_type = metadata_type
        self.grid_coverage = grid_coverage
        self.pixel_is_point = pixel_is_point

    def _file_band_nil_values(self, index):
        """
        This is used to get the null values (Only 1) from the given band index if one exists when nilValue was not defined
        in ingredient file
        :param integer index: the current band index to get the nilValues (GRIB seems only support 1 band)
        :rtype: List[RangeTypeNilValue] with only 1 element
        """
        if len(self.files) < 1:
            raise RuntimeException("No files to import were specified.")

        # NOTE: all files should have same bands's metadata
        dataset = pygrib.open(self.files[0].filepath)
        try:
            nil_value = dataset.message(1)["missingValue"]
        except KeyError:
            # missingValue is not defined in grib file
            nil_value = None

        if nil_value is None:
            return None
        else:
            return [nil_value]

    def _evaluated_messages_to_dict(self, evaluated_messages):
        """
        Converts a list of messages to json friendly data structure
        :param list[GRIBMessage] evaluated_messages: the messages to convert
        :rtype: list[dict]
        """
        out_messages = []
        for message in evaluated_messages:
            for user_axis in message.axes:
                # Translate time axis in to ISO date as Petascope will only parse dateTime format
                if user_axis.type == UserAxisType.DATE:
                    user_axis.interval.low = DateTimeUtil.get_datetime_iso(user_axis.interval.low)
                    if user_axis.interval.high is not None:
                        user_axis.interval.high = DateTimeUtil.get_datetime_iso(user_axis.interval.high)

            out_messages.append(message.to_json())
        return out_messages

    def _evaluated_messages(self, grib_file):
        """
        Returns the evaluated_messages for all grib_messages
        :param File grib_file: the grib file for which to return the evaluated_messages
        :rtype: list[GRIBMessage]
        """
        dataset = pygrib.open(grib_file.get_filepath())
        evaluated_messages = []
        # Message id starts with "1"
        for i in range(1, dataset.messages + 1):
            grib_message = dataset.message(i)
            axes = []
            # Iterate all the axes and evaluate them with message
            # e.g: Long axis: ${grib:longitudeOfFirstGridPointInDegrees}
            #      Lat axis: ${grib:latitudeOfLastGridPointInDegrees}
            # Message 1 return: Long: -180, Lat: 90
            # Message 2 return: Long: -170, Lat: 80
            # ...
            # Message 20 return: Long: 180, Lat: -90
            for user_axis in self.user_axes:
                # find the crs_axis which are used to evaluate the user_axis (have same name)
                crs_axis = self._get_crs_axis_by_user_axis_name(user_axis.name)

                # NOTE: directPositions could be retrieved only when every message evaluated to get values for axis
                # e.g: message 1 has value: 0, message 3 has value: 2, message 5 has value: 8,...message 20 value: 30
                # then, the directPositions of axis is [0, 2, 8,...30]
                # the syntax to retrieve directions in ingredient file is: ${grib:axis:axis_name}
                # with axis_name is the name user defined (e.g: AnsiDate?axis-label="time" then axis name is: time)
                evaluated_user_axis = self._user_axis(user_axis, GribMessageEvaluatorSlice(grib_message, grib_file))

                # When pixelIsPoint:true then it will be adjusted by half pixels for min, max internally (recommended)
                if self.pixel_is_point is True:
                    PointPixelAdjuster.adjust_axis_bounds_to_continuous_space(evaluated_user_axis, crs_axis)
                else:
                    # translate the dateTime format to float
                    if evaluated_user_axis.type == UserAxisType.DATE:
                        evaluated_user_axis.interval.low = arrow.get(evaluated_user_axis.interval.low).float_timestamp
                        if evaluated_user_axis.interval.high:
                            evaluated_user_axis.interval.high = arrow.get(evaluated_user_axis.interval.high).float_timestamp
                    # if low < high, adjust it
                    if evaluated_user_axis.interval.high is not None \
                        and evaluated_user_axis.interval.low > evaluated_user_axis.interval.high:
                        evaluated_user_axis.interval.low, evaluated_user_axis.interval.high = evaluated_user_axis.interval.high, evaluated_user_axis.interval.low

                axes.append(evaluated_user_axis)
            evaluated_messages.append(GRIBMessage(i, axes, grib_message))

        return evaluated_messages

    def _axis_subset(self, grib_file, evaluated_messages, crs_axis):
        """
        Returns an axis subset using the given crs axis in the context of the grib file
        :param File grib_file: the current grib file (slice) is evaluated
        :param List[GirbMessages] evaluated_messages: all Grib messages was evaluated
        :param CRSAxis crs_axis: the crs definition of the axis
        :rtype AxisSubset
        """
        # first grib message from grib file, used to extract grib variables only
        dataset = pygrib.open(grib_file.get_filepath())
        first_grib_message = dataset.message(1)

        # As all the messages contain same axes (but different intervals), so first message is ok to get user_axis
        first_user_axis = self._get_user_axis_in_evaluated_message(evaluated_messages[0], crs_axis.label)
        # NOTE: we don't want to change this user_axis belongs to messages, so clone it
        user_axis = copy.deepcopy(first_user_axis)
        # Then, we calculate the geo, grid bounds, origin, resolution of this axis for the slice
        self._set_low_high(evaluated_messages, user_axis)

        high = user_axis.interval.high if user_axis.interval.high else user_axis.interval.low
        origin = PointPixelAdjuster.get_origin(user_axis, crs_axis)

        if isinstance(user_axis, RegularUserAxis):
            geo_axis = RegularAxis(crs_axis.label, crs_axis.uom, user_axis.interval.low, high, origin, crs_axis)
        else:
            # after all messages was evaluated, we could get the direct_positions of the axis as in netcdf
            # then, it can evaluate the grib sentence normally, e.g: ${grib:axis:level} + 5
            evaluating_sentence = user_axis.directPositions
            direct_positions = self._get_axis_values(evaluated_messages, user_axis)
            # convert all of values in the list to string then it can be evaluated
            direct_positions = list_util.to_list_string(direct_positions)
            evaluator_slice = GribMessageEvaluatorSlice(first_grib_message, grib_file, direct_positions)
            user_axis.directPositions = self.sentence_evaluator.evaluate(evaluating_sentence, evaluator_slice)

            # axis is datetime
            if user_axis.type == UserAxisType.DATE:
                if crs_axis.is_uom_day():
                    coefficients = self._translate_day_date_direct_position_to_coefficients(user_axis.interval.low,
                                                                                            user_axis.directPositions)
                else:
                    coefficients = self._translate_seconds_date_direct_position_to_coefficients(user_axis.interval.low,
                                                                                                user_axis.directPositions)
            else:
                # number axis like Index1D
                coefficients = self._translate_number_direct_position_to_coefficients(user_axis.interval.low,
                                                                                      user_axis.directPositions)
            geo_axis = IrregularAxis(crs_axis.label, crs_axis.uom, user_axis.interval.low, high, origin,
                                     coefficients, crs_axis)
        grid_low = 0
        grid_high = PointPixelAdjuster.get_grid_points(user_axis, crs_axis)
        # NOTE: Grid Coverage uses the direct intervals as in Rasdaman
        if self.grid_coverage is False and grid_high > grid_low:
            grid_high -= 1
        grid_axis = GridAxis(user_axis.order, crs_axis.label, user_axis.resolution, grid_low, grid_high)
        if user_axis.type == UserAxisType.DATE:
            self._translate_decimal_to_datetime(user_axis, geo_axis)

        return AxisSubset(CoverageAxis(geo_axis, grid_axis, user_axis.dataBound),
                                       Interval(user_axis.interval.low, user_axis.interval.high))

    def _set_low_high(self, messages, user_axis):
        """
        Set the (geo) low, highfor an axis in the context of a grib file
        :param list[GRIBMessage] messages: a list of messages represented by a list of user axes
        :param UserAxis user_axis: the user_axis need to calculate these values
        :param CrsAxis crs_axis: the crs which is set to the axis (e.g: lat:epsg:4326, t:ansidate)
        """
        values = self._get_axis_values(messages, user_axis)
        low = values[0]
        high = values[len(values) - 1]

        user_axis.interval.low = low
        user_axis.interval.high = high

    def _get_axis_values(self, messages, user_axis):
        """
        Return all the different values from user_axis by iterating all messages from message id: 1 ... n
        NOTE: it is also the direct_positions (i.e: the list of different values for irregular axis) from messages
        :param list[GRIBMessage] messages: the evaluated messages
        :param UserAxis user_axis: the irregular user_axis to get the list of positions
        :return: list of values
        """
        # only store the different values of axis for all messages (i.e: find the min,.....,max value from each axis)
        values = []
        for message in messages:
            for axis in message.axes:
                if axis.name == user_axis.name:
                    low = axis.interval.low
                    if low not in values:
                        values.append(low)
                    if axis.interval.high:
                        high = axis.interval.high
                        if high not in values:
                            values.append(high)

        # make sure no values are incorrect order (i.e: max,..,min) which is not supported for coefficients
        values.sort()

        return values

    def _get_user_axis_in_evaluated_message(self, message, crs_axis_name):
        """
        Get the user_axis from first message by axis_name
        :param Grib_Message message: first evaulated message
        :param Str crs_axis_name: Crs axis name (e.g: lat, lon, time)
        :return: User_Axis user_axis
        """
        for user_axis in message.axes:
            if user_axis.name == crs_axis_name:
                return user_axis

    def _data_type(self):
        """
        Returns the data type for this grib dataset
        :rtype: str
        """
        # TODO: it does not have a way to get the data type of grib, yet, so use the default float64 as before
        return self.DEFAULT_DATA_TYPE

    def _slice(self, grib_file, crs_axes):
        """
        Returns a slice for a grib file
        :param File grib_file: the path to the grib file
        :param list[CRSAxis] crs_axes: the crs axes for the coverage
        :rtype: Slice
        """
        evaluated_messages = self._evaluated_messages(grib_file)
        axis_subsets = []

        # Build slice for grib files which contains all the axes (i.e: min, max, origin, resolution of geo, grid bounds)
        for i in range(0, len(crs_axes)):
            crs_axis = crs_axes[i]
            axis_subset = self._axis_subset(grib_file, evaluated_messages, crs_axis)
            axis_subsets.append(axis_subset)

        return Slice(axis_subsets, FileDataProvider(grib_file, self._evaluated_messages_to_dict(evaluated_messages), self.MIMETYPE))
