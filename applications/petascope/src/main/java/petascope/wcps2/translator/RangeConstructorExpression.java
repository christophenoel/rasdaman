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

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Translation class for the range constructor expressions
 * <code>
 * for c in (COV) return encode( {red: c.red;    green: c.green;    blue: c.blue }, "png")
 * </code>
 * returns
 * <code>
 * select  { c.red, c.green, c.blue } from COV as c
 * </code>
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 */
public class RangeConstructorExpression extends CoverageExpression {
    /**
     * Constructor for the class
     *
     * @param fieldStructure the structure of the range fields
     */
    public RangeConstructorExpression(Map<String, CoverageExpression> fieldStructure) {
        this.fieldStructure = fieldStructure;
        setCoverage(fieldStructure.values().iterator().next().getCoverage());
    }

    @Override
    public String toRasql() {
        List<String> translatedFields = new ArrayList<String>();
        for (Map.Entry<String, CoverageExpression> entry : fieldStructure.entrySet()) {
            translatedFields.add(entry.getValue().toRasql());
        }
        return TEMPLATE.replace("$fieldDefinitions", StringUtils.join(translatedFields, ","));
    }

    private final Map<String, CoverageExpression> fieldStructure;
    private final String TEMPLATE = "{$fieldDefinitions}";
}
