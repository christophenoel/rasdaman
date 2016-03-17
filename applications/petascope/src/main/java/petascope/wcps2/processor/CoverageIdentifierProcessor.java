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

import java.util.List;
import petascope.wcps2.error.managed.processing.CoverageIdentifierNotFoundException;
import petascope.wcps2.metadata.CoverageRegistry;
import petascope.wcps2.translator.CoverageIdentifier;
import petascope.wcps2.translator.ForClause;
import petascope.wcps2.parse.treenode.IParseTreeNode;

/**
 * Get coverage identifier from coverage variable name in ForClauseList e.g (for
 * c in (mr), d in (rgb) return identifier(c)) = mr;
 *
 * @author <a href="bphamhuu@jacobs-university.de">Bang Pham Huu</a>
 */
public class CoverageIdentifierProcessor implements IProcessor {

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
        CoverageIdentifier coverageIdentifier = (CoverageIdentifier) currentNode;
        // Iterate the List and compare with ForClause'coverageIterator with CoverageIdentifier.getCoverageVariableName()
        for (IParseTreeNode node : nodes) {
            if (node instanceof ForClause) {
                ForClause forClauseNode = (ForClause) node;
                // Check if forClause has iterator same name as CoverageIdentifier's coverage variable name
                if (forClauseNode.getCoverageIterator().equals(coverageIdentifier.getCoverageVariableName())) {
                    // Set coverage's name to CoverageIdentifier
                    coverageIdentifier.setCoverageIdentifier(forClauseNode.getCoverageName());
                    return;
                }
            }
        }

        // If cannot find any same iterator with coverage variable name then throw an exception
        throw new CoverageIdentifierNotFoundException(coverageIdentifier.getCoverageVariableName());
    }

    public boolean canProcess(IParseTreeNode currentNode) {
        if (currentNode instanceof CoverageIdentifier) {
            return true;
        }
        return false;
    }
}