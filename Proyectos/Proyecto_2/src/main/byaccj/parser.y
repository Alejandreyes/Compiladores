%{
  import java.lang.Math;
  import java.io.*;
%}

%token IDENTIFICADOR NUMERO BOOLEANO SALTO AND FROM NOT WHILE FOR ELSE CADENA
%token ELIF OR IF PRINT RETURN MAS MENOS MULT DIV EXP MOD MAYOR MENOR 
%token MAYORIG MENOSIG IGUAL DIST MASIG MENORIG IGUALIG PARIZQ PARDER DOSPUNTOS PUNTOCOMA ENDMARKER
/* Gramática con recursión izquierda */

%%
/**
*   file_input: (SALTO | stmt)* ENDMARKER
*/
file_input: SALTO file_input
          | stmt file_input
          |ENDMARKER   
;
/* Gramatica simple_stmt: small_stmt SALTO */
stmt: simple_stmt 
    | compound_stmt
    ;
simple_stmt: small_stmt SALTO ; 

/*small_stmt: expr_stmt | print_stmt*/

small_stmt: expr_stmt 
          | print_stmt
    ;
/*expr_stmt: test IGUAL test*/
expr_stmt: test IGUAL test ; 

/*print_stmt: 'print' test*/
print_stmt: PRINT test ; 

/*compound_stmt: if_stmt
             | while_stmt*/
compound_stmt: if_stmt
             | while_stmt
             ; 
/*if_stmt: 'if' test DOSPUNTOS suite [ELSE DOSPUNTOS suite]*/             
if_stmt: IF test DOSPUNTOS suite
    | IF test DOSPUNTOS suite ELSE DOSPUNTOS suite
    ;
/*while_stmt: WHILE test DOSPUNTOS suite*/
while_stmt: WHILE test DOSPUNTOS suite
/*suite: simple_stmt | SALTO INDENTA stmt+ DEINDENTA*/
suite: simple_stmt 
    | SALTO INDENTA stmtEst
    | DEINDENTA
;
// stmt* 
stmtEst : stmt 
    | stmt stmtEst
    ;
// test: or_test
test: or_test

/*or_test: and_test (OR and_test)* Pasando a gramatica recursiva por la izquierda*/
or_test: or_test OR and_test   
    | and_test OR  and_test 
; 
/*and_test: not_test (AND not_test)**/
and_test: not_test AND and_test
  | and_test AND and_test
  ; 

not_test: NOT not_test 
    | comparison
    ;
/* comparison: expr (comp_op expr)* */
comparison: expr comparisonAux
    ;
comparisonAux  : comp_op expr
    | expr
    ;

comp_op: MENOR
    |MAYOR
    |IGUALIG
    |MAYORIG
    |MENORIG
    |DIST
    ;
expr: expr MAS expr
    | expr MENOS expr
    | term
    ;  
/* term: factor ((MULT|DIV|MOD) factor)* */    

term: factor MULT factor
    | factor DIV factor
    | factor MOD factor
    
    ;
/* factor: (MAS|MENOS) factor | power */    
factor: MAS factor 
    |   MENOS factor
    |   power
    ;
/* power: atom [EXP factor] */    
power: atom 
    | atom EXP factor
    ;
/* atom: IDENTIFICADOR | ENTERO | CADENA | REAL | BOOLEANO | PARIZQ test PARDER */
atom: IDENTIFICADOR 
    | ENTERO 
    | CADENA
    | REAL 
    | BOOLEANO 
    | PARIZQ test PARDER

%%
/* Referencia a analizador léxico */
private Flexer lexer;

/* Constructor */
public Parser(Reader r) {
    lexer = new Flexer(r, this);
}

private int yylex () {
    int yyl_return = -1;
    try {
      yyl_return = lexer.yylex();
    }
    catch (IOException e) {
      System.err.println("IO error :"+e);
    }
    return yyl_return;
}

/* Función para reportar error */
public void yyerror (String error) {
    System.err.println ("[ERROR]  " + error);
    System.exit(1);
}

/* Creación del parser e inicialización del reconocimiento */
public static void main(String args[]) throws IOException {
    Parser parser = new Parser(new FileReader("src/main/resources/test.txt"));
    parser.yydebug = true;
    parser.yyparse();
}
