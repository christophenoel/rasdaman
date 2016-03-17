// Generated from wcps.g4 by ANTLR 4.1
package petascope.wcps2.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class wcpsLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"FOR", "ABSOLUTE_VALUE", "ADD", "ALL", "AND", "ARCSIN", "ARCCOS", "ARCTAN", 
		"AVG", "BIT", "':'", "','", "CONDENSE", "COS", "COSH", "COUNT", "COVERAGE", 
		"'$'", "CRS_TRANSFORM", "DECODE", "DESCRIBE_COVERAGE", "'/'", "'.'", "ENCODE", 
		"'='", "EXP", "EXTEND", "FALSE", "'>'", "'>='", "IMAGINARY_PART", "ID", 
		"IMGCRSDOMAIN", "IN", "'{'", "'['", "'('", "LN", "LIST", "LOG", "'<'", 
		"'<='", "MAX", "MIN", "'-'", "'*'", "NOT", "'!='", "OR", "OVER", "OVERLAY", 
		"'+'", "POWER", "REAL_PART", "ROUND", "RETURN", "'}'", "']'", "')'", "SCALE", 
		"';'", "SIN", "SINH", "SLICE", "SOME", "SQUARE_ROOT", "STRUCT", "TAN", 
		"TANH", "TRIM", "TRUE", "USING", "VALUE", "VALUES", "WHERE", "XOR", "REAL_NUMBER_CONSTANT", 
		"IDENTIFIER", "NAME", "STRING_LITERAL", "WS"
	};
	public static final String[] ruleNames = {
		"FOR", "ABSOLUTE_VALUE", "ADD", "ALL", "AND", "ARCSIN", "ARCCOS", "ARCTAN", 
		"AVG", "BIT", "COLON", "COMMA", "CONDENSE", "COS", "COSH", "COUNT", "COVERAGE", 
		"COVERAGE_VARIABLE_NAME_PREFIX", "CRS_TRANSFORM", "DECODE", "DESCRIBE_COVERAGE", 
		"DIVISION", "DOT", "ENCODE", "EQUAL", "EXP", "EXTEND", "FALSE", "GREATER_THAN", 
		"GREATER_OR_EQUAL_THAN", "IMAGINARY_PART", "ID", "IMGCRSDOMAIN", "IN", 
		"LEFT_BRACE", "LEFT_BRACKET", "LEFT_PARANTHESIS", "LN", "LIST", "LOG", 
		"LOWER_THAN", "LOWER_OR_EQUAL_THAN", "MAX", "MIN", "MINUS", "MULTIPLICATION", 
		"NOT", "NOT_EQUAL", "OR", "OVER", "OVERLAY", "PLUS", "POWER", "REAL_PART", 
		"ROUND", "RETURN", "RIGHT_BRACE", "RIGHT_BRACKET", "RIGHT_PARANTHESIS", 
		"SCALE", "SEMICOLON", "SIN", "SINH", "SLICE", "SOME", "SQUARE_ROOT", "STRUCT", 
		"TAN", "TANH", "TRIM", "TRUE", "USING", "VALUE", "VALUES", "WHERE", "XOR", 
		"REAL_NUMBER_CONSTANT", "IDENTIFIER", "NAME", "STRING_LITERAL", "WS"
	};


	public wcpsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "wcps.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 80: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2S\u0238\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38"+
		"\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3=\3="+
		"\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C"+
		"\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G"+
		"\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K"+
		"\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3N\6N\u0213\nN\rN\16N\u0214\3"+
		"N\3N\7N\u0219\nN\fN\16N\u021c\13N\5N\u021e\nN\3O\6O\u0221\nO\rO\16O\u0222"+
		"\3P\6P\u0226\nP\rP\16P\u0227\3Q\3Q\6Q\u022c\nQ\rQ\16Q\u022d\3Q\3Q\3R\6"+
		"R\u0233\nR\rR\16R\u0234\3R\3R\2S\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!"+
		"\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S"+
		"+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8"+
		"\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083C\1\u0085D\1\u0087"+
		"E\1\u0089F\1\u008bG\1\u008dH\1\u008fI\1\u0091J\1\u0093K\1\u0095L\1\u0097"+
		"M\1\u0099N\1\u009bO\1\u009dP\1\u009fQ\1\u00a1R\1\u00a3S\2\3\2\36\4\2H"+
		"Hhh\4\2QQqq\4\2TTtt\4\2CCcc\4\2DDdd\4\2UUuu\4\2FFff\4\2NNnn\4\2PPpp\4"+
		"\2EEee\4\2KKkk\4\2VVvv\4\2XXxx\4\2IIii\4\2GGgg\4\2JJjj\4\2WWww\4\2OOo"+
		"o\4\2ZZzz\4\2RRrr\4\2[[{{\4\2YYyy\4\2SSss\3\2\62;\7\2&&\62;C\\aac|\5\2"+
		"C\\c|~~\7\2\"#%&((-ac|\5\2\13\f\17\17\"\"\u023e\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2\2\5\u00a9\3\2\2\2\7\u00ad\3\2\2\2\t\u00b1"+
		"\3\2\2\2\13\u00b5\3\2\2\2\r\u00b9\3\2\2\2\17\u00c0\3\2\2\2\21\u00c7\3"+
		"\2\2\2\23\u00ce\3\2\2\2\25\u00d2\3\2\2\2\27\u00d6\3\2\2\2\31\u00d8\3\2"+
		"\2\2\33\u00da\3\2\2\2\35\u00e3\3\2\2\2\37\u00e7\3\2\2\2!\u00ec\3\2\2\2"+
		"#\u00f2\3\2\2\2%\u00fb\3\2\2\2\'\u00fd\3\2\2\2)\u010a\3\2\2\2+\u0111\3"+
		"\2\2\2-\u0122\3\2\2\2/\u0124\3\2\2\2\61\u0126\3\2\2\2\63\u012d\3\2\2\2"+
		"\65\u012f\3\2\2\2\67\u0133\3\2\2\29\u013a\3\2\2\2;\u0140\3\2\2\2=\u0142"+
		"\3\2\2\2?\u0145\3\2\2\2A\u0148\3\2\2\2C\u0153\3\2\2\2E\u0160\3\2\2\2G"+
		"\u0163\3\2\2\2I\u0165\3\2\2\2K\u0167\3\2\2\2M\u0169\3\2\2\2O\u016c\3\2"+
		"\2\2Q\u0171\3\2\2\2S\u0175\3\2\2\2U\u0177\3\2\2\2W\u017a\3\2\2\2Y\u017e"+
		"\3\2\2\2[\u0182\3\2\2\2]\u0184\3\2\2\2_\u0186\3\2\2\2a\u018a\3\2\2\2c"+
		"\u018d\3\2\2\2e\u0190\3\2\2\2g\u0195\3\2\2\2i\u019d\3\2\2\2k\u019f\3\2"+
		"\2\2m\u01a3\3\2\2\2o\u01a6\3\2\2\2q\u01ac\3\2\2\2s\u01b3\3\2\2\2u\u01b5"+
		"\3\2\2\2w\u01b7\3\2\2\2y\u01b9\3\2\2\2{\u01bf\3\2\2\2}\u01c1\3\2\2\2\177"+
		"\u01c5\3\2\2\2\u0081\u01ca\3\2\2\2\u0083\u01d0\3\2\2\2\u0085\u01d5\3\2"+
		"\2\2\u0087\u01da\3\2\2\2\u0089\u01e1\3\2\2\2\u008b\u01e5\3\2\2\2\u008d"+
		"\u01ea\3\2\2\2\u008f\u01ef\3\2\2\2\u0091\u01f4\3\2\2\2\u0093\u01fa\3\2"+
		"\2\2\u0095\u0200\3\2\2\2\u0097\u0207\3\2\2\2\u0099\u020d\3\2\2\2\u009b"+
		"\u0212\3\2\2\2\u009d\u0220\3\2\2\2\u009f\u0225\3\2\2\2\u00a1\u0229\3\2"+
		"\2\2\u00a3\u0232\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6\u00a7\t\3\2\2\u00a7"+
		"\u00a8\t\4\2\2\u00a8\4\3\2\2\2\u00a9\u00aa\t\5\2\2\u00aa\u00ab\t\6\2\2"+
		"\u00ab\u00ac\t\7\2\2\u00ac\6\3\2\2\2\u00ad\u00ae\t\5\2\2\u00ae\u00af\t"+
		"\b\2\2\u00af\u00b0\t\b\2\2\u00b0\b\3\2\2\2\u00b1\u00b2\t\5\2\2\u00b2\u00b3"+
		"\t\t\2\2\u00b3\u00b4\t\t\2\2\u00b4\n\3\2\2\2\u00b5\u00b6\t\5\2\2\u00b6"+
		"\u00b7\t\n\2\2\u00b7\u00b8\t\b\2\2\u00b8\f\3\2\2\2\u00b9\u00ba\t\5\2\2"+
		"\u00ba\u00bb\t\4\2\2\u00bb\u00bc\t\13\2\2\u00bc\u00bd\t\7\2\2\u00bd\u00be"+
		"\t\f\2\2\u00be\u00bf\t\n\2\2\u00bf\16\3\2\2\2\u00c0\u00c1\t\5\2\2\u00c1"+
		"\u00c2\t\4\2\2\u00c2\u00c3\t\13\2\2\u00c3\u00c4\t\13\2\2\u00c4\u00c5\t"+
		"\3\2\2\u00c5\u00c6\t\7\2\2\u00c6\20\3\2\2\2\u00c7\u00c8\t\5\2\2\u00c8"+
		"\u00c9\t\4\2\2\u00c9\u00ca\t\13\2\2\u00ca\u00cb\t\r\2\2\u00cb\u00cc\t"+
		"\5\2\2\u00cc\u00cd\t\n\2\2\u00cd\22\3\2\2\2\u00ce\u00cf\t\5\2\2\u00cf"+
		"\u00d0\t\16\2\2\u00d0\u00d1\t\17\2\2\u00d1\24\3\2\2\2\u00d2\u00d3\t\6"+
		"\2\2\u00d3\u00d4\t\f\2\2\u00d4\u00d5\t\r\2\2\u00d5\26\3\2\2\2\u00d6\u00d7"+
		"\7<\2\2\u00d7\30\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9\32\3\2\2\2\u00da\u00db"+
		"\t\13\2\2\u00db\u00dc\t\3\2\2\u00dc\u00dd\t\n\2\2\u00dd\u00de\t\b\2\2"+
		"\u00de\u00df\t\20\2\2\u00df\u00e0\t\n\2\2\u00e0\u00e1\t\7\2\2\u00e1\u00e2"+
		"\t\20\2\2\u00e2\34\3\2\2\2\u00e3\u00e4\t\13\2\2\u00e4\u00e5\t\3\2\2\u00e5"+
		"\u00e6\t\7\2\2\u00e6\36\3\2\2\2\u00e7\u00e8\t\13\2\2\u00e8\u00e9\t\3\2"+
		"\2\u00e9\u00ea\t\7\2\2\u00ea\u00eb\t\21\2\2\u00eb \3\2\2\2\u00ec\u00ed"+
		"\t\13\2\2\u00ed\u00ee\t\3\2\2\u00ee\u00ef\t\22\2\2\u00ef\u00f0\t\n\2\2"+
		"\u00f0\u00f1\t\r\2\2\u00f1\"\3\2\2\2\u00f2\u00f3\t\13\2\2\u00f3\u00f4"+
		"\t\3\2\2\u00f4\u00f5\t\16\2\2\u00f5\u00f6\t\20\2\2\u00f6\u00f7\t\4\2\2"+
		"\u00f7\u00f8\t\5\2\2\u00f8\u00f9\t\17\2\2\u00f9\u00fa\t\20\2\2\u00fa$"+
		"\3\2\2\2\u00fb\u00fc\7&\2\2\u00fc&\3\2\2\2\u00fd\u00fe\t\13\2\2\u00fe"+
		"\u00ff\t\4\2\2\u00ff\u0100\t\7\2\2\u0100\u0101\t\r\2\2\u0101\u0102\t\4"+
		"\2\2\u0102\u0103\t\5\2\2\u0103\u0104\t\n\2\2\u0104\u0105\t\7\2\2\u0105"+
		"\u0106\t\2\2\2\u0106\u0107\t\3\2\2\u0107\u0108\t\4\2\2\u0108\u0109\t\23"+
		"\2\2\u0109(\3\2\2\2\u010a\u010b\t\b\2\2\u010b\u010c\t\20\2\2\u010c\u010d"+
		"\t\13\2\2\u010d\u010e\t\3\2\2\u010e\u010f\t\b\2\2\u010f\u0110\t\20\2\2"+
		"\u0110*\3\2\2\2\u0111\u0112\t\b\2\2\u0112\u0113\t\20\2\2\u0113\u0114\t"+
		"\7\2\2\u0114\u0115\t\13\2\2\u0115\u0116\t\4\2\2\u0116\u0117\t\f\2\2\u0117"+
		"\u0118\t\6\2\2\u0118\u0119\t\20\2\2\u0119\u011a\t\13\2\2\u011a\u011b\t"+
		"\3\2\2\u011b\u011c\t\16\2\2\u011c\u011d\t\20\2\2\u011d\u011e\t\4\2\2\u011e"+
		"\u011f\t\5\2\2\u011f\u0120\t\17\2\2\u0120\u0121\t\20\2\2\u0121,\3\2\2"+
		"\2\u0122\u0123\7\61\2\2\u0123.\3\2\2\2\u0124\u0125\7\60\2\2\u0125\60\3"+
		"\2\2\2\u0126\u0127\t\20\2\2\u0127\u0128\t\n\2\2\u0128\u0129\t\13\2\2\u0129"+
		"\u012a\t\3\2\2\u012a\u012b\t\b\2\2\u012b\u012c\t\20\2\2\u012c\62\3\2\2"+
		"\2\u012d\u012e\7?\2\2\u012e\64\3\2\2\2\u012f\u0130\t\20\2\2\u0130\u0131"+
		"\t\24\2\2\u0131\u0132\t\25\2\2\u0132\66\3\2\2\2\u0133\u0134\t\20\2\2\u0134"+
		"\u0135\t\24\2\2\u0135\u0136\t\r\2\2\u0136\u0137\t\20\2\2\u0137\u0138\t"+
		"\n\2\2\u0138\u0139\t\b\2\2\u01398\3\2\2\2\u013a\u013b\t\2\2\2\u013b\u013c"+
		"\t\5\2\2\u013c\u013d\t\t\2\2\u013d\u013e\t\7\2\2\u013e\u013f\t\20\2\2"+
		"\u013f:\3\2\2\2\u0140\u0141\7@\2\2\u0141<\3\2\2\2\u0142\u0143\7@\2\2\u0143"+
		"\u0144\7?\2\2\u0144>\3\2\2\2\u0145\u0146\t\f\2\2\u0146\u0147\t\23\2\2"+
		"\u0147@\3\2\2\2\u0148\u0149\t\f\2\2\u0149\u014a\t\b\2\2\u014a\u014b\t"+
		"\20\2\2\u014b\u014c\t\n\2\2\u014c\u014d\t\r\2\2\u014d\u014e\4kk\2\u014e"+
		"\u014f\t\2\2\2\u014f\u0150\t\f\2\2\u0150\u0151\t\20\2\2\u0151\u0152\t"+
		"\4\2\2\u0152B\3\2\2\2\u0153\u0154\t\f\2\2\u0154\u0155\t\23\2\2\u0155\u0156"+
		"\t\17\2\2\u0156\u0157\t\13\2\2\u0157\u0158\t\4\2\2\u0158\u0159\t\7\2\2"+
		"\u0159\u015a\t\b\2\2\u015a\u015b\t\3\2\2\u015b\u015c\t\23\2\2\u015c\u015d"+
		"\t\5\2\2\u015d\u015e\t\f\2\2\u015e\u015f\t\n\2\2\u015fD\3\2\2\2\u0160"+
		"\u0161\t\f\2\2\u0161\u0162\t\n\2\2\u0162F\3\2\2\2\u0163\u0164\7}\2\2\u0164"+
		"H\3\2\2\2\u0165\u0166\7]\2\2\u0166J\3\2\2\2\u0167\u0168\7*\2\2\u0168L"+
		"\3\2\2\2\u0169\u016a\t\t\2\2\u016a\u016b\t\n\2\2\u016bN\3\2\2\2\u016c"+
		"\u016d\t\t\2\2\u016d\u016e\t\f\2\2\u016e\u016f\t\7\2\2\u016f\u0170\t\r"+
		"\2\2\u0170P\3\2\2\2\u0171\u0172\t\t\2\2\u0172\u0173\t\3\2\2\u0173\u0174"+
		"\t\17\2\2\u0174R\3\2\2\2\u0175\u0176\7>\2\2\u0176T\3\2\2\2\u0177\u0178"+
		"\7>\2\2\u0178\u0179\7?\2\2\u0179V\3\2\2\2\u017a\u017b\t\23\2\2\u017b\u017c"+
		"\t\5\2\2\u017c\u017d\t\24\2\2\u017dX\3\2\2\2\u017e\u017f\t\23\2\2\u017f"+
		"\u0180\t\f\2\2\u0180\u0181\t\n\2\2\u0181Z\3\2\2\2\u0182\u0183\7/\2\2\u0183"+
		"\\\3\2\2\2\u0184\u0185\7,\2\2\u0185^\3\2\2\2\u0186\u0187\t\n\2\2\u0187"+
		"\u0188\t\3\2\2\u0188\u0189\t\r\2\2\u0189`\3\2\2\2\u018a\u018b\7#\2\2\u018b"+
		"\u018c\7?\2\2\u018cb\3\2\2\2\u018d\u018e\t\3\2\2\u018e\u018f\t\4\2\2\u018f"+
		"d\3\2\2\2\u0190\u0191\t\3\2\2\u0191\u0192\t\16\2\2\u0192\u0193\t\20\2"+
		"\2\u0193\u0194\t\4\2\2\u0194f\3\2\2\2\u0195\u0196\t\3\2\2\u0196\u0197"+
		"\t\16\2\2\u0197\u0198\t\20\2\2\u0198\u0199\t\4\2\2\u0199\u019a\t\t\2\2"+
		"\u019a\u019b\t\5\2\2\u019b\u019c\t\26\2\2\u019ch\3\2\2\2\u019d\u019e\7"+
		"-\2\2\u019ej\3\2\2\2\u019f\u01a0\t\25\2\2\u01a0\u01a1\t\3\2\2\u01a1\u01a2"+
		"\t\27\2\2\u01a2l\3\2\2\2\u01a3\u01a4\t\4\2\2\u01a4\u01a5\t\20\2\2\u01a5"+
		"n\3\2\2\2\u01a6\u01a7\t\4\2\2\u01a7\u01a8\t\3\2\2\u01a8\u01a9\t\22\2\2"+
		"\u01a9\u01aa\t\n\2\2\u01aa\u01ab\t\b\2\2\u01abp\3\2\2\2\u01ac\u01ad\t"+
		"\4\2\2\u01ad\u01ae\t\20\2\2\u01ae\u01af\t\r\2\2\u01af\u01b0\t\22\2\2\u01b0"+
		"\u01b1\t\4\2\2\u01b1\u01b2\t\n\2\2\u01b2r\3\2\2\2\u01b3\u01b4\7\177\2"+
		"\2\u01b4t\3\2\2\2\u01b5\u01b6\7_\2\2\u01b6v\3\2\2\2\u01b7\u01b8\7+\2\2"+
		"\u01b8x\3\2\2\2\u01b9\u01ba\t\7\2\2\u01ba\u01bb\t\13\2\2\u01bb\u01bc\t"+
		"\5\2\2\u01bc\u01bd\t\t\2\2\u01bd\u01be\t\20\2\2\u01bez\3\2\2\2\u01bf\u01c0"+
		"\7=\2\2\u01c0|\3\2\2\2\u01c1\u01c2\t\7\2\2\u01c2\u01c3\t\f\2\2\u01c3\u01c4"+
		"\t\n\2\2\u01c4~\3\2\2\2\u01c5\u01c6\t\7\2\2\u01c6\u01c7\t\f\2\2\u01c7"+
		"\u01c8\t\n\2\2\u01c8\u01c9\t\21\2\2\u01c9\u0080\3\2\2\2\u01ca\u01cb\t"+
		"\7\2\2\u01cb\u01cc\t\t\2\2\u01cc\u01cd\t\f\2\2\u01cd\u01ce\t\13\2\2\u01ce"+
		"\u01cf\t\20\2\2\u01cf\u0082\3\2\2\2\u01d0\u01d1\t\7\2\2\u01d1\u01d2\t"+
		"\3\2\2\u01d2\u01d3\t\23\2\2\u01d3\u01d4\t\20\2\2\u01d4\u0084\3\2\2\2\u01d5"+
		"\u01d6\t\7\2\2\u01d6\u01d7\t\30\2\2\u01d7\u01d8\t\4\2\2\u01d8\u01d9\t"+
		"\r\2\2\u01d9\u0086\3\2\2\2\u01da\u01db\t\7\2\2\u01db\u01dc\t\r\2\2\u01dc"+
		"\u01dd\t\4\2\2\u01dd\u01de\t\22\2\2\u01de\u01df\t\13\2\2\u01df\u01e0\t"+
		"\r\2\2\u01e0\u0088\3\2\2\2\u01e1\u01e2\t\r\2\2\u01e2\u01e3\t\5\2\2\u01e3"+
		"\u01e4\t\n\2\2\u01e4\u008a\3\2\2\2\u01e5\u01e6\t\r\2\2\u01e6\u01e7\t\5"+
		"\2\2\u01e7\u01e8\t\n\2\2\u01e8\u01e9\t\21\2\2\u01e9\u008c\3\2\2\2\u01ea"+
		"\u01eb\t\r\2\2\u01eb\u01ec\t\4\2\2\u01ec\u01ed\t\f\2\2\u01ed\u01ee\t\23"+
		"\2\2\u01ee\u008e\3\2\2\2\u01ef\u01f0\t\r\2\2\u01f0\u01f1\t\4\2\2\u01f1"+
		"\u01f2\t\22\2\2\u01f2\u01f3\t\20\2\2\u01f3\u0090\3\2\2\2\u01f4\u01f5\t"+
		"\22\2\2\u01f5\u01f6\t\7\2\2\u01f6\u01f7\t\f\2\2\u01f7\u01f8\t\n\2\2\u01f8"+
		"\u01f9\t\17\2\2\u01f9\u0092\3\2\2\2\u01fa\u01fb\t\16\2\2\u01fb\u01fc\t"+
		"\5\2\2\u01fc\u01fd\t\t\2\2\u01fd\u01fe\t\22\2\2\u01fe\u01ff\t\20\2\2\u01ff"+
		"\u0094\3\2\2\2\u0200\u0201\t\16\2\2\u0201\u0202\t\5\2\2\u0202\u0203\t"+
		"\t\2\2\u0203\u0204\t\22\2\2\u0204\u0205\t\20\2\2\u0205\u0206\t\7\2\2\u0206"+
		"\u0096\3\2\2\2\u0207\u0208\t\27\2\2\u0208\u0209\t\21\2\2\u0209\u020a\t"+
		"\20\2\2\u020a\u020b\t\4\2\2\u020b\u020c\t\20\2\2\u020c\u0098\3\2\2\2\u020d"+
		"\u020e\t\24\2\2\u020e\u020f\t\3\2\2\u020f\u0210\t\4\2\2\u0210\u009a\3"+
		"\2\2\2\u0211\u0213\t\31\2\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u021d\3\2\2\2\u0216\u021a\7\60"+
		"\2\2\u0217\u0219\t\31\2\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2"+
		"\2\2\u021d\u0216\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u009c\3\2\2\2\u021f"+
		"\u0221\t\32\2\2\u0220\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0220\3"+
		"\2\2\2\u0222\u0223\3\2\2\2\u0223\u009e\3\2\2\2\u0224\u0226\t\33\2\2\u0225"+
		"\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u00a0\3\2\2\2\u0229\u022b\7$\2\2\u022a\u022c\t\34\2\2\u022b"+
		"\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7$\2\2\u0230\u00a2\3\2\2\2\u0231"+
		"\u0233\t\35\2\2\u0232\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0232\3"+
		"\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\bR\2\2\u0237"+
		"\u00a4\3\2\2\2\n\2\u0214\u021a\u021d\u0222\u0227\u022d\u0234";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}