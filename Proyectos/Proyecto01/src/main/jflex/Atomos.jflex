package testmaven;
%%
%{
  int espacios = 0 ;
  /* %line Sirve para crear un identificador en que linea se encuentra el token que esta siendo reconozido*/
  ControladorAnalisisLexico controlador  = new ControladorAnalisisLexico();
%}
%class Aléxico
%public
%unicode
%line
%type String
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
{FLOAT} { return "FLOAT ("+yytext()+")"; }
{RESERVED_WORD} { return "RESERVADA("+yytext()+")"; }
{BOOLEAN}     { return "BOOLEAN("+yytext()+")"; }
{SEPARADOR}   { return "SEPARADOR("+yytext()+")"; }
{ENTERO}      { return "ENTERO("+yytext()+")"; }
{STRING}      { return "CADENA( "+yytext() + ")"; }
{ID_PYTHON}    { return "ID_PYTHON("+yytext() + ")"; }
{COMMENT}     { return "COMMENT( "+yytext() + ")"; }
{OPERADOR}    { return "OPERADOR("+yytext()+")"; }

<ESPACIOS> {
" "   {yybegin(YYINITIAL);}
  (" ")+    {
              yybegin(YYINITIAL);
              return ("NUMERO DE ESPACIOS("+yytext().length()+")");
            }
  \t        {
              espacios += 4 ;
              yybegin(YYINITIAL);
              return ("NUMERO DE ESPACIOS("+espacios+")");
            }
}
.             { }
