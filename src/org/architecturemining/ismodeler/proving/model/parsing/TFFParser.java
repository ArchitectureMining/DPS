// Generated from TFF.g4 by ANTLR 4.7.1
package org.architecturemining.ismodeler.proving.model.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TFFParser extends Parser {
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
	public static final int
		RULE_fof_quantifier = 0, RULE_binary_connective = 1, RULE_assoc_connective = 2, 
		RULE_unary_connective = 3, RULE_tff_file = 4, RULE_tff_line = 5, RULE_formula_role = 6, 
		RULE_tff_formula = 7, RULE_tff_logic_formula = 8, RULE_tff_binary_formula = 9, 
		RULE_tff_binary_nonassoc = 10, RULE_tff_binary_assoc = 11, RULE_tff_or_formula = 12, 
		RULE_tff_and_formula = 13, RULE_tff_unitary_formula = 14, RULE_tff_quantified_formula = 15, 
		RULE_tff_unary_formula = 16, RULE_tff_atomic_formula = 17, RULE_fof_infix_unary = 18, 
		RULE_fof_term = 19, RULE_argument_list = 20, RULE_argument = 21, RULE_tff_typed_atom = 22, 
		RULE_variable = 23, RULE_variable_list = 24, RULE_name = 25, RULE_atomic_word_list = 26, 
		RULE_atomic_word = 27, RULE_atomic_defined_word = 28, RULE_atomic_system_word = 29, 
		RULE_number = 30, RULE_file_name = 31;
	public static final String[] ruleNames = {
		"fof_quantifier", "binary_connective", "assoc_connective", "unary_connective", 
		"tff_file", "tff_line", "formula_role", "tff_formula", "tff_logic_formula", 
		"tff_binary_formula", "tff_binary_nonassoc", "tff_binary_assoc", "tff_or_formula", 
		"tff_and_formula", "tff_unitary_formula", "tff_quantified_formula", "tff_unary_formula", 
		"tff_atomic_formula", "fof_infix_unary", "fof_term", "argument_list", 
		"argument", "tff_typed_atom", "variable", "variable_list", "name", "atomic_word_list", 
		"atomic_word", "atomic_defined_word", "atomic_system_word", "number", 
		"file_name"
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

	@Override
	public String getGrammarFileName() { return "TFF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TFFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Fof_quantifierContext extends ParserRuleContext {
		public TerminalNode Forall() { return getToken(TFFParser.Forall, 0); }
		public TerminalNode Exists() { return getToken(TFFParser.Exists, 0); }
		public Fof_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterFof_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitFof_quantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitFof_quantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fof_quantifierContext fof_quantifier() throws RecognitionException {
		Fof_quantifierContext _localctx = new Fof_quantifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fof_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==Forall || _la==Exists) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Binary_connectiveContext extends ParserRuleContext {
		public TerminalNode Iff() { return getToken(TFFParser.Iff, 0); }
		public TerminalNode Impl() { return getToken(TFFParser.Impl, 0); }
		public TerminalNode If() { return getToken(TFFParser.If, 0); }
		public TerminalNode Niff() { return getToken(TFFParser.Niff, 0); }
		public TerminalNode Nor() { return getToken(TFFParser.Nor, 0); }
		public TerminalNode Nand() { return getToken(TFFParser.Nand, 0); }
		public Binary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterBinary_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitBinary_connective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitBinary_connective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_connectiveContext binary_connective() throws RecognitionException {
		Binary_connectiveContext _localctx = new Binary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_binary_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Iff) | (1L << Impl) | (1L << If) | (1L << Niff) | (1L << Nor) | (1L << Nand))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Assoc_connectiveContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(TFFParser.Or, 0); }
		public TerminalNode And() { return getToken(TFFParser.And, 0); }
		public Assoc_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterAssoc_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitAssoc_connective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitAssoc_connective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assoc_connectiveContext assoc_connective() throws RecognitionException {
		Assoc_connectiveContext _localctx = new Assoc_connectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assoc_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==Or || _la==And) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Unary_connectiveContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(TFFParser.Not, 0); }
		public Unary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterUnary_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitUnary_connective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitUnary_connective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_connectiveContext unary_connective() throws RecognitionException {
		Unary_connectiveContext _localctx = new Unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unary_connective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(Not);
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

	public static class Tff_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TFFParser.EOF, 0); }
		public List<Tff_lineContext> tff_line() {
			return getRuleContexts(Tff_lineContext.class);
		}
		public Tff_lineContext tff_line(int i) {
			return getRuleContext(Tff_lineContext.class,i);
		}
		public Tff_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_fileContext tff_file() throws RecognitionException {
		Tff_fileContext _localctx = new Tff_fileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tff_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(72);
				tff_line();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(EOF);
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

	public static class Tff_lineContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Tff_formulaContext tff_formula() {
			return getRuleContext(Tff_formulaContext.class,0);
		}
		public Tff_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_lineContext tff_line() throws RecognitionException {
		Tff_lineContext _localctx = new Tff_lineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tff_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(81);
			name();
			setState(82);
			match(T__1);
			setState(83);
			formula_role();
			setState(84);
			match(T__1);
			setState(85);
			tff_formula();
			setState(86);
			match(T__2);
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

	public static class Formula_roleContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(TFFParser.Lower_word, 0); }
		public Formula_roleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterFormula_role(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitFormula_role(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitFormula_role(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formula_roleContext formula_role() throws RecognitionException {
		Formula_roleContext _localctx = new Formula_roleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formula_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Lower_word);
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

	public static class Tff_formulaContext extends ParserRuleContext {
		public Tff_logic_formulaContext tff_logic_formula() {
			return getRuleContext(Tff_logic_formulaContext.class,0);
		}
		public Tff_typed_atomContext tff_typed_atom() {
			return getRuleContext(Tff_typed_atomContext.class,0);
		}
		public Tff_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_formulaContext tff_formula() throws RecognitionException {
		Tff_formulaContext _localctx = new Tff_formulaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tff_formula);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				tff_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				tff_typed_atom();
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

	public static class Tff_logic_formulaContext extends ParserRuleContext {
		public Tff_binary_formulaContext tff_binary_formula() {
			return getRuleContext(Tff_binary_formulaContext.class,0);
		}
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Tff_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_logic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_logic_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_logic_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_logic_formulaContext tff_logic_formula() throws RecognitionException {
		Tff_logic_formulaContext _localctx = new Tff_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tff_logic_formula);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				tff_binary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				tff_unitary_formula();
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

	public static class Tff_binary_formulaContext extends ParserRuleContext {
		public Tff_binary_nonassocContext tff_binary_nonassoc() {
			return getRuleContext(Tff_binary_nonassocContext.class,0);
		}
		public Tff_binary_assocContext tff_binary_assoc() {
			return getRuleContext(Tff_binary_assocContext.class,0);
		}
		public Tff_binary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_binary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_binary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_binary_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_binary_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_binary_formulaContext tff_binary_formula() throws RecognitionException {
		Tff_binary_formulaContext _localctx = new Tff_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tff_binary_formula);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				tff_binary_nonassoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				tff_binary_assoc();
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

	public static class Tff_binary_nonassocContext extends ParserRuleContext {
		public List<Tff_unitary_formulaContext> tff_unitary_formula() {
			return getRuleContexts(Tff_unitary_formulaContext.class);
		}
		public Tff_unitary_formulaContext tff_unitary_formula(int i) {
			return getRuleContext(Tff_unitary_formulaContext.class,i);
		}
		public Binary_connectiveContext binary_connective() {
			return getRuleContext(Binary_connectiveContext.class,0);
		}
		public Tff_binary_nonassocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_binary_nonassoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_binary_nonassoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_binary_nonassoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_binary_nonassoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_binary_nonassocContext tff_binary_nonassoc() throws RecognitionException {
		Tff_binary_nonassocContext _localctx = new Tff_binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tff_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			tff_unitary_formula();
			setState(103);
			binary_connective();
			setState(104);
			tff_unitary_formula();
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

	public static class Tff_binary_assocContext extends ParserRuleContext {
		public Tff_or_formulaContext tff_or_formula() {
			return getRuleContext(Tff_or_formulaContext.class,0);
		}
		public Tff_and_formulaContext tff_and_formula() {
			return getRuleContext(Tff_and_formulaContext.class,0);
		}
		public Tff_binary_assocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_binary_assoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_binary_assoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_binary_assoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_binary_assoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_binary_assocContext tff_binary_assoc() throws RecognitionException {
		Tff_binary_assocContext _localctx = new Tff_binary_assocContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tff_binary_assoc);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				tff_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				tff_and_formula(0);
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

	public static class Tff_or_formulaContext extends ParserRuleContext {
		public List<Tff_unitary_formulaContext> tff_unitary_formula() {
			return getRuleContexts(Tff_unitary_formulaContext.class);
		}
		public Tff_unitary_formulaContext tff_unitary_formula(int i) {
			return getRuleContext(Tff_unitary_formulaContext.class,i);
		}
		public TerminalNode Or() { return getToken(TFFParser.Or, 0); }
		public Tff_or_formulaContext tff_or_formula() {
			return getRuleContext(Tff_or_formulaContext.class,0);
		}
		public Tff_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_or_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_or_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_or_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_or_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_or_formulaContext tff_or_formula() throws RecognitionException {
		return tff_or_formula(0);
	}

	private Tff_or_formulaContext tff_or_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_or_formulaContext _localctx = new Tff_or_formulaContext(_ctx, _parentState);
		Tff_or_formulaContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_tff_or_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111);
			tff_unitary_formula();
			setState(112);
			match(Or);
			setState(113);
			tff_unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tff_or_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tff_or_formula);
					setState(115);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(116);
					match(Or);
					setState(117);
					tff_unitary_formula();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Tff_and_formulaContext extends ParserRuleContext {
		public List<Tff_unitary_formulaContext> tff_unitary_formula() {
			return getRuleContexts(Tff_unitary_formulaContext.class);
		}
		public Tff_unitary_formulaContext tff_unitary_formula(int i) {
			return getRuleContext(Tff_unitary_formulaContext.class,i);
		}
		public TerminalNode And() { return getToken(TFFParser.And, 0); }
		public Tff_and_formulaContext tff_and_formula() {
			return getRuleContext(Tff_and_formulaContext.class,0);
		}
		public Tff_and_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_and_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_and_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_and_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_and_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_and_formulaContext tff_and_formula() throws RecognitionException {
		return tff_and_formula(0);
	}

	private Tff_and_formulaContext tff_and_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_and_formulaContext _localctx = new Tff_and_formulaContext(_ctx, _parentState);
		Tff_and_formulaContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_tff_and_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(124);
			tff_unitary_formula();
			setState(125);
			match(And);
			setState(126);
			tff_unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tff_and_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tff_and_formula);
					setState(128);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(129);
					match(And);
					setState(130);
					tff_unitary_formula();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Tff_unitary_formulaContext extends ParserRuleContext {
		public Tff_quantified_formulaContext tff_quantified_formula() {
			return getRuleContext(Tff_quantified_formulaContext.class,0);
		}
		public Tff_unary_formulaContext tff_unary_formula() {
			return getRuleContext(Tff_unary_formulaContext.class,0);
		}
		public Tff_atomic_formulaContext tff_atomic_formula() {
			return getRuleContext(Tff_atomic_formulaContext.class,0);
		}
		public Tff_unitary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unitary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_unitary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_unitary_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_unitary_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_unitary_formulaContext tff_unitary_formula() throws RecognitionException {
		Tff_unitary_formulaContext _localctx = new Tff_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tff_unitary_formula);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				tff_quantified_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				tff_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				tff_atomic_formula();
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

	public static class Tff_quantified_formulaContext extends ParserRuleContext {
		public Fof_quantifierContext fof_quantifier() {
			return getRuleContext(Fof_quantifierContext.class,0);
		}
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Tff_quantified_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_quantified_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_quantified_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_quantified_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_quantified_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_quantified_formulaContext tff_quantified_formula() throws RecognitionException {
		Tff_quantified_formulaContext _localctx = new Tff_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tff_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			fof_quantifier();
			setState(142);
			match(T__3);
			setState(143);
			variable_list();
			setState(144);
			match(T__4);
			setState(145);
			match(T__5);
			setState(146);
			tff_unitary_formula();
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

	public static class Tff_unary_formulaContext extends ParserRuleContext {
		public Unary_connectiveContext unary_connective() {
			return getRuleContext(Unary_connectiveContext.class,0);
		}
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Fof_infix_unaryContext fof_infix_unary() {
			return getRuleContext(Fof_infix_unaryContext.class,0);
		}
		public Tff_logic_formulaContext tff_logic_formula() {
			return getRuleContext(Tff_logic_formulaContext.class,0);
		}
		public Tff_unary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_unary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_unary_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_unary_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_unary_formulaContext tff_unary_formula() throws RecognitionException {
		Tff_unary_formulaContext _localctx = new Tff_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tff_unary_formula);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				unary_connective();
				setState(149);
				tff_unitary_formula();
				}
				break;
			case Upper_word:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				fof_infix_unary();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(T__6);
				setState(153);
				tff_logic_formula();
				setState(154);
				match(T__7);
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

	public static class Tff_atomic_formulaContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Tff_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_atomic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_atomic_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_atomic_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_atomic_formulaContext tff_atomic_formula() throws RecognitionException {
		Tff_atomic_formulaContext _localctx = new Tff_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tff_atomic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			atomic_word();
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(159);
				match(T__6);
				setState(160);
				argument_list();
				setState(161);
				match(T__7);
				}
				break;
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

	public static class Fof_infix_unaryContext extends ParserRuleContext {
		public List<Fof_termContext> fof_term() {
			return getRuleContexts(Fof_termContext.class);
		}
		public Fof_termContext fof_term(int i) {
			return getRuleContext(Fof_termContext.class,i);
		}
		public TerminalNode Infix_inequality() { return getToken(TFFParser.Infix_inequality, 0); }
		public Fof_infix_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_infix_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterFof_infix_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitFof_infix_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitFof_infix_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fof_infix_unaryContext fof_infix_unary() throws RecognitionException {
		Fof_infix_unaryContext _localctx = new Fof_infix_unaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fof_infix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			fof_term();
			setState(166);
			match(Infix_inequality);
			setState(167);
			fof_term();
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

	public static class Fof_termContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Fof_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterFof_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitFof_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitFof_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fof_termContext fof_term() throws RecognitionException {
		Fof_termContext _localctx = new Fof_termContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fof_term);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				atomic_word();
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(170);
					match(T__6);
					setState(171);
					argument_list();
					setState(172);
					match(T__7);
					}
					break;
				}
				}
				break;
			case Upper_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				variable();
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

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			argument();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(180);
				match(T__1);
				setState(181);
				argument();
				}
				}
				setState(186);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode Upper_word() { return getToken(TFFParser.Upper_word, 0); }
		public TerminalNode Lower_word() { return getToken(TFFParser.Lower_word, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==Upper_word || _la==Lower_word) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Tff_typed_atomContext extends ParserRuleContext {
		public List<Atomic_wordContext> atomic_word() {
			return getRuleContexts(Atomic_wordContext.class);
		}
		public Atomic_wordContext atomic_word(int i) {
			return getRuleContext(Atomic_wordContext.class,i);
		}
		public Tff_typed_atomContext tff_typed_atom() {
			return getRuleContext(Tff_typed_atomContext.class,0);
		}
		public Tff_typed_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_typed_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterTff_typed_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitTff_typed_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitTff_typed_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tff_typed_atomContext tff_typed_atom() throws RecognitionException {
		Tff_typed_atomContext _localctx = new Tff_typed_atomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tff_typed_atom);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				atomic_word();
				setState(190);
				match(T__5);
				setState(191);
				atomic_word();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(T__6);
				setState(194);
				tff_typed_atom();
				setState(195);
				match(T__7);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Upper_word() { return getToken(TFFParser.Upper_word, 0); }
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(Upper_word);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(200);
				match(T__5);
				setState(201);
				atomic_word();
				}
				break;
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

	public static class Variable_listContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterVariable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitVariable_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitVariable_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_listContext variable_list() throws RecognitionException {
		Variable_listContext _localctx = new Variable_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variable_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			variable();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(205);
				match(T__1);
				setState(206);
				variable();
				}
				}
				setState(211);
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

	public static class NameContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public TerminalNode Integer() { return getToken(TFFParser.Integer, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_name);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				atomic_word();
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(Integer);
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

	public static class Atomic_word_listContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public List<Atomic_word_listContext> atomic_word_list() {
			return getRuleContexts(Atomic_word_listContext.class);
		}
		public Atomic_word_listContext atomic_word_list(int i) {
			return getRuleContext(Atomic_word_listContext.class,i);
		}
		public Atomic_word_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_word_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterAtomic_word_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitAtomic_word_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitAtomic_word_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atomic_word_listContext atomic_word_list() throws RecognitionException {
		Atomic_word_listContext _localctx = new Atomic_word_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atomic_word_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			atomic_word();
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(T__1);
					setState(218);
					atomic_word_list();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Atomic_wordContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(TFFParser.Lower_word, 0); }
		public TerminalNode Single_quoted() { return getToken(TFFParser.Single_quoted, 0); }
		public Atomic_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterAtomic_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitAtomic_word(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitAtomic_word(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atomic_wordContext atomic_word() throws RecognitionException {
		Atomic_wordContext _localctx = new Atomic_wordContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atomic_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==Lower_word || _la==Single_quoted) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Atomic_defined_wordContext extends ParserRuleContext {
		public TerminalNode Dollar_word() { return getToken(TFFParser.Dollar_word, 0); }
		public Atomic_defined_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_defined_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterAtomic_defined_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitAtomic_defined_word(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitAtomic_defined_word(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atomic_defined_wordContext atomic_defined_word() throws RecognitionException {
		Atomic_defined_wordContext _localctx = new Atomic_defined_wordContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atomic_defined_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(Dollar_word);
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

	public static class Atomic_system_wordContext extends ParserRuleContext {
		public TerminalNode Dollar_dollar_word() { return getToken(TFFParser.Dollar_dollar_word, 0); }
		public Atomic_system_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_system_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterAtomic_system_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitAtomic_system_word(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitAtomic_system_word(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atomic_system_wordContext atomic_system_word() throws RecognitionException {
		Atomic_system_wordContext _localctx = new Atomic_system_wordContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atomic_system_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(Dollar_dollar_word);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(TFFParser.Integer, 0); }
		public TerminalNode Rational() { return getToken(TFFParser.Rational, 0); }
		public TerminalNode Real() { return getToken(TFFParser.Real, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Real) | (1L << Rational) | (1L << Integer))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode Single_quoted() { return getToken(TFFParser.Single_quoted, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TFFListener ) ((TFFListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TFFVisitor ) return ((TFFVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(Single_quoted);
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
		case 12:
			return tff_or_formula_sempred((Tff_or_formulaContext)_localctx, predIndex);
		case 13:
			return tff_and_formula_sempred((Tff_and_formulaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tff_or_formula_sempred(Tff_or_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tff_and_formula_sempred(Tff_and_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5\t_\n\t\3\n\3\n\5"+
		"\nc\n\n\3\13\3\13\5\13g\n\13\3\f\3\f\3\f\3\f\3\r\3\r\5\ro\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16y\n\16\f\16\16\16|\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0086\n\17\f\17\16\17\u0089\13\17"+
		"\3\20\3\20\3\20\5\20\u008e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u009f\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00a6\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00b1\n\25\3\25\5\25\u00b4\n\25\3\26\3\26\3\26\7\26\u00b9\n\26\f\26\16"+
		"\26\u00bc\13\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00c8\n\30\3\31\3\31\3\31\5\31\u00cd\n\31\3\32\3\32\3\32\7\32\u00d2\n"+
		"\32\f\32\16\32\u00d5\13\32\3\33\3\33\5\33\u00d9\n\33\3\34\3\34\3\34\7"+
		"\34\u00de\n\34\f\34\16\34\u00e1\13\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3!\2\4\32\34\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@\2\b\4\2\30\30\33\33\3\2\r\22\3\2\13\f\3\2<=\3\2"+
		"=>\5\2)),,//\2\u00e0\2B\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\nM\3"+
		"\2\2\2\fR\3\2\2\2\16Z\3\2\2\2\20^\3\2\2\2\22b\3\2\2\2\24f\3\2\2\2\26h"+
		"\3\2\2\2\30n\3\2\2\2\32p\3\2\2\2\34}\3\2\2\2\36\u008d\3\2\2\2 \u008f\3"+
		"\2\2\2\"\u009e\3\2\2\2$\u00a0\3\2\2\2&\u00a7\3\2\2\2(\u00b3\3\2\2\2*\u00b5"+
		"\3\2\2\2,\u00bd\3\2\2\2.\u00c7\3\2\2\2\60\u00c9\3\2\2\2\62\u00ce\3\2\2"+
		"\2\64\u00d8\3\2\2\2\66\u00da\3\2\2\28\u00e2\3\2\2\2:\u00e4\3\2\2\2<\u00e6"+
		"\3\2\2\2>\u00e8\3\2\2\2@\u00ea\3\2\2\2BC\t\2\2\2C\3\3\2\2\2DE\t\3\2\2"+
		"E\5\3\2\2\2FG\t\4\2\2G\7\3\2\2\2HI\7\23\2\2I\t\3\2\2\2JL\5\f\7\2KJ\3\2"+
		"\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\13\3"+
		"\2\2\2RS\7\3\2\2ST\5\64\33\2TU\7\4\2\2UV\5\16\b\2VW\7\4\2\2WX\5\20\t\2"+
		"XY\7\5\2\2Y\r\3\2\2\2Z[\7=\2\2[\17\3\2\2\2\\_\5\22\n\2]_\5.\30\2^\\\3"+
		"\2\2\2^]\3\2\2\2_\21\3\2\2\2`c\5\24\13\2ac\5\36\20\2b`\3\2\2\2ba\3\2\2"+
		"\2c\23\3\2\2\2dg\5\26\f\2eg\5\30\r\2fd\3\2\2\2fe\3\2\2\2g\25\3\2\2\2h"+
		"i\5\36\20\2ij\5\4\3\2jk\5\36\20\2k\27\3\2\2\2lo\5\32\16\2mo\5\34\17\2"+
		"nl\3\2\2\2nm\3\2\2\2o\31\3\2\2\2pq\b\16\1\2qr\5\36\20\2rs\7\13\2\2st\5"+
		"\36\20\2tz\3\2\2\2uv\f\3\2\2vw\7\13\2\2wy\5\36\20\2xu\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{\33\3\2\2\2|z\3\2\2\2}~\b\17\1\2~\177\5\36\20\2"+
		"\177\u0080\7\f\2\2\u0080\u0081\5\36\20\2\u0081\u0087\3\2\2\2\u0082\u0083"+
		"\f\3\2\2\u0083\u0084\7\f\2\2\u0084\u0086\5\36\20\2\u0085\u0082\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\35"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008e\5 \21\2\u008b\u008e\5\"\22\2"+
		"\u008c\u008e\5$\23\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\37\3\2\2\2\u008f\u0090\5\2\2\2\u0090\u0091\7\6\2\2\u0091"+
		"\u0092\5\62\32\2\u0092\u0093\7\7\2\2\u0093\u0094\7\b\2\2\u0094\u0095\5"+
		"\36\20\2\u0095!\3\2\2\2\u0096\u0097\5\b\5\2\u0097\u0098\5\36\20\2\u0098"+
		"\u009f\3\2\2\2\u0099\u009f\5&\24\2\u009a\u009b\7\t\2\2\u009b\u009c\5\22"+
		"\n\2\u009c\u009d\7\n\2\2\u009d\u009f\3\2\2\2\u009e\u0096\3\2\2\2\u009e"+
		"\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009f#\3\2\2\2\u00a0\u00a5\58\35\2"+
		"\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5*\26\2\u00a3\u00a4\7\n\2\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6%\3\2\2\2\u00a7"+
		"\u00a8\5(\25\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa\5(\25\2\u00aa\'\3\2\2"+
		"\2\u00ab\u00b0\58\35\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\5*\26\2\u00ae\u00af"+
		"\7\n\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b4\5\60\31\2\u00b3\u00ab\3\2\2\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4)\3\2\2\2\u00b5\u00ba\5,\27\2\u00b6\u00b7\7\4\2\2\u00b7\u00b9"+
		"\5,\27\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb+\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\t\5\2\2"+
		"\u00be-\3\2\2\2\u00bf\u00c0\58\35\2\u00c0\u00c1\7\b\2\2\u00c1\u00c2\5"+
		"8\35\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\5.\30\2\u00c5"+
		"\u00c6\7\n\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2"+
		"\2\2\u00c8/\3\2\2\2\u00c9\u00cc\7<\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00cd"+
		"\58\35\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\61\3\2\2\2\u00ce"+
		"\u00d3\5\60\31\2\u00cf\u00d0\7\4\2\2\u00d0\u00d2\5\60\31\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\63\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\58\35\2\u00d7\u00d9\7/\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\65\3\2\2\2\u00da\u00df"+
		"\58\35\2\u00db\u00dc\7\4\2\2\u00dc\u00de\5\66\34\2\u00dd\u00db\3\2\2\2"+
		"\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\67"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\t\6\2\2\u00e39\3\2\2\2\u00e4"+
		"\u00e5\7:\2\2\u00e5;\3\2\2\2\u00e6\u00e7\7;\2\2\u00e7=\3\2\2\2\u00e8\u00e9"+
		"\t\7\2\2\u00e9?\3\2\2\2\u00ea\u00eb\7>\2\2\u00ebA\3\2\2\2\24M^bfnz\u0087"+
		"\u008d\u009e\u00a5\u00b0\u00b3\u00ba\u00c7\u00cc\u00d3\u00d8\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}