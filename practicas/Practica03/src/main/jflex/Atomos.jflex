package asintactico;
%%
%{
    private Parser parser;

    public Nodos (java.io.Reader r, Parser p){
    	   this(r);
    	   parser = p;
    }
%}
%class Nodos
%standalone
%public
%unicode
%%
[1-9][0-9]*			{parser.yylval = new ParserVal(yytext()); return parser.NUMERO ; }
([1-9][0-9]* | 0+) \. ([1-9][0-9]* | 0+)      {parser.yylval = new ParserVal(yytext()); return parser.NUMERO  ;}
.             { }
