package testmaven.ciencias.unam.compiladores;
%%
%public
%standalone
%unicode
PUNTO   = \.
ENTERO  = [1-9][0-9]* | 0+
IDENTIFICADOR = ([a-Z]|[A-Z]|_)([a-Z]|[0-9])*
%%
{ENTERO}        { System.out.print("ENTERO("+yytext() + ")"); }
{ENTERO}? {PUNTO} {ENTERO} | {ENTERO} {PUNTO} {ENTERO}?
                { System.out.print("REAL(" + yytext() + ")" ); }
.               { }
