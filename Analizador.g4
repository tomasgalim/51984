grammar Analizador;

// Reglas del parser
programa: instruccion* ;

instruccion: bucle | salida ;

bucle: MIENTRAS condicion LBRACE instruccion* RBRACE ; 

salida: IMPRIMIR LPAREN  CADENA RPAREN SEMICOLON  ;

condicion: VERDADERO | FALSO ;

// Reglas del lexer (tokens y lexemas)
MIENTRAS: 'mientras';
IMPRIMIR: 'imprimir';
VERDADERO: 'verdadero';
FALSO: 'falso';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
LBRACKET: '[';
RBRACKET: ']';

// Token para cadenas entre comillas dobles, acepta letras, dígitos, espacio y símbolos permitidos
CADENA: '"' (LETRA | DIGITO | ESPACIO | SIMBOLO)* '"' ;

// Letras (mayúsculas y minúsculas)
fragment LETRA: [a-zA-Z];

// Dígitos
fragment DIGITO: [0-9];

// Espacio
fragment ESPACIO: ' ';

// Símbolos permitidos
fragment SIMBOLO: [.,!?:;'];

// Ignorar espacios en blanco, tabulaciones y saltos de línea
WS: [ \t\r\n]+ -> skip;