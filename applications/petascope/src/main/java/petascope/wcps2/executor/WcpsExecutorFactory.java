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

package petascope.wcps2.executor;

import petascope.wcps.grammar.IParseTreeNode;
import petascope.wcps2.error.managed.processing.WCPSProcessingError;
import petascope.wcps2.result.WCPSMetaResult;
import petascope.wcps2.result.WCPSRasqlResult;
import petascope.wcps2.result.WCPSResult;

/**
 * Executor Factory for WcpsMetaExecutor and WcpsRasqlExecutor
 *
 * @author <a href="mailto:bphamhuux@jacobs-university.de">Bang Pham Huu</a>
 */
public class WcpsExecutorFactory {

    public static WcpsExecutor getExecutor(WCPSResult query) {
        // Get result from meta value
        if (query instanceof WCPSMetaResult) {
            return new WcpsMetaExecutor((WCPSMetaResult) query);
        } // Execute Rasql and get the value
        else if (query instanceof WCPSRasqlResult) {
            return new WcpsRasqlExecutor((WCPSRasqlResult) query);
        } else {
            throw new WCPSProcessingError("Cannot get the executor to get the result from translated tree.");
        }
    }
}