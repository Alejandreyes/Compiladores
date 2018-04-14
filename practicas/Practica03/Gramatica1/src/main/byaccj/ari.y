/* Primera Sección */
%{
  //Importamos lo necesario para trabajar con archivos y hacer operaciones matemáticas.
  import java.lang.Math;
  import java.io.*;
%}
//Declaramos los tokens de la gramática
//Terminales:
%token<dval> NUMERO //Número
%token<sval> MINUS //Signo menos
//No terminales:
%type<dval> S /*Simbolo inicial*/ 
%type<dval> E K T L F /*Simbolos no terminales*/
//Jerarquía de operaciones y parentización:
%left '-' '+' //Asocian a la izquierda. Menor presedencia.
%left '*' '/' //Asocian a la izquierda. Mayor presedencia.
%left MINUS //Asocia a la izquierda. Precedencia mayor de "menos" (número negativo)

%%
/*Segunda Sección */

/**
Reglas originales en EBNF:
E : (E (+|-))* T
T : (T (*|/))* F
F : [-] NUMBER

Reglas modificadas (Sin estrella de Kleene):
S -> E
E -> K(+|-)T | T
K -> E | K(+|-)F | F
T -> L(*|/)F | F
L -> T | L(*|/)F | F
F -> - NUMBER | NUMBER
*/
// S es el símbolo inicial.
S : E {$$ = $1; System.out.println("[OK] "+$$);}
  | /*Cadena vacía*/ {yyerror("Cadena vacía");}
  ;

E : K '+' T {$$ = $1 + $3;} 
  | K '-' T {$$ = $1 - $3;}
  | T {$$ = $1;}
  ;

K : E {$$ = $1;}
  | K '+' F {$$ = $1 + $3;}
  | K '-' F {$$ = $1 - $3;}
  | F {$$ = $1;}
  ;

T : L '*' F {$$ = $1 * $3;}
  | L '/' F {if($3 == 0d) yyerror("división entre cero"); else $$ = $1 / $3; } // Checar el caso de división entre cero.
  | F       {$$ = $1;}
  ;

L : T            {$$ = $1;}
  | L '*' F {$$ = $1 * $3;}
  | L '/' F {if($3 == 0d) yyerror("división entre cero"); else $$ = $1 / $3; } //Checar el caso de división entre cero
  | F            {$$ = $1;}
  ;
F : NUMERO {$$ = $1;}
  | '-' NUMERO %prec MINUS {$$ = -$2;}
  ;
%%
/*Tercera Sección*/

/* Referencia a analizador léxico */
private Nodos lexer;

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

/* Constructor */
public Parser(Reader r) {
    lexer = new Nodos(r, this);
}

/* Creación del parser e inicialización del reconocimiento */
public static void main(String args[]) throws IOException {
    Parser parser = new Parser(new FileReader(args[0]));
    parser.yyparse();
}
