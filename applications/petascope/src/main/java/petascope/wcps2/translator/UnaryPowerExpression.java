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

/**
 * Translation node from wcps to rasql for unary pow(er) expressions. Example:  <code>
 * pow($c1, 2)
 * </code> translates to  <code>
 * pow(c1, 2)
 * </code>
 *
 * @author <a href="mailto:bphamhuu@jacobs-university.net">Bang Pham Huu</a>
 */
public class UnaryPowerExpression extends CoverageExpression {

    public UnaryPowerExpression(CoverageExpression coverageExp, CoverageExpression scalarExpression) {
        this.coverageExp = coverageExp;
        this.scalarExpression = scalarExpression;
        addChild(coverageExp);
        addChild(scalarExpression);
    }

    @Override
    public String toRasql() {        
        // NOTE: It is implemented same as UnaryBooleanExpression with case bit
        String template = TEMPLATE.replace("$coverageExp", this.coverageExp.toRasql()).replace("$scalarExp", this.scalarExpression.toRasql());
        return template;
    }

    private CoverageExpression coverageExp;
    private CoverageExpression scalarExpression;
    private final String TEMPLATE = "POW($coverageExp, $scalarExp)";
}