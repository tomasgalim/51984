import AnalizadorVisitor from "./generated/AnalizadorVisitor.js";
import AnalizadorListener from "./generated/AnalizadorListener.js";

// Visitor para tu lenguaje Analizador
export class CustomAnalizadorVisitor extends AnalizadorVisitor {
    visitPrograma(ctx) {
        for (let instr of ctx.instruccion()) {
            this.visit(instr);
        }
    }
    visitInstruccion(ctx) {
        if (ctx.bucle()) return this.visit(ctx.bucle());
        if (ctx.salida()) return this.visit(ctx.salida());
    }
    visitBucle(ctx) {
        while (this.visit(ctx.condicion())) {
            for (let instr of ctx.instruccion()) {
                this.visit(instr);
            }
        }
    }
    visitSalida(ctx) {
        const texto = ctx.CADENA().getText();
        console.log(texto.slice(1, -1));
    }
    visitCondicion(ctx) {
        if (ctx.VERDADERO()) return true;
        if (ctx.FALSO()) return false;
    }
}

// Listener opcional para Analizador
export class CustomAnalizadorListener extends AnalizadorListener {
    enterSalida(ctx) {
        console.log("Se detectó una instrucción de salida (imprimir)");
    }

    enterBucle(ctx) {
        console.log("Se detectó un bucle mientras");
    }

    enterPrograma(ctx) {
        console.log("Inicio del programa");
    }
}