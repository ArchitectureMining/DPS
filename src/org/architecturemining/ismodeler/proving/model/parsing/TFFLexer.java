// Generated from TFF.g4 by ANTLR 4.7.1
package org.architecturemining.ismodeler.proving.model.parsing;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TFFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Or=9, 
		And=10, Iff=11, Impl=12, If=13, Niff=14, Nor=15, Nand=16, Not=17, ForallComb=18, 
		TyForall=19, Infix_inequality=20, Infix_equality=21, Forall=22, ExistsComb=23, 
		TyExists=24, Exists=25, Lambda=26, ChoiceComb=27, Choice=28, DescriptionComb=29, 
		Description=30, EqComb=31, App=32, Assignment=33, Arrow=34, Star=35, Plus=36, 
		Subtype_sign=37, Gentzen_arrow=38, Real=39, Signed_real=40, Unsigned_real=41, 
		Rational=42, Signed_rational=43, Unsigned_rational=44, Integer=45, Signed_integer=46, 
		Unsigned_integer=47, Decimal=48, Positive_decimal=49, Decimal_exponent=50, 
		Decimal_fraction=51, Dot_decimal=52, Exp_integer=53, Signed_exp_integer=54, 
		Unsigned_exp_integer=55, Dollar_word=56, Dollar_dollar_word=57, Upper_word=58, 
		Lower_word=59, Single_quoted=60, Distinct_object=61, WS=62, Line_comment=63, 
		Block_comment=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Do_char", 
		"Sq_char", "Sign", "Exponent", "Non_zero_numeric", "Numeric", "Lower_alpha", 
		"Upper_alpha", "Alpha_numeric", "Or", "And", "Iff", "Impl", "If", "Niff", 
		"Nor", "Nand", "Not", "ForallComb", "TyForall", "Infix_inequality", "Infix_equality", 
		"Forall", "ExistsComb", "TyExists", "Exists", "Lambda", "ChoiceComb", 
		"Choice", "DescriptionComb", "Description", "EqComb", "App", "Assignment", 
		"Arrow", "Star", "Plus", "Subtype_sign", "Gentzen_arrow", "Real", "Signed_real", 
		"Unsigned_real", "Rational", "Signed_rational", "Unsigned_rational", "Integer", 
		"Signed_integer", "Unsigned_integer", "Decimal", "Positive_decimal", "Decimal_exponent", 
		"Decimal_fraction", "Dot_decimal", "Exp_integer", "Signed_exp_integer", 
		"Unsigned_exp_integer", "Dollar_word", "Dollar_dollar_word", "Upper_word", 
		"Lower_word", "Single_quoted", "Distinct_object", "WS", "Line_comment", 
		"Block_comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'tff('", "','", "').'", "'['", "']'", "':'", "'('", "')'", "'|'", 
		"'&'", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'~'", "'!!'", 
		"'!>'", "'!='", "'='", "'!'", "'??'", "'?*'", "'?'", "'^'", "'@@+'", "'@+'", 
		"'@@-'", "'@-'", "'@='", "'@'", "':='", "'>'", "'*'", "'+'", "'<<'", "'-->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Or", "And", "Iff", 
		"Impl", "If", "Niff", "Nor", "Nand", "Not", "ForallComb", "TyForall", 
		"Infix_inequality", "Infix_equality", "Forall", "ExistsComb", "TyExists", 
		"Exists", "Lambda", "ChoiceComb", "Choice", "DescriptionComb", "Description", 
		"EqComb", "App", "Assignment", "Arrow", "Star", "Plus", "Subtype_sign", 
		"Gentzen_arrow", "Real", "Signed_real", "Unsigned_real", "Rational", "Signed_rational", 
		"Unsigned_rational", "Integer", "Signed_integer", "Unsigned_integer", 
		"Decimal", "Positive_decimal", "Decimal_exponent", "Decimal_fraction", 
		"Dot_decimal", "Exp_integer", "Signed_exp_integer", "Unsigned_exp_integer", 
		"Dollar_word", "Dollar_dollar_word", "Upper_word", "Lower_word", "Single_quoted", 
		"Distinct_object", "WS", "Line_comment", "Block_comment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TFFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TFF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\n\u00ad\n\n\3\13\3\13\3\13\5\13\u00b2"+
		"\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00c4\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\5\61\u011c\n\61\3\62\3\62\3\62\3\63\3\63\5\63"+
		"\u0123\n\63\3\64\3\64\5\64\u0127\n\64\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\5\67\u0132\n\67\38\38\38\39\39\3:\3:\5:\u013b\n:\3;\3;\7"+
		";\u013f\n;\f;\16;\u0142\13;\3<\3<\5<\u0146\n<\3<\3<\3<\3=\3=\3=\3>\3>"+
		"\3>\7>\u0151\n>\f>\16>\u0154\13>\3?\3?\5?\u0158\n?\3@\3@\3@\3A\3A\7A\u015f"+
		"\nA\fA\16A\u0162\13A\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\7D\u016e\nD\fD\16D"+
		"\u0171\13D\3E\3E\7E\u0175\nE\fE\16E\u0178\13E\3F\3F\6F\u017c\nF\rF\16"+
		"F\u017d\3F\3F\3G\3G\6G\u0184\nG\rG\16G\u0185\3G\3G\3H\6H\u018b\nH\rH\16"+
		"H\u018c\3H\3H\3I\3I\7I\u0193\nI\fI\16I\u0196\13I\3I\3I\3J\3J\3J\3J\7J"+
		"\u019e\nJ\fJ\16J\u01a1\13J\3J\3J\3J\3J\3J\3\u019f\2K\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\13\'\f)\r+"+
		"\16-\17/\20\61\21\63\22\65\23\67\249\25;\26=\27?\30A\31C\32E\33G\34I\35"+
		"K\36M\37O Q!S\"U#W$Y%[&]\'_(a)c*e+g,i-k.m/o\60q\61s\62u\63w\64y\65{\66"+
		"}\67\1778\u00819\u0083:\u0085;\u0087<\u0089=\u008b>\u008d?\u008f@\u0091"+
		"A\u0093B\3\2\16\5\2\"#%]_\u0080\4\2$$^^\5\2\"(*]_\u0080\4\2))^^\4\2--"+
		"//\4\2GGgg\3\2\63;\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u01b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u009a\3\2\2\2\7\u009c\3\2\2\2\t\u009f"+
		"\3\2\2\2\13\u00a1\3\2\2\2\r\u00a3\3\2\2\2\17\u00a5\3\2\2\2\21\u00a7\3"+
		"\2\2\2\23\u00ac\3\2\2\2\25\u00b1\3\2\2\2\27\u00b3\3\2\2\2\31\u00b5\3\2"+
		"\2\2\33\u00b7\3\2\2\2\35\u00b9\3\2\2\2\37\u00bb\3\2\2\2!\u00bd\3\2\2\2"+
		"#\u00c3\3\2\2\2%\u00c5\3\2\2\2\'\u00c7\3\2\2\2)\u00c9\3\2\2\2+\u00cd\3"+
		"\2\2\2-\u00d0\3\2\2\2/\u00d3\3\2\2\2\61\u00d7\3\2\2\2\63\u00da\3\2\2\2"+
		"\65\u00dd\3\2\2\2\67\u00df\3\2\2\29\u00e2\3\2\2\2;\u00e5\3\2\2\2=\u00e8"+
		"\3\2\2\2?\u00ea\3\2\2\2A\u00ec\3\2\2\2C\u00ef\3\2\2\2E\u00f2\3\2\2\2G"+
		"\u00f4\3\2\2\2I\u00f6\3\2\2\2K\u00fa\3\2\2\2M\u00fd\3\2\2\2O\u0101\3\2"+
		"\2\2Q\u0104\3\2\2\2S\u0107\3\2\2\2U\u0109\3\2\2\2W\u010c\3\2\2\2Y\u010e"+
		"\3\2\2\2[\u0110\3\2\2\2]\u0112\3\2\2\2_\u0115\3\2\2\2a\u011b\3\2\2\2c"+
		"\u011d\3\2\2\2e\u0122\3\2\2\2g\u0126\3\2\2\2i\u0128\3\2\2\2k\u012b\3\2"+
		"\2\2m\u0131\3\2\2\2o\u0133\3\2\2\2q\u0136\3\2\2\2s\u013a\3\2\2\2u\u013c"+
		"\3\2\2\2w\u0145\3\2\2\2y\u014a\3\2\2\2{\u014d\3\2\2\2}\u0157\3\2\2\2\177"+
		"\u0159\3\2\2\2\u0081\u015c\3\2\2\2\u0083\u0163\3\2\2\2\u0085\u0166\3\2"+
		"\2\2\u0087\u016b\3\2\2\2\u0089\u0172\3\2\2\2\u008b\u0179\3\2\2\2\u008d"+
		"\u0181\3\2\2\2\u008f\u018a\3\2\2\2\u0091\u0190\3\2\2\2\u0093\u0199\3\2"+
		"\2\2\u0095\u0096\7v\2\2\u0096\u0097\7h\2\2\u0097\u0098\7h\2\2\u0098\u0099"+
		"\7*\2\2\u0099\4\3\2\2\2\u009a\u009b\7.\2\2\u009b\6\3\2\2\2\u009c\u009d"+
		"\7+\2\2\u009d\u009e\7\60\2\2\u009e\b\3\2\2\2\u009f\u00a0\7]\2\2\u00a0"+
		"\n\3\2\2\2\u00a1\u00a2\7_\2\2\u00a2\f\3\2\2\2\u00a3\u00a4\7<\2\2\u00a4"+
		"\16\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8"+
		"\22\3\2\2\2\u00a9\u00ad\t\2\2\2\u00aa\u00ab\7^\2\2\u00ab\u00ad\t\3\2\2"+
		"\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\24\3\2\2\2\u00ae\u00b2"+
		"\t\4\2\2\u00af\u00b0\7^\2\2\u00b0\u00b2\t\5\2\2\u00b1\u00ae\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\t\6\2\2\u00b4\30\3\2\2\2\u00b5"+
		"\u00b6\t\7\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\t\b\2\2\u00b8\34\3\2\2\2\u00b9"+
		"\u00ba\t\t\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\t\n\2\2\u00bc \3\2\2\2\u00bd"+
		"\u00be\t\13\2\2\u00be\"\3\2\2\2\u00bf\u00c4\5\37\20\2\u00c0\u00c4\5!\21"+
		"\2\u00c1\u00c4\5\35\17\2\u00c2\u00c4\7a\2\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4$\3\2\2\2"+
		"\u00c5\u00c6\7~\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8(\3\2\2\2\u00c9"+
		"\u00ca\7>\2\2\u00ca\u00cb\7?\2\2\u00cb\u00cc\7@\2\2\u00cc*\3\2\2\2\u00cd"+
		"\u00ce\7?\2\2\u00ce\u00cf\7@\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1"+
		"\u00d2\7?\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7\u0080\2"+
		"\2\u00d5\u00d6\7@\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7\u0080\2\2\u00d8\u00d9"+
		"\7~\2\2\u00d9\62\3\2\2\2\u00da\u00db\7\u0080\2\2\u00db\u00dc\7(\2\2\u00dc"+
		"\64\3\2\2\2\u00dd\u00de\7\u0080\2\2\u00de\66\3\2\2\2\u00df\u00e0\7#\2"+
		"\2\u00e0\u00e1\7#\2\2\u00e18\3\2\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e4\7"+
		"@\2\2\u00e4:\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e7\7?\2\2\u00e7<\3\2"+
		"\2\2\u00e8\u00e9\7?\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb@\3\2\2"+
		"\2\u00ec\u00ed\7A\2\2\u00ed\u00ee\7A\2\2\u00eeB\3\2\2\2\u00ef\u00f0\7"+
		"A\2\2\u00f0\u00f1\7,\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7A\2\2\u00f3F\3\2"+
		"\2\2\u00f4\u00f5\7`\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7B\2\2\u00f7\u00f8"+
		"\7B\2\2\u00f8\u00f9\7-\2\2\u00f9J\3\2\2\2\u00fa\u00fb\7B\2\2\u00fb\u00fc"+
		"\7-\2\2\u00fcL\3\2\2\2\u00fd\u00fe\7B\2\2\u00fe\u00ff\7B\2\2\u00ff\u0100"+
		"\7/\2\2\u0100N\3\2\2\2\u0101\u0102\7B\2\2\u0102\u0103\7/\2\2\u0103P\3"+
		"\2\2\2\u0104\u0105\7B\2\2\u0105\u0106\7?\2\2\u0106R\3\2\2\2\u0107\u0108"+
		"\7B\2\2\u0108T\3\2\2\2\u0109\u010a\7<\2\2\u010a\u010b\7?\2\2\u010bV\3"+
		"\2\2\2\u010c\u010d\7@\2\2\u010dX\3\2\2\2\u010e\u010f\7,\2\2\u010fZ\3\2"+
		"\2\2\u0110\u0111\7-\2\2\u0111\\\3\2\2\2\u0112\u0113\7>\2\2\u0113\u0114"+
		"\7>\2\2\u0114^\3\2\2\2\u0115\u0116\7/\2\2\u0116\u0117\7/\2\2\u0117\u0118"+
		"\7@\2\2\u0118`\3\2\2\2\u0119\u011c\5c\62\2\u011a\u011c\5e\63\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011a\3\2\2\2\u011cb\3\2\2\2\u011d\u011e\5\27\f\2\u011e"+
		"\u011f\5e\63\2\u011fd\3\2\2\2\u0120\u0123\5y=\2\u0121\u0123\5w<\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123f\3\2\2\2\u0124\u0127\5i\65\2"+
		"\u0125\u0127\5k\66\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127h\3"+
		"\2\2\2\u0128\u0129\5\27\f\2\u0129\u012a\5k\66\2\u012aj\3\2\2\2\u012b\u012c"+
		"\5s:\2\u012c\u012d\7\61\2\2\u012d\u012e\5u;\2\u012el\3\2\2\2\u012f\u0132"+
		"\5o8\2\u0130\u0132\5q9\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"n\3\2\2\2\u0133\u0134\5\27\f\2\u0134\u0135\5q9\2\u0135p\3\2\2\2\u0136"+
		"\u0137\5s:\2\u0137r\3\2\2\2\u0138\u013b\7\62\2\2\u0139\u013b\5u;\2\u013a"+
		"\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013bt\3\2\2\2\u013c\u0140\5\33\16"+
		"\2\u013d\u013f\5\35\17\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141v\3\2\2\2\u0142\u0140\3\2\2\2"+
		"\u0143\u0146\5s:\2\u0144\u0146\5y=\2\u0145\u0143\3\2\2\2\u0145\u0144\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\5\31\r\2\u0148\u0149\5}?\2\u0149"+
		"x\3\2\2\2\u014a\u014b\5s:\2\u014b\u014c\5{>\2\u014cz\3\2\2\2\u014d\u014e"+
		"\7\60\2\2\u014e\u0152\5\35\17\2\u014f\u0151\5\35\17\2\u0150\u014f\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"|\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0158\5\177@\2\u0156\u0158\5\u0081"+
		"A\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158~\3\2\2\2\u0159\u015a"+
		"\5\27\f\2\u015a\u015b\5\u0081A\2\u015b\u0080\3\2\2\2\u015c\u0160\5\35"+
		"\17\2\u015d\u015f\5\35\17\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0082\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0163\u0164\7&\2\2\u0164\u0165\5\u0089E\2\u0165\u0084\3\2\2\2\u0166"+
		"\u0167\7&\2\2\u0167\u0168\7&\2\2\u0168\u0169\3\2\2\2\u0169\u016a\5\u0089"+
		"E\2\u016a\u0086\3\2\2\2\u016b\u016f\5!\21\2\u016c\u016e\5#\22\2\u016d"+
		"\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0088\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0176\5\37\20\2\u0173"+
		"\u0175\5#\22\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u008a\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017b\7)\2\2\u017a\u017c\5\25\13\2\u017b\u017a\3\2\2\2\u017c\u017d\3"+
		"\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\7)\2\2\u0180\u008c\3\2\2\2\u0181\u0183\7$\2\2\u0182\u0184\5\23"+
		"\n\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7$\2\2\u0188\u008e\3\2"+
		"\2\2\u0189\u018b\t\f\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\bH"+
		"\2\2\u018f\u0090\3\2\2\2\u0190\u0194\7\'\2\2\u0191\u0193\n\r\2\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\bI\2\2\u0198"+
		"\u0092\3\2\2\2\u0199\u019a\7\61\2\2\u019a\u019b\7,\2\2\u019b\u019f\3\2"+
		"\2\2\u019c\u019e\13\2\2\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a2\u01a3\7,\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\bJ\2\2\u01a6\u0094\3\2\2\2\27\2\u00ac\u00b1\u00c3\u011b\u0122\u0126"+
		"\u0131\u013a\u0140\u0145\u0152\u0157\u0160\u016f\u0176\u017d\u0185\u018c"+
		"\u0194\u019f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}