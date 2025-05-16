// Generated from Analizador.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AnalizadorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MIENTRAS=1, IMPRIMIR=2, VERDADERO=3, FALSO=4, LPAREN=5, RPAREN=6, LBRACE=7, 
		RBRACE=8, SEMICOLON=9, LBRACKET=10, RBRACKET=11, CADENA=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MIENTRAS", "IMPRIMIR", "VERDADERO", "FALSO", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMICOLON", "LBRACKET", "RBRACKET", "CADENA", "LETRA", "DIGITO", 
			"ESPACIO", "SIMBOLO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mientras'", "'imprimir'", "'verdadero'", "'falso'", "'('", "')'", 
			"'{'", "'}'", "';'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MIENTRAS", "IMPRIMIR", "VERDADERO", "FALSO", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SEMICOLON", "LBRACKET", "RBRACKET", "CADENA", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public AnalizadorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analizador.g4"; }

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
		"\u0004\u0000\rn\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000bY\b\u000b\n\u000b\f\u000b\\\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010i\b\u0010\u000b\u0010\f\u0010j\u0001"+
		"\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u0000!\r\u0001"+
		"\u0000\u0004\u0002\u0000AZaz\u0001\u000009\u0006\u0000!!\'\',,..:;??\u0003"+
		"\u0000\t\n\r\r  n\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003"+
		",\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u0007?\u0001"+
		"\u0000\u0000\u0000\tE\u0001\u0000\u0000\u0000\u000bG\u0001\u0000\u0000"+
		"\u0000\rI\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011"+
		"M\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000\u0000\u0015Q\u0001"+
		"\u0000\u0000\u0000\u0017S\u0001\u0000\u0000\u0000\u0019_\u0001\u0000\u0000"+
		"\u0000\u001ba\u0001\u0000\u0000\u0000\u001dc\u0001\u0000\u0000\u0000\u001f"+
		"e\u0001\u0000\u0000\u0000!h\u0001\u0000\u0000\u0000#$\u0005m\u0000\u0000"+
		"$%\u0005i\u0000\u0000%&\u0005e\u0000\u0000&\'\u0005n\u0000\u0000\'(\u0005"+
		"t\u0000\u0000()\u0005r\u0000\u0000)*\u0005a\u0000\u0000*+\u0005s\u0000"+
		"\u0000+\u0002\u0001\u0000\u0000\u0000,-\u0005i\u0000\u0000-.\u0005m\u0000"+
		"\u0000./\u0005p\u0000\u0000/0\u0005r\u0000\u000001\u0005i\u0000\u0000"+
		"12\u0005m\u0000\u000023\u0005i\u0000\u000034\u0005r\u0000\u00004\u0004"+
		"\u0001\u0000\u0000\u000056\u0005v\u0000\u000067\u0005e\u0000\u000078\u0005"+
		"r\u0000\u000089\u0005d\u0000\u00009:\u0005a\u0000\u0000:;\u0005d\u0000"+
		"\u0000;<\u0005e\u0000\u0000<=\u0005r\u0000\u0000=>\u0005o\u0000\u0000"+
		">\u0006\u0001\u0000\u0000\u0000?@\u0005f\u0000\u0000@A\u0005a\u0000\u0000"+
		"AB\u0005l\u0000\u0000BC\u0005s\u0000\u0000CD\u0005o\u0000\u0000D\b\u0001"+
		"\u0000\u0000\u0000EF\u0005(\u0000\u0000F\n\u0001\u0000\u0000\u0000GH\u0005"+
		")\u0000\u0000H\f\u0001\u0000\u0000\u0000IJ\u0005{\u0000\u0000J\u000e\u0001"+
		"\u0000\u0000\u0000KL\u0005}\u0000\u0000L\u0010\u0001\u0000\u0000\u0000"+
		"MN\u0005;\u0000\u0000N\u0012\u0001\u0000\u0000\u0000OP\u0005[\u0000\u0000"+
		"P\u0014\u0001\u0000\u0000\u0000QR\u0005]\u0000\u0000R\u0016\u0001\u0000"+
		"\u0000\u0000SZ\u0005\"\u0000\u0000TY\u0003\u0019\f\u0000UY\u0003\u001b"+
		"\r\u0000VY\u0003\u001d\u000e\u0000WY\u0003\u001f\u000f\u0000XT\u0001\u0000"+
		"\u0000\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001"+
		"\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]^\u0005\"\u0000\u0000^\u0018\u0001\u0000\u0000\u0000_`\u0007\u0000"+
		"\u0000\u0000`\u001a\u0001\u0000\u0000\u0000ab\u0007\u0001\u0000\u0000"+
		"b\u001c\u0001\u0000\u0000\u0000cd\u0005 \u0000\u0000d\u001e\u0001\u0000"+
		"\u0000\u0000ef\u0007\u0002\u0000\u0000f \u0001\u0000\u0000\u0000gi\u0007"+
		"\u0003\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0006\u0010\u0000\u0000m\"\u0001\u0000\u0000\u0000\u0004\u0000"+
		"XZj\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}