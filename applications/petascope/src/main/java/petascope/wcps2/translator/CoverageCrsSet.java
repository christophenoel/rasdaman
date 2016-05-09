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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import petascope.wcps2.parse.treenode.IMetaParseTreeNode;

/**
 * Translator class for CrsSet of the coverage (e.g list all coverage's axis CRS
 * from crsSet($c))
 *
 * <code>
 * for c in (mr), d in (rgb) return crsSet(c)
 * </code>
 *
 * <code>
 * i:http://localhost:8080/def/crs/OGC/0/Index2D CRS:1
 * j:http://localhost:8080/def/crs/OGC/0/Index2D CRS:1
 * </code>
 *
 * @author <a href="mailto:bphamhuu@jacobs-university.de">Bang Pham Huu</a>
 */
public class CoverageCrsSet extends IMetaParseTreeNode {

    /**
     * Constructor for the class
     *
     * @param coverageVariableName the coverage variable name (e.g: $c)
     */
    public CoverageCrsSet(String coverageVariableName) {
        this.coverageVariableName = coverageVariableName;
    }

    @Override
    public String getResult() {
        String result = "";
        // This need to be calculated in CoverageCrsSetProcessor
        // Return the String which contains: axis:its crs set. 
        int i = 0;
        for (Map.Entry<String, List<String>> entry : coverageAxesCrsSet.entrySet()) {
            String axisLabel = entry.getKey();
            result += axisLabel + ":";
            List<String> axisCrsSet = entry.getValue();
            int j = 0;
            for (String crs : axisCrsSet) {
                result += crs;
                if (j < axisCrsSet.size() - 1) {
                    result += " ";
                }
                j++;
            }
            // Concatinate with "," until the last entry
            if (i < coverageAxesCrsSet.entrySet().size() - 1) {
                result += ", ";
            }
            i++;
        }

        return result.trim();
    }

    /**
     * Return coverage variable name (e.g: $c)
     *
     * @return String
     */
    public String getCoverageVariableName() {
        return coverageVariableName;
    }

    /**
     * Return the coverage's axes crs set
     *
     * @return HashMap<String, List<String>> list Crs belonged to each axe
     */
    public HashMap<String, List<String>> getCoverageAxesCrsSet() {
        return coverageAxesCrsSet;
    }

    /**
     * Set the coverage's axes crs set
     *
     * @param coverageAxesCrsSet HashMap<String, List<String>>
     */
    public void setCoverageAxesCrsSet(HashMap<String, List<String>> coverageAxesCrsSet) {
        this.coverageAxesCrsSet = coverageAxesCrsSet;
    }
    // Axis Label and its crs set
    private HashMap<String, List<String>> coverageAxesCrsSet;
    private final String coverageVariableName;
}