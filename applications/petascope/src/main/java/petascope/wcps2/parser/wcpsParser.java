// Generated from wcps.g4 by ANTLR 4.1
package petascope.wcps2.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class wcpsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, ABSOLUTE_VALUE=2, ADD=3, ALL=4, AND=5, ARCSIN=6, ARCCOS=7, ARCTAN=8, 
		AVG=9, BIT=10, COLON=11, COMMA=12, CONDENSE=13, COS=14, COSH=15, COUNT=16, 
		COVERAGE=17, COVERAGE_VARIABLE_NAME_PREFIX=18, CRS_TRANSFORM=19, DECODE=20, 
		DESCRIBE_COVERAGE=21, DIVISION=22, DOT=23, ENCODE=24, EQUAL=25, EXP=26, 
		EXTEND=27, FALSE=28, GREATER_THAN=29, GREATER_OR_EQUAL_THAN=30, IMAGINARY_PART=31, 
		ID=32, IMGCRSDOMAIN=33, IN=34, LEFT_BRACE=35, LEFT_BRACKET=36, LEFT_PARANTHESIS=37, 
		LN=38, LIST=39, LOG=40, LOWER_THAN=41, LOWER_OR_EQUAL_THAN=42, MAX=43, 
		MIN=44, MINUS=45, MULTIPLICATION=46, NOT=47, NOT_EQUAL=48, OR=49, OVER=50, 
		OVERLAY=51, PLUS=52, POWER=53, REAL_PART=54, ROUND=55, RETURN=56, RIGHT_BRACE=57, 
		RIGHT_BRACKET=58, RIGHT_PARANTHESIS=59, SCALE=60, SEMICOLON=61, SIN=62, 
		SINH=63, SLICE=64, SOME=65, SQUARE_ROOT=66, STRUCT=67, TAN=68, TANH=69, 
		TRIM=70, TRUE=71, USING=72, VALUE=73, VALUES=74, WHERE=75, XOR=76, REAL_NUMBER_CONSTANT=77, 
		IDENTIFIER=78, NAME=79, STRING_LITERAL=80, WS=81;
	public static final String[] tokenNames = {
		"<INVALID>", "FOR", "ABSOLUTE_VALUE", "ADD", "ALL", "AND", "ARCSIN", "ARCCOS", 
		"ARCTAN", "AVG", "BIT", "':'", "','", "CONDENSE", "COS", "COSH", "COUNT", 
		"COVERAGE", "'$'", "CRS_TRANSFORM", "DECODE", "DESCRIBE_COVERAGE", "'/'", 
		"'.'", "ENCODE", "'='", "EXP", "EXTEND", "FALSE", "'>'", "'>='", "IMAGINARY_PART", 
		"ID", "IMGCRSDOMAIN", "IN", "'{'", "'['", "'('", "LN", "LIST", "LOG", 
		"'<'", "'<='", "MAX", "MIN", "'-'", "'*'", "NOT", "'!='", "OR", "OVER", 
		"OVERLAY", "'+'", "POWER", "REAL_PART", "ROUND", "RETURN", "'}'", "']'", 
		"')'", "SCALE", "';'", "SIN", "SINH", "SLICE", "SOME", "SQUARE_ROOT", 
		"STRUCT", "TAN", "TANH", "TRIM", "TRUE", "USING", "VALUE", "VALUES", "WHERE", 
		"XOR", "REAL_NUMBER_CONSTANT", "IDENTIFIER", "NAME", "STRING_LITERAL", 
		"WS"
	};
	public static final int
		RULE_wcpsQuery = 0, RULE_forClauseList = 1, RULE_forClause = 2, RULE_whereClause = 3, 
		RULE_returnClause = 4, RULE_coverageVariableName = 5, RULE_processingExpression = 6, 
		RULE_scalarExpression = 7, RULE_booleanScalarExpression = 8, RULE_booleanUnaryOperator = 9, 
		RULE_booleanConstant = 10, RULE_booleanOperator = 11, RULE_numericalComparissonOperator = 12, 
		RULE_stringOperator = 13, RULE_stringScalarExpression = 14, RULE_starExpression = 15, 
		RULE_numericalScalarExpression = 16, RULE_complexNumberConstant = 17, 
		RULE_numericalOperator = 18, RULE_numericalUnaryOperation = 19, RULE_trigonometricOperator = 20, 
		RULE_getComponentExpression = 21, RULE_coverageIdentifierExpression = 22, 
		RULE_describeCoverageExpression = 23, RULE_encodedCoverageExpression = 24, 
		RULE_decodeCoverageExpression = 25, RULE_coverageExpression = 26, RULE_coverageArithmeticOperator = 27, 
		RULE_unaryArithmeticExpressionOperator = 28, RULE_unaryArithmeticExpression = 29, 
		RULE_trigonometricExpression = 30, RULE_exponentialExpressionOperator = 31, 
		RULE_exponentialExpression = 32, RULE_unaryPowerExpression = 33, RULE_unaryBooleanExpression = 34, 
		RULE_rangeType = 35, RULE_castExpression = 36, RULE_fieldName = 37, RULE_rangeConstructorExpression = 38, 
		RULE_crsTransformExpression = 39, RULE_dimensionPointList = 40, RULE_dimensionPointElement = 41, 
		RULE_dimensionIntervalList = 42, RULE_dimensionIntervalElement = 43, RULE_dimensionCrsList = 44, 
		RULE_dimensionCrsElement = 45, RULE_fieldInterpolationList = 46, RULE_fieldInterpolationListElement = 47, 
		RULE_interpolationMethod = 48, RULE_nullResistance = 49, RULE_interpolationType = 50, 
		RULE_coverageConstructorExpression = 51, RULE_axisIterator = 52, RULE_intervalExpression = 53, 
		RULE_coverageConstantExpression = 54, RULE_axisSpec = 55, RULE_condenseExpression = 56, 
		RULE_reduceBooleanExpressionOperator = 57, RULE_reduceNumericalExpressionOperator = 58, 
		RULE_reduceBooleanExpression = 59, RULE_reduceNumericalExpression = 60, 
		RULE_reduceExpression = 61, RULE_condenseExpressionOperator = 62, RULE_generalCondenseExpression = 63, 
		RULE_crsName = 64, RULE_axisName = 65, RULE_constant = 66;
	public static final String[] ruleNames = {
		"wcpsQuery", "forClauseList", "forClause", "whereClause", "returnClause", 
		"coverageVariableName", "processingExpression", "scalarExpression", "booleanScalarExpression", 
		"booleanUnaryOperator", "booleanConstant", "booleanOperator", "numericalComparissonOperator", 
		"stringOperator", "stringScalarExpression", "starExpression", "numericalScalarExpression", 
		"complexNumberConstant", "numericalOperator", "numericalUnaryOperation", 
		"trigonometricOperator", "getComponentExpression", "coverageIdentifierExpression", 
		"describeCoverageExpression", "encodedCoverageExpression", "decodeCoverageExpression", 
		"coverageExpression", "coverageArithmeticOperator", "unaryArithmeticExpressionOperator", 
		"unaryArithmeticExpression", "trigonometricExpression", "exponentialExpressionOperator", 
		"exponentialExpression", "unaryPowerExpression", "unaryBooleanExpression", 
		"rangeType", "castExpression", "fieldName", "rangeConstructorExpression", 
		"crsTransformExpression", "dimensionPointList", "dimensionPointElement", 
		"dimensionIntervalList", "dimensionIntervalElement", "dimensionCrsList", 
		"dimensionCrsElement", "fieldInterpolationList", "fieldInterpolationListElement", 
		"interpolationMethod", "nullResistance", "interpolationType", "coverageConstructorExpression", 
		"axisIterator", "intervalExpression", "coverageConstantExpression", "axisSpec", 
		"condenseExpression", "reduceBooleanExpressionOperator", "reduceNumericalExpressionOperator", 
		"reduceBooleanExpression", "reduceNumericalExpression", "reduceExpression", 
		"condenseExpressionOperator", "generalCondenseExpression", "crsName", 
		"axisName", "constant"
	};

	@Override
	public String getGrammarFileName() { return "wcps.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public wcpsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WcpsQueryContext extends ParserRuleContext {
		public WcpsQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wcpsQuery; }
	 
		public WcpsQueryContext() { }
		public void copyFrom(WcpsQueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WcpsQueryLabelContext extends WcpsQueryContext {
		public ForClauseListContext forClauseList() {
			return getRuleContext(ForClauseListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public WcpsQueryLabelContext(WcpsQueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitWcpsQueryLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WcpsQueryContext wcpsQuery() throws RecognitionException {
		WcpsQueryContext _localctx = new WcpsQueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wcpsQuery);
		int _la;
		try {
			_localctx = new WcpsQueryLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134); forClauseList();
			}
			setState(136);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(135); whereClause();
				}
			}

			{
			setState(138); returnClause();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseListContext extends ParserRuleContext {
		public ForClauseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClauseList; }
	 
		public ForClauseListContext() { }
		public void copyFrom(ForClauseListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForClauseListLabelContext extends ForClauseListContext {
		public List<ForClauseContext> forClause() {
			return getRuleContexts(ForClauseContext.class);
		}
		public TerminalNode FOR() { return getToken(wcpsParser.FOR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public ForClauseContext forClause(int i) {
			return getRuleContext(ForClauseContext.class,i);
		}
		public ForClauseListLabelContext(ForClauseListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitForClauseListLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseListContext forClauseList() throws RecognitionException {
		ForClauseListContext _localctx = new ForClauseListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_forClauseList);
		int _la;
		try {
			_localctx = new ForClauseListLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(FOR);
			{
			setState(141); forClause();
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142); match(COMMA);
				setState(143); forClause();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
	 
		public ForClauseContext() { }
		public void copyFrom(ForClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForClauseLabelContext extends ForClauseContext {
		public TerminalNode IN() { return getToken(wcpsParser.IN, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(wcpsParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(wcpsParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageVariableNameContext coverageVariableName() {
			return getRuleContext(CoverageVariableNameContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public ForClauseLabelContext(ForClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitForClauseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forClause);
		int _la;
		try {
			int _alt;
			_localctx = new ForClauseLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149); coverageVariableName();
			setState(150); match(IN);
			setState(152);
			_la = _input.LA(1);
			if (_la==LEFT_PARANTHESIS) {
				{
				setState(151); match(LEFT_PARANTHESIS);
				}
			}

			setState(154); match(IDENTIFIER);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(155); match(COMMA);
					setState(156); match(IDENTIFIER);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(163);
			_la = _input.LA(1);
			if (_la==RIGHT_PARANTHESIS) {
				{
				setState(162); match(RIGHT_PARANTHESIS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	 
		public WhereClauseContext() { }
		public void copyFrom(WhereClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereClauseLabelContext extends WhereClauseContext {
		public TerminalNode WHERE() { return getToken(wcpsParser.WHERE, 0); }
		public BooleanScalarExpressionContext booleanScalarExpression() {
			return getRuleContext(BooleanScalarExpressionContext.class,0);
		}
		public WhereClauseLabelContext(WhereClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitWhereClauseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whereClause);
		try {
			_localctx = new WhereClauseLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(WHERE);
			setState(166); booleanScalarExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
	 
		public ReturnClauseContext() { }
		public void copyFrom(ReturnClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnClauseLabelContext extends ReturnClauseContext {
		public ProcessingExpressionContext processingExpression() {
			return getRuleContext(ProcessingExpressionContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(wcpsParser.RETURN, 0); }
		public ReturnClauseLabelContext(ReturnClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitReturnClauseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnClause);
		try {
			_localctx = new ReturnClauseLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(RETURN);
			setState(169); processingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverageVariableNameContext extends ParserRuleContext {
		public CoverageVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverageVariableName; }
	 
		public CoverageVariableNameContext() { }
		public void copyFrom(CoverageVariableNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CoverageVariableNameLabelContext extends CoverageVariableNameContext {
		public TerminalNode IDENTIFIER() { return getToken(wcpsParser.IDENTIFIER, 0); }
		public CoverageVariableNameLabelContext(CoverageVariableNameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageVariableNameLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageVariableNameContext coverageVariableName() throws RecognitionException {
		CoverageVariableNameContext _localctx = new CoverageVariableNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coverageVariableName);
		try {
			_localctx = new CoverageVariableNameLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcessingExpressionContext extends ParserRuleContext {
		public EncodedCoverageExpressionContext encodedCoverageExpression() {
			return getRuleContext(EncodedCoverageExpressionContext.class,0);
		}
		public ScalarExpressionContext scalarExpression() {
			return getRuleContext(ScalarExpressionContext.class,0);
		}
		public ProcessingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processingExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitProcessingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessingExpressionContext processingExpression() throws RecognitionException {
		ProcessingExpressionContext _localctx = new ProcessingExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_processingExpression);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case ABSOLUTE_VALUE:
			case ADD:
			case ALL:
			case ARCSIN:
			case ARCCOS:
			case ARCTAN:
			case AVG:
			case CONDENSE:
			case COS:
			case COSH:
			case COUNT:
			case DESCRIBE_COVERAGE:
			case DIVISION:
			case FALSE:
			case IMAGINARY_PART:
			case ID:
			case LEFT_PARANTHESIS:
			case MAX:
			case MIN:
			case MINUS:
			case MULTIPLICATION:
			case NOT:
			case PLUS:
			case REAL_PART:
			case ROUND:
			case SIN:
			case SINH:
			case SOME:
			case SQUARE_ROOT:
			case TAN:
			case TANH:
			case TRUE:
			case REAL_NUMBER_CONSTANT:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); scalarExpression();
				}
				break;
			case ENCODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); encodedCoverageExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarExpressionContext extends ParserRuleContext {
		public NumericalScalarExpressionContext numericalScalarExpression() {
			return getRuleContext(NumericalScalarExpressionContext.class,0);
		}
		public GetComponentExpressionContext getComponentExpression() {
			return getRuleContext(GetComponentExpressionContext.class,0);
		}
		public StarExpressionContext starExpression() {
			return getRuleContext(StarExpressionContext.class,0);
		}
		public StringScalarExpressionContext stringScalarExpression() {
			return getRuleContext(StringScalarExpressionContext.class,0);
		}
		public BooleanScalarExpressionContext booleanScalarExpression() {
			return getRuleContext(BooleanScalarExpressionContext.class,0);
		}
		public ScalarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitScalarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarExpressionContext scalarExpression() throws RecognitionException {
		ScalarExpressionContext _localctx = new ScalarExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scalarExpression);
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); booleanScalarExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); numericalScalarExpression(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179); stringScalarExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180); getComponentExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181); starExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanScalarExpressionContext extends ParserRuleContext {
		public int _p;
		public BooleanScalarExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BooleanScalarExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_booleanScalarExpression; }
	 
		public BooleanScalarExpressionContext() { }
		public void copyFrom(BooleanScalarExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class BooleanReduceExpressionContext extends BooleanScalarExpressionContext {
		public ReduceBooleanExpressionContext reduceBooleanExpression() {
			return getRuleContext(ReduceBooleanExpressionContext.class,0);
		}
		public BooleanReduceExpressionContext(BooleanScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBooleanReduceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanNumericalComparisonScalarLabelContext extends BooleanScalarExpressionContext {
		public List<NumericalScalarExpressionContext> numericalScalarExpression() {
			return getRuleContexts(NumericalScalarExpressionContext.class);
		}
		public NumericalScalarExpressionContext numericalScalarExpression(int i) {
			return getRuleContext(NumericalScalarExpressionContext.class,i);
		}
		public NumericalComparissonOperatorContext numericalComparissonOperator() {
			return getRuleContext(NumericalComparissonOperatorContext.class,0);
		}
		public BooleanNumericalComparisonScalarLabelContext(BooleanScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBooleanNumericalComparisonScalarLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanStringComparisonScalarContext extends BooleanScalarExpressionContext {
		public StringScalarExpressionContext stringScalarExpression(int i) {
			return getRuleContext(StringScalarExpressionContext.class,i);
		}
		public StringOperatorContext stringOperator() {
			return getRuleContext(StringOperatorContext.class,0);
		}
		public List<StringScalarExpressionContext> stringScalarExpression() {
			return getRuleContexts(StringScalarExpressionContext.class);
		}
		public BooleanStringComparisonScalarContext(BooleanScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBooleanStringComparisonScalar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanUnaryScalarLabelContext extends BooleanScalarExpressionContext {
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public BooleanUnaryOperatorContext booleanUnaryOperator() {
			return getRuleContext(BooleanUnaryOperatorContext.class,0);
		}
		public BooleanScalarExpressionContext booleanScalarExpression() {
			return getRuleContext(BooleanScalarExpressionContext.class,0);
		}
		public BooleanUnaryScalarLabelContext(BooleanScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBooleanUnaryScalarLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanConstantLabelContext extends BooleanScalarExpressionContext {
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public BooleanConstantLabelContext(BooleanScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBooleanConstantLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanBinaryScalarLabelContext extends BooleanScalarExpressionContext {
		public BooleanOperatorContext booleanOperator() {
			return getRuleContext(BooleanOperatorContext.class,0);
		}
		public BooleanScalarExpressionContext booleanScalarExpression(int i) {
			return getRuleContext(BooleanScalarExpressionContext.class,i);
		}
		public List<BooleanScalarExpressionContext> booleanScalarExpression() {
			return getRuleContexts(BooleanScalarExpressionContext.class);
		}
		public BooleanBinaryScalarLabelContext(BooleanScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBooleanBinaryScalarLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanScalarExpressionContext booleanScalarExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanScalarExpressionContext _localctx = new BooleanScalarExpressionContext(_ctx, _parentState, _p);
		BooleanScalarExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_booleanScalarExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new BooleanReduceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(185); reduceBooleanExpression();
				}
				break;

			case 2:
				{
				_localctx = new BooleanConstantLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186); booleanConstant();
				}
				break;

			case 3:
				{
				_localctx = new BooleanUnaryScalarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187); booleanUnaryOperator();
				setState(189);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(188); match(LEFT_PARANTHESIS);
					}
					break;
				}
				setState(191); booleanScalarExpression(0);
				setState(193);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(192); match(RIGHT_PARANTHESIS);
					}
					break;
				}
				}
				break;

			case 4:
				{
				_localctx = new BooleanNumericalComparisonScalarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195); numericalScalarExpression(0);
				setState(196); numericalComparissonOperator();
				setState(197); numericalScalarExpression(0);
				}
				break;

			case 5:
				{
				_localctx = new BooleanReduceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); reduceBooleanExpression();
				}
				break;

			case 6:
				{
				_localctx = new BooleanStringComparisonScalarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200); stringScalarExpression();
				setState(201); stringOperator();
				setState(202); stringScalarExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanBinaryScalarLabelContext(new BooleanScalarExpressionContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_booleanScalarExpression);
					setState(206);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(207); booleanOperator();
					setState(208); booleanScalarExpression(0);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BooleanUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(wcpsParser.NOT, 0); }
		public BooleanUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanUnaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBooleanUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanUnaryOperatorContext booleanUnaryOperator() throws RecognitionException {
		BooleanUnaryOperatorContext _localctx = new BooleanUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleanUnaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanConstantContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(wcpsParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(wcpsParser.FALSE, 0); }
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanOperatorContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(wcpsParser.XOR, 0); }
		public TerminalNode AND() { return getToken(wcpsParser.AND, 0); }
		public TerminalNode OR() { return getToken(wcpsParser.OR, 0); }
		public BooleanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBooleanOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperatorContext booleanOperator() throws RecognitionException {
		BooleanOperatorContext _localctx = new BooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR || _la==XOR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericalComparissonOperatorContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(wcpsParser.GREATER_THAN, 0); }
		public TerminalNode LOWER_THAN() { return getToken(wcpsParser.LOWER_THAN, 0); }
		public TerminalNode GREATER_OR_EQUAL_THAN() { return getToken(wcpsParser.GREATER_OR_EQUAL_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(wcpsParser.EQUAL, 0); }
		public TerminalNode LOWER_OR_EQUAL_THAN() { return getToken(wcpsParser.LOWER_OR_EQUAL_THAN, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(wcpsParser.NOT_EQUAL, 0); }
		public NumericalComparissonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalComparissonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalComparissonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalComparissonOperatorContext numericalComparissonOperator() throws RecognitionException {
		NumericalComparissonOperatorContext _localctx = new NumericalComparissonOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numericalComparissonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_OR_EQUAL_THAN) | (1L << LOWER_THAN) | (1L << LOWER_OR_EQUAL_THAN) | (1L << NOT_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(wcpsParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(wcpsParser.NOT_EQUAL, 0); }
		public StringOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitStringOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringOperatorContext stringOperator() throws RecognitionException {
		StringOperatorContext _localctx = new StringOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringScalarExpressionContext extends ParserRuleContext {
		public StringScalarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringScalarExpression; }
	 
		public StringScalarExpressionContext() { }
		public void copyFrom(StringScalarExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringScalarExpressionLabelContext extends StringScalarExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(wcpsParser.STRING_LITERAL, 0); }
		public StringScalarExpressionLabelContext(StringScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitStringScalarExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringScalarExpressionContext stringScalarExpression() throws RecognitionException {
		StringScalarExpressionContext _localctx = new StringScalarExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringScalarExpression);
		try {
			_localctx = new StringScalarExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StarExpressionContext extends ParserRuleContext {
		public StarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starExpression; }
	 
		public StarExpressionContext() { }
		public void copyFrom(StarExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarExpressionLabelContext extends StarExpressionContext {
		public TerminalNode MULTIPLICATION() { return getToken(wcpsParser.MULTIPLICATION, 0); }
		public StarExpressionLabelContext(StarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitStarExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarExpressionContext starExpression() throws RecognitionException {
		StarExpressionContext _localctx = new StarExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_starExpression);
		try {
			_localctx = new StarExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(MULTIPLICATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericalScalarExpressionContext extends ParserRuleContext {
		public int _p;
		public NumericalScalarExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NumericalScalarExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_numericalScalarExpression; }
	 
		public NumericalScalarExpressionContext() { }
		public void copyFrom(NumericalScalarExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class NumericalBinaryScalarExpressionLabelContext extends NumericalScalarExpressionContext {
		public List<NumericalScalarExpressionContext> numericalScalarExpression() {
			return getRuleContexts(NumericalScalarExpressionContext.class);
		}
		public NumericalScalarExpressionContext numericalScalarExpression(int i) {
			return getRuleContext(NumericalScalarExpressionContext.class,i);
		}
		public NumericalOperatorContext numericalOperator() {
			return getRuleContext(NumericalOperatorContext.class,0);
		}
		public NumericalBinaryScalarExpressionLabelContext(NumericalScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalBinaryScalarExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalUnaryScalarExpressionLabelContext extends NumericalScalarExpressionContext {
		public NumericalScalarExpressionContext numericalScalarExpression() {
			return getRuleContext(NumericalScalarExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public NumericalUnaryOperationContext numericalUnaryOperation() {
			return getRuleContext(NumericalUnaryOperationContext.class,0);
		}
		public NumericalUnaryScalarExpressionLabelContext(NumericalScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalUnaryScalarExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalCondenseExpressionLabelContext extends NumericalScalarExpressionContext {
		public CondenseExpressionContext condenseExpression() {
			return getRuleContext(CondenseExpressionContext.class,0);
		}
		public NumericalCondenseExpressionLabelContext(NumericalScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalCondenseExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalRealPositiveNumberExpressionLabelContext extends NumericalScalarExpressionContext {
		public TerminalNode REAL_NUMBER_CONSTANT() { return getToken(wcpsParser.REAL_NUMBER_CONSTANT, 0); }
		public NumericalOperatorContext numericalOperator() {
			return getRuleContext(NumericalOperatorContext.class,0);
		}
		public NumericalRealPositiveNumberExpressionLabelContext(NumericalScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalRealPositiveNumberExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalTrigonometricScalarExpressionLabelContext extends NumericalScalarExpressionContext {
		public NumericalScalarExpressionContext numericalScalarExpression() {
			return getRuleContext(NumericalScalarExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public TrigonometricOperatorContext trigonometricOperator() {
			return getRuleContext(TrigonometricOperatorContext.class,0);
		}
		public NumericalTrigonometricScalarExpressionLabelContext(NumericalScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalTrigonometricScalarExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalRealNumberExpressionLabelContext extends NumericalScalarExpressionContext {
		public TerminalNode REAL_NUMBER_CONSTANT() { return getToken(wcpsParser.REAL_NUMBER_CONSTANT, 0); }
		public NumericalRealNumberExpressionLabelContext(NumericalScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalRealNumberExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalComplexNumberConstantContext extends NumericalScalarExpressionContext {
		public ComplexNumberConstantContext complexNumberConstant() {
			return getRuleContext(ComplexNumberConstantContext.class,0);
		}
		public NumericalComplexNumberConstantContext(NumericalScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalComplexNumberConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalScalarExpressionContext numericalScalarExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumericalScalarExpressionContext _localctx = new NumericalScalarExpressionContext(_ctx, _parentState, _p);
		NumericalScalarExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_numericalScalarExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NumericalUnaryScalarExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(230); numericalUnaryOperation();
				setState(231); match(LEFT_PARANTHESIS);
				setState(232); numericalScalarExpression(0);
				setState(233); match(RIGHT_PARANTHESIS);
				}
				break;

			case 2:
				{
				_localctx = new NumericalTrigonometricScalarExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235); trigonometricOperator();
				setState(236); match(LEFT_PARANTHESIS);
				setState(237); numericalScalarExpression(0);
				setState(238); match(RIGHT_PARANTHESIS);
				}
				break;

			case 3:
				{
				_localctx = new NumericalCondenseExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240); condenseExpression();
				}
				break;

			case 4:
				{
				_localctx = new NumericalRealPositiveNumberExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241); numericalOperator();
				setState(242); match(REAL_NUMBER_CONSTANT);
				}
				break;

			case 5:
				{
				_localctx = new NumericalRealNumberExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244); match(REAL_NUMBER_CONSTANT);
				}
				break;

			case 6:
				{
				_localctx = new NumericalComplexNumberConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245); complexNumberConstant();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NumericalBinaryScalarExpressionLabelContext(new NumericalScalarExpressionContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_numericalScalarExpression);
					setState(248);
					if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
					setState(249); numericalOperator();
					setState(250); numericalScalarExpression(0);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComplexNumberConstantContext extends ParserRuleContext {
		public ComplexNumberConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexNumberConstant; }
	 
		public ComplexNumberConstantContext() { }
		public void copyFrom(ComplexNumberConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexNumberConstantLabelContext extends ComplexNumberConstantContext {
		public List<TerminalNode> REAL_NUMBER_CONSTANT() { return getTokens(wcpsParser.REAL_NUMBER_CONSTANT); }
		public TerminalNode COMMA() { return getToken(wcpsParser.COMMA, 0); }
		public TerminalNode REAL_NUMBER_CONSTANT(int i) {
			return getToken(wcpsParser.REAL_NUMBER_CONSTANT, i);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public ComplexNumberConstantLabelContext(ComplexNumberConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitComplexNumberConstantLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexNumberConstantContext complexNumberConstant() throws RecognitionException {
		ComplexNumberConstantContext _localctx = new ComplexNumberConstantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_complexNumberConstant);
		try {
			_localctx = new ComplexNumberConstantLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(LEFT_PARANTHESIS);
			setState(258); match(REAL_NUMBER_CONSTANT);
			setState(259); match(COMMA);
			setState(260); match(REAL_NUMBER_CONSTANT);
			setState(261); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericalOperatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(wcpsParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(wcpsParser.DIVISION, 0); }
		public TerminalNode MINUS() { return getToken(wcpsParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(wcpsParser.PLUS, 0); }
		public NumericalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalOperatorContext numericalOperator() throws RecognitionException {
		NumericalOperatorContext _localctx = new NumericalOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numericalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVISION) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << PLUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericalUnaryOperationContext extends ParserRuleContext {
		public TerminalNode ABSOLUTE_VALUE() { return getToken(wcpsParser.ABSOLUTE_VALUE, 0); }
		public TerminalNode SQUARE_ROOT() { return getToken(wcpsParser.SQUARE_ROOT, 0); }
		public TerminalNode IMAGINARY_PART() { return getToken(wcpsParser.IMAGINARY_PART, 0); }
		public TerminalNode MINUS() { return getToken(wcpsParser.MINUS, 0); }
		public TerminalNode REAL_PART() { return getToken(wcpsParser.REAL_PART, 0); }
		public TerminalNode PLUS() { return getToken(wcpsParser.PLUS, 0); }
		public TerminalNode ROUND() { return getToken(wcpsParser.ROUND, 0); }
		public NumericalUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalUnaryOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNumericalUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalUnaryOperationContext numericalUnaryOperation() throws RecognitionException {
		NumericalUnaryOperationContext _localctx = new NumericalUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numericalUnaryOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSOLUTE_VALUE) | (1L << IMAGINARY_PART) | (1L << MINUS) | (1L << PLUS) | (1L << REAL_PART) | (1L << ROUND))) != 0) || _la==SQUARE_ROOT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrigonometricOperatorContext extends ParserRuleContext {
		public TerminalNode ARCSIN() { return getToken(wcpsParser.ARCSIN, 0); }
		public TerminalNode TANH() { return getToken(wcpsParser.TANH, 0); }
		public TerminalNode ARCTAN() { return getToken(wcpsParser.ARCTAN, 0); }
		public TerminalNode TAN() { return getToken(wcpsParser.TAN, 0); }
		public TerminalNode SIN() { return getToken(wcpsParser.SIN, 0); }
		public TerminalNode SINH() { return getToken(wcpsParser.SINH, 0); }
		public TerminalNode ARCCOS() { return getToken(wcpsParser.ARCCOS, 0); }
		public TerminalNode COSH() { return getToken(wcpsParser.COSH, 0); }
		public TerminalNode COS() { return getToken(wcpsParser.COS, 0); }
		public TrigonometricOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigonometricOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitTrigonometricOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigonometricOperatorContext trigonometricOperator() throws RecognitionException {
		TrigonometricOperatorContext _localctx = new TrigonometricOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_trigonometricOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (ARCSIN - 6)) | (1L << (ARCCOS - 6)) | (1L << (ARCTAN - 6)) | (1L << (COS - 6)) | (1L << (COSH - 6)) | (1L << (SIN - 6)) | (1L << (SINH - 6)) | (1L << (TAN - 6)) | (1L << (TANH - 6)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetComponentExpressionContext extends ParserRuleContext {
		public DescribeCoverageExpressionContext describeCoverageExpression() {
			return getRuleContext(DescribeCoverageExpressionContext.class,0);
		}
		public CoverageIdentifierExpressionContext coverageIdentifierExpression() {
			return getRuleContext(CoverageIdentifierExpressionContext.class,0);
		}
		public GetComponentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getComponentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitGetComponentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetComponentExpressionContext getComponentExpression() throws RecognitionException {
		GetComponentExpressionContext _localctx = new GetComponentExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_getComponentExpression);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(269); coverageIdentifierExpression();
				}
				break;
			case DESCRIBE_COVERAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(270); describeCoverageExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverageIdentifierExpressionContext extends ParserRuleContext {
		public CoverageIdentifierExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverageIdentifierExpression; }
	 
		public CoverageIdentifierExpressionContext() { }
		public void copyFrom(CoverageIdentifierExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CoverageIdentifierExpressionLabelContext extends CoverageIdentifierExpressionContext {
		public TerminalNode ID() { return getToken(wcpsParser.ID, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageVariableNameContext coverageVariableName() {
			return getRuleContext(CoverageVariableNameContext.class,0);
		}
		public CoverageIdentifierExpressionLabelContext(CoverageIdentifierExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageIdentifierExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageIdentifierExpressionContext coverageIdentifierExpression() throws RecognitionException {
		CoverageIdentifierExpressionContext _localctx = new CoverageIdentifierExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_coverageIdentifierExpression);
		try {
			_localctx = new CoverageIdentifierExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(ID);
			setState(274); match(LEFT_PARANTHESIS);
			setState(275); coverageVariableName();
			setState(276); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeCoverageExpressionContext extends ParserRuleContext {
		public DescribeCoverageExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeCoverageExpression; }
	 
		public DescribeCoverageExpressionContext() { }
		public void copyFrom(DescribeCoverageExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DescribeCoverageExpressionLabelContext extends DescribeCoverageExpressionContext {
		public TerminalNode DESCRIBE_COVERAGE() { return getToken(wcpsParser.DESCRIBE_COVERAGE, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageVariableNameContext coverageVariableName() {
			return getRuleContext(CoverageVariableNameContext.class,0);
		}
		public DescribeCoverageExpressionLabelContext(DescribeCoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitDescribeCoverageExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeCoverageExpressionContext describeCoverageExpression() throws RecognitionException {
		DescribeCoverageExpressionContext _localctx = new DescribeCoverageExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_describeCoverageExpression);
		try {
			_localctx = new DescribeCoverageExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(DESCRIBE_COVERAGE);
			setState(279); match(LEFT_PARANTHESIS);
			setState(280); coverageVariableName();
			setState(281); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EncodedCoverageExpressionContext extends ParserRuleContext {
		public EncodedCoverageExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodedCoverageExpression; }
	 
		public EncodedCoverageExpressionContext() { }
		public void copyFrom(EncodedCoverageExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EncodedCoverageExpressionLabelContext extends EncodedCoverageExpressionContext {
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(wcpsParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(wcpsParser.STRING_LITERAL); }
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode ENCODE() { return getToken(wcpsParser.ENCODE, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public EncodedCoverageExpressionLabelContext(EncodedCoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitEncodedCoverageExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncodedCoverageExpressionContext encodedCoverageExpression() throws RecognitionException {
		EncodedCoverageExpressionContext _localctx = new EncodedCoverageExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_encodedCoverageExpression);
		int _la;
		try {
			_localctx = new EncodedCoverageExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(ENCODE);
			setState(284); match(LEFT_PARANTHESIS);
			setState(285); coverageExpression(0);
			setState(286); match(COMMA);
			setState(287); match(STRING_LITERAL);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288); match(COMMA);
				setState(289); match(STRING_LITERAL);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecodeCoverageExpressionContext extends ParserRuleContext {
		public DecodeCoverageExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decodeCoverageExpression; }
	 
		public DecodeCoverageExpressionContext() { }
		public void copyFrom(DecodeCoverageExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecodedCoverageExpressionLabelContext extends DecodeCoverageExpressionContext {
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(wcpsParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(wcpsParser.STRING_LITERAL); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode DECODE() { return getToken(wcpsParser.DECODE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public DecodedCoverageExpressionLabelContext(DecodeCoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitDecodedCoverageExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecodeCoverageExpressionContext decodeCoverageExpression() throws RecognitionException {
		DecodeCoverageExpressionContext _localctx = new DecodeCoverageExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decodeCoverageExpression);
		int _la;
		try {
			_localctx = new DecodedCoverageExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(DECODE);
			setState(298); match(LEFT_PARANTHESIS);
			setState(299); match(STRING_LITERAL);
			setState(300); match(COMMA);
			setState(301); match(STRING_LITERAL);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(302); match(COMMA);
				setState(303); match(STRING_LITERAL);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverageExpressionContext extends ParserRuleContext {
		public int _p;
		public CoverageExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CoverageExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_coverageExpression; }
	 
		public CoverageExpressionContext() { }
		public void copyFrom(CoverageExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class CoverageExpressionScalarLabelContext extends CoverageExpressionContext {
		public ScalarExpressionContext scalarExpression() {
			return getRuleContext(ScalarExpressionContext.class,0);
		}
		public CoverageExpressionScalarLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionScalarLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionLogicLabelContext extends CoverageExpressionContext {
		public BooleanOperatorContext booleanOperator() {
			return getRuleContext(BooleanOperatorContext.class,0);
		}
		public List<CoverageExpressionContext> coverageExpression() {
			return getRuleContexts(CoverageExpressionContext.class);
		}
		public CoverageExpressionContext coverageExpression(int i) {
			return getRuleContext(CoverageExpressionContext.class,i);
		}
		public CoverageExpressionLogicLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionLogicLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionUnaryBooleanLabelContext extends CoverageExpressionContext {
		public UnaryBooleanExpressionContext unaryBooleanExpression() {
			return getRuleContext(UnaryBooleanExpressionContext.class,0);
		}
		public CoverageExpressionUnaryBooleanLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionUnaryBooleanLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionOverlayLabelContext extends CoverageExpressionContext {
		public TerminalNode OVERLAY() { return getToken(wcpsParser.OVERLAY, 0); }
		public List<CoverageExpressionContext> coverageExpression() {
			return getRuleContexts(CoverageExpressionContext.class);
		}
		public CoverageExpressionContext coverageExpression(int i) {
			return getRuleContext(CoverageExpressionContext.class,i);
		}
		public CoverageExpressionOverlayLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionOverlayLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionTrigonometricLabelContext extends CoverageExpressionContext {
		public TrigonometricExpressionContext trigonometricExpression() {
			return getRuleContext(TrigonometricExpressionContext.class,0);
		}
		public CoverageExpressionTrigonometricLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionTrigonometricLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionUnaryArithmeticLabelContext extends CoverageExpressionContext {
		public UnaryArithmeticExpressionContext unaryArithmeticExpression() {
			return getRuleContext(UnaryArithmeticExpressionContext.class,0);
		}
		public CoverageExpressionUnaryArithmeticLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionUnaryArithmeticLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionExtendLabelContext extends CoverageExpressionContext {
		public TerminalNode RIGHT_BRACE() { return getToken(wcpsParser.RIGHT_BRACE, 0); }
		public DimensionIntervalListContext dimensionIntervalList() {
			return getRuleContext(DimensionIntervalListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(wcpsParser.COMMA, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(wcpsParser.LEFT_BRACE, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public TerminalNode EXTEND() { return getToken(wcpsParser.EXTEND, 0); }
		public CoverageExpressionExtendLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionExtendLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionVariableNameLabelContext extends CoverageExpressionContext {
		public CoverageVariableNameContext coverageVariableName() {
			return getRuleContext(CoverageVariableNameContext.class,0);
		}
		public CoverageExpressionVariableNameLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionVariableNameLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionConstantLabelContext extends CoverageExpressionContext {
		public CoverageConstantExpressionContext coverageConstantExpression() {
			return getRuleContext(CoverageConstantExpressionContext.class,0);
		}
		public CoverageExpressionConstantLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionConstantLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionCoverageLabelContext extends CoverageExpressionContext {
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public CoverageExpressionCoverageLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionCoverageLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionComparissonLabelContext extends CoverageExpressionContext {
		public NumericalComparissonOperatorContext numericalComparissonOperator() {
			return getRuleContext(NumericalComparissonOperatorContext.class,0);
		}
		public List<CoverageExpressionContext> coverageExpression() {
			return getRuleContexts(CoverageExpressionContext.class);
		}
		public CoverageExpressionContext coverageExpression(int i) {
			return getRuleContext(CoverageExpressionContext.class,i);
		}
		public CoverageExpressionComparissonLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionComparissonLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionShorthandSliceLabelContext extends CoverageExpressionContext {
		public DimensionPointListContext dimensionPointList() {
			return getRuleContext(DimensionPointListContext.class,0);
		}
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(wcpsParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(wcpsParser.RIGHT_BRACKET, 0); }
		public CoverageExpressionShorthandSliceLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionShorthandSliceLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionScaleLabelContext extends CoverageExpressionContext {
		public TerminalNode SCALE() { return getToken(wcpsParser.SCALE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(wcpsParser.RIGHT_BRACE, 0); }
		public List<FieldInterpolationListContext> fieldInterpolationList() {
			return getRuleContexts(FieldInterpolationListContext.class);
		}
		public DimensionIntervalListContext dimensionIntervalList() {
			return getRuleContext(DimensionIntervalListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public FieldInterpolationListContext fieldInterpolationList(int i) {
			return getRuleContext(FieldInterpolationListContext.class,i);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(wcpsParser.LEFT_BRACE, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public CoverageExpressionScaleLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionScaleLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionShorthandTrimLabelContext extends CoverageExpressionContext {
		public DimensionIntervalListContext dimensionIntervalList() {
			return getRuleContext(DimensionIntervalListContext.class,0);
		}
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(wcpsParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(wcpsParser.RIGHT_BRACKET, 0); }
		public CoverageExpressionShorthandTrimLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionShorthandTrimLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionPowerLabelContext extends CoverageExpressionContext {
		public UnaryPowerExpressionContext unaryPowerExpression() {
			return getRuleContext(UnaryPowerExpressionContext.class,0);
		}
		public CoverageExpressionPowerLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionPowerLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionConstructorLabelContext extends CoverageExpressionContext {
		public CoverageConstructorExpressionContext coverageConstructorExpression() {
			return getRuleContext(CoverageConstructorExpressionContext.class,0);
		}
		public CoverageExpressionConstructorLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionConstructorLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionRangeSubsettingLabelContext extends CoverageExpressionContext {
		public TerminalNode DOT() { return getToken(wcpsParser.DOT, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public CoverageExpressionRangeSubsettingLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionRangeSubsettingLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionCrsTransformLabelContext extends CoverageExpressionContext {
		public CrsTransformExpressionContext crsTransformExpression() {
			return getRuleContext(CrsTransformExpressionContext.class,0);
		}
		public CoverageExpressionCrsTransformLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionCrsTransformLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionExponentialLabelContext extends CoverageExpressionContext {
		public ExponentialExpressionContext exponentialExpression() {
			return getRuleContext(ExponentialExpressionContext.class,0);
		}
		public CoverageExpressionExponentialLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionExponentialLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionCastLabelContext extends CoverageExpressionContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CoverageExpressionCastLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionCastLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionSliceLabelContext extends CoverageExpressionContext {
		public TerminalNode RIGHT_BRACE() { return getToken(wcpsParser.RIGHT_BRACE, 0); }
		public DimensionPointListContext dimensionPointList() {
			return getRuleContext(DimensionPointListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(wcpsParser.COMMA, 0); }
		public TerminalNode SLICE() { return getToken(wcpsParser.SLICE, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(wcpsParser.LEFT_BRACE, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public CoverageExpressionSliceLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionSliceLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionTrimCoverageLabelContext extends CoverageExpressionContext {
		public TerminalNode RIGHT_BRACE() { return getToken(wcpsParser.RIGHT_BRACE, 0); }
		public DimensionIntervalListContext dimensionIntervalList() {
			return getRuleContext(DimensionIntervalListContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS(int i) {
			return getToken(wcpsParser.RIGHT_PARANTHESIS, i);
		}
		public TerminalNode COMMA() { return getToken(wcpsParser.COMMA, 0); }
		public TerminalNode TRIM() { return getToken(wcpsParser.TRIM, 0); }
		public List<TerminalNode> RIGHT_PARANTHESIS() { return getTokens(wcpsParser.RIGHT_PARANTHESIS); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(wcpsParser.LEFT_BRACE, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public CoverageExpressionTrimCoverageLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionTrimCoverageLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionArithmeticLabelContext extends CoverageExpressionContext {
		public CoverageArithmeticOperatorContext coverageArithmeticOperator() {
			return getRuleContext(CoverageArithmeticOperatorContext.class,0);
		}
		public List<CoverageExpressionContext> coverageExpression() {
			return getRuleContexts(CoverageExpressionContext.class);
		}
		public CoverageExpressionContext coverageExpression(int i) {
			return getRuleContext(CoverageExpressionContext.class,i);
		}
		public CoverageExpressionArithmeticLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionArithmeticLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionDecodeLabelContext extends CoverageExpressionContext {
		public DecodeCoverageExpressionContext decodeCoverageExpression() {
			return getRuleContext(DecodeCoverageExpressionContext.class,0);
		}
		public CoverageExpressionDecodeLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionDecodeLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoverageExpressionRangeConstructorLabelContext extends CoverageExpressionContext {
		public RangeConstructorExpressionContext rangeConstructorExpression() {
			return getRuleContext(RangeConstructorExpressionContext.class,0);
		}
		public CoverageExpressionRangeConstructorLabelContext(CoverageExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageExpressionRangeConstructorLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageExpressionContext coverageExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CoverageExpressionContext _localctx = new CoverageExpressionContext(_ctx, _parentState, _p);
		CoverageExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, RULE_coverageExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new CoverageExpressionVariableNameLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(312); coverageVariableName();
				}
				break;

			case 2:
				{
				_localctx = new CoverageExpressionScalarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313); scalarExpression();
				}
				break;

			case 3:
				{
				_localctx = new CoverageExpressionConstantLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314); coverageConstantExpression();
				}
				break;

			case 4:
				{
				_localctx = new CoverageExpressionConstructorLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315); coverageConstructorExpression();
				}
				break;

			case 5:
				{
				_localctx = new CoverageExpressionDecodeLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316); decodeCoverageExpression();
				}
				break;

			case 6:
				{
				_localctx = new CoverageExpressionTrimCoverageLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317); match(TRIM);
				setState(318); match(LEFT_PARANTHESIS);
				setState(319); coverageExpression(0);
				setState(320); match(COMMA);
				setState(321); match(LEFT_BRACE);
				setState(322); dimensionIntervalList();
				setState(323); match(RIGHT_BRACE);
				setState(325); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(324); match(RIGHT_PARANTHESIS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(327); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 7:
				{
				_localctx = new CoverageExpressionSliceLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329); match(SLICE);
				setState(330); match(LEFT_PARANTHESIS);
				setState(331); coverageExpression(0);
				setState(332); match(COMMA);
				setState(333); match(LEFT_BRACE);
				setState(334); dimensionPointList();
				setState(335); match(RIGHT_BRACE);
				setState(336); match(RIGHT_PARANTHESIS);
				}
				break;

			case 8:
				{
				_localctx = new CoverageExpressionExtendLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338); match(EXTEND);
				setState(339); match(LEFT_PARANTHESIS);
				setState(340); coverageExpression(0);
				setState(341); match(COMMA);
				setState(342); match(LEFT_BRACE);
				setState(343); dimensionIntervalList();
				setState(344); match(RIGHT_BRACE);
				setState(345); match(RIGHT_PARANTHESIS);
				}
				break;

			case 9:
				{
				_localctx = new CoverageExpressionUnaryArithmeticLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347); unaryArithmeticExpression();
				}
				break;

			case 10:
				{
				_localctx = new CoverageExpressionTrigonometricLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348); trigonometricExpression();
				}
				break;

			case 11:
				{
				_localctx = new CoverageExpressionExponentialLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349); exponentialExpression();
				}
				break;

			case 12:
				{
				_localctx = new CoverageExpressionPowerLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350); unaryPowerExpression();
				}
				break;

			case 13:
				{
				_localctx = new CoverageExpressionUnaryBooleanLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351); unaryBooleanExpression();
				}
				break;

			case 14:
				{
				_localctx = new CoverageExpressionCastLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352); castExpression();
				}
				break;

			case 15:
				{
				_localctx = new CoverageExpressionRangeConstructorLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353); rangeConstructorExpression();
				}
				break;

			case 16:
				{
				_localctx = new CoverageExpressionCrsTransformLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354); crsTransformExpression();
				}
				break;

			case 17:
				{
				_localctx = new CoverageExpressionScaleLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355); match(SCALE);
				setState(356); match(LEFT_PARANTHESIS);
				setState(357); coverageExpression(0);
				setState(358); match(COMMA);
				setState(359); match(LEFT_BRACE);
				setState(360); dimensionIntervalList();
				setState(361); match(RIGHT_BRACE);
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(362); match(COMMA);
					setState(363); fieldInterpolationList();
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369); match(RIGHT_PARANTHESIS);
				}
				break;

			case 18:
				{
				_localctx = new CoverageExpressionCoverageLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(371); match(LEFT_PARANTHESIS);
				setState(372); coverageExpression(0);
				setState(373); match(RIGHT_PARANTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(405);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new CoverageExpressionOverlayLabelContext(new CoverageExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_coverageExpression);
						setState(377);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(378); match(OVERLAY);
						setState(379); coverageExpression(24);
						}
						break;

					case 2:
						{
						_localctx = new CoverageExpressionLogicLabelContext(new CoverageExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_coverageExpression);
						setState(380);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(381); booleanOperator();
						setState(382); coverageExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new CoverageExpressionArithmeticLabelContext(new CoverageExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_coverageExpression);
						setState(384);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(385); coverageArithmeticOperator();
						setState(386); coverageExpression(0);
						}
						break;

					case 4:
						{
						_localctx = new CoverageExpressionComparissonLabelContext(new CoverageExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_coverageExpression);
						setState(388);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(389); numericalComparissonOperator();
						setState(390); coverageExpression(0);
						}
						break;

					case 5:
						{
						_localctx = new CoverageExpressionShorthandTrimLabelContext(new CoverageExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_coverageExpression);
						setState(392);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(393); match(LEFT_BRACKET);
						setState(394); dimensionIntervalList();
						setState(395); match(RIGHT_BRACKET);
						}
						break;

					case 6:
						{
						_localctx = new CoverageExpressionShorthandSliceLabelContext(new CoverageExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_coverageExpression);
						setState(397);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(398); match(LEFT_BRACKET);
						setState(399); dimensionPointList();
						setState(400); match(RIGHT_BRACKET);
						}
						break;

					case 7:
						{
						_localctx = new CoverageExpressionRangeSubsettingLabelContext(new CoverageExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_coverageExpression);
						setState(402);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(403); match(DOT);
						setState(404); fieldName();
						}
						break;
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CoverageArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(wcpsParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(wcpsParser.DIVISION, 0); }
		public TerminalNode MINUS() { return getToken(wcpsParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(wcpsParser.PLUS, 0); }
		public CoverageArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverageArithmeticOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageArithmeticOperatorContext coverageArithmeticOperator() throws RecognitionException {
		CoverageArithmeticOperatorContext _localctx = new CoverageArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_coverageArithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVISION) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << PLUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryArithmeticExpressionOperatorContext extends ParserRuleContext {
		public TerminalNode ABSOLUTE_VALUE() { return getToken(wcpsParser.ABSOLUTE_VALUE, 0); }
		public TerminalNode SQUARE_ROOT() { return getToken(wcpsParser.SQUARE_ROOT, 0); }
		public TerminalNode IMAGINARY_PART() { return getToken(wcpsParser.IMAGINARY_PART, 0); }
		public TerminalNode MINUS() { return getToken(wcpsParser.MINUS, 0); }
		public TerminalNode REAL_PART() { return getToken(wcpsParser.REAL_PART, 0); }
		public TerminalNode PLUS() { return getToken(wcpsParser.PLUS, 0); }
		public UnaryArithmeticExpressionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryArithmeticExpressionOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitUnaryArithmeticExpressionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryArithmeticExpressionOperatorContext unaryArithmeticExpressionOperator() throws RecognitionException {
		UnaryArithmeticExpressionOperatorContext _localctx = new UnaryArithmeticExpressionOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unaryArithmeticExpressionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSOLUTE_VALUE) | (1L << IMAGINARY_PART) | (1L << MINUS) | (1L << PLUS) | (1L << REAL_PART))) != 0) || _la==SQUARE_ROOT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryArithmeticExpressionContext extends ParserRuleContext {
		public UnaryArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryArithmeticExpression; }
	 
		public UnaryArithmeticExpressionContext() { }
		public void copyFrom(UnaryArithmeticExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryCoverageArithmeticExpressionLabelContext extends UnaryArithmeticExpressionContext {
		public UnaryArithmeticExpressionOperatorContext unaryArithmeticExpressionOperator() {
			return getRuleContext(UnaryArithmeticExpressionOperatorContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public UnaryCoverageArithmeticExpressionLabelContext(UnaryArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitUnaryCoverageArithmeticExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryArithmeticExpressionContext unaryArithmeticExpression() throws RecognitionException {
		UnaryArithmeticExpressionContext _localctx = new UnaryArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unaryArithmeticExpression);
		try {
			_localctx = new UnaryCoverageArithmeticExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(414); unaryArithmeticExpressionOperator();
			setState(415); match(LEFT_PARANTHESIS);
			setState(416); coverageExpression(0);
			setState(417); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrigonometricExpressionContext extends ParserRuleContext {
		public TrigonometricExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigonometricExpression; }
	 
		public TrigonometricExpressionContext() { }
		public void copyFrom(TrigonometricExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrigonometricExpressionLabelContext extends TrigonometricExpressionContext {
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public TrigonometricOperatorContext trigonometricOperator() {
			return getRuleContext(TrigonometricOperatorContext.class,0);
		}
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public TrigonometricExpressionLabelContext(TrigonometricExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitTrigonometricExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigonometricExpressionContext trigonometricExpression() throws RecognitionException {
		TrigonometricExpressionContext _localctx = new TrigonometricExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_trigonometricExpression);
		try {
			_localctx = new TrigonometricExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(419); trigonometricOperator();
			setState(420); match(LEFT_PARANTHESIS);
			setState(421); coverageExpression(0);
			setState(422); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentialExpressionOperatorContext extends ParserRuleContext {
		public TerminalNode LN() { return getToken(wcpsParser.LN, 0); }
		public TerminalNode LOG() { return getToken(wcpsParser.LOG, 0); }
		public TerminalNode EXP() { return getToken(wcpsParser.EXP, 0); }
		public ExponentialExpressionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentialExpressionOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitExponentialExpressionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentialExpressionOperatorContext exponentialExpressionOperator() throws RecognitionException {
		ExponentialExpressionOperatorContext _localctx = new ExponentialExpressionOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exponentialExpressionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXP) | (1L << LN) | (1L << LOG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentialExpressionContext extends ParserRuleContext {
		public ExponentialExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentialExpression; }
	 
		public ExponentialExpressionContext() { }
		public void copyFrom(ExponentialExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExponentialExpressionLabelContext extends ExponentialExpressionContext {
		public ExponentialExpressionOperatorContext exponentialExpressionOperator() {
			return getRuleContext(ExponentialExpressionOperatorContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public ExponentialExpressionLabelContext(ExponentialExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitExponentialExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentialExpressionContext exponentialExpression() throws RecognitionException {
		ExponentialExpressionContext _localctx = new ExponentialExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exponentialExpression);
		try {
			_localctx = new ExponentialExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(426); exponentialExpressionOperator();
			setState(427); match(LEFT_PARANTHESIS);
			setState(428); coverageExpression(0);
			setState(429); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryPowerExpressionContext extends ParserRuleContext {
		public UnaryPowerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPowerExpression; }
	 
		public UnaryPowerExpressionContext() { }
		public void copyFrom(UnaryPowerExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryPowerExpressionLabelContext extends UnaryPowerExpressionContext {
		public NumericalScalarExpressionContext numericalScalarExpression() {
			return getRuleContext(NumericalScalarExpressionContext.class,0);
		}
		public TerminalNode POWER() { return getToken(wcpsParser.POWER, 0); }
		public TerminalNode COMMA() { return getToken(wcpsParser.COMMA, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public UnaryPowerExpressionLabelContext(UnaryPowerExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitUnaryPowerExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPowerExpressionContext unaryPowerExpression() throws RecognitionException {
		UnaryPowerExpressionContext _localctx = new UnaryPowerExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unaryPowerExpression);
		try {
			_localctx = new UnaryPowerExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(431); match(POWER);
			setState(432); match(LEFT_PARANTHESIS);
			setState(433); coverageExpression(0);
			setState(434); match(COMMA);
			setState(435); numericalScalarExpression(0);
			setState(436); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryBooleanExpressionContext extends ParserRuleContext {
		public UnaryBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryBooleanExpression; }
	 
		public UnaryBooleanExpressionContext() { }
		public void copyFrom(UnaryBooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BitUnaryBooleanExpressionLabelContext extends UnaryBooleanExpressionContext {
		public NumericalScalarExpressionContext numericalScalarExpression() {
			return getRuleContext(NumericalScalarExpressionContext.class,0);
		}
		public TerminalNode BIT() { return getToken(wcpsParser.BIT, 0); }
		public TerminalNode COMMA() { return getToken(wcpsParser.COMMA, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public BitUnaryBooleanExpressionLabelContext(UnaryBooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitBitUnaryBooleanExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotUnaryBooleanExpressionLabelContext extends UnaryBooleanExpressionContext {
		public TerminalNode NOT() { return getToken(wcpsParser.NOT, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public NotUnaryBooleanExpressionLabelContext(UnaryBooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNotUnaryBooleanExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryBooleanExpressionContext unaryBooleanExpression() throws RecognitionException {
		UnaryBooleanExpressionContext _localctx = new UnaryBooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unaryBooleanExpression);
		try {
			setState(450);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotUnaryBooleanExpressionLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(438); match(NOT);
				setState(439); match(LEFT_PARANTHESIS);
				setState(440); coverageExpression(0);
				setState(441); match(RIGHT_PARANTHESIS);
				}
				break;
			case BIT:
				_localctx = new BitUnaryBooleanExpressionLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(443); match(BIT);
				setState(444); match(LEFT_PARANTHESIS);
				setState(445); coverageExpression(0);
				setState(446); match(COMMA);
				setState(447); numericalScalarExpression(0);
				setState(448); match(RIGHT_PARANTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(wcpsParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(wcpsParser.IDENTIFIER); }
		public RangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitRangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeTypeContext rangeType() throws RecognitionException {
		RangeTypeContext _localctx = new RangeTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rangeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); match(IDENTIFIER);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(453); match(IDENTIFIER);
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CastExpressionLabelContext extends CastExpressionContext {
		public RangeTypeContext rangeType() {
			return getRuleContext(RangeTypeContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public CastExpressionLabelContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCastExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_castExpression);
		try {
			_localctx = new CastExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(LEFT_PARANTHESIS);
			setState(460); rangeType();
			setState(461); match(RIGHT_PARANTHESIS);
			setState(462); coverageExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER_CONSTANT() { return getToken(wcpsParser.REAL_NUMBER_CONSTANT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(wcpsParser.IDENTIFIER, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fieldName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_la = _input.LA(1);
			if ( !(_la==REAL_NUMBER_CONSTANT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeConstructorExpressionContext extends ParserRuleContext {
		public RangeConstructorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeConstructorExpression; }
	 
		public RangeConstructorExpressionContext() { }
		public void copyFrom(RangeConstructorExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RangeConstructorExpressionLabelContext extends RangeConstructorExpressionContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(wcpsParser.SEMICOLON); }
		public TerminalNode RIGHT_BRACE() { return getToken(wcpsParser.RIGHT_BRACE, 0); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(wcpsParser.SEMICOLON, i);
		}
		public TerminalNode COLON(int i) {
			return getToken(wcpsParser.COLON, i);
		}
		public List<CoverageExpressionContext> coverageExpression() {
			return getRuleContexts(CoverageExpressionContext.class);
		}
		public TerminalNode LEFT_BRACE() { return getToken(wcpsParser.LEFT_BRACE, 0); }
		public CoverageExpressionContext coverageExpression(int i) {
			return getRuleContext(CoverageExpressionContext.class,i);
		}
		public FieldNameContext fieldName(int i) {
			return getRuleContext(FieldNameContext.class,i);
		}
		public List<FieldNameContext> fieldName() {
			return getRuleContexts(FieldNameContext.class);
		}
		public List<TerminalNode> COLON() { return getTokens(wcpsParser.COLON); }
		public RangeConstructorExpressionLabelContext(RangeConstructorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitRangeConstructorExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeConstructorExpressionContext rangeConstructorExpression() throws RecognitionException {
		RangeConstructorExpressionContext _localctx = new RangeConstructorExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rangeConstructorExpression);
		int _la;
		try {
			_localctx = new RangeConstructorExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(466); match(LEFT_BRACE);
			{
			setState(467); fieldName();
			setState(468); match(COLON);
			setState(469); coverageExpression(0);
			}
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(471); match(SEMICOLON);
				setState(472); fieldName();
				setState(473); match(COLON);
				setState(474); coverageExpression(0);
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481); match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrsTransformExpressionContext extends ParserRuleContext {
		public CrsTransformExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crsTransformExpression; }
	 
		public CrsTransformExpressionContext() { }
		public void copyFrom(CrsTransformExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CrsTransformExpressionLabelContext extends CrsTransformExpressionContext {
		public FieldInterpolationListContext fieldInterpolationList() {
			return getRuleContext(FieldInterpolationListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public TerminalNode CRS_TRANSFORM() { return getToken(wcpsParser.CRS_TRANSFORM, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public DimensionCrsListContext dimensionCrsList() {
			return getRuleContext(DimensionCrsListContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public CrsTransformExpressionLabelContext(CrsTransformExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCrsTransformExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrsTransformExpressionContext crsTransformExpression() throws RecognitionException {
		CrsTransformExpressionContext _localctx = new CrsTransformExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_crsTransformExpression);
		try {
			_localctx = new CrsTransformExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(483); match(CRS_TRANSFORM);
			setState(484); match(LEFT_PARANTHESIS);
			setState(485); coverageExpression(0);
			setState(486); match(COMMA);
			setState(487); dimensionCrsList();
			setState(488); match(COMMA);
			setState(489); fieldInterpolationList();
			setState(490); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionPointListContext extends ParserRuleContext {
		public DimensionPointListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionPointList; }
	 
		public DimensionPointListContext() { }
		public void copyFrom(DimensionPointListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimensionPointListLabelContext extends DimensionPointListContext {
		public List<DimensionPointElementContext> dimensionPointElement() {
			return getRuleContexts(DimensionPointElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public DimensionPointElementContext dimensionPointElement(int i) {
			return getRuleContext(DimensionPointElementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public DimensionPointListLabelContext(DimensionPointListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitDimensionPointListLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionPointListContext dimensionPointList() throws RecognitionException {
		DimensionPointListContext _localctx = new DimensionPointListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dimensionPointList);
		int _la;
		try {
			_localctx = new DimensionPointListLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(492); dimensionPointElement();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(493); match(COMMA);
				setState(494); dimensionPointElement();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionPointElementContext extends ParserRuleContext {
		public DimensionPointElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionPointElement; }
	 
		public DimensionPointElementContext() { }
		public void copyFrom(DimensionPointElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimensionPointElementLabelContext extends DimensionPointElementContext {
		public CrsNameContext crsName() {
			return getRuleContext(CrsNameContext.class,0);
		}
		public AxisNameContext axisName() {
			return getRuleContext(AxisNameContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(wcpsParser.COLON, 0); }
		public DimensionPointElementLabelContext(DimensionPointElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitDimensionPointElementLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionPointElementContext dimensionPointElement() throws RecognitionException {
		DimensionPointElementContext _localctx = new DimensionPointElementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dimensionPointElement);
		int _la;
		try {
			_localctx = new DimensionPointElementLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(500); axisName();
			setState(503);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(501); match(COLON);
				setState(502); crsName();
				}
			}

			setState(505); match(LEFT_PARANTHESIS);
			setState(506); coverageExpression(0);
			setState(507); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionIntervalListContext extends ParserRuleContext {
		public DimensionIntervalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionIntervalList; }
	 
		public DimensionIntervalListContext() { }
		public void copyFrom(DimensionIntervalListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimensionIntervalListLabelContext extends DimensionIntervalListContext {
		public DimensionIntervalElementContext dimensionIntervalElement(int i) {
			return getRuleContext(DimensionIntervalElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public List<DimensionIntervalElementContext> dimensionIntervalElement() {
			return getRuleContexts(DimensionIntervalElementContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public DimensionIntervalListLabelContext(DimensionIntervalListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitDimensionIntervalListLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionIntervalListContext dimensionIntervalList() throws RecognitionException {
		DimensionIntervalListContext _localctx = new DimensionIntervalListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dimensionIntervalList);
		int _la;
		try {
			_localctx = new DimensionIntervalListLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(509); dimensionIntervalElement();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(510); match(COMMA);
				setState(511); dimensionIntervalElement();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionIntervalElementContext extends ParserRuleContext {
		public DimensionIntervalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionIntervalElement; }
	 
		public DimensionIntervalElementContext() { }
		public void copyFrom(DimensionIntervalElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrimDimensionIntervalElementLabelContext extends DimensionIntervalElementContext {
		public CrsNameContext crsName() {
			return getRuleContext(CrsNameContext.class,0);
		}
		public AxisNameContext axisName() {
			return getRuleContext(AxisNameContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(wcpsParser.COLON, i);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public List<CoverageExpressionContext> coverageExpression() {
			return getRuleContexts(CoverageExpressionContext.class);
		}
		public CoverageExpressionContext coverageExpression(int i) {
			return getRuleContext(CoverageExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(wcpsParser.COLON); }
		public TrimDimensionIntervalElementLabelContext(DimensionIntervalElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitTrimDimensionIntervalElementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SliceDimensionIntervalElementLabelContext extends DimensionIntervalElementContext {
		public CrsNameContext crsName() {
			return getRuleContext(CrsNameContext.class,0);
		}
		public AxisNameContext axisName() {
			return getRuleContext(AxisNameContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(wcpsParser.COLON, 0); }
		public SliceDimensionIntervalElementLabelContext(DimensionIntervalElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitSliceDimensionIntervalElementLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionIntervalElementContext dimensionIntervalElement() throws RecognitionException {
		DimensionIntervalElementContext _localctx = new DimensionIntervalElementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_dimensionIntervalElement);
		int _la;
		try {
			setState(537);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new TrimDimensionIntervalElementLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(517); axisName();
				setState(520);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(518); match(COLON);
					setState(519); crsName();
					}
				}

				setState(522); match(LEFT_PARANTHESIS);
				setState(523); coverageExpression(0);
				setState(524); match(COLON);
				setState(525); coverageExpression(0);
				setState(526); match(RIGHT_PARANTHESIS);
				}
				break;

			case 2:
				_localctx = new SliceDimensionIntervalElementLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(528); axisName();
				setState(531);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(529); match(COLON);
					setState(530); crsName();
					}
				}

				setState(533); match(LEFT_PARANTHESIS);
				setState(534); coverageExpression(0);
				setState(535); match(RIGHT_PARANTHESIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionCrsListContext extends ParserRuleContext {
		public DimensionCrsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionCrsList; }
	 
		public DimensionCrsListContext() { }
		public void copyFrom(DimensionCrsListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimensionCrsListLabelContext extends DimensionCrsListContext {
		public TerminalNode RIGHT_BRACE() { return getToken(wcpsParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public DimensionCrsElementContext dimensionCrsElement(int i) {
			return getRuleContext(DimensionCrsElementContext.class,i);
		}
		public List<DimensionCrsElementContext> dimensionCrsElement() {
			return getRuleContexts(DimensionCrsElementContext.class);
		}
		public TerminalNode LEFT_BRACE() { return getToken(wcpsParser.LEFT_BRACE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public DimensionCrsListLabelContext(DimensionCrsListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitDimensionCrsListLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionCrsListContext dimensionCrsList() throws RecognitionException {
		DimensionCrsListContext _localctx = new DimensionCrsListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dimensionCrsList);
		int _la;
		try {
			_localctx = new DimensionCrsListLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(539); match(LEFT_BRACE);
			setState(540); dimensionCrsElement();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(541); match(COMMA);
				setState(542); dimensionCrsElement();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548); match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionCrsElementContext extends ParserRuleContext {
		public DimensionCrsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionCrsElement; }
	 
		public DimensionCrsElementContext() { }
		public void copyFrom(DimensionCrsElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimensionCrsElementLabelContext extends DimensionCrsElementContext {
		public CrsNameContext crsName() {
			return getRuleContext(CrsNameContext.class,0);
		}
		public AxisNameContext axisName() {
			return getRuleContext(AxisNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(wcpsParser.COLON, 0); }
		public DimensionCrsElementLabelContext(DimensionCrsElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitDimensionCrsElementLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionCrsElementContext dimensionCrsElement() throws RecognitionException {
		DimensionCrsElementContext _localctx = new DimensionCrsElementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dimensionCrsElement);
		try {
			_localctx = new DimensionCrsElementLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(550); axisName();
			setState(551); match(COLON);
			setState(552); crsName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldInterpolationListContext extends ParserRuleContext {
		public FieldInterpolationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldInterpolationList; }
	 
		public FieldInterpolationListContext() { }
		public void copyFrom(FieldInterpolationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldInterpolationListLabelContext extends FieldInterpolationListContext {
		public TerminalNode RIGHT_BRACE() { return getToken(wcpsParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public TerminalNode LEFT_BRACE() { return getToken(wcpsParser.LEFT_BRACE, 0); }
		public FieldInterpolationListElementContext fieldInterpolationListElement(int i) {
			return getRuleContext(FieldInterpolationListElementContext.class,i);
		}
		public List<FieldInterpolationListElementContext> fieldInterpolationListElement() {
			return getRuleContexts(FieldInterpolationListElementContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public FieldInterpolationListLabelContext(FieldInterpolationListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitFieldInterpolationListLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldInterpolationListContext fieldInterpolationList() throws RecognitionException {
		FieldInterpolationListContext _localctx = new FieldInterpolationListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fieldInterpolationList);
		int _la;
		try {
			_localctx = new FieldInterpolationListLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(554); match(LEFT_BRACE);
			setState(555); fieldInterpolationListElement();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(556); match(COMMA);
				setState(557); fieldInterpolationListElement();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563); match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldInterpolationListElementContext extends ParserRuleContext {
		public FieldInterpolationListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldInterpolationListElement; }
	 
		public FieldInterpolationListElementContext() { }
		public void copyFrom(FieldInterpolationListElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldInterpolationListElementLabelContext extends FieldInterpolationListElementContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public InterpolationMethodContext interpolationMethod() {
			return getRuleContext(InterpolationMethodContext.class,0);
		}
		public FieldInterpolationListElementLabelContext(FieldInterpolationListElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitFieldInterpolationListElementLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldInterpolationListElementContext fieldInterpolationListElement() throws RecognitionException {
		FieldInterpolationListElementContext _localctx = new FieldInterpolationListElementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fieldInterpolationListElement);
		try {
			_localctx = new FieldInterpolationListElementLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(565); fieldName();
			setState(566); interpolationMethod();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterpolationMethodContext extends ParserRuleContext {
		public InterpolationMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationMethod; }
	 
		public InterpolationMethodContext() { }
		public void copyFrom(InterpolationMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InterpolationMethodLabelContext extends InterpolationMethodContext {
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public NullResistanceContext nullResistance() {
			return getRuleContext(NullResistanceContext.class,0);
		}
		public TerminalNode COLON() { return getToken(wcpsParser.COLON, 0); }
		public InterpolationTypeContext interpolationType() {
			return getRuleContext(InterpolationTypeContext.class,0);
		}
		public InterpolationMethodLabelContext(InterpolationMethodContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitInterpolationMethodLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationMethodContext interpolationMethod() throws RecognitionException {
		InterpolationMethodContext _localctx = new InterpolationMethodContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interpolationMethod);
		try {
			_localctx = new InterpolationMethodLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(LEFT_PARANTHESIS);
			setState(569); interpolationType();
			setState(570); match(COLON);
			setState(571); nullResistance();
			setState(572); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullResistanceContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(wcpsParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(wcpsParser.FALSE, 0); }
		public NullResistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullResistance; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitNullResistance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullResistanceContext nullResistance() throws RecognitionException {
		NullResistanceContext _localctx = new NullResistanceContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_nullResistance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterpolationTypeContext extends ParserRuleContext {
		public InterpolationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationType; }
	 
		public InterpolationTypeContext() { }
		public void copyFrom(InterpolationTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InterpolationTypeLabelContext extends InterpolationTypeContext {
		public TerminalNode STRING_LITERAL() { return getToken(wcpsParser.STRING_LITERAL, 0); }
		public InterpolationTypeLabelContext(InterpolationTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitInterpolationTypeLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationTypeContext interpolationType() throws RecognitionException {
		InterpolationTypeContext _localctx = new InterpolationTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_interpolationType);
		try {
			_localctx = new InterpolationTypeLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(576); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverageConstructorExpressionContext extends ParserRuleContext {
		public CoverageConstructorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverageConstructorExpression; }
	 
		public CoverageConstructorExpressionContext() { }
		public void copyFrom(CoverageConstructorExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CoverageConstructorExpressionLabelContext extends CoverageConstructorExpressionContext {
		public TerminalNode OVER() { return getToken(wcpsParser.OVER, 0); }
		public AxisIteratorContext axisIterator(int i) {
			return getRuleContext(AxisIteratorContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(wcpsParser.IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public List<AxisIteratorContext> axisIterator() {
			return getRuleContexts(AxisIteratorContext.class);
		}
		public TerminalNode COVERAGE() { return getToken(wcpsParser.COVERAGE, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(wcpsParser.VALUES, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public CoverageConstructorExpressionLabelContext(CoverageConstructorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageConstructorExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageConstructorExpressionContext coverageConstructorExpression() throws RecognitionException {
		CoverageConstructorExpressionContext _localctx = new CoverageConstructorExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_coverageConstructorExpression);
		int _la;
		try {
			_localctx = new CoverageConstructorExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(578); match(COVERAGE);
			setState(579); match(IDENTIFIER);
			setState(580); match(OVER);
			setState(581); axisIterator();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(582); match(COMMA);
				setState(583); axisIterator();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589); match(VALUES);
			setState(590); coverageExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AxisIteratorContext extends ParserRuleContext {
		public AxisIteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisIterator; }
	 
		public AxisIteratorContext() { }
		public void copyFrom(AxisIteratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AxisIteratorLabelContext extends AxisIteratorContext {
		public DimensionIntervalElementContext dimensionIntervalElement() {
			return getRuleContext(DimensionIntervalElementContext.class,0);
		}
		public CoverageVariableNameContext coverageVariableName() {
			return getRuleContext(CoverageVariableNameContext.class,0);
		}
		public AxisIteratorLabelContext(AxisIteratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitAxisIteratorLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxisIteratorContext axisIterator() throws RecognitionException {
		AxisIteratorContext _localctx = new AxisIteratorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_axisIterator);
		try {
			_localctx = new AxisIteratorLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(592); coverageVariableName();
			setState(593); dimensionIntervalElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalExpressionContext extends ParserRuleContext {
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
	 
		public IntervalExpressionContext() { }
		public void copyFrom(IntervalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntervalExpressionLabelContext extends IntervalExpressionContext {
		public ScalarExpressionContext scalarExpression(int i) {
			return getRuleContext(ScalarExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(wcpsParser.COLON, 0); }
		public List<ScalarExpressionContext> scalarExpression() {
			return getRuleContexts(ScalarExpressionContext.class);
		}
		public IntervalExpressionLabelContext(IntervalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitIntervalExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CRSIntervalExpressionLabelContext extends IntervalExpressionContext {
		public AxisNameContext axisName() {
			return getRuleContext(AxisNameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(wcpsParser.COMMA, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageVariableNameContext coverageVariableName() {
			return getRuleContext(CoverageVariableNameContext.class,0);
		}
		public TerminalNode IMGCRSDOMAIN() { return getToken(wcpsParser.IMGCRSDOMAIN, 0); }
		public CRSIntervalExpressionLabelContext(IntervalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCRSIntervalExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_intervalExpression);
		try {
			setState(606);
			switch (_input.LA(1)) {
			case ABSOLUTE_VALUE:
			case ADD:
			case ALL:
			case ARCSIN:
			case ARCCOS:
			case ARCTAN:
			case AVG:
			case CONDENSE:
			case COS:
			case COSH:
			case COUNT:
			case DESCRIBE_COVERAGE:
			case DIVISION:
			case FALSE:
			case IMAGINARY_PART:
			case ID:
			case LEFT_PARANTHESIS:
			case MAX:
			case MIN:
			case MINUS:
			case MULTIPLICATION:
			case NOT:
			case PLUS:
			case REAL_PART:
			case ROUND:
			case SIN:
			case SINH:
			case SOME:
			case SQUARE_ROOT:
			case TAN:
			case TANH:
			case TRUE:
			case REAL_NUMBER_CONSTANT:
			case STRING_LITERAL:
				_localctx = new IntervalExpressionLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(595); scalarExpression();
				setState(596); match(COLON);
				setState(597); scalarExpression();
				}
				break;
			case IMGCRSDOMAIN:
				_localctx = new CRSIntervalExpressionLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(599); match(IMGCRSDOMAIN);
				setState(600); match(LEFT_PARANTHESIS);
				setState(601); coverageVariableName();
				setState(602); match(COMMA);
				setState(603); axisName();
				setState(604); match(RIGHT_PARANTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverageConstantExpressionContext extends ParserRuleContext {
		public CoverageConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverageConstantExpression; }
	 
		public CoverageConstantExpressionContext() { }
		public void copyFrom(CoverageConstantExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CoverageConstantExpressionLabelContext extends CoverageConstantExpressionContext {
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(wcpsParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(wcpsParser.SEMICOLON, i);
		}
		public AxisIteratorContext axisIterator(int i) {
			return getRuleContext(AxisIteratorContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(wcpsParser.GREATER_THAN, 0); }
		public List<AxisIteratorContext> axisIterator() {
			return getRuleContexts(AxisIteratorContext.class);
		}
		public TerminalNode LOWER_THAN() { return getToken(wcpsParser.LOWER_THAN, 0); }
		public TerminalNode LIST() { return getToken(wcpsParser.LIST, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public TerminalNode OVER() { return getToken(wcpsParser.OVER, 0); }
		public TerminalNode VALUE() { return getToken(wcpsParser.VALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(wcpsParser.IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public TerminalNode COVERAGE() { return getToken(wcpsParser.COVERAGE, 0); }
		public CoverageConstantExpressionLabelContext(CoverageConstantExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCoverageConstantExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageConstantExpressionContext coverageConstantExpression() throws RecognitionException {
		CoverageConstantExpressionContext _localctx = new CoverageConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_coverageConstantExpression);
		int _la;
		try {
			_localctx = new CoverageConstantExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(608); match(COVERAGE);
			setState(609); match(IDENTIFIER);
			setState(610); match(OVER);
			setState(611); axisIterator();
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(612); match(COMMA);
				setState(613); axisIterator();
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619); match(VALUE);
			setState(620); match(LIST);
			setState(621); match(LOWER_THAN);
			setState(622); constant();
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(623); match(SEMICOLON);
				setState(624); constant();
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630); match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AxisSpecContext extends ParserRuleContext {
		public AxisSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisSpec; }
	 
		public AxisSpecContext() { }
		public void copyFrom(AxisSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AxisSpecLabelContext extends AxisSpecContext {
		public DimensionIntervalElementContext dimensionIntervalElement() {
			return getRuleContext(DimensionIntervalElementContext.class,0);
		}
		public AxisSpecLabelContext(AxisSpecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitAxisSpecLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxisSpecContext axisSpec() throws RecognitionException {
		AxisSpecContext _localctx = new AxisSpecContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_axisSpec);
		try {
			_localctx = new AxisSpecLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(632); dimensionIntervalElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondenseExpressionContext extends ParserRuleContext {
		public ReduceExpressionContext reduceExpression() {
			return getRuleContext(ReduceExpressionContext.class,0);
		}
		public GeneralCondenseExpressionContext generalCondenseExpression() {
			return getRuleContext(GeneralCondenseExpressionContext.class,0);
		}
		public CondenseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condenseExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCondenseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondenseExpressionContext condenseExpression() throws RecognitionException {
		CondenseExpressionContext _localctx = new CondenseExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_condenseExpression);
		try {
			setState(636);
			switch (_input.LA(1)) {
			case ADD:
			case ALL:
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(634); reduceExpression();
				}
				break;
			case CONDENSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(635); generalCondenseExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReduceBooleanExpressionOperatorContext extends ParserRuleContext {
		public TerminalNode SOME() { return getToken(wcpsParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(wcpsParser.ALL, 0); }
		public ReduceBooleanExpressionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduceBooleanExpressionOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitReduceBooleanExpressionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReduceBooleanExpressionOperatorContext reduceBooleanExpressionOperator() throws RecognitionException {
		ReduceBooleanExpressionOperatorContext _localctx = new ReduceBooleanExpressionOperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_reduceBooleanExpressionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==SOME) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReduceNumericalExpressionOperatorContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(wcpsParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(wcpsParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(wcpsParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(wcpsParser.MAX, 0); }
		public TerminalNode ADD() { return getToken(wcpsParser.ADD, 0); }
		public ReduceNumericalExpressionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduceNumericalExpressionOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitReduceNumericalExpressionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReduceNumericalExpressionOperatorContext reduceNumericalExpressionOperator() throws RecognitionException {
		ReduceNumericalExpressionOperatorContext _localctx = new ReduceNumericalExpressionOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_reduceNumericalExpressionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReduceBooleanExpressionContext extends ParserRuleContext {
		public ReduceBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduceBooleanExpression; }
	 
		public ReduceBooleanExpressionContext() { }
		public void copyFrom(ReduceBooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReduceBooleanExpressionLabelContext extends ReduceBooleanExpressionContext {
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public ReduceBooleanExpressionOperatorContext reduceBooleanExpressionOperator() {
			return getRuleContext(ReduceBooleanExpressionOperatorContext.class,0);
		}
		public ReduceBooleanExpressionLabelContext(ReduceBooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitReduceBooleanExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReduceBooleanExpressionContext reduceBooleanExpression() throws RecognitionException {
		ReduceBooleanExpressionContext _localctx = new ReduceBooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_reduceBooleanExpression);
		try {
			_localctx = new ReduceBooleanExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(642); reduceBooleanExpressionOperator();
			setState(643); match(LEFT_PARANTHESIS);
			setState(644); coverageExpression(0);
			setState(645); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReduceNumericalExpressionContext extends ParserRuleContext {
		public ReduceNumericalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduceNumericalExpression; }
	 
		public ReduceNumericalExpressionContext() { }
		public void copyFrom(ReduceNumericalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReduceNumericalExpressionLabelContext extends ReduceNumericalExpressionContext {
		public ReduceNumericalExpressionOperatorContext reduceNumericalExpressionOperator() {
			return getRuleContext(ReduceNumericalExpressionOperatorContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(wcpsParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(wcpsParser.LEFT_PARANTHESIS, 0); }
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public ReduceNumericalExpressionLabelContext(ReduceNumericalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitReduceNumericalExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReduceNumericalExpressionContext reduceNumericalExpression() throws RecognitionException {
		ReduceNumericalExpressionContext _localctx = new ReduceNumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_reduceNumericalExpression);
		try {
			_localctx = new ReduceNumericalExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(647); reduceNumericalExpressionOperator();
			setState(648); match(LEFT_PARANTHESIS);
			setState(649); coverageExpression(0);
			setState(650); match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReduceExpressionContext extends ParserRuleContext {
		public ReduceBooleanExpressionContext reduceBooleanExpression() {
			return getRuleContext(ReduceBooleanExpressionContext.class,0);
		}
		public ReduceNumericalExpressionContext reduceNumericalExpression() {
			return getRuleContext(ReduceNumericalExpressionContext.class,0);
		}
		public ReduceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduceExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitReduceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReduceExpressionContext reduceExpression() throws RecognitionException {
		ReduceExpressionContext _localctx = new ReduceExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_reduceExpression);
		try {
			setState(654);
			switch (_input.LA(1)) {
			case ALL:
			case SOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(652); reduceBooleanExpression();
				}
				break;
			case ADD:
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(653); reduceNumericalExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondenseExpressionOperatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(wcpsParser.MULTIPLICATION, 0); }
		public TerminalNode AND() { return getToken(wcpsParser.AND, 0); }
		public TerminalNode OR() { return getToken(wcpsParser.OR, 0); }
		public TerminalNode MIN() { return getToken(wcpsParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(wcpsParser.MAX, 0); }
		public TerminalNode PLUS() { return getToken(wcpsParser.PLUS, 0); }
		public CondenseExpressionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condenseExpressionOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCondenseExpressionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondenseExpressionOperatorContext condenseExpressionOperator() throws RecognitionException {
		CondenseExpressionOperatorContext _localctx = new CondenseExpressionOperatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_condenseExpressionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MAX) | (1L << MIN) | (1L << MULTIPLICATION) | (1L << OR) | (1L << PLUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralCondenseExpressionContext extends ParserRuleContext {
		public GeneralCondenseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalCondenseExpression; }
	 
		public GeneralCondenseExpressionContext() { }
		public void copyFrom(GeneralCondenseExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GeneralCondenseExpressionLabelContext extends GeneralCondenseExpressionContext {
		public TerminalNode WHERE() { return getToken(wcpsParser.WHERE, 0); }
		public TerminalNode OVER() { return getToken(wcpsParser.OVER, 0); }
		public TerminalNode CONDENSE() { return getToken(wcpsParser.CONDENSE, 0); }
		public AxisIteratorContext axisIterator(int i) {
			return getRuleContext(AxisIteratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(wcpsParser.COMMA); }
		public TerminalNode USING() { return getToken(wcpsParser.USING, 0); }
		public List<AxisIteratorContext> axisIterator() {
			return getRuleContexts(AxisIteratorContext.class);
		}
		public CoverageExpressionContext coverageExpression() {
			return getRuleContext(CoverageExpressionContext.class,0);
		}
		public BooleanScalarExpressionContext booleanScalarExpression() {
			return getRuleContext(BooleanScalarExpressionContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(wcpsParser.COMMA, i);
		}
		public CondenseExpressionOperatorContext condenseExpressionOperator() {
			return getRuleContext(CondenseExpressionOperatorContext.class,0);
		}
		public GeneralCondenseExpressionLabelContext(GeneralCondenseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitGeneralCondenseExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralCondenseExpressionContext generalCondenseExpression() throws RecognitionException {
		GeneralCondenseExpressionContext _localctx = new GeneralCondenseExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_generalCondenseExpression);
		int _la;
		try {
			_localctx = new GeneralCondenseExpressionLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(658); match(CONDENSE);
			setState(659); condenseExpressionOperator();
			setState(660); match(OVER);
			setState(661); axisIterator();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(662); match(COMMA);
				setState(663); axisIterator();
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(669); match(WHERE);
				setState(670); booleanScalarExpression(0);
				}
			}

			setState(673); match(USING);
			setState(674); coverageExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrsNameContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(wcpsParser.STRING_LITERAL, 0); }
		public CrsNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crsName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitCrsName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrsNameContext crsName() throws RecognitionException {
		CrsNameContext _localctx = new CrsNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_crsName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AxisNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(wcpsParser.IDENTIFIER, 0); }
		public AxisNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitAxisName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxisNameContext axisName() throws RecognitionException {
		AxisNameContext _localctx = new AxisNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_axisName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER_CONSTANT() { return getToken(wcpsParser.REAL_NUMBER_CONSTANT, 0); }
		public TerminalNode TRUE() { return getToken(wcpsParser.TRUE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(wcpsParser.STRING_LITERAL, 0); }
		public ComplexNumberConstantContext complexNumberConstant() {
			return getRuleContext(ComplexNumberConstantContext.class,0);
		}
		public TerminalNode FALSE() { return getToken(wcpsParser.FALSE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wcpsVisitor ) return ((wcpsVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_constant);
		try {
			setState(685);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(680); match(STRING_LITERAL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(681); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(682); match(FALSE);
				}
				break;
			case REAL_NUMBER_CONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(683); match(REAL_NUMBER_CONSTANT);
				}
				break;
			case LEFT_PARANTHESIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(684); complexNumberConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return booleanScalarExpression_sempred((BooleanScalarExpressionContext)_localctx, predIndex);

		case 16: return numericalScalarExpression_sempred((NumericalScalarExpressionContext)_localctx, predIndex);

		case 26: return coverageExpression_sempred((CoverageExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean coverageExpression_sempred(CoverageExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 23 >= _localctx._p;

		case 3: return 25 >= _localctx._p;

		case 4: return 24 >= _localctx._p;

		case 5: return 22 >= _localctx._p;

		case 6: return 16 >= _localctx._p;

		case 7: return 14 >= _localctx._p;

		case 8: return 5 >= _localctx._p;
		}
		return true;
	}
	private boolean booleanScalarExpression_sempred(BooleanScalarExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean numericalScalarExpression_sempred(NumericalScalarExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3S\u02b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\5\2\u008b\n\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\7\3\u0093\n\3\f\3\16\3\u0096\13\3\3\4\3\4\3\4\5\4\u009b"+
		"\n\4\3\4\3\4\3\4\7\4\u00a0\n\4\f\4\16\4\u00a3\13\4\3\4\5\4\u00a6\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\5\b\u00b2\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00b9\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\3\n\3\n\5\n\u00c4\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cf\n\n\3\n\3\n\3\n\3\n\7"+
		"\n\u00d5\n\n\f\n\16\n\u00d8\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f9\n\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00ff\n\22\f\22\16\22\u0102\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u0112\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u0125\n\32\f\32\16\32\u0128\13\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u0133\n\33\f\33\16\33\u0136\13\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\6\34\u0148\n\34\r\34\16\34\u0149\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\7\34\u016f\n\34\f\34\16\34\u0172\13\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u017a\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\7\34\u0198\n\34\f\34\16\34\u019b\13\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01c5"+
		"\n$\3%\3%\7%\u01c9\n%\f%\16%\u01cc\13%\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\7(\u01df\n(\f(\16(\u01e2\13(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3*\3*\3*\7*\u01f2\n*\f*\16*\u01f5\13*\3+\3+\3+\5+\u01fa"+
		"\n+\3+\3+\3+\3+\3,\3,\3,\7,\u0203\n,\f,\16,\u0206\13,\3-\3-\3-\5-\u020b"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0216\n-\3-\3-\3-\3-\5-\u021c\n-\3."+
		"\3.\3.\3.\7.\u0222\n.\f.\16.\u0225\13.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\7\60\u0231\n\60\f\60\16\60\u0234\13\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\7\65\u024b\n\65\f\65\16\65\u024e\13\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u0261\n\67\38\38\38\38\38\38\78\u0269\n8\f8\168\u026c\138\38\38\38\3"+
		"8\38\38\78\u0274\n8\f8\168\u0277\138\38\38\39\39\3:\3:\5:\u027f\n:\3;"+
		"\3;\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\5?\u0291\n?\3@\3@\3A\3A"+
		"\3A\3A\3A\3A\7A\u029b\nA\fA\16A\u029e\13A\3A\3A\5A\u02a2\nA\3A\3A\3A\3"+
		"B\3B\3C\3C\3D\3D\3D\3D\3D\5D\u02b0\nD\3D\2E\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\2\17\4\2\36\36II\5\2\7\7\63\63NN\6\2\33\33\37"+
		" +,\62\62\4\2\33\33\62\62\5\2\30\30/\60\66\66\b\2\4\4!!//\66\6689DD\6"+
		"\2\b\n\20\21@AFG\b\2\4\4!!//\66\6688DD\5\2\34\34((**\3\2OP\4\2\6\6CC\6"+
		"\2\5\5\13\13\22\22-.\7\2\7\7-.\60\60\63\63\66\66\u02ba\2\u0088\3\2\2\2"+
		"\4\u008e\3\2\2\2\6\u0097\3\2\2\2\b\u00a7\3\2\2\2\n\u00aa\3\2\2\2\f\u00ad"+
		"\3\2\2\2\16\u00b1\3\2\2\2\20\u00b8\3\2\2\2\22\u00ce\3\2\2\2\24\u00d9\3"+
		"\2\2\2\26\u00db\3\2\2\2\30\u00dd\3\2\2\2\32\u00df\3\2\2\2\34\u00e1\3\2"+
		"\2\2\36\u00e3\3\2\2\2 \u00e5\3\2\2\2\"\u00f8\3\2\2\2$\u0103\3\2\2\2&\u0109"+
		"\3\2\2\2(\u010b\3\2\2\2*\u010d\3\2\2\2,\u0111\3\2\2\2.\u0113\3\2\2\2\60"+
		"\u0118\3\2\2\2\62\u011d\3\2\2\2\64\u012b\3\2\2\2\66\u0179\3\2\2\28\u019c"+
		"\3\2\2\2:\u019e\3\2\2\2<\u01a0\3\2\2\2>\u01a5\3\2\2\2@\u01aa\3\2\2\2B"+
		"\u01ac\3\2\2\2D\u01b1\3\2\2\2F\u01c4\3\2\2\2H\u01c6\3\2\2\2J\u01cd\3\2"+
		"\2\2L\u01d2\3\2\2\2N\u01d4\3\2\2\2P\u01e5\3\2\2\2R\u01ee\3\2\2\2T\u01f6"+
		"\3\2\2\2V\u01ff\3\2\2\2X\u021b\3\2\2\2Z\u021d\3\2\2\2\\\u0228\3\2\2\2"+
		"^\u022c\3\2\2\2`\u0237\3\2\2\2b\u023a\3\2\2\2d\u0240\3\2\2\2f\u0242\3"+
		"\2\2\2h\u0244\3\2\2\2j\u0252\3\2\2\2l\u0260\3\2\2\2n\u0262\3\2\2\2p\u027a"+
		"\3\2\2\2r\u027e\3\2\2\2t\u0280\3\2\2\2v\u0282\3\2\2\2x\u0284\3\2\2\2z"+
		"\u0289\3\2\2\2|\u0290\3\2\2\2~\u0292\3\2\2\2\u0080\u0294\3\2\2\2\u0082"+
		"\u02a6\3\2\2\2\u0084\u02a8\3\2\2\2\u0086\u02af\3\2\2\2\u0088\u008a\5\4"+
		"\3\2\u0089\u008b\5\b\5\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\5\n\6\2\u008d\3\3\2\2\2\u008e\u008f\7\3\2\2"+
		"\u008f\u0094\5\6\4\2\u0090\u0091\7\16\2\2\u0091\u0093\5\6\4\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\5\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\5\f\7\2\u0098\u009a\7$\2\2"+
		"\u0099\u009b\7\'\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u00a1\7P\2\2\u009d\u009e\7\16\2\2\u009e\u00a0\7P\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7=\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\7\3\2\2\2\u00a7\u00a8\7M\2\2"+
		"\u00a8\u00a9\5\22\n\2\u00a9\t\3\2\2\2\u00aa\u00ab\7:\2\2\u00ab\u00ac\5"+
		"\16\b\2\u00ac\13\3\2\2\2\u00ad\u00ae\7P\2\2\u00ae\r\3\2\2\2\u00af\u00b2"+
		"\5\20\t\2\u00b0\u00b2\5\62\32\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2"+
		"\2\u00b2\17\3\2\2\2\u00b3\u00b9\5\22\n\2\u00b4\u00b9\5\"\22\2\u00b5\u00b9"+
		"\5\36\20\2\u00b6\u00b9\5,\27\2\u00b7\u00b9\5 \21\2\u00b8\u00b3\3\2\2\2"+
		"\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00bb\b\n\1\2\u00bb\u00cf\5x=\2\u00bc"+
		"\u00cf\5\26\f\2\u00bd\u00bf\5\24\13\2\u00be\u00c0\7\'\2\2\u00bf\u00be"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\5\22\n\2"+
		"\u00c2\u00c4\7=\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cf"+
		"\3\2\2\2\u00c5\u00c6\5\"\22\2\u00c6\u00c7\5\32\16\2\u00c7\u00c8\5\"\22"+
		"\2\u00c8\u00cf\3\2\2\2\u00c9\u00cf\5x=\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc"+
		"\5\34\17\2\u00cc\u00cd\5\36\20\2\u00cd\u00cf\3\2\2\2\u00ce\u00ba\3\2\2"+
		"\2\u00ce\u00bc\3\2\2\2\u00ce\u00bd\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c9"+
		"\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00d6\3\2\2\2\u00d0\u00d1\6\n\2\3\u00d1"+
		"\u00d2\5\30\r\2\u00d2\u00d3\5\22\n\2\u00d3\u00d5\3\2\2\2\u00d4\u00d0\3"+
		"\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\23\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\61\2\2\u00da\25\3\2\2\2"+
		"\u00db\u00dc\t\2\2\2\u00dc\27\3\2\2\2\u00dd\u00de\t\3\2\2\u00de\31\3\2"+
		"\2\2\u00df\u00e0\t\4\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\t\5\2\2\u00e2\35"+
		"\3\2\2\2\u00e3\u00e4\7R\2\2\u00e4\37\3\2\2\2\u00e5\u00e6\7\60\2\2\u00e6"+
		"!\3\2\2\2\u00e7\u00e8\b\22\1\2\u00e8\u00e9\5(\25\2\u00e9\u00ea\7\'\2\2"+
		"\u00ea\u00eb\5\"\22\2\u00eb\u00ec\7=\2\2\u00ec\u00f9\3\2\2\2\u00ed\u00ee"+
		"\5*\26\2\u00ee\u00ef\7\'\2\2\u00ef\u00f0\5\"\22\2\u00f0\u00f1\7=\2\2\u00f1"+
		"\u00f9\3\2\2\2\u00f2\u00f9\5r:\2\u00f3\u00f4\5&\24\2\u00f4\u00f5\7O\2"+
		"\2\u00f5\u00f9\3\2\2\2\u00f6\u00f9\7O\2\2\u00f7\u00f9\5$\23\2\u00f8\u00e7"+
		"\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u0100\3\2\2\2\u00fa\u00fb\6\22"+
		"\3\3\u00fb\u00fc\5&\24\2\u00fc\u00fd\5\"\22\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00fa\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101#\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\'\2\2\u0104\u0105"+
		"\7O\2\2\u0105\u0106\7\16\2\2\u0106\u0107\7O\2\2\u0107\u0108\7=\2\2\u0108"+
		"%\3\2\2\2\u0109\u010a\t\6\2\2\u010a\'\3\2\2\2\u010b\u010c\t\7\2\2\u010c"+
		")\3\2\2\2\u010d\u010e\t\b\2\2\u010e+\3\2\2\2\u010f\u0112\5.\30\2\u0110"+
		"\u0112\5\60\31\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112-\3\2\2"+
		"\2\u0113\u0114\7\"\2\2\u0114\u0115\7\'\2\2\u0115\u0116\5\f\7\2\u0116\u0117"+
		"\7=\2\2\u0117/\3\2\2\2\u0118\u0119\7\27\2\2\u0119\u011a\7\'\2\2\u011a"+
		"\u011b\5\f\7\2\u011b\u011c\7=\2\2\u011c\61\3\2\2\2\u011d\u011e\7\32\2"+
		"\2\u011e\u011f\7\'\2\2\u011f\u0120\5\66\34\2\u0120\u0121\7\16\2\2\u0121"+
		"\u0126\7R\2\2\u0122\u0123\7\16\2\2\u0123\u0125\7R\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7=\2\2\u012a\63\3\2\2\2"+
		"\u012b\u012c\7\26\2\2\u012c\u012d\7\'\2\2\u012d\u012e\7R\2\2\u012e\u012f"+
		"\7\16\2\2\u012f\u0134\7R\2\2\u0130\u0131\7\16\2\2\u0131\u0133\7R\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7=\2\2\u0138"+
		"\65\3\2\2\2\u0139\u013a\b\34\1\2\u013a\u017a\5\f\7\2\u013b\u017a\5\20"+
		"\t\2\u013c\u017a\5n8\2\u013d\u017a\5h\65\2\u013e\u017a\5\64\33\2\u013f"+
		"\u0140\7H\2\2\u0140\u0141\7\'\2\2\u0141\u0142\5\66\34\2\u0142\u0143\7"+
		"\16\2\2\u0143\u0144\7%\2\2\u0144\u0145\5V,\2\u0145\u0147\7;\2\2\u0146"+
		"\u0148\7=\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u017a\3\2\2\2\u014b\u014c\7B\2\2\u014c"+
		"\u014d\7\'\2\2\u014d\u014e\5\66\34\2\u014e\u014f\7\16\2\2\u014f\u0150"+
		"\7%\2\2\u0150\u0151\5R*\2\u0151\u0152\7;\2\2\u0152\u0153\7=\2\2\u0153"+
		"\u017a\3\2\2\2\u0154\u0155\7\35\2\2\u0155\u0156\7\'\2\2\u0156\u0157\5"+
		"\66\34\2\u0157\u0158\7\16\2\2\u0158\u0159\7%\2\2\u0159\u015a\5V,\2\u015a"+
		"\u015b\7;\2\2\u015b\u015c\7=\2\2\u015c\u017a\3\2\2\2\u015d\u017a\5<\37"+
		"\2\u015e\u017a\5> \2\u015f\u017a\5B\"\2\u0160\u017a\5D#\2\u0161\u017a"+
		"\5F$\2\u0162\u017a\5J&\2\u0163\u017a\5N(\2\u0164\u017a\5P)\2\u0165\u0166"+
		"\7>\2\2\u0166\u0167\7\'\2\2\u0167\u0168\5\66\34\2\u0168\u0169\7\16\2\2"+
		"\u0169\u016a\7%\2\2\u016a\u016b\5V,\2\u016b\u0170\7;\2\2\u016c\u016d\7"+
		"\16\2\2\u016d\u016f\5^\60\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0174\7=\2\2\u0174\u017a\3\2\2\2\u0175\u0176\7\'\2\2\u0176"+
		"\u0177\5\66\34\2\u0177\u0178\7=\2\2\u0178\u017a\3\2\2\2\u0179\u0139\3"+
		"\2\2\2\u0179\u013b\3\2\2\2\u0179\u013c\3\2\2\2\u0179\u013d\3\2\2\2\u0179"+
		"\u013e\3\2\2\2\u0179\u013f\3\2\2\2\u0179\u014b\3\2\2\2\u0179\u0154\3\2"+
		"\2\2\u0179\u015d\3\2\2\2\u0179\u015e\3\2\2\2\u0179\u015f\3\2\2\2\u0179"+
		"\u0160\3\2\2\2\u0179\u0161\3\2\2\2\u0179\u0162\3\2\2\2\u0179\u0163\3\2"+
		"\2\2\u0179\u0164\3\2\2\2\u0179\u0165\3\2\2\2\u0179\u0175\3\2\2\2\u017a"+
		"\u0199\3\2\2\2\u017b\u017c\6\34\4\3\u017c\u017d\7\65\2\2\u017d\u0198\5"+
		"\66\34\2\u017e\u017f\6\34\5\3\u017f\u0180\5\30\r\2\u0180\u0181\5\66\34"+
		"\2\u0181\u0198\3\2\2\2\u0182\u0183\6\34\6\3\u0183\u0184\58\35\2\u0184"+
		"\u0185\5\66\34\2\u0185\u0198\3\2\2\2\u0186\u0187\6\34\7\3\u0187\u0188"+
		"\5\32\16\2\u0188\u0189\5\66\34\2\u0189\u0198\3\2\2\2\u018a\u018b\6\34"+
		"\b\3\u018b\u018c\7&\2\2\u018c\u018d\5V,\2\u018d\u018e\7<\2\2\u018e\u0198"+
		"\3\2\2\2\u018f\u0190\6\34\t\3\u0190\u0191\7&\2\2\u0191\u0192\5R*\2\u0192"+
		"\u0193\7<\2\2\u0193\u0198\3\2\2\2\u0194\u0195\6\34\n\3\u0195\u0196\7\31"+
		"\2\2\u0196\u0198\5L\'\2\u0197\u017b\3\2\2\2\u0197\u017e\3\2\2\2\u0197"+
		"\u0182\3\2\2\2\u0197\u0186\3\2\2\2\u0197\u018a\3\2\2\2\u0197\u018f\3\2"+
		"\2\2\u0197\u0194\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\67\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\t\6\2"+
		"\2\u019d9\3\2\2\2\u019e\u019f\t\t\2\2\u019f;\3\2\2\2\u01a0\u01a1\5:\36"+
		"\2\u01a1\u01a2\7\'\2\2\u01a2\u01a3\5\66\34\2\u01a3\u01a4\7=\2\2\u01a4"+
		"=\3\2\2\2\u01a5\u01a6\5*\26\2\u01a6\u01a7\7\'\2\2\u01a7\u01a8\5\66\34"+
		"\2\u01a8\u01a9\7=\2\2\u01a9?\3\2\2\2\u01aa\u01ab\t\n\2\2\u01abA\3\2\2"+
		"\2\u01ac\u01ad\5@!\2\u01ad\u01ae\7\'\2\2\u01ae\u01af\5\66\34\2\u01af\u01b0"+
		"\7=\2\2\u01b0C\3\2\2\2\u01b1\u01b2\7\67\2\2\u01b2\u01b3\7\'\2\2\u01b3"+
		"\u01b4\5\66\34\2\u01b4\u01b5\7\16\2\2\u01b5\u01b6\5\"\22\2\u01b6\u01b7"+
		"\7=\2\2\u01b7E\3\2\2\2\u01b8\u01b9\7\61\2\2\u01b9\u01ba\7\'\2\2\u01ba"+
		"\u01bb\5\66\34\2\u01bb\u01bc\7=\2\2\u01bc\u01c5\3\2\2\2\u01bd\u01be\7"+
		"\f\2\2\u01be\u01bf\7\'\2\2\u01bf\u01c0\5\66\34\2\u01c0\u01c1\7\16\2\2"+
		"\u01c1\u01c2\5\"\22\2\u01c2\u01c3\7=\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01b8"+
		"\3\2\2\2\u01c4\u01bd\3\2\2\2\u01c5G\3\2\2\2\u01c6\u01ca\7P\2\2\u01c7\u01c9"+
		"\7P\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cbI\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7\'\2\2"+
		"\u01ce\u01cf\5H%\2\u01cf\u01d0\7=\2\2\u01d0\u01d1\5\66\34\2\u01d1K\3\2"+
		"\2\2\u01d2\u01d3\t\13\2\2\u01d3M\3\2\2\2\u01d4\u01d5\7%\2\2\u01d5\u01d6"+
		"\5L\'\2\u01d6\u01d7\7\r\2\2\u01d7\u01d8\5\66\34\2\u01d8\u01e0\3\2\2\2"+
		"\u01d9\u01da\7?\2\2\u01da\u01db\5L\'\2\u01db\u01dc\7\r\2\2\u01dc\u01dd"+
		"\5\66\34\2\u01dd\u01df\3\2\2\2\u01de\u01d9\3\2\2\2\u01df\u01e2\3\2\2\2"+
		"\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e3\u01e4\7;\2\2\u01e4O\3\2\2\2\u01e5\u01e6\7\25\2\2\u01e6"+
		"\u01e7\7\'\2\2\u01e7\u01e8\5\66\34\2\u01e8\u01e9\7\16\2\2\u01e9\u01ea"+
		"\5Z.\2\u01ea\u01eb\7\16\2\2\u01eb\u01ec\5^\60\2\u01ec\u01ed\7=\2\2\u01ed"+
		"Q\3\2\2\2\u01ee\u01f3\5T+\2\u01ef\u01f0\7\16\2\2\u01f0\u01f2\5T+\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4S\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9\5\u0084C\2\u01f7\u01f8"+
		"\7\r\2\2\u01f8\u01fa\5\u0082B\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2"+
		"\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7\'\2\2\u01fc\u01fd\5\66\34\2\u01fd"+
		"\u01fe\7=\2\2\u01feU\3\2\2\2\u01ff\u0204\5X-\2\u0200\u0201\7\16\2\2\u0201"+
		"\u0203\5X-\2\u0202\u0200\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2"+
		"\2\u0204\u0205\3\2\2\2\u0205W\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u020a"+
		"\5\u0084C\2\u0208\u0209\7\r\2\2\u0209\u020b\5\u0082B\2\u020a\u0208\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7\'\2\2\u020d"+
		"\u020e\5\66\34\2\u020e\u020f\7\r\2\2\u020f\u0210\5\66\34\2\u0210\u0211"+
		"\7=\2\2\u0211\u021c\3\2\2\2\u0212\u0215\5\u0084C\2\u0213\u0214\7\r\2\2"+
		"\u0214\u0216\5\u0082B\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0218\7\'\2\2\u0218\u0219\5\66\34\2\u0219\u021a\7"+
		"=\2\2\u021a\u021c\3\2\2\2\u021b\u0207\3\2\2\2\u021b\u0212\3\2\2\2\u021c"+
		"Y\3\2\2\2\u021d\u021e\7%\2\2\u021e\u0223\5\\/\2\u021f\u0220\7\16\2\2\u0220"+
		"\u0222\5\\/\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0227\7;\2\2\u0227[\3\2\2\2\u0228\u0229\5\u0084C\2\u0229\u022a\7\r\2"+
		"\2\u022a\u022b\5\u0082B\2\u022b]\3\2\2\2\u022c\u022d\7%\2\2\u022d\u0232"+
		"\5`\61\2\u022e\u022f\7\16\2\2\u022f\u0231\5`\61\2\u0230\u022e\3\2\2\2"+
		"\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235"+
		"\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7;\2\2\u0236_\3\2\2\2\u0237\u0238"+
		"\5L\'\2\u0238\u0239\5b\62\2\u0239a\3\2\2\2\u023a\u023b\7\'\2\2\u023b\u023c"+
		"\5f\64\2\u023c\u023d\7\r\2\2\u023d\u023e\5d\63\2\u023e\u023f\7=\2\2\u023f"+
		"c\3\2\2\2\u0240\u0241\t\2\2\2\u0241e\3\2\2\2\u0242\u0243\7R\2\2\u0243"+
		"g\3\2\2\2\u0244\u0245\7\23\2\2\u0245\u0246\7P\2\2\u0246\u0247\7\64\2\2"+
		"\u0247\u024c\5j\66\2\u0248\u0249\7\16\2\2\u0249\u024b\5j\66\2\u024a\u0248"+
		"\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\7L\2\2\u0250\u0251\5\66"+
		"\34\2\u0251i\3\2\2\2\u0252\u0253\5\f\7\2\u0253\u0254\5X-\2\u0254k\3\2"+
		"\2\2\u0255\u0256\5\20\t\2\u0256\u0257\7\r\2\2\u0257\u0258\5\20\t\2\u0258"+
		"\u0261\3\2\2\2\u0259\u025a\7#\2\2\u025a\u025b\7\'\2\2\u025b\u025c\5\f"+
		"\7\2\u025c\u025d\7\16\2\2\u025d\u025e\5\u0084C\2\u025e\u025f\7=\2\2\u025f"+
		"\u0261\3\2\2\2\u0260\u0255\3\2\2\2\u0260\u0259\3\2\2\2\u0261m\3\2\2\2"+
		"\u0262\u0263\7\23\2\2\u0263\u0264\7P\2\2\u0264\u0265\7\64\2\2\u0265\u026a"+
		"\5j\66\2\u0266\u0267\7\16\2\2\u0267\u0269\5j\66\2\u0268\u0266\3\2\2\2"+
		"\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d"+
		"\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026e\7K\2\2\u026e\u026f\7)\2\2\u026f"+
		"\u0270\7+\2\2\u0270\u0275\5\u0086D\2\u0271\u0272\7?\2\2\u0272\u0274\5"+
		"\u0086D\2\u0273\u0271\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2"+
		"\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279"+
		"\7\37\2\2\u0279o\3\2\2\2\u027a\u027b\5X-\2\u027bq\3\2\2\2\u027c\u027f"+
		"\5|?\2\u027d\u027f\5\u0080A\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2"+
		"\u027fs\3\2\2\2\u0280\u0281\t\f\2\2\u0281u\3\2\2\2\u0282\u0283\t\r\2\2"+
		"\u0283w\3\2\2\2\u0284\u0285\5t;\2\u0285\u0286\7\'\2\2\u0286\u0287\5\66"+
		"\34\2\u0287\u0288\7=\2\2\u0288y\3\2\2\2\u0289\u028a\5v<\2\u028a\u028b"+
		"\7\'\2\2\u028b\u028c\5\66\34\2\u028c\u028d\7=\2\2\u028d{\3\2\2\2\u028e"+
		"\u0291\5x=\2\u028f\u0291\5z>\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2"+
		"\u0291}\3\2\2\2\u0292\u0293\t\16\2\2\u0293\177\3\2\2\2\u0294\u0295\7\17"+
		"\2\2\u0295\u0296\5~@\2\u0296\u0297\7\64\2\2\u0297\u029c\5j\66\2\u0298"+
		"\u0299\7\16\2\2\u0299\u029b\5j\66\2\u029a\u0298\3\2\2\2\u029b\u029e\3"+
		"\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a1\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029f\u02a0\7M\2\2\u02a0\u02a2\5\22\n\2\u02a1\u029f\3\2"+
		"\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7J\2\2\u02a4"+
		"\u02a5\5\66\34\2\u02a5\u0081\3\2\2\2\u02a6\u02a7\7R\2\2\u02a7\u0083\3"+
		"\2\2\2\u02a8\u02a9\7P\2\2\u02a9\u0085\3\2\2\2\u02aa\u02b0\7R\2\2\u02ab"+
		"\u02b0\7I\2\2\u02ac\u02b0\7\36\2\2\u02ad\u02b0\7O\2\2\u02ae\u02b0\5$\23"+
		"\2\u02af\u02aa\3\2\2\2\u02af\u02ab\3\2\2\2\u02af\u02ac\3\2\2\2\u02af\u02ad"+
		"\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0\u0087\3\2\2\2+\u008a\u0094\u009a\u00a1"+
		"\u00a5\u00b1\u00b8\u00bf\u00c3\u00ce\u00d6\u00f8\u0100\u0111\u0126\u0134"+
		"\u0149\u0170\u0179\u0197\u0199\u01c4\u01ca\u01e0\u01f3\u01f9\u0204\u020a"+
		"\u0215\u021b\u0223\u0232\u024c\u0260\u026a\u0275\u027e\u0290\u029c\u02a1"+
		"\u02af";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}