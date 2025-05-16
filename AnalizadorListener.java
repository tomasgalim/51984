// Generated from Analizador.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnalizadorParser}.
 */
public interface AnalizadorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AnalizadorParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AnalizadorParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(AnalizadorParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(AnalizadorParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(AnalizadorParser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(AnalizadorParser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(AnalizadorParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(AnalizadorParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(AnalizadorParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(AnalizadorParser.CondicionContext ctx);
}