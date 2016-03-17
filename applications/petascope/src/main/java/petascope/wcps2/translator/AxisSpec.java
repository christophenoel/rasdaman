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
 * Translation node from wcps axisSpec to rasql
 * Example:
 * <code>
 * x(0:100)
 * </code>
 * translates to
 * <code>
 * x in [0:100]
 * </code>
 *
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 */
public class AxisSpec extends IRasqlParseTreeNode {

    /**
     * Constructor for the class
     *
     * @param subsetDimension the interval in which the iteration is done
     */
   public AxisSpec(SubsetDimension subsetDimension) {
        this.axisName = subsetDimension.getAxisName();
        this.subsetDimension = subsetDimension;
        this.interval = new IntervalExpression(subsetDimension.getRawSubset().getLowerLimit(),
                subsetDimension.getRawSubset().getUpperLimit());
        addChild(interval);
    }

    /**
     * Returns the axis name
     *
     * @return
     */
    public String getAxisName() {
        return axisName;
    }

    /**
     * Returns the interval to iterate on
     *
     * @return
     */
    public IntervalExpression getInterval() {
        return interval;
    }


    @Override
    public String toRasql() {
        String template = TEMPLATE.replace("$variable", this.axisName).replace("$interval", this.interval.toRasql());
        return template;
    }


    public SubsetDimension getTrimInterval() {
        return subsetDimension;
     }

    public void setAxisName(String axisName) {
        this.axisName = axisName;
        this.subsetDimension.setAxisName(axisName);
    }

    protected String axisName;
    protected IntervalExpression interval;
    protected SubsetDimension subsetDimension;

    private final String TEMPLATE = "$variable in $interval";

}
