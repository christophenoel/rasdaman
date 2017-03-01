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
package petascope.wcs2.parsers;

import java.util.List;
import nu.xom.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import petascope.HTTPRequest;
import petascope.exceptions.WCSException;
import static petascope.util.XMLSymbols.*;
import static petascope.util.XMLUtil.*;
import petascope.wcs2.handlers.RequestHandler;
import petascope.ConfigManager;
import petascope.exceptions.ExceptionCode;
import static petascope.util.KVPSymbols.KEY_COVERAGEID;

/**
 * Parse a GetCapabilities XML request.
 *
 * @author <a href="mailto:d.misev@jacobs-university.de">Dimitar Misev</a>
 */
public class XMLDescribeCoverageParser extends XMLParser<DescribeCoverageRequest> {

    Logger log = LoggerFactory.getLogger(XMLDescribeCoverageParser.class);

    @Override
    public DescribeCoverageRequest parse(HTTPRequest request) throws WCSException {

        // input XML validation
        if (ConfigManager.XML_VALIDATION) {
            validateInput(request.getRequestString(), schema);
        }

        // parsing
        Element root = parseInput(request.getRequestString());
        List<Element> coverageIds = collectAll(root, PREFIX_WCS,
                                               LABEL_COVERAGE_ID, CTX_WCS);
        if (coverageIds.isEmpty()) {
            log.error("Missing required " + LABEL_COVERAGE_ID + " element in request.");
            throw new WCSException(ExceptionCode.InvalidRequest, "A DescribeCoverage request must specify at least one " + KEY_COVERAGEID + ".");
        }
        DescribeCoverageRequest ret = new DescribeCoverageRequest();
        for (Element coverageId : coverageIds) {
            ret.getCoverageIds().add(getText(coverageId));
        }
        return ret;
    }

    @Override
    public String getOperationName() {
        return RequestHandler.DESCRIBE_COVERAGE;
    }
}
