package testmaven;
%%
%class Aléxico
%public
%standalone
%unicode
PUNTO   = \.
ENTERO  = [1-9][0-9]* | 0+
FLOAT = {ENTERO} {PUNTO} {ENTERO}
RESERVED_WORD = False |class|finall|is|return|None|continue|for|lambda|try|True|def|from|nonloc|while|and|del|global|not|with|as|elif|if|or|yield|assert|else|import|pass|break|except|in|raise
COMMENT = #.*
ID_PYTHON = [:jletter:] [:jletterdigit:]*
%%
{FLOAT} { System.out.println("FLOAT ("+yytext()+")"); }
{ENTERO}      { System.out.print("ENTERO("+yytext() + ")"); }
{RESERVED_WORD} { System.out.print("Palabra reservada("+yytext()+")"); }
{ID_PYTHON}     { System.out.print("ID_PYTHON("+yytext() + ")"); }
{COMMENT}     { System.out.print("COMMENT( "+yytext() + ")"); }
.             { }

