/********************************************************************************
**  @author Diana Montes                                                       **
**  @about Proyecto 1: Analizador léxico para p, subconjunto de Python.        **
*********************************************************************************/
package asintactico;
import java.util.Stack;

%%
%public
%class Flexer
%standalone
%line
%state INDENTA CADENA CODIGO
%unicode
%{
    private Parser parser;

    public Flexer (java.io.Reader r, Parser p){
    	   this(r);
    	   parser = p;
    }
    
    /* Acumula todos los átomos de DEINDENTA que deben ser devueltos  */
    static String dedents = "";
    /* Estructura auxiliar para almacenar los bloques de indentación */
    static Stack<Integer> pila = new Stack<Integer>();
    /* Guarda el nivel actual de indentación */
    static Integer actual = 0;
    /** Función que maneja los niveles de indetación e imprime
    * átomos INDENTA y DEINDENTA.
    * @param int espacios - nivel de indetación actual.
    * @return boolean - true en caso que no haya errores léxicos,
    * 	      	      	 false en otro caso.
    */
    public static boolean indentacion(int espacios){
        if(pila.empty()){ //ponerle un cero a la pila si esta vacia
             pila.push(new Integer(0));
        }

        Integer tope = pila.peek();

        if(tope != espacios){
	    //Se debe emitir un DEDENT por cada nivel mayor al actual
            if(tope > espacios){
                while(pila.peek() > espacios &&  pila.peek()!=0 ){
                    dedents += "DEINDENTA("+pila.pop()+")\n";
                }
                if(pila.peek() == espacios){
                    System.out.print(dedents);
                    dedents = "";
                    return true;
                }
                return false;
            }
   	    //El nivel actual de indentación es mayor a los anteriores.
            pila.push(espacios);
            System.out.println("INDENTA("+actual+")");
            return true;
        }
	//El nivel actual es igual al anterior.
        return true;
    }
%}
PUNTO			=	\.
DIGIT           	=       [0-9]
CERO             	=        0+
ENTERO			= 	{CERO} | {DIGIT}+
REAL			= 	{ENTERO}? {PUNTO} {ENTERO} | {ENTERO} {PUNTO} {ENTERO}?
AND             = "and"
FROM            = "from"
NOT             = "not"
WHILE           = "while"
FOR             = "for"
ELSE            = "else"
ELIF            = "elif"
OR              = "or"
IF              = "if"
PRINT           = "print"
RETURN          = "return"
MAS                         = "+"
MENOS               = "-"
MULT                = "*"
DIV             = "/"
EXP             = "**"
MOD             = "%"
MAYOR               = ">"
MENOR               = "<"
MAYORIG             = ">="
MENORIG             = "<="
IGUAL               = "="
DIST                = "!="
MASIG               = "+="
MENOSIG             = "-="
IGUALIG             = "=="
PARIZQ              ="("
PARDER              =")"
DOSPUNTOS               =":"
PUNTOCOMA               =";"
/* OPERADOR  		=       ("+" | "-" | "*" | "**" | "/" | "//" | "%" |
			         "<" | ">" | "<=" | "+=" | "-=" | ">=" | "==" | "!=" | "<>" | "=" )
SEPARADOR  		=       ("(" | ")" | ":" | ";" ) */
SALTO          	        =        "\n"
IDENTIFICADOR       	= 	([:letter:] | "_" )([:letter:] | "_" | [0-9])*
ESC              	= 	(\\)
CHAR_LITERAL   	        = 	([:letter:] | [:digit:] | "_" | "$" | " " | "#" ) | "\\"
COMENTARIO 		=     	"#".*{SALTO}
BOOLEANO		=	("True" | "False")
%%
{COMENTARIO}      			{}
<CADENA>{
  {CHAR_LITERAL}			{ yybegin(CODIGO); return Parser.CADENA;}
  {SALTO}				{ System.out.println("Cadena mal construida, linea " + (yyline+1) ); System.exit(1);}
}
<YYINITIAL>{
  " "+                        		{ System.out.println("Error de indentación. Línea " + (yyline+1) ); System.exit(1);}
  .                               	{ yypushback(1); yybegin(CODIGO);}
}
<CODIGO>{
  \"					{ yybegin(CADENA); }
  {ENTERO}				{ return Parser.NUMERO; }
  {REAL}   				{ return Parser.NUMERO; }
  {BOOLEANO}                 		{ return Parser.BOOLEANO; }
  {AND }                              {return Parser.AND;}                  
  {FROM}                              {return Parser.FROM;}
  {NOT }                              {return Parser.NOT ;}
  {WHILE }                            {return Parser.WHILE ;}
  {FOR }                              {return Parser.FOR ;}
  {ELSE}                              {return Parser.ELSE ;}
  {ELIF}                              {return Parser.ELIF ;}
  {OR    }                            {return Parser.OR ;}
  {IF    }                            {return Parser.IF ;}
  {PRINT }                            {return Parser.PRINT ;}
  {RETURN}                            {return Parser.RETURN ;}
  {MAS  }                             {return Parser.MAS ;}
  {MENOS}                             {return Parser.MENOS ;}
  {MULT }                             {return Parser.MULT ;}
  {DIV  }                             {return Parser.DIV ;}
  {EXP  }                             {return Parser.EXP ;}
  {MOD  }                             {return Parser.MOD ;}
  {MAYOR}                             {return Parser.MAYOR ;}
  {MENOR}                             {return Parser.MENOR ;}
  {MAYORIG   }                        {return Parser.MAYORIG ;}
  {MENOSIG   }                        {return Parser.MENOSIG ;}
  {IGUAL     }                        {return Parser.IGUAL ;}
  {DIST      }                        {return Parser.DIST ;}
  {MASIG     }                        {return Parser.MASIG ;}
  {MENOSIG   }                        {return Parser.MENOSIG ;}
  {IGUALIG   }                        {return Parser.IGUALIG ;}
  {PARIZQ    }                        {return Parser.PARIZQ ;}
  {PARDER    }                        {return Parser.PARDER ;}
  {DOSPUNTOS}                         {return Parser.DOSPUNTOS ;}
  {PUNTOCOMA}                         {return Parser.PUNTOCOMA ;}
  {IDENTIFICADOR}           		{ return Parser.IDENTIFICADOR; }
  {SALTO}                 		{ yybegin(INDENTA); actual=0;}
  " "                        		{   }
}
<INDENTA>{
  {SALTO}				{ actual = 0;}
  " "                            	{ actual++;}
  \t                             	{ actual += 4;}
  .                               	{ yypushback(1);
                                          if(!indentacion(actual)){
                                                System.out.println("Error de indentacion, linea "+(yyline+1));
                                                System.exit(1);
                                          }
					  yybegin(CODIGO);
					}
}
<<EOF>>                                 {indentacion(0); System.out.println("Simulacion Exitosa"); System.exit(0);}
[^]					{ }
