/* original parser id follows */
/* yysccsid[] = "@(#)yaccpar	1.9 (Berkeley) 02/21/93" */
/* (use YYMAJOR/YYMINOR for ifdefs dependent on parser version) */

#define YYBYACC 1
#define YYMAJOR 1
#define YYMINOR 9
#define YYPATCH 20140715

#define YYEMPTY        (-1)
#define yyclearin      (yychar = YYEMPTY)
#define yyerrok        (yyerrflag = 0)
#define YYRECOVERING() (yyerrflag != 0)
#define YYENOMEM       (-2)
#define YYEOF          0
#define YYPREFIX "yy"

#define YYPURE 0

#line 2 "parser.y"
  import java.lang.Math;
  import java.io.*;
#line 24 "y.tab.c"

#if ! defined(YYSTYPE) && ! defined(YYSTYPE_IS_DECLARED)
/* Default: YYSTYPE is the semantic value type. */
typedef int YYSTYPE;
# define YYSTYPE_IS_DECLARED 1
#endif

/* compatibility with bison */
#ifdef YYPARSE_PARAM
/* compatibility with FreeBSD */
# ifdef YYPARSE_PARAM_TYPE
#  define YYPARSE_DECL() yyparse(YYPARSE_PARAM_TYPE YYPARSE_PARAM)
# else
#  define YYPARSE_DECL() yyparse(void *YYPARSE_PARAM)
# endif
#else
# define YYPARSE_DECL() yyparse(void)
#endif

/* Parameters sent to lex. */
#ifdef YYLEX_PARAM
# define YYLEX_DECL() yylex(void *YYLEX_PARAM)
# define YYLEX yylex(YYLEX_PARAM)
#else
# define YYLEX_DECL() yylex(void)
# define YYLEX yylex()
#endif

/* Parameters sent to yyerror. */
#ifndef YYERROR_DECL
#define YYERROR_DECL() yyerror(const char *s)
#endif
#ifndef YYERROR_CALL
#define YYERROR_CALL(msg) yyerror(msg)
#endif

extern int YYPARSE_DECL();

#define IDENTIFICADOR 257
#define NUMERO 258
#define TRUE 259
#define FALSE 260
#define SALTO 261
#define AND 262
#define FROM 263
#define ENTERO 264
#define REAL 265
#define INDENTA 266
#define DEINDENTA 267
#define ELIF 268
#define OR 269
#define IF 270
#define PRINT 271
#define RETURN 272
#define MAS 273
#define MENOS 274
#define MULT 275
#define DIV 276
#define EXP 277
#define MOD 278
#define MAYOR 279
#define MENOR 280
#define NOT 281
#define WHILE 282
#define FOR 283
#define ELSE 284
#define CADENA 285
#define MAYORIG 286
#define MENOSIG 287
#define IGUAL 288
#define DIST 289
#define MASIG 290
#define MENORIG 291
#define IGUALIG 292
#define PARIZQ 293
#define PARDER 294
#define DOSPUNTOS 295
#define PUNTOCOMA 296
#define YYERRCODE 256
typedef short YYINT;
static const YYINT yylhs[] = {                           -1,
    0,    0,    1,    1,    2,    4,    4,    5,    6,    3,
    3,    8,    8,    9,   10,   10,   10,   11,   11,    7,
   12,   12,   13,   13,   14,   14,   15,   15,   17,   17,
   17,   17,   17,   17,   16,   16,   16,   18,   18,   18,
   18,   19,   19,   19,   20,   20,   21,   21,   21,   21,
   21,   21,   21,
};
static const YYINT yylen[] = {                            2,
    2,    2,    1,    1,    1,    1,    1,    3,    2,    1,
    1,    4,    7,    4,    4,    4,    1,    1,    2,    1,
    1,    3,    1,    3,    2,    1,    1,    3,    1,    1,
    1,    1,    1,    1,    1,    3,    3,    1,    3,    3,
    3,    2,    2,    1,    1,    3,    1,    1,    1,    1,
    1,    1,    3,
};
static const YYINT yydefred[] = {                         0,
   47,   51,   52,    0,   48,   50,    0,    0,    0,    0,
    0,    0,   49,    0,    0,    0,    3,    4,    5,    6,
    7,    0,   10,   11,    0,    0,   23,    0,    0,    0,
   38,   44,    0,    1,    0,    9,   42,   43,   25,    0,
    0,    2,    0,    0,    0,   30,   29,   32,   34,   33,
   31,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   53,    8,    0,   24,    0,    0,    0,   39,   40,   41,
   46,    0,   17,    0,   14,    0,    0,    0,    0,    0,
   15,    0,   19,   16,   13,
};
static const YYINT yydgoto[] = {                         15,
   16,   17,   18,   19,   20,   21,   22,   23,   24,   74,
   83,   25,   26,   27,   28,   29,   52,   30,   31,   32,
   33,
};
static const YYINT yysindex[] = {                       171,
    0,    0,    0,  171,    0,    0,  270,  270,  293,  293,
  270,  270,    0,  270,    0,  171,    0,    0,    0,    0,
    0, -285,    0,    0, -247, -234,    0,  282, -204,  -93,
    0,    0, -245,    0, -260,    0,    0,    0,    0, -252,
 -243,    0,  270,  270,  270,    0,    0,    0,    0,    0,
    0,  293,  293,  293,  293,  293,  293,  293,  252,  252,
    0,    0, -234,    0, -204,  -93,  -93,    0,    0,    0,
    0, -195,    0, -225,    0,  225, -219,  198, -187,  252,
    0,  225,    0,    0,    0,
};
static const YYINT yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  105,   27,    0,  -12,  -90, -207,
    0,    0, -255,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   66,    0,  -51, -168, -129,    0,    0,    0,
    0,    0,    0,  144,    0,    0,    0,    0,    0,    0,
    0, -184,    0,    0,    0,
};
static const YYINT yygindex[] = {                        52,
  -65,  -15,    0,    0,    0,    0,  534,    0,    0,  -19,
   14,    0,   51,   -3,    0,   46,    0,   54,   -9,    0,
    0,
};
#define YYTABLESIZE 586
static const YYINT yytable[] = {                         37,
   38,   45,   43,   45,   45,   45,   45,   39,   45,   45,
   78,   45,   82,   45,   45,   45,   82,   45,   45,   45,
   45,   44,   45,   45,   45,   45,   45,   45,   45,   45,
   45,   58,   45,   45,   59,   45,   45,   45,   45,   45,
   75,   64,   60,   73,   73,   68,   69,   70,   71,   35,
   61,   35,   35,   35,   35,   34,   35,   35,   77,   35,
   85,   35,   35,   35,   73,   35,   35,   42,   53,   54,
   76,   35,   35,   35,   35,   80,   35,   35,   35,   84,
   35,   35,   18,   35,   35,   35,   35,   35,   36,   79,
   36,   36,   36,   36,   63,   36,   36,   65,   36,    0,
   36,   36,   36,    0,   36,   36,   66,   67,    0,    0,
   36,   36,   36,   36,    0,   36,   36,   36,    0,   36,
   36,    0,   36,   36,   36,   36,   36,   37,    0,   37,
   37,   37,   37,    0,   37,   37,    0,   37,    0,   37,
   37,   37,    0,   37,   37,    0,    0,    0,    0,   37,
   37,   37,   37,    0,   37,   37,   37,    0,   37,   37,
    0,   37,   37,   37,   37,   37,   27,    0,   27,   27,
   27,   27,    0,   27,   27,    0,   27,    0,   27,   27,
   27,   55,   56,    0,   57,    0,    0,    0,   27,   27,
   27,   27,    0,   27,   27,   27,    0,   27,   27,    0,
   27,   27,   27,   27,   27,   28,    0,   28,   28,   28,
   28,    0,   28,   28,    0,   28,    0,   28,   28,   28,
    0,    0,    0,    0,    0,    0,    0,   28,   28,   28,
   28,    0,   28,   28,   28,    0,   28,   28,    0,   28,
   28,   28,   28,   28,   26,    0,   26,   26,   26,   26,
    0,   26,   26,    0,   26,    0,   26,   26,   26,    0,
   26,   26,    0,    0,    0,    0,    0,    0,   26,   26,
    0,   26,   26,    0,    0,   26,    0,    0,    0,    0,
   26,   26,   26,   21,    0,   21,   21,   21,    0,    0,
   21,   21,    0,   21,    0,   21,   21,   21,    0,   21,
   21,    0,    0,    0,    0,    0,    0,   21,   21,    0,
   21,   21,    0,    0,   21,    0,    0,    0,    0,   21,
   21,   21,   22,    0,   22,   22,   22,    0,    0,   22,
   22,    0,   22,    0,   22,   22,   22,    0,   22,   22,
    0,    0,    0,    0,    0,    0,   22,   22,    0,   22,
   22,    0,    0,   22,    0,    0,    0,    0,   22,   22,
   22,   20,    0,   20,   20,   20,    0,    0,   20,   20,
    0,   20,    0,    0,   20,   20,    0,   20,   20,    0,
    0,    0,    0,    0,    0,   20,   20,    0,   20,   20,
    0,    0,   20,    0,    0,    0,    0,   20,   20,   20,
   12,    0,   12,   12,   12,    0,    0,   12,   12,    0,
   12,    0,    0,   12,   12,    0,   12,   12,    0,    0,
    0,    0,    0,    0,   12,   12,    0,    1,   12,    2,
    3,    4,    0,    0,    5,    6,   12,    0,    0,    0,
    7,    8,    0,    9,   10,    0,    0,    0,    0,    0,
    0,   11,   12,    0,    1,   13,    2,    3,    0,    0,
    0,    5,    6,   14,   81,    0,    0,    7,    8,    0,
    9,   10,    0,    0,    0,    0,    0,    0,   11,   12,
    0,    1,   13,    2,    3,    0,    0,    0,    5,    6,
   14,    0,    0,    0,    7,    8,    0,    9,   10,    0,
    0,    0,    0,    0,    0,   11,   12,    0,    1,   13,
    2,    3,   72,    0,    0,    5,    6,   14,    0,    0,
    0,    0,    8,    0,    9,   10,    1,    0,    2,    3,
    0,    0,   11,    5,    6,    0,   13,    0,    0,    0,
   35,   36,    9,   10,   14,   40,    0,   41,    0,    1,
   11,    2,    3,    0,   13,    0,    5,    6,    0,    0,
   46,   47,   14,    0,    0,    9,   10,   48,    0,    0,
   49,    0,   50,   51,    0,    0,   62,   13,    0,    0,
    0,    0,    0,    0,    0,   14,
};
static const YYINT yycheck[] = {                          9,
   10,  257,  288,  259,  260,  261,  262,   11,  264,  265,
   76,  267,   78,  269,  270,  271,   82,  273,  274,  275,
  276,  269,  278,  279,  280,  281,  282,  262,  284,  285,
  286,  277,  288,  289,  295,  291,  292,  293,  294,  295,
   60,   45,  295,   59,   60,   55,   56,   57,   58,  257,
  294,  259,  260,  261,  262,    4,  264,  265,  284,  267,
   80,  269,  270,  271,   80,  273,  274,   16,  273,  274,
  266,  279,  280,  281,  282,  295,  284,  285,  286,  267,
  288,  289,  267,  291,  292,  293,  294,  295,  257,   76,
  259,  260,  261,  262,   44,  264,  265,   52,  267,   -1,
  269,  270,  271,   -1,  273,  274,   53,   54,   -1,   -1,
  279,  280,  281,  282,   -1,  284,  285,  286,   -1,  288,
  289,   -1,  291,  292,  293,  294,  295,  257,   -1,  259,
  260,  261,  262,   -1,  264,  265,   -1,  267,   -1,  269,
  270,  271,   -1,  273,  274,   -1,   -1,   -1,   -1,  279,
  280,  281,  282,   -1,  284,  285,  286,   -1,  288,  289,
   -1,  291,  292,  293,  294,  295,  257,   -1,  259,  260,
  261,  262,   -1,  264,  265,   -1,  267,   -1,  269,  270,
  271,  275,  276,   -1,  278,   -1,   -1,   -1,  279,  280,
  281,  282,   -1,  284,  285,  286,   -1,  288,  289,   -1,
  291,  292,  293,  294,  295,  257,   -1,  259,  260,  261,
  262,   -1,  264,  265,   -1,  267,   -1,  269,  270,  271,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  279,  280,  281,
  282,   -1,  284,  285,  286,   -1,  288,  289,   -1,  291,
  292,  293,  294,  295,  257,   -1,  259,  260,  261,  262,
   -1,  264,  265,   -1,  267,   -1,  269,  270,  271,   -1,
  273,  274,   -1,   -1,   -1,   -1,   -1,   -1,  281,  282,
   -1,  284,  285,   -1,   -1,  288,   -1,   -1,   -1,   -1,
  293,  294,  295,  257,   -1,  259,  260,  261,   -1,   -1,
  264,  265,   -1,  267,   -1,  269,  270,  271,   -1,  273,
  274,   -1,   -1,   -1,   -1,   -1,   -1,  281,  282,   -1,
  284,  285,   -1,   -1,  288,   -1,   -1,   -1,   -1,  293,
  294,  295,  257,   -1,  259,  260,  261,   -1,   -1,  264,
  265,   -1,  267,   -1,  269,  270,  271,   -1,  273,  274,
   -1,   -1,   -1,   -1,   -1,   -1,  281,  282,   -1,  284,
  285,   -1,   -1,  288,   -1,   -1,   -1,   -1,  293,  294,
  295,  257,   -1,  259,  260,  261,   -1,   -1,  264,  265,
   -1,  267,   -1,   -1,  270,  271,   -1,  273,  274,   -1,
   -1,   -1,   -1,   -1,   -1,  281,  282,   -1,  284,  285,
   -1,   -1,  288,   -1,   -1,   -1,   -1,  293,  294,  295,
  257,   -1,  259,  260,  261,   -1,   -1,  264,  265,   -1,
  267,   -1,   -1,  270,  271,   -1,  273,  274,   -1,   -1,
   -1,   -1,   -1,   -1,  281,  282,   -1,  257,  285,  259,
  260,  261,   -1,   -1,  264,  265,  293,   -1,   -1,   -1,
  270,  271,   -1,  273,  274,   -1,   -1,   -1,   -1,   -1,
   -1,  281,  282,   -1,  257,  285,  259,  260,   -1,   -1,
   -1,  264,  265,  293,  267,   -1,   -1,  270,  271,   -1,
  273,  274,   -1,   -1,   -1,   -1,   -1,   -1,  281,  282,
   -1,  257,  285,  259,  260,   -1,   -1,   -1,  264,  265,
  293,   -1,   -1,   -1,  270,  271,   -1,  273,  274,   -1,
   -1,   -1,   -1,   -1,   -1,  281,  282,   -1,  257,  285,
  259,  260,  261,   -1,   -1,  264,  265,  293,   -1,   -1,
   -1,   -1,  271,   -1,  273,  274,  257,   -1,  259,  260,
   -1,   -1,  281,  264,  265,   -1,  285,   -1,   -1,   -1,
    7,    8,  273,  274,  293,   12,   -1,   14,   -1,  257,
  281,  259,  260,   -1,  285,   -1,  264,  265,   -1,   -1,
  279,  280,  293,   -1,   -1,  273,  274,  286,   -1,   -1,
  289,   -1,  291,  292,   -1,   -1,   43,  285,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  293,
};
#define YYFINAL 15
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 296
#define YYUNDFTOKEN 320
#define YYTRANSLATE(a) ((a) > YYMAXTOKEN ? YYUNDFTOKEN : (a))
#if YYDEBUG
static const char *const yyname[] = {

"end-of-file",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"IDENTIFICADOR","NUMERO","TRUE",
"FALSE","SALTO","AND","FROM","ENTERO","REAL","INDENTA","DEINDENTA","ELIF","OR",
"IF","PRINT","RETURN","MAS","MENOS","MULT","DIV","EXP","MOD","MAYOR","MENOR",
"NOT","WHILE","FOR","ELSE","CADENA","MAYORIG","MENOSIG","IGUAL","DIST","MASIG",
"MENORIG","IGUALIG","PARIZQ","PARDER","DOSPUNTOS","PUNTOCOMA",0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,"illegal-symbol",
};
static const char *const yyrule[] = {
"$accept : file_input",
"file_input : SALTO file_input",
"file_input : stmt file_input",
"stmt : simple_stmt",
"stmt : compound_stmt",
"simple_stmt : small_stmt",
"small_stmt : expr_stmt",
"small_stmt : print_stmt",
"expr_stmt : test IGUAL test",
"print_stmt : PRINT test",
"compound_stmt : if_stmt",
"compound_stmt : while_stmt",
"if_stmt : IF test DOSPUNTOS suite",
"if_stmt : IF test DOSPUNTOS suite ELSE DOSPUNTOS suite",
"while_stmt : WHILE test DOSPUNTOS suite",
"suite : SALTO INDENTA stmt DEINDENTA",
"suite : SALTO INDENTA stmtmas DEINDENTA",
"suite : simple_stmt",
"stmtmas : stmt",
"stmtmas : stmt stmtmas",
"test : or_test",
"or_test : and_test",
"or_test : or_test OR and_test",
"and_test : not_test",
"and_test : and_test AND not_test",
"not_test : NOT not_test",
"not_test : comparison",
"comparison : expr",
"comparison : comparison comp_op expr",
"comp_op : MENOR",
"comp_op : MAYOR",
"comp_op : IGUALIG",
"comp_op : MAYORIG",
"comp_op : MENORIG",
"comp_op : DIST",
"expr : term",
"expr : expr MAS term",
"expr : expr MENOS term",
"term : factor",
"term : term MULT factor",
"term : term DIV factor",
"term : term MOD factor",
"factor : MAS factor",
"factor : MENOS factor",
"factor : power",
"power : atom",
"power : atom EXP factor",
"atom : IDENTIFICADOR",
"atom : ENTERO",
"atom : CADENA",
"atom : REAL",
"atom : TRUE",
"atom : FALSE",
"atom : PARIZQ test PARDER",

};
#endif

int      yydebug;
int      yynerrs;

int      yyerrflag;
int      yychar;
YYSTYPE  yyval;
YYSTYPE  yylval;

/* define the initial stack-sizes */
#ifdef YYSTACKSIZE
#undef YYMAXDEPTH
#define YYMAXDEPTH  YYSTACKSIZE
#else
#ifdef YYMAXDEPTH
#define YYSTACKSIZE YYMAXDEPTH
#else
#define YYSTACKSIZE 10000
#define YYMAXDEPTH  10000
#endif
#endif

#define YYINITSTACKSIZE 200

typedef struct {
    unsigned stacksize;
    YYINT    *s_base;
    YYINT    *s_mark;
    YYINT    *s_last;
    YYSTYPE  *l_base;
    YYSTYPE  *l_mark;
} YYSTACKDATA;
/* variables for the parser stack */
static YYSTACKDATA yystack;
#line 130 "parser.y"
/* Referencia a analizador léxico */
private Flexer lexer;

/* Constructor */
public Parser(Reader r) {
    lexer = new Flexer(r, this);
}

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

/* Creación del parser e inicialización del reconocimiento */
public static void main(String args[]) throws IOException {
    Parser parser = new Parser(new FileReader("src/main/resources/test.txt"));
    parser.yydebug = true;
    parser.yyparse();
}
#line 434 "y.tab.c"

#if YYDEBUG
#include <stdio.h>		/* needed for printf */
#endif

#include <stdlib.h>	/* needed for malloc, etc */
#include <string.h>	/* needed for memset */

/* allocate initial stack or double stack size, up to YYMAXDEPTH */
static int yygrowstack(YYSTACKDATA *data)
{
    int i;
    unsigned newsize;
    YYINT *newss;
    YYSTYPE *newvs;

    if ((newsize = data->stacksize) == 0)
        newsize = YYINITSTACKSIZE;
    else if (newsize >= YYMAXDEPTH)
        return YYENOMEM;
    else if ((newsize *= 2) > YYMAXDEPTH)
        newsize = YYMAXDEPTH;

    i = (int) (data->s_mark - data->s_base);
    newss = (YYINT *)realloc(data->s_base, newsize * sizeof(*newss));
    if (newss == 0)
        return YYENOMEM;

    data->s_base = newss;
    data->s_mark = newss + i;

    newvs = (YYSTYPE *)realloc(data->l_base, newsize * sizeof(*newvs));
    if (newvs == 0)
        return YYENOMEM;

    data->l_base = newvs;
    data->l_mark = newvs + i;

    data->stacksize = newsize;
    data->s_last = data->s_base + newsize - 1;
    return 0;
}

#if YYPURE || defined(YY_NO_LEAKS)
static void yyfreestack(YYSTACKDATA *data)
{
    free(data->s_base);
    free(data->l_base);
    memset(data, 0, sizeof(*data));
}
#else
#define yyfreestack(data) /* nothing */
#endif

#define YYABORT  goto yyabort
#define YYREJECT goto yyabort
#define YYACCEPT goto yyaccept
#define YYERROR  goto yyerrlab

int
YYPARSE_DECL()
{
    int yym, yyn, yystate;
#if YYDEBUG
    const char *yys;

    if ((yys = getenv("YYDEBUG")) != 0)
    {
        yyn = *yys;
        if (yyn >= '0' && yyn <= '9')
            yydebug = yyn - '0';
    }
#endif

    yynerrs = 0;
    yyerrflag = 0;
    yychar = YYEMPTY;
    yystate = 0;

#if YYPURE
    memset(&yystack, 0, sizeof(yystack));
#endif

    if (yystack.s_base == NULL && yygrowstack(&yystack) == YYENOMEM) goto yyoverflow;
    yystack.s_mark = yystack.s_base;
    yystack.l_mark = yystack.l_base;
    yystate = 0;
    *yystack.s_mark = 0;

yyloop:
    if ((yyn = yydefred[yystate]) != 0) goto yyreduce;
    if (yychar < 0)
    {
        if ((yychar = YYLEX) < 0) yychar = YYEOF;
#if YYDEBUG
        if (yydebug)
        {
            yys = yyname[YYTRANSLATE(yychar)];
            printf("%sdebug: state %d, reading %d (%s)\n",
                    YYPREFIX, yystate, yychar, yys);
        }
#endif
    }
    if ((yyn = yysindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
#if YYDEBUG
        if (yydebug)
            printf("%sdebug: state %d, shifting to state %d\n",
                    YYPREFIX, yystate, yytable[yyn]);
#endif
        if (yystack.s_mark >= yystack.s_last && yygrowstack(&yystack) == YYENOMEM)
        {
            goto yyoverflow;
        }
        yystate = yytable[yyn];
        *++yystack.s_mark = yytable[yyn];
        *++yystack.l_mark = yylval;
        yychar = YYEMPTY;
        if (yyerrflag > 0)  --yyerrflag;
        goto yyloop;
    }
    if ((yyn = yyrindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
        yyn = yytable[yyn];
        goto yyreduce;
    }
    if (yyerrflag) goto yyinrecovery;

    YYERROR_CALL("syntax error");

    goto yyerrlab;

yyerrlab:
    ++yynerrs;

yyinrecovery:
    if (yyerrflag < 3)
    {
        yyerrflag = 3;
        for (;;)
        {
            if ((yyn = yysindex[*yystack.s_mark]) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
#if YYDEBUG
                if (yydebug)
                    printf("%sdebug: state %d, error recovery shifting\
 to state %d\n", YYPREFIX, *yystack.s_mark, yytable[yyn]);
#endif
                if (yystack.s_mark >= yystack.s_last && yygrowstack(&yystack) == YYENOMEM)
                {
                    goto yyoverflow;
                }
                yystate = yytable[yyn];
                *++yystack.s_mark = yytable[yyn];
                *++yystack.l_mark = yylval;
                goto yyloop;
            }
            else
            {
#if YYDEBUG
                if (yydebug)
                    printf("%sdebug: error recovery discarding state %d\n",
                            YYPREFIX, *yystack.s_mark);
#endif
                if (yystack.s_mark <= yystack.s_base) goto yyabort;
                --yystack.s_mark;
                --yystack.l_mark;
            }
        }
    }
    else
    {
        if (yychar == YYEOF) goto yyabort;
#if YYDEBUG
        if (yydebug)
        {
            yys = yyname[YYTRANSLATE(yychar)];
            printf("%sdebug: state %d, error recovery discards token %d (%s)\n",
                    YYPREFIX, yystate, yychar, yys);
        }
#endif
        yychar = YYEMPTY;
        goto yyloop;
    }

yyreduce:
#if YYDEBUG
    if (yydebug)
        printf("%sdebug: state %d, reducing by rule %d (%s)\n",
                YYPREFIX, yystate, yyn, yyrule[yyn]);
#endif
    yym = yylen[yyn];
    if (yym)
        yyval = yystack.l_mark[1-yym];
    else
        memset(&yyval, 0, sizeof yyval);
    switch (yyn)
    {
    }
    yystack.s_mark -= yym;
    yystate = *yystack.s_mark;
    yystack.l_mark -= yym;
    yym = yylhs[yyn];
    if (yystate == 0 && yym == 0)
    {
#if YYDEBUG
        if (yydebug)
            printf("%sdebug: after reduction, shifting from state 0 to\
 state %d\n", YYPREFIX, YYFINAL);
#endif
        yystate = YYFINAL;
        *++yystack.s_mark = YYFINAL;
        *++yystack.l_mark = yyval;
        if (yychar < 0)
        {
            if ((yychar = YYLEX) < 0) yychar = YYEOF;
#if YYDEBUG
            if (yydebug)
            {
                yys = yyname[YYTRANSLATE(yychar)];
                printf("%sdebug: state %d, reading %d (%s)\n",
                        YYPREFIX, YYFINAL, yychar, yys);
            }
#endif
        }
        if (yychar == YYEOF) goto yyaccept;
        goto yyloop;
    }
    if ((yyn = yygindex[yym]) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn];
    else
        yystate = yydgoto[yym];
#if YYDEBUG
    if (yydebug)
        printf("%sdebug: after reduction, shifting from state %d \
to state %d\n", YYPREFIX, *yystack.s_mark, yystate);
#endif
    if (yystack.s_mark >= yystack.s_last && yygrowstack(&yystack) == YYENOMEM)
    {
        goto yyoverflow;
    }
    *++yystack.s_mark = (YYINT) yystate;
    *++yystack.l_mark = yyval;
    goto yyloop;

yyoverflow:
    YYERROR_CALL("yacc stack overflow");

yyabort:
    yyfreestack(&yystack);
    return (1);

yyaccept:
    yyfreestack(&yystack);
    return (0);
}
