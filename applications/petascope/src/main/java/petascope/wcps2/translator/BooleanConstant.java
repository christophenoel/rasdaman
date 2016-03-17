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

import petascope.wcps2.parse.treenode.IRasqlParseTreeNode;

/**
 * Class to translate a boolean constant, e.g. true or false
 * <p/>
 * <code>
 * true
 * </code>
 * translates to
 * <code>
 * true
 * </code>
 *
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 */
public class BooleanConstant extends IRasqlParseTreeNode {

    /**
     * Constructor for the class
     *
     * @param truthValue the boolean value in string format
     */
    public BooleanConstant(String truthValue) {
        this.truthValue = truthValue;
    }

    @Override
    public String toRasql() {
        return truthValue;
    }

    public final String truthValue;
}
