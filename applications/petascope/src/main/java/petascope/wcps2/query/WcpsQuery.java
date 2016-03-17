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
package petascope.wcps2.query;

import petascope.wcps2.parse.treenode.IParseTreeNode;
import petascope.wcps2.parse.treenode.IRasqlParseTreeNode;
import petascope.wcps2.translator.ForClauseList;
import petascope.wcps2.translator.ReturnClause;
import petascope.wcps2.translator.WhereClause;

/**
 * Translation node from wcps to rasql.
 * Example:
 * <code>
 * for $c1 in cov1 for $c2 in cov 2 return encode($c1 + $c2, "csv")
 * </code>
 * 
 * translates to
 * 
 * <code>
 * SELECT csv(c1 + c2) FROM cov1 as c1, cov2 as c2
 * </code>
 *
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 */
public class WcpsQuery extends IRasqlParseTreeNode{

    public WcpsQuery(ForClauseList forClauseList, WhereClause whereClause, ReturnClause returnClause) {
        this.forClauseList = forClauseList;
        this.whereClause = whereClause;
        this.returnClause = returnClause;
        addChild(forClauseList);
        if (whereClause != null) {
            addChild(whereClause);
        }
        addChild(returnClause);
    }

    @Override
    public String toRasql() {
        //SELECT c1+c2
        //NOTE: return clause can be *Rasql* or *Meta value* result
        String  template = this.returnClause.getRasqlOrResult();
        //FROM cov1 as c1, cov2 as c2
        template = template.concat(forClauseList.toRasql());
        //append where if exists
        if (this.whereClause != null) {
            template = template.concat(this.whereClause.toRasql());
        }
        return template;
    }


    /**
     * Get the ReturnClause to handle in WcpsTranslator
     * @return ReturnClause
     */
    public ReturnClause getReturnClause()
    {
        return this.returnClause;
    }

    /**
     * Get the processingExpression from ReturnClause to handle in WcpsTranslator
     * @return processingExpression
     */
    public IParseTreeNode getProcessingExpression()
    {
        return returnClause.getProcessingExpr();
    }

    private ForClauseList forClauseList;
    private WhereClause whereClause;
    private ReturnClause returnClause;
}