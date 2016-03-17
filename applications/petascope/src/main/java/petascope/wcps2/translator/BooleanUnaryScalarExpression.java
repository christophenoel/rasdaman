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

import petascope.wcps2.parse.treenode.IParseTreeNode;
import petascope.wcps2.parse.treenode.IRasqlParseTreeNode;

/**
 * Translation class for boolean unary scalar expression.
 * Example
 * <code>
 *     NOT(avg_cells(c) > 10)
 * </code>
 * translates to
 * <code>
 *     not(avg_cells(c) > 10)
 * </code>
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 */
public class BooleanUnaryScalarExpression extends IRasqlParseTreeNode {
    public BooleanUnaryScalarExpression(String operand, IRasqlParseTreeNode scalarExpression) {
        this.operand = operand;
        this.scalarExpression = scalarExpression;
        addChild(scalarExpression);
    }

    @Override
    public String toRasql() {
        return TEMPLATE.replace("$operand", operand).replace("$scalarExpression", scalarExpression.toRasql());
    }

    private final String operand;
    private final IRasqlParseTreeNode scalarExpression;
    private static final String TEMPLATE = "$operand($scalarExpression)";
}
