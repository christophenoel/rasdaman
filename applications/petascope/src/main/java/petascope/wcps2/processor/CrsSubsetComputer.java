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
package petascope.wcps2.processor;

import petascope.wcps2.parse.treenode.IParseTreeNode;
import petascope.wcps.metadata.DomainElement;
import petascope.wcps2.metadata.Coverage;
import petascope.wcps2.metadata.CoverageRegistry;
import petascope.wcps2.metadata.Subset;
import petascope.wcps2.translator.*;
import petascope.wcps2.util.CrsComputer;

import java.util.ArrayList;
import java.util.List;
import petascope.util.CrsUtil;

/**
 * Calculates the pixel array bounds based on the subset given taking the crs of the coverage expression into account
 *
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 */
public class CrsSubsetComputer implements IProcessor {

    @Override
    public void process(IParseTreeNode translationTree, IParseTreeNode currentNode, CoverageRegistry coverageRegistry) {
        if (currentNode instanceof TrimExpression) {
            processTrimExpression(currentNode, coverageRegistry);
        } else if (currentNode instanceof ExtendExpression) {
            processExtendExpression(currentNode, coverageRegistry);
        } else if (currentNode instanceof ScaleExpression) {
            processScaleExpression(currentNode, coverageRegistry);
        } else if (currentNode instanceof GeneralCondenser) {
            GeneralCondenser generalCondenser = (GeneralCondenser) currentNode;
            Integer axisIteratorCounter = 0;
            for(AxisIterator axisIterator: generalCondenser.getAxisIterators()){
                processAxisIterator(axisIterator, coverageRegistry, axisIteratorCounter);
                axisIteratorCounter ++;
            }
        } else if (currentNode instanceof CoverageConstructor) {
            CoverageConstructor constructor = (CoverageConstructor) currentNode;
            Integer axisIteratorCounter = 0;
            for(AxisIterator axisIterator: constructor.getAxisIterators()){
                processAxisIterator(axisIterator, coverageRegistry, axisIteratorCounter);
                axisIteratorCounter ++;
            }
        }
    }

    @Override
    public boolean canProcess(IParseTreeNode currentNode) {
        if (currentNode instanceof TrimExpression
            || currentNode instanceof ExtendExpression
            || currentNode instanceof ScaleExpression
            || currentNode instanceof GeneralCondenser
            || currentNode instanceof CoverageConstructor) {
            return true;
        }
        return false;
    }

    /**
     * Replaces the pixel geographic coordinates with array coordinates in axis iterators. This operation is dependent
     * on the coverage addressed by the axis iterator, but since the same axis iterator can address more than 1 coverage
     * the first coverage that appears in the query is always considered.
     *
     * @param currentNode
     * @param coverageRegistry
     */
    private void processAxisIterator(IParseTreeNode currentNode, CoverageRegistry coverageRegistry, Integer axisIteratorCounter){
        //for now consider that the coverage is the first one addressed in the query
        Coverage coverage = coverageRegistry.getFirstCoverage();
        AxisIterator axisIterator = (AxisIterator) currentNode;
        //HACK: If the axis name given to the iterator id different than any of the axes name of the coverage, then set
        //it to one of the axis names of the coverage (of the same index, or, if the index is too large, the first one)
        //This is needed because the axis iterator serves both for iterating over a coverage axis and for defining a new
        // axis.
        List<DomainElement> axes = coverage.getCoverageInfo().getDomains();
        List<String> axesNames = new ArrayList<String>(axes.size());
        for(DomainElement axis : axes){
            axesNames.add(axis.getLabel());
        }
        if(axisIteratorCounter > (axes.size() - 1)){
            axisIteratorCounter = 0;
        }
        String oldAxisName = axisIterator.getAxisName();
        if (!axesNames.contains(axisIterator.getAxisName())){
            axisIterator.setAxisName(axesNames.get(axisIteratorCounter));
        }
        //END HACK
        
        // NOTE: axis iterator should only be considered as GridAxis (i.e: CRS:1)
        // or it will try to calculate it same as geo-referenced axis (e.g: $t [0:20] will be $t [0:19] (t1206)
        coverage.getCoverageInfo().setCoverageCrs(CrsUtil.GRID_CRS);
        processSubsetDimension(axisIterator.getTrimInterval(), coverage, coverageRegistry);
        //set the axis name back
        axisIterator.setAxisName(oldAxisName);
    }

    /**
     * Processes a subset interval calculating the pixel bounds.
     *
     * @param subsetDimension
     * @param coverage
     * @param coverageRegistry
     */
    private void processSubsetDimension(SubsetDimension subsetDimension, Coverage coverage, CoverageRegistry coverageRegistry) {
        //check that the interval is numeric, otherwise leave it as it (for example a[ i($x:$y)] should be left as is)
        // NOTE: it will try to check isTrimming first, if it is not then check isSlicing
        // or it will returns NULL in case *slicing* due to getRawSubset();
        if (subsetDimension.getRawSubset().isCrsComputable()) {
            String crs = subsetDimension.getCrs();
            if (crs == null) {
                crs = coverage.getCoverageInfo().getCoverageCrs();
            }
            CrsComputer crsComputer = null;
            if (subsetDimension.getRawSubset().isTrimming()) {
                crsComputer = new CrsComputer(subsetDimension.getAxisName(), crs, subsetDimension.getRawSubset(), coverage, coverageRegistry);
                Subset<Long> pixelIndices = crsComputer.getPixelIndices();
                subsetDimension.setSubset(pixelIndices);
            } else {
                crsComputer = new CrsComputer(subsetDimension.getAxisName(), crs, subsetDimension.getRawSubset().getSlicingCoordinate(), coverage, coverageRegistry);
                Subset<Long> pixelIndices = crsComputer.getPixelIndices();
                // NOTE: Get only lower bound value from pixelIndices in case of slicing
                subsetDimension.setSubset(new Subset<Long>(pixelIndices.getLowerLimit()));
            }
        }
    }

    /**
     * Processes a trim expression calculating the pixel bounds
     *
     * @param currentNode the current node where the trim was detected
     * @param coverageRegistry the coverage registry
     */
    private void processTrimExpression(IParseTreeNode currentNode, CoverageRegistry coverageRegistry) {
        TrimExpression trim = (TrimExpression) currentNode;
        Coverage coverage = trim.getCoverageExpression().getCoverage();
        for (SubsetDimension subsetDimension : trim.getDimensionIntervalList().getIntervals()) {
            processSubsetDimension(subsetDimension, coverage, coverageRegistry);
         }
    }


    /**
     * Processes a scale expression calculating the pixel bounds
     *
     * @param currentNode      the current node where the trim was detected
     * @param coverageRegistry the coverage registry
     */
    private void processScaleExpression(IParseTreeNode currentNode, CoverageRegistry coverageRegistry) {
        ScaleExpression scale = (ScaleExpression) currentNode;
        Coverage coverage = scale.getCoverage();
        for (SubsetDimension subsetDimension : scale.getDimensionIntervals().getIntervals()) {
            // NOTE: with this type of subset, it will not check the boundary of subset should be inside coverage
            // e.g scale(c, {i(0:500), j(0:500)}
            subsetDimension.getRawSubset().setSubsetScaleExtend(true);
            processSubsetDimension(subsetDimension, coverage, coverageRegistry);
         }
    }

    /**
     * Processes an extend expression calculating the pixel bounds
     *
     * @param currentNode the node where the extend expression was found
     */
    private void processExtendExpression(IParseTreeNode currentNode, CoverageRegistry coverageRegistry) {
        ExtendExpression extend = (ExtendExpression) currentNode;
        Coverage coverage = extend.getCoverage();
        for (SubsetDimension subsetDimension : extend.getDimensionIntervalList().getIntervals()) {
            // NOTE: with this type of subset, it will not check the boundary of subset should be inside coverage
            // e.g extend(c, {i(0:500), j(0:500)}
            subsetDimension.getRawSubset().setSubsetScaleExtend(true);
            processSubsetDimension(subsetDimension, coverage, coverageRegistry);
         }
    }
}
