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

import petascope.wcps2.metadata.Coverage;
import petascope.wcps2.parse.treenode.IMetaParseTreeNode;

/**
 * Translator class for Identifier of the coverage (e.g coverage's name from
 * identifier($c))
 *
 * <code>
 * for c in (mr), d in (rgb) return identifier(c)
 * </code> 
 * 
 * <code>
 * mr
 * </code>
 *
 * @author <a href="mailto:bphamhuux@jacobs-university.de">Bang Pham Huu</a>
 */
public class CoverageIdentifier extends IMetaParseTreeNode {

    /**
     * Constructor for the class
     *
     * @param coverageVariableName the coverage variable name (e.g: $c)
     */
    public CoverageIdentifier(String coverageVariableName) {
        this.coverageVariableName = coverageVariableName;
    }

    @Override
    public String getResult() {
        // This need to be calculated in CoverageIdentifierProcessor
        return this.coverageIdentifier;
    }
    
    /**
     * Return coverage variable name (e.g: $c)
     * @return String
     */
    public String getCoverageVariableName()
    {
        return coverageVariableName;
    }
    
    /**
     * Set the coverage identifier from processor
     * @param coverageIdentifier 
     */
    public void setCoverageIdentifier(String coverageIdentifier)
    {
        this.coverageIdentifier = coverageIdentifier;
    }
    
    /**
     * Get the coverage identifier
     * @return coverage identifier
     */
    public String getCoverageIdentifier()
    {
        return this.coverageIdentifier;
    }

    private final String coverageVariableName;
    private String coverageIdentifier;

}