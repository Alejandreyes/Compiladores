package testmaven;
%%
%{
  int espacios = 0 ;
  /* %line Sirve para crear un identificador en que linea se encuentra el token que esta siendo reconozido*/
  ControladorAnalisisLexico controlador  = new ControladorAnalisisLexico();
%}
%class Aléxico
%public
%standalone
%unicode
%line
PUNTO   = \.
BOOLEAN = True | False
ENTERO  = [1-9][0-9]* | 0+
FLOAT = {ENTERO} {PUNTO} {ENTERO} | {PUNTO} {ENTERO} | {ENTERO} {PUNTO}
RESERVED_WORD = and|or|not|for|while|if|else|elif|print
STRING = \" ([:jletter:])* \"
SEPARADOR = :
OPERADOR = \+|\-|\*|\**|\/|\/\/|\%|\<|\>|\>=|\<=|\=|\!|\==
COMMENT = #.*
ID_PYTHON = ([:jletter:]|_) ([:jletter:]|[:jletterdigit:]|_)*
%state ESPACIOS
%%
\n     { yybegin(ESPACIOS);  }
{FLOAT} { System.out.println("FLOAT ("+yytext()+")"); }
{RESERVED_WORD} { System.out.print("RESERVADA("+yytext()+")"); }
{BOOLEAN}     { System.out.print("BOOLEAN("+yytext()+")"); }
{SEPARADOR}   { System.out.print("SEPARADOR("+yytext()+")"); }
{ENTERO}      { System.out.print("ENTERO("+yytext()+")"); }
{STRING}      { System.out.print("CADENA( "+yytext() + ")"); }
{ID_PYTHON}    { System.out.print("ID_PYTHON("+yytext() + ")"); }
{COMMENT}     { System.out.print("COMMENT( "+yytext() + ")"); }
{OPERADOR}    { System.out.print("OPERADOR("+yytext()+")"); }
<ESPACIOS> {
  " "       {yybegin(YYINITIAL);}
  (" ")+    {

              System.out.print("NUMERO DE ESPACIOS("+yytext().length()+")");
              yybegin(YYINITIAL);
              }
  \t        {
              espacios += 4 ;System.out.print("NUMERO DE ESPACIOS("+espacios+")");
              yybegin(YYINITIAL);
            }

}
.             { }
