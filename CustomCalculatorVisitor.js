import AnalizadorVisitor from "./generated/AnalizadorVisitor.js";

export class CustomJavaScriptGeneratorVisitor extends AnalizadorVisitor {
    constructor() {
        super();
        this.output = [];
        this.indent = "";
    }

    visitPrograma(ctx) {
        for (let instr of ctx.instruccion()) {
            this.visit(instr);
        }
        return this.output.join("\n");
    }

    visitInstruccion(ctx) {
        if (ctx.bucle()) return this.visit(ctx.bucle());
        if (ctx.salida()) return this.visit(ctx.salida());
    }

    visitBucle(ctx) {
        const cond = this.visit(ctx.condicion());
        this.output.push(`${this.indent}while (${cond}) {`);
        const prevIndent = this.indent;
        this.indent += "    ";
        for (let instr of ctx.instruccion()) {
            this.visit(instr);
        }
        this.indent = prevIndent;
        this.output.push(`${this.indent}}`);
    }

    visitSalida(ctx) {
        const texto = ctx.CADENA().getText();
        this.output.push(`${this.indent}console.log(${texto});`);
    }

    visitCondicion(ctx) {
        if (ctx.VERDADERO()) return "true";
        if (ctx.FALSO()) return "false";
    }
}