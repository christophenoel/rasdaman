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
import petascope.wcps2.translator.ReturnClause;

/**
 * Translation node from wcps to value. Example:  <code>
 * for c in (mr) return identifier(c)
 * </code> translates to  <code>
 * mr instead of Rasql (SELECT ... FROM)
 * </code>
 *
 * @author <a href="mailto:bphamhuux@jacobs-university.de">Bang Pham Huu</a>
 */
public class WcpsMetaQuery extends IParseTreeNode {

    public WcpsMetaQuery(WcpsQuery wcpsQuery)
    {
        this.returnClause = wcpsQuery.getReturnClause();
        addChild(returnClause);
    }   
   
    /**
     * Translate translatedTree to MetaResult
     * @return String (metaresult)
     */
    public String toMetaResult() {
        // NOTE: ReturnClause can return *Rasql* or *Meta value*, then call this method to get correct output.
        String value = this.returnClause.getRasqlOrResult();        
        return value;
    }

    private ReturnClause returnClause;
}