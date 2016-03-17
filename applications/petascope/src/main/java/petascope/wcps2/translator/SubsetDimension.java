/*
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
 * Copyright 2003 - 2014 Peter Baumann / rasdaman GmbH.
 *
 * For more information please see <http://www.rasdaman.org>
 * or contact Peter Baumann via <baumann@rasdaman.com>.
 */
package petascope.wcps2.translator;

import petascope.wcps2.error.managed.processing.InvalidSlicingException;
import petascope.wcps2.metadata.Subset;
import petascope.wcps2.parse.treenode.IRasqlParseTreeNode;
import static petascope.wcs2.parsers.subsets.DimensionSubset.ASTERISK;

/**
 * Class to translate trimming or slicing operations to rasql  <code>
 * x,http://crs.com/def/ESPG4236(4.56:2.32)
 * </code> translates to  <code>
 * 4.56:2.32
 * </code>
 *
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 * @author <a href="mailto:b.phamhuu@jacobs-university.de">Bang Pham Huu</a>
 */
public class SubsetDimension extends IRasqlParseTreeNode implements Comparable {
    /**
    * Constructor for the trimming of class
    *
     * @param axisName the name of the axis on which the trim operation is made
     * @param crs the crs of the subset
     * @param rawLowerBound the lower bound of the trim interval
     * @param rawUpperBound the upper bound of the interval
     */
    public SubsetDimension(String axisName, String crs, CoverageExpression rawLowerBound, CoverageExpression rawUpperBound) {
        this.rawLowerBound = rawLowerBound;
        this.rawUpperBound = rawUpperBound;
        this.axisName = axisName;
        this.crs = crs;
        this.rawSubset = new Subset<String>(rawLowerBound.toRasql(), rawUpperBound.toRasql());
        this.subset = new Subset<Long>(Long.MAX_VALUE, Long.MAX_VALUE);
        addChild(rawLowerBound);
        addChild(rawUpperBound);
    }

    /**
     * Constructor for the slicing of class
     *
     * @param axisName the name of the axis on which the trim operation is made
     * @param crs the crs of the subset
     * @param rawSlicingBound slicing coordinate
     * @throws petascope.wcps2.error.managed.processing.InvalidSlicingException
     */
    public SubsetDimension(String axisName, String crs, CoverageExpression rawSlicingBound) throws InvalidSlicingException {
        // Return a new Slicing
        if (rawSlicingBound instanceof StringScalar) {
            StringScalar s = (StringScalar) rawSlicingBound;
            String slicingPoint = s.toRasql();
            if (slicingPoint.equals(ASTERISK)) {
                throw new InvalidSlicingException(axisName, ASTERISK);
            }
        }
        this.axisName = axisName;
        this.crs = crs;
        this.rawSlicingBound = rawSlicingBound;
        this.rawSubset = new Subset<String>(rawSlicingBound.toRasql());
        this.subset = new Subset<Long>(Long.MAX_VALUE);
        addChild(rawSlicingBound);
    }

    /**
     * Returns the raw subset (trimming/slicing)
     *
     * @return
     */
    public Subset<String> getRawSubset() {
        return rawSubset;
    }

    /**
     * Sets the numeric subset (trimming/slicing)
     *
     * @param subset
     */
    public void setSubset(Subset<Long> subset) {
        this.subset = subset;
    }

    /**
     * Returns the axis on which the trim interval is being done
     *
     * @return
     */
    public String getAxisName() {
        return axisName;
    }

    public void setAxisName(String axisName) {
        this.axisName = axisName;
    }

    /**
     * Sets the corresponding array subset position for this coverage axis
     *
     * @return the position in the array subset of this axis
     */
    public int getAxisPosition() {
        return axisPosition;
    }

    /**
     * Sets the corresponding array subset position for this coverage axis
     *
     * @param axisPosition the position in the array subset of this axis
     */
    public void setAxisPosition(int axisPosition) {
        this.axisPosition = axisPosition;
    }

    /**
     * Returns the crs of the trim interval
     *
     * @return
     */
    public String getCrs() {
        return crs;
    }

    /**
     * Compares two trim dimension intervals based on their axis order
     */
    @Override
    public int compareTo(Object o) {
        SubsetDimension other = (SubsetDimension) o;

        if (getAxisPosition() > other.getAxisPosition()) {
            return 1;
        } else if (getAxisPosition() == other.getAxisPosition()) {
            return 0;
        }
        return -1;
    }

    @Override
    public String toRasql() {

        if (rawSubset.isTrimming()) {
            String lowerLimit;
            String upperLimit;
            if (rawSubset.isCrsComputable()) {
                //numeric interval (which is calculated correctly in class CrsComputer)
                lowerLimit = String.valueOf(subset.getLowerLimit());
                upperLimit = String.valueOf(subset.getUpperLimit());
            } else {
                //non-numeric interval, just pass the limits as the evaluation result of the coverage expressions they represent
                lowerLimit = rawLowerBound.toRasql();
                upperLimit = rawUpperBound.toRasql();
            }

            return fillTemplate(lowerLimit, upperLimit);
        } // else it is slicing point then only returns [lo]
        else {
            String slicingCoordinate;
            if (rawSubset.isCrsComputable()) {
                //numeric slicing (which is calculated correctly in class CrsComputer)
                slicingCoordinate = String.valueOf(subset.getSlicingCoordinate());
            } else {
                slicingCoordinate = rawSlicingBound.toRasql();
            }
            return fillTemplate(slicingCoordinate);
        }
    }

    @Override
    protected String nodeInformation() {
        if (rawSubset.isTrimming()) {
            return new StringBuilder("(").append(rawSubset.getLowerLimit()).append(":").append(rawSubset.getUpperLimit()).append(")").toString();
        } else {
            return new StringBuilder("(").append(rawSubset.getSlicingCoordinate()).append(")").toString();
        }
    }

    /**
     * Fills the right template and returns the result. this will return [lo:hi]
     *
     * @param lowerBound
     * @param upperBound
     * @return
     */
    private static String fillTemplate(String lowerBound, String upperBound) {
        return TEMPLATE.replace("$lowerBound", lowerBound)
                .replace("$upperBound", upperBound);
    }

    /**
     * Fills the right template and returns the result. this will return [lo]
     *
     * @param slicingPoint
     * @return
     */
    private static String fillTemplate(String slicingPoint) {
        return TEMPLATE_POINT.replace("$lowerBound", slicingPoint);
    }

    public static final String WHOLE_DIMENSION_SYMBOL = "*";

    private CoverageExpression rawLowerBound;
    private CoverageExpression rawUpperBound;
    private CoverageExpression rawSlicingBound;
    private int axisPosition = Integer.MAX_VALUE;
    private String axisName;
    private final String crs;
    private Subset<String> rawSubset;
    private Subset<Long> subset;
    private final static String TEMPLATE = "$lowerBound:$upperBound";
    private final static String TEMPLATE_POINT = "$lowerBound";
}