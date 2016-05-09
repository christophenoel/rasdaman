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
package petascope.wcps2.processor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import petascope.wcps.metadata.CoverageInfo;
import petascope.wcps.metadata.DomainElement;
import petascope.wcps2.error.managed.processing.CoverageIdentifierNotFoundException;
import petascope.wcps2.metadata.Coverage;
import petascope.wcps2.metadata.CoverageRegistry;
import petascope.wcps2.translator.ForClause;
import petascope.wcps2.parse.treenode.IParseTreeNode;
import petascope.wcps2.translator.CoverageCrsSet;

/**
 * Get coverage's axes crs set in ForClauseList e.g (for
 * c in (mr), d in (rgb) return crsSet(c));
 *
 * returns:
 * i:http://localhost:8080/def/crs/OGC/0/Index2D CRS:1,
 * j:http://localhost:8080/def/crs/OGC/0/Index2D CRS:1
 *
 * @author <a href="mailto:b.phamhuu@jacobs-university.net">Bang Pham Huu</a>
 */
public class CoverageCrsSetProcessor implements IProcessor {

    /**
     * Get the coverage name (e.g: mr) from ForClauseList by coverage variable
     * name (e.g: $c)
     *
     * @param translationTree
     * @param currentNode
     * @param nodes
     * @param coverageRegistry
     */
    public void process(IParseTreeNode translationTree, IParseTreeNode currentNode, CoverageRegistry coverageRegistry) {
        // Get all the childrens of the tree
        List<IParseTreeNode> nodes = translationTree.getDescendants();
        CoverageCrsSet coverageCrsSet = (CoverageCrsSet) currentNode;
        // Iterate the List and compare with ForClause'coverageIterator with CoverageCrsSet.getCoverageVariableName()
        for (IParseTreeNode node : nodes) {
            if (node instanceof ForClause) {
                ForClause forClauseNode = (ForClause) node;
                // Check if forClause has iterator same name as CoverageCrsSet's coverage variable name
                if (forClauseNode.getCoverageIterator().equals(coverageCrsSet.getCoverageVariableName())) {
                    // Return coverage by coverage's name
                    Coverage coverage = coverageRegistry.lookupCoverage(forClauseNode.getCoverageName());
                    CoverageInfo coverageInfo = coverage.getCoverageInfo();
                    List<DomainElement> domains = coverageInfo.getDomains();

                    // Iterate domains and get all the axis labels and its crs set
                    LinkedHashMap<String, List<String>> crsSet = new LinkedHashMap<String, List<String>>();

                    // Note: we need to put in order of axis (time, Long (X), Lat (Y))
                    for(int i = 0; i < domains.size(); i++) {
                        if(domains.get(i).getType().equals("t")) {
                            crsSet.put(domains.get(i).getLabel(), domains.get(i).getCrsSet());
                            break;
                        }
                    }
                    // Then add the other axis type in the normal oder
                    for(DomainElement element : domains)
                    {
                        if(!element.getType().equals("t")) {
                            crsSet.put(element.getLabel(), element.getCrsSet());
                        }
                    }

                    // When fetched all the axis labels and their crs sets and set it to object CoverageCrsSet
                    coverageCrsSet.setCoverageAxesCrsSet(crsSet);
                    return;
                }
            }
        }

        // If cannot find any same iterator with coverage variable name then throw an exception
        throw new CoverageIdentifierNotFoundException(coverageCrsSet.getCoverageVariableName());
    }

    public boolean canProcess(IParseTreeNode currentNode) {
        if (currentNode instanceof CoverageCrsSet) {
            return true;
        }
        return false;
    }
}