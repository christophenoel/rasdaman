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
package petascope.wcps2.parser;

import petascope.wcps2.query.WcpsQuery;
import petascope.wcps2.parse.treenode.IParseTreeNode;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import petascope.wcps2.error.managed.processing.InvalidAxisNameException;
import petascope.wcps2.error.managed.processing.InvalidSubsettingException;
import petascope.wcps2.metadata.CoverageRegistry;
import petascope.wcps2.metadata.Subset;
import petascope.wcps2.translator.*;
import static petascope.wcs2.parsers.subsets.DimensionSlice.ASTERISK;

import java.util.*;
import org.slf4j.LoggerFactory;
import petascope.wcps2.error.managed.processing.InvalidSlicingException;
import petascope.wcps2.parse.treenode.IRasqlParseTreeNode;

/**
 * Class that implements the parsing rules described in wcps.g4
 *
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 */
public class wcpsEvaluator extends wcpsBaseVisitor<IParseTreeNode> {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(wcpsEvaluator.class);
    
    public wcpsEvaluator(CoverageRegistry coverageRegistry) {
        super();
        this.coverageRegistry = coverageRegistry;
    }

    @Override
    public IParseTreeNode visitWcpsQueryLabel(@NotNull wcpsParser.WcpsQueryLabelContext ctx) {
        ForClauseList forClauseList = (ForClauseList)visit(ctx.forClauseList());
        //only visit the for clause if it exists
        WhereClause whereClause = null;
        if (ctx.whereClause() != null) {
            whereClause = (WhereClause)visit(ctx.whereClause());
        }
        ReturnClause returnClause = (ReturnClause)visit(ctx.returnClause());
        return new WcpsQuery(forClauseList, whereClause, returnClause);
    }

    @Override
    public IParseTreeNode visitForClauseLabel(@NotNull wcpsParser.ForClauseLabelContext ctx) {
        return new ForClause(ctx.coverageVariableName().getText(), ctx.IDENTIFIER().get(0).getText(), coverageRegistry);
    }

    @Override
    public IParseTreeNode visitForClauseListLabel(@NotNull wcpsParser.ForClauseListLabelContext ctx) {
        ArrayList<IRasqlParseTreeNode> forClauses = new ArrayList<IRasqlParseTreeNode>();
        for (wcpsParser.ForClauseContext currentClause : ctx.forClause()) {
            forClauses.add((IRasqlParseTreeNode)visit(currentClause));
        }
        return new ForClauseList(forClauses);
    }

    @Override
    public IParseTreeNode visitReturnClauseLabel(@NotNull wcpsParser.ReturnClauseLabelContext ctx) {
        return new ReturnClause((IParseTreeNode)visit(ctx.processingExpression()));
    }

    @Override
    public IParseTreeNode visitEncodedCoverageExpressionLabel(@NotNull wcpsParser.EncodedCoverageExpressionLabelContext ctx) {
        IParseTreeNode coverageExpression = visit(ctx.coverageExpression());
        List<TerminalNode> params = ctx.STRING_LITERAL();
        /**
         * Changed for backwards compatibility with WCPS1.
         * The change consisted in accepting a string literal as format name.
         * In order to revert the change, uncomment the code below.
         */

        //code removed for backwards compatibility
        //String format = ctx.FORMAT_NAME().getText();
        //end code removed for backwards compatibility

        //code added for backwards compatibility with WCPS1, where format name can be a STRING_LITERAL
        String format = params.get(0).getText();
        //end code added for backwards compatibility

        List<String> otherParams = null;
        if(params.size() > 1){
            otherParams = new ArrayList<String>(params.size() - 1);
            for(Integer i = 1; i < params.size(); i++){
                otherParams.add(params.get(i).getText());
            }
        }

        return new EncodedCoverage((CoverageExpression)coverageExpression, format, otherParams);
    }

    @Override
    public IParseTreeNode visitCoverageVariableNameLabel(@NotNull wcpsParser.CoverageVariableNameLabelContext ctx) {
        String coverageVariable = ctx.IDENTIFIER().getText();
        return new CoverageExpressionVariableName(coverageVariable, coverageRegistry);
    }

    @Override
    public IParseTreeNode visitCoverageExpressionLogicLabel(@NotNull wcpsParser.CoverageExpressionLogicLabelContext ctx) {
        return new BinaryCoverageExpression((CoverageExpression)visit(ctx.coverageExpression(0)), ctx.booleanOperator().getText(), (CoverageExpression)visit(ctx.coverageExpression(1)));
    }

    @Override
    public IParseTreeNode visitCoverageExpressionArithmeticLabel(@NotNull wcpsParser.CoverageExpressionArithmeticLabelContext ctx) {
        return new BinaryCoverageExpression((CoverageExpression)visit(ctx.coverageExpression(0)), ctx.coverageArithmeticOperator().getText(), (CoverageExpression)visit(ctx.coverageExpression(1)));
    }

    @Override
    public IParseTreeNode visitCoverageExpressionOverlayLabel(@NotNull wcpsParser.CoverageExpressionOverlayLabelContext ctx) {
        //invert the order of the operators since WCPS overlay order is the opposite of the one in rasql
        return new BinaryCoverageExpression((CoverageExpression)visit(ctx.coverageExpression(1)), ctx.OVERLAY().getText(), (CoverageExpression)visit(ctx.coverageExpression(0)));
    }

    @Override
    public IParseTreeNode visitBooleanConstant(@NotNull wcpsParser.BooleanConstantContext ctx) {
        return new BooleanConstant(ctx.getText());
    }

    @Override
    public IParseTreeNode visitBooleanStringComparisonScalar(@NotNull wcpsParser.BooleanStringComparisonScalarContext ctx) {
        return new BinaryScalarExpression(ctx.stringScalarExpression(0).getText(), ctx.stringOperator().getText(), ctx.stringScalarExpression(1).getText());
    }

    @Override
    public IParseTreeNode visitIntervalExpressionLabel(@NotNull wcpsParser.IntervalExpressionLabelContext ctx) {
        return new IntervalExpression(ctx.scalarExpression(0).getText(), ctx.scalarExpression(1).getText());
    }

    @Override
    public IParseTreeNode visitAxisSpecLabel(@NotNull wcpsParser.AxisSpecLabelContext ctx) {
        SubsetDimension subsetDimension = (SubsetDimension) visit(ctx.dimensionIntervalElement());
        return new AxisSpec(subsetDimension);
    }

    @Override
    public IParseTreeNode visitAxisIteratorLabel(@NotNull wcpsParser.AxisIteratorLabelContext ctx) {
        SubsetDimension subsetDimension = (SubsetDimension) visit(ctx.dimensionIntervalElement());
        return new AxisIterator((CoverageExpressionVariableName) visit(ctx.coverageVariableName()), subsetDimension);
    }

    @Override
    public IParseTreeNode visitCoverageConstructorExpressionLabel(@NotNull wcpsParser.CoverageConstructorExpressionLabelContext ctx) {
        ArrayList<AxisIterator> intervalList = new ArrayList<AxisIterator>();
        for (wcpsParser.AxisIteratorContext i : ctx.axisIterator()) {
            intervalList.add((AxisIterator) visit(i));
        }
        return new CoverageConstructor(ctx.IDENTIFIER().getText(), intervalList, (IRasqlParseTreeNode)visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitUnaryCoverageArithmeticExpressionLabel(@NotNull wcpsParser.UnaryCoverageArithmeticExpressionLabelContext ctx) {
        return new UnaryArithmeticExpression(ctx.unaryArithmeticExpressionOperator().getText(), (IRasqlParseTreeNode)visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitTrigonometricExpressionLabel(@NotNull wcpsParser.TrigonometricExpressionLabelContext ctx) {
        return new UnaryArithmeticExpression(ctx.trigonometricOperator().getText(), (CoverageExpression)visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitExponentialExpressionLabel(@NotNull wcpsParser.ExponentialExpressionLabelContext ctx) {
        return new UnaryArithmeticExpression(ctx.exponentialExpressionOperator().getText(), (CoverageExpression)visit(ctx.coverageExpression()));
    }
    
    @Override
    public IParseTreeNode visitUnaryPowerExpressionLabel(@NotNull wcpsParser.UnaryPowerExpressionLabelContext ctx) {
        return new UnaryPowerExpression((CoverageExpression)visit(ctx.coverageExpression()), (CoverageExpression)visit(ctx.numericalScalarExpression()));
    }

    @Override
    public IParseTreeNode visitNotUnaryBooleanExpressionLabel(@NotNull wcpsParser.NotUnaryBooleanExpressionLabelContext ctx) {
        return new UnaryBooleanExpression((CoverageExpression)visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitBitUnaryBooleanExpressionLabel(@NotNull wcpsParser.BitUnaryBooleanExpressionLabelContext ctx) {
        return new UnaryBooleanExpression((CoverageExpression)visit(ctx.coverageExpression()), (IRasqlParseTreeNode)visit(ctx.numericalScalarExpression()));
    }

    @Override
    public IParseTreeNode visitCastExpressionLabel(@NotNull wcpsParser.CastExpressionLabelContext ctx) {
        return new CastExpression(StringUtils.join(ctx.rangeType().IDENTIFIER(), " "), (CoverageExpression)visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitCoverageExpressionRangeSubsettingLabel(@NotNull wcpsParser.CoverageExpressionRangeSubsettingLabelContext ctx) {
        return new RangeSubsetting(ctx.fieldName().getText(), (CoverageExpression) visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitNumericalRealNumberExpressionLabel(@NotNull wcpsParser.NumericalRealNumberExpressionLabelContext ctx) {
        return new RealNumberConstant(ctx.getText());
    }
           
    @Override
    public IParseTreeNode visitNumericalRealPositiveNumberExpressionLabel (@NotNull wcpsParser.NumericalRealPositiveNumberExpressionLabelContext ctx) {
       return new RealNumberConstant(ctx.getText());
    }

    @Override
    public IParseTreeNode visitCoverageExpressionCoverageLabel(@NotNull wcpsParser.CoverageExpressionCoverageLabelContext ctx) {
        return new ParenthesesCoverageExpression((CoverageExpression)visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitWhereClauseLabel(@NotNull wcpsParser.WhereClauseLabelContext ctx) {
        return new WhereClause((IRasqlParseTreeNode)visit(ctx.booleanScalarExpression()));
    }

    @Override
    public IParseTreeNode visitBooleanUnaryScalarLabel(@NotNull wcpsParser.BooleanUnaryScalarLabelContext ctx) {
        return new BooleanUnaryScalarExpression(ctx.booleanUnaryOperator().getText(), (IRasqlParseTreeNode)visit(ctx.booleanScalarExpression()));
    }

    @Override
    public IParseTreeNode visitBooleanNumericalComparisonScalarLabel(@NotNull wcpsParser.BooleanNumericalComparisonScalarLabelContext ctx) {
        return new BooleanNumericalComparissonScalar((IRasqlParseTreeNode)visit(ctx.numericalScalarExpression(0)), (IRasqlParseTreeNode)visit(ctx.numericalScalarExpression(1)), ctx.numericalComparissonOperator().getText());
    }

    @Override
    public IParseTreeNode visitReduceBooleanExpressionLabel(@NotNull wcpsParser.ReduceBooleanExpressionLabelContext ctx) {
        return new ReduceExpression(ctx.reduceBooleanExpressionOperator().getText(), (CoverageExpression)visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitCoverageExpressionComparissonLabel(@NotNull wcpsParser.CoverageExpressionComparissonLabelContext ctx) {
        return new BinaryCoverageExpression((CoverageExpression)visit(ctx.coverageExpression(0)), ctx.numericalComparissonOperator().getText(), (CoverageExpression)visit(ctx.coverageExpression(1)));
    }

    @Override
    public IParseTreeNode visitBooleanBinaryScalarLabel(@NotNull wcpsParser.BooleanBinaryScalarLabelContext ctx) {
        return new BinaryCoverageExpression((CoverageExpression)visit(ctx.booleanScalarExpression(0)), ctx.booleanOperator().getText(), (CoverageExpression)visit(ctx.booleanScalarExpression(1)));
    }

    @Override
    public IParseTreeNode visitNumericalUnaryScalarExpressionLabel(@NotNull wcpsParser.NumericalUnaryScalarExpressionLabelContext ctx) {
        return new UnaryArithmeticExpression(ctx.numericalUnaryOperation().getText(), (IRasqlParseTreeNode)visit(ctx.numericalScalarExpression()));
    }

    @Override
    public IParseTreeNode visitNumericalTrigonometricScalarExpressionLabel(@NotNull wcpsParser.NumericalTrigonometricScalarExpressionLabelContext ctx) {
        return new UnaryArithmeticExpression(ctx.trigonometricOperator().getText(), (IRasqlParseTreeNode)visit(ctx.numericalScalarExpression()));
    }

    @Override
    public IParseTreeNode visitNumericalBinaryScalarExpressionLabel(@NotNull wcpsParser.NumericalBinaryScalarExpressionLabelContext ctx) {
        return new BinaryCoverageExpression((CoverageExpression)visit(ctx.numericalScalarExpression(0)), ctx.numericalOperator().getText(), (CoverageExpression)visit(ctx.numericalScalarExpression(1)));
    }

    @Override
    public IParseTreeNode visitComplexNumberConstantLabel(@NotNull wcpsParser.ComplexNumberConstantLabelContext ctx) {
        return new ComplexNumberConstant(ctx.REAL_NUMBER_CONSTANT(0).getText(), ctx.REAL_NUMBER_CONSTANT(1).getText());
    }

    @Override
    public IParseTreeNode visitReduceNumericalExpressionLabel(@NotNull wcpsParser.ReduceNumericalExpressionLabelContext ctx) {
        return new ReduceExpression(ctx.reduceNumericalExpressionOperator().getText(), (CoverageExpression)visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitGeneralCondenseExpressionLabel(@NotNull wcpsParser.GeneralCondenseExpressionLabelContext ctx) {
        ArrayList<AxisIterator> intervalList = new ArrayList<AxisIterator>();
        for (wcpsParser.AxisIteratorContext i : ctx.axisIterator()) {
            intervalList.add((AxisIterator) visit(i));
        }
        IParseTreeNode whereClause = null;
        if (ctx.booleanScalarExpression() != null) {
            whereClause = visit(ctx.booleanScalarExpression());
        }
        return new GeneralCondenser(ctx.condenseExpressionOperator().getText(), intervalList, (IRasqlParseTreeNode)whereClause, (CoverageExpression)visit(ctx.coverageExpression()));
    }

    @Override
    public IParseTreeNode visitTrimDimensionIntervalElementLabel(@NotNull wcpsParser.TrimDimensionIntervalElementLabelContext ctx) {
        try {
            CoverageExpression rawLowerBound = (CoverageExpression) visit(ctx.coverageExpression(0));
            CoverageExpression rawUpperBound = (CoverageExpression) visit(ctx.coverageExpression(1));
            String crs = null;
            if (ctx.crsName() != null) {
                crs = ctx.crsName().getText().replace("\"", "");
            }
            if (ctx.axisName() == null) {
                throw new InvalidAxisNameException("No axis given");
            }
            return new SubsetDimension(ctx.axisName().getText(), crs, rawLowerBound, rawUpperBound);
        } catch (NumberFormatException e) {
            throw new InvalidSubsettingException(ctx.axisName().getText(), new Subset<String>(ctx.coverageExpression(0).getText(), ctx.coverageExpression(1).getText()));
        }
    }

    @Override
    public IParseTreeNode visitDimensionIntervalListLabel(@NotNull wcpsParser.DimensionIntervalListLabelContext ctx) {
        List<SubsetDimension> intervalList = new ArrayList<SubsetDimension>(ctx.dimensionIntervalElement().size());
        for (wcpsParser.DimensionIntervalElementContext elem : ctx.dimensionIntervalElement()) {
            intervalList.add((SubsetDimension) visit(elem));
        }
        return new DimensionIntervalList(intervalList);
    }

    @Override
    public IParseTreeNode visitCoverageExpressionShorthandTrimLabel(@NotNull wcpsParser.CoverageExpressionShorthandTrimLabelContext ctx) {
        DimensionIntervalList dimensionIntList = (DimensionIntervalList) visit(ctx.dimensionIntervalList());
        return new TrimExpression((CoverageExpression)visit(ctx.coverageExpression()), dimensionIntList);
    }
    
    @Override
    // ticket:1246
    public IParseTreeNode visitCoverageExpressionTrimCoverageLabel(@NotNull wcpsParser.CoverageExpressionTrimCoverageLabelContext ctx) {
        DimensionIntervalList dimensionIntList = (DimensionIntervalList) visit(ctx.dimensionIntervalList());
        return new TrimExpression((CoverageExpression)visit(ctx.coverageExpression()), dimensionIntList);
    }

    @Override
    public IParseTreeNode visitCoverageConstantExpressionLabel(@NotNull wcpsParser.CoverageConstantExpressionLabelContext ctx) {
        ArrayList<AxisIterator> axisIterators = new ArrayList<AxisIterator>();
        ArrayList<String> constants = new ArrayList<String>();
        //parse the axis specifications
        for (wcpsParser.AxisIteratorContext i : ctx.axisIterator()) {
            axisIterators.add((AxisIterator) visit(i));
        }
        //parse the constants
        for (wcpsParser.ConstantContext i : ctx.constant()) {
            constants.add(i.getText());
        }
        return new CoverageConstant(ctx.IDENTIFIER().getText(), axisIterators, constants);
    }


    @Override
    public IParseTreeNode visitCoverageExpressionExtendLabel(@NotNull wcpsParser.CoverageExpressionExtendLabelContext ctx) {
        return new ExtendExpression((CoverageExpression) visit(ctx.coverageExpression()), (DimensionIntervalList) visit(ctx.dimensionIntervalList()));
    }

    @Override
    public IParseTreeNode visitRangeConstructorExpressionLabel(@NotNull wcpsParser.RangeConstructorExpressionLabelContext ctx) {
        Map<String, CoverageExpression> constructor = new LinkedHashMap<String, CoverageExpression>();
        for (int i = 0; i < ctx.fieldName().size(); i++) {
            constructor.put(ctx.fieldName().get(i).getText(), (CoverageExpression) visit(ctx.coverageExpression().get(i)));
        }
        return new RangeConstructorExpression(constructor);
    }

    @Override
    public IParseTreeNode visitCoverageExpressionRangeConstructorLabel(@NotNull wcpsParser.CoverageExpressionRangeConstructorLabelContext ctx) {
        return visit(ctx.rangeConstructorExpression());
    }

    @Override
    public IParseTreeNode visitDimensionPointElementLabel(@NotNull wcpsParser.DimensionPointElementLabelContext ctx) {
        String crs = null;
        if(ctx.crsName() != null){
            crs = ctx.crsName().getText().replace("\"", "");
        }
        CoverageExpression bound = (CoverageExpression) visit(ctx.coverageExpression());
        return new SubsetDimension(ctx.axisName().getText(), crs, bound, bound);
    }

    @Override
    public IParseTreeNode visitDimensionPointListLabel(@NotNull wcpsParser.DimensionPointListLabelContext ctx) {
        List<SubsetDimension> intervalList = new ArrayList<SubsetDimension>(ctx.dimensionPointElement().size());
        for (wcpsParser.DimensionPointElementContext elem : ctx.dimensionPointElement()) {
            intervalList.add((SubsetDimension) visit(elem));
        }
        return new DimensionIntervalList(intervalList);
    }

    @Override
    public IParseTreeNode visitSliceDimensionIntervalElementLabel(@NotNull wcpsParser.SliceDimensionIntervalElementLabelContext ctx){
        CoverageExpression bound = (CoverageExpression) visit(ctx.coverageExpression());
        String crs = ctx.crsName() == null ? "" : ctx.crsName().getText().replace("\"", "");
        SubsetDimension subsetDimension = null;
        try {
            subsetDimension = new SubsetDimension(ctx.axisName().getText(), crs, bound);
        } catch (InvalidSlicingException ex) {
            log.error(ex.getMessage());
            throw ex;
        }
        return subsetDimension;
    }

    @Override
    public IParseTreeNode visitCoverageExpressionShorthandSliceLabel(@NotNull wcpsParser.CoverageExpressionShorthandSliceLabelContext ctx) {
        return new TrimExpression((CoverageExpression)visit(ctx.coverageExpression()), (DimensionIntervalList) visit(ctx.dimensionPointList()));
    }

    @Override
    public IParseTreeNode visitStringScalarExpressionLabel(@NotNull wcpsParser.StringScalarExpressionLabelContext ctx) {
        return new StringScalar(ctx.STRING_LITERAL().getText());
    }
    
    @Override
    public IParseTreeNode visitCoverageIdentifierExpressionLabel(@NotNull wcpsParser.CoverageIdentifierExpressionLabelContext ctx) {
        // NOTE: it only handle "coverageVariableName" not "coverageExpression"
        return new CoverageIdentifier(ctx.coverageVariableName().getText());
    }

    @Override
    public IParseTreeNode visitStarExpressionLabel(@NotNull wcpsParser.StarExpressionLabelContext ctx) {
        return new StringScalar("\""+ ASTERISK + "\"");
    }

    @Override
    public IParseTreeNode visitCoverageExpressionScaleLabel(@NotNull wcpsParser.CoverageExpressionScaleLabelContext ctx) {
        return new ScaleExpression((CoverageExpression) visit(ctx.coverageExpression()), (DimensionIntervalList) visit(ctx.dimensionIntervalList()));
    }

    @Override
    public IParseTreeNode visitCoverageExpressionSliceLabel(@NotNull wcpsParser.CoverageExpressionSliceLabelContext ctx) {
        return new TrimExpression((CoverageExpression)visit(ctx.coverageExpression()), (DimensionIntervalList) visit(ctx.dimensionPointList()));
    }

    private CoverageRegistry coverageRegistry;
}