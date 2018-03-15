package testmaven;
%%
%{
  int espacios = 0 ;
  /* %line Sirve para crear un identificador en que linea se encuentra el token que esta siendo reconozido*/
  ControladorAnalisisLexico controlador  = new ControladorAnalisisLexico();
%}
%class Flexer
%public
%unicode
%line
%type String
PUNTO   = \.
BOOLEAN = True | False
ENTERO  = [1-9][0-9]* | 0+
FLOAT = {ENTERO} {PUNTO} {ENTERO} | {PUNTO} {ENTERO} | {ENTERO} {PUNTO}
RESERVED_WORD = and|or|not|for|while|if|else|elif|print
STRING = \" (.[^\\])* \"
SEPARADOR = :
OPERADOR = \+|\-|\*|\**|\/|\/\/|\%|\<|\>|\>=|\<=|\=|\!|\==
COMMENT = #.*
ID_PYTHON = ([:jletter:]|_) ([:jletter:]|[:jletterdigit:]|_)*
%state ESPACIOS
%%
\n     {  yybegin(ESPACIOS);  }
{FLOAT} { return "FLOAT ("+yytext()+")"; }
{RESERVED_WORD} { return "RESERVADA("+yytext()+")"; }
{BOOLEAN}     { return "BOOLEAN("+yytext()+")"; }
{SEPARADOR}   { return "SEPARADOR("+yytext()+")"; }
{ENTERO}      { return "ENTERO("+yytext()+")"; }
{STRING}      { return "CADENA("+yytext() + ")"; }
{ID_PYTHON}    { return "ID_PYTHON("+yytext() + ")"; }
{COMMENT}     { return "COMMENT( "+yytext() + ")"; }
{OPERADOR}    { return "OPERADOR("+yytext()+")"; }
" "           {}
("("|")")       {}
<ESPACIOS> {
" "         { return "SALTO";
            yybegin(YYINITIAL);}
  (" ")+    {
              int espacios = yytext().length();
              yybegin(YYINITIAL);
              String resultado = controlador.representa(espacios);
              if(resultado==""){
                return "\n";
              }
              return "SALTO\n"+(resultado+"("+espacios+")");
            }
  (\t|" ")+  {
              int espacios = yytext().length();
              yybegin(YYINITIAL);
              String resultado = controlador.representa(espacios);
              if(resultado==""){
                return "\n";
              }
              return "SALTO\n"+(resultado+"("+espacios+")");
            }
}
.             { yyline +=1; /* Esto ocurre porque comienza a contar desde la linea  0 que no es natural para ningun editor de texto  */
                throw new RuntimeException("Error en la linea: " + yyline); }