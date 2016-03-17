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
 * Copyright 2003 - 2016 Peter Baumann / rasdaman GmbH.
 *
 * For more information please see <http://www.rasdaman.org>
 * or contact Peter Baumann via <baumann@rasdaman.com>.
 */
package petascope.wcps2.translator;

import petascope.wcps2.parse.treenode.IMetaParseTreeNode;
import petascope.wcps2.parse.treenode.IParseTreeNode;
import petascope.wcps2.parse.treenode.IRasqlParseTreeNode;

/**
 * Translation node from wcps to rasql for the return clause.
 * Example:
 * <code>
 * return $c1 + $c2
 * </code>
 * translates to
 * <code>
 * SELECT c1 + c2
 * </code>
 *
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 */
public class ReturnClause extends IParseTreeNode {

    public ReturnClause(IParseTreeNode processingExpr) {
        this.processingExpr = processingExpr;
        addChild(processingExpr);
    }

    /**
     * Result can be translated to *Rasql* or get Meta *Result* based on the type of *processingExpr*
     * @return String
     */
    public String getRasqlOrResult()
    {
        String value;
        // Default it should return *Rasql*
        if(isReturnRasql()) {
            value = toRasql();
        }
        // In some cases, it should return *Meta value*
        else {
            value = getResult();
        }
        return value;
    }

    /**
     * Check if the WCPS query should return *Rasql* or get Meta *Result*, default return true
     * NOTE: if need to check other cases to return 'Result' then add it in here
     * @return boolean
     */
    public boolean isReturnRasql()
    {
        // identifier(c) = mr
        if(this.processingExpr instanceof CoverageIdentifier) {
            return false;
        }
        return true;
    }

    // This function will return *Rasql* in "return clause"
    private String toRasql() {
        String template = TEMPLATE_RASQL.replace("$processingExpression", ((IRasqlParseTreeNode)this.processingExpr).toRasql());
        return template;
    }

    // This function will return *Meta value*
    private String getResult() {
        String template = TEMPLATE_META_VALUE.replace("$returnValue", ((IMetaParseTreeNode)this.processingExpr).getResult());
        return template;
    }

    /**
     * Return the processing expression in ReturnClause
     * @return IParseTreeNode
     */
    public IParseTreeNode getProcessingExpr()
    {
        return processingExpr;
    }

    private IParseTreeNode processingExpr;
    private String TEMPLATE_RASQL = "SELECT $processingExpression ";
    private String TEMPLATE_META_VALUE = "$returnValue";
}
