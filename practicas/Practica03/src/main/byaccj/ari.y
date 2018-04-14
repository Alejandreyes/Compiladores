%{
  import java.lang.Math;
  import java.io.*;
%}

/*%token<dval> NUMERO// Declaracion  de Terminales 
%type<dval>  LINEA E  // Declaracion de no terminales

/* Gramática con recursión izquierda 
%%*/



/*input : Lista {$$ = $1; System.out.println("[OK] "+ $$  );}
      |       { System.out.println("[Ok Lista Vacía] ");}
;

Lista: Lista NODO {$$ = $1 + $2;}
     | NODO {$$ = $1;}*/
/*LINEA : E  { $$ = $1; System.out.println("[OK] "+ $$  );} 
  | LINEA E { $$ = $2; System.out.println("[OK] "+ $$  );}
  ;
LINEA : E  { $$ = $1; System.out.println("[OK] "+ $$  );}
E : NUMERO '+' NUMERO   {$$ = $1 + $3 ; System.out.println("El valor resultado es igual a" +  $1); }
  | NUMERO       {$$ = $1;}
  ;*/

 // %token NL          /* newline  */
%token <dval> NUMERO  /* a number */

%type <dval> exp fact term MENOS

%left '-' '+'
%left '*' '/'

      
%%

input:   /* empty string */
       | input line
       ;
      
line:   exp  { System.out.println(" = " + $1);  }
       ;
      
exp:  exp '+' exp        { $$ = $1 + $3; }
     | exp '-' exp           {$$ = $1 - $3 ; } 
     | term                //  {$$ = $1 ; }
  ;  
term : term '*' term                { $$ = $1 * $3; }
    | term '/' term                 { $$ = $1 / $3; }
    | fact
  ;
fact  : NUMERO                      {$$ = $1 ; }                         
    | MENOS NUMERO                    {$$ = -1 * $2 ; }
    ;
    
%%
/* Referencia a analizador léxico */
private Nodos lexer;
/* Constructor */
public Parser(Reader r) {
    lexer = new Nodos(r, this);
}

public int yylex(){
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
    Parser parser = new Parser(new FileReader(args[0]));
    parser.yyparse();
}
