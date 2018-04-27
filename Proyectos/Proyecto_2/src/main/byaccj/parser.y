%{
  import java.lang.Math;
  import java.io.*;
%}

%token NUMERO TRUE FALSE SALTO AND FROM ENTERO REAL INDENTA DEINDENTA
%token ELIF OR IF PRINT RETURN MAS MENOS MULT DIV EXP MOD MAYOR MENOR NOT WHILE FOR ELSE CADENA
%token MAYORIG MENOSIG IGUAL DIST MASIG MENORIG IGUALIG PARIZQ PARDER DOSPUNTOS PUNTOCOMA IDENTIFICADOR
/* Gramática con recursión izquierda */

%%

/* file_input: (SALTO | stmt)* ENDMARKER */

file_input : SALTO file_input
    | stmt file_input
    ;

/* stmt: simple_stmt | compound_stmt */
stmt : compound_stmt
    | simple_stmt
    ; 


/* simple_stmt: small_stmt SALTO */
simple_stmt : small_stmt
    ;

/* small_stmt: expr_stmt | print_stmt */
small_stmt : expr_stmt
    | print_stmt
    ;

/* expr_stmt: test '=' test */
expr_stmt : test IGUAL test
    ;

/* print_stmt: 'print' test */
print_stmt : PRINT test
    ;

/* compound_stmt: if_stmt
             | while_stmt */
compound_stmt: if_stmt
    |while_stmt
    ;

/* if_stmt: 'if' test ':' suite ['else' ':' suite] */
if_stmt : IF test DOSPUNTOS suite
    | IF test DOSPUNTOS suite ELSE DOSPUNTOS suite
    ;
/* while_stmt: 'while' test ':' suite */
while_stmt : WHILE test DOSPUNTOS suite
    ;
/* suite: simple_stmt | SALTO INDENTA stmt+ DEINDENTA */

suite : SALTO INDENTA stmt DEINDENTA
    | SALTO INDENTA stmtmas DEINDENTA
    | simple_stmt 
    ; 
stmtmas : stmt
    |stmt stmtmas
    ;

/* test: or_test */
test : or_test
    ;

/* or_test: and_test ('or' and_test)* */
or_test : and_test
    | or_test OR and_test
    ;

/* and_test: not_test ('and' not_test)* */
and_test : not_test
    | and_test AND not_test
    ;
/* not_test: 'not' not_test | comparison */
not_test: NOT not_test 
    | comparison
    ;
/* comparison: expr (comp_op expr)* */
comparison: expr 
    | comparison comp_op expr 
    ;
/* comp_op: '<'|'>'|'=='|'>='|'<='|'!=' */
comp_op: MENOR
    |MAYOR
    |IGUALIG
    |MAYORIG
    |MENORIG
    |DIST
    ;
/* expr: term (('+'|'-') term)* */
expr: term 
    | expr MAS term
    | expr MENOS term
    ;
/* term: factor (('*'|'/'|'%'|'//') factor)* */
term: factor 
    |term MULT factor
    |term DIV factor
    |term MOD factor
    ;

/* factor: ('+'|'-') factor | power */
factor: MAS factor
    | MENOS factor
    | power
    ;
/* power: atom ['**' factor] */
power: atom 
    | atom EXP factor
    ;
/* atom: IDENTIFICADOR | ENTERO | CADENA
    | REAL | BOOLEANO | '(' test ')' */

atom: IDENTIFICADOR 
    | ENTERO 
    | CADENA
    | REAL 
    | TRUE
    | FALSE 
    | PARIZQ test PARDER
    ;






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
