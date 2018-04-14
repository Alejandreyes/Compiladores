package asintactico;
%%
%{
    private Parser yyparser;

    public Nodos (java.io.Reader r, Parser p){
    	   this(r);
    	   yyparser = p;
    }
%}
%class Nodos
%standalone
%public
%unicode
//%%
/**[1-9][0-9]*			{parser.yylval = new ParserVal(Integer.parseInt(yytext())); return parser.NUMERO ; }
([1-9][0-9]* | 0+) \. ([1-9][0-9]* | 0+)      {parser.yylval = new ParserVal(Double.parseDouble(yytext())); return parser.NUMERO  ;}
' ' 				{ }
.             { }
*/

NUMERO = [0-9]+ ("." [0-9]+)?
//NL  = \n | \r | \r\n
MENOS = "-"
%%

/* operators */
"+" | 
"*" | 
"/" | 
"^" | 
"(" | 
")"    { return (int) yycharat(0); }

/* newline */
//{NL}   { return Parser.NL; }

/* float */
{MENOS}			{return Parser.MENOS ; } 
{NUMERO}  { yyparser.yylval = new ParserVal(Double.parseDouble(yytext()));
						return Parser.NUMERO; }
([\t]+| (" ")+ )       { }
. 			{yyparser.yyerror("Error cadena mal formada"); } 