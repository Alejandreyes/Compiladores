//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";



package asintactico;



//#line 2 "/home/stein/Documentos/Semestres/Semestre20182/Compiladores/Compiladores/Proyectos/Proyecto_2/src/main/byaccj/parser.y"
  import java.lang.Math;
  import java.io.*;
//#line 20 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//public class ParserVal is defined in ParserVal.java


String   yytext;//user variable to return contextual strings
ParserVal yyval; //used to return semantic vals from action routines
ParserVal yylval;//the 'lval' (result) I got from yylex()
ParserVal valstk[];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
void val_init()
{
  valstk=new ParserVal[YYSTACKSIZE];
  yyval=new ParserVal();
  yylval=new ParserVal();
  valptr=-1;
}
void val_push(ParserVal val)
{
  if (valptr>=YYSTACKSIZE)
    return;
  valstk[++valptr]=val;
}
ParserVal val_pop()
{
  if (valptr<0)
    return new ParserVal();
  return valstk[valptr--];
}
void val_drop(int cnt)
{
int ptr;
  ptr=valptr-cnt;
  if (ptr<0)
    return;
  valptr = ptr;
}
ParserVal val_peek(int relative)
{
int ptr;
  ptr=valptr-relative;
  if (ptr<0)
    return new ParserVal();
  return valstk[ptr];
}
final ParserVal dup_yyval(ParserVal val)
{
  ParserVal dup = new ParserVal();
  dup.ival = val.ival;
  dup.dval = val.dval;
  dup.sval = val.sval;
  dup.obj = val.obj;
  return dup;
}
//#### end semantic value section ####
public final static short NUMERO=257;
public final static short TRUE=258;
public final static short FALSE=259;
public final static short SALTO=260;
public final static short AND=261;
public final static short FROM=262;
public final static short ENTERO=263;
public final static short REAL=264;
public final static short INDENTA=265;
public final static short DEINDENTA=266;
public final static short ELIF=267;
public final static short OR=268;
public final static short IF=269;
public final static short PRINT=270;
public final static short RETURN=271;
public final static short MAS=272;
public final static short MENOS=273;
public final static short MULT=274;
public final static short DIV=275;
public final static short EXP=276;
public final static short MOD=277;
public final static short MAYOR=278;
public final static short MENOR=279;
public final static short NOT=280;
public final static short WHILE=281;
public final static short FOR=282;
public final static short ELSE=283;
public final static short CADENA=284;
public final static short MAYORIG=285;
public final static short MENOSIG=286;
public final static short IGUAL=287;
public final static short DIST=288;
public final static short MASIG=289;
public final static short MENORIG=290;
public final static short IGUALIG=291;
public final static short PARIZQ=292;
public final static short PARDER=293;
public final static short DOSPUNTOS=294;
public final static short PUNTOCOMA=295;
public final static short IDENTIFICADOR=296;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    0,    1,    1,    3,    4,    4,    5,    6,    2,
    2,    8,    8,    9,   10,   10,   10,   11,   11,    7,
   12,   12,   13,   13,   14,   14,   15,   15,   17,   17,
   17,   17,   17,   17,   16,   16,   16,   18,   18,   18,
   18,   19,   19,   19,   20,   20,   21,   21,   21,   21,
   21,   21,   21,
};
final static short yylen[] = {                            2,
    2,    2,    1,    1,    1,    1,    1,    3,    2,    1,
    1,    4,    7,    4,    4,    4,    1,    1,    2,    1,
    1,    3,    1,    3,    2,    1,    1,    3,    1,    1,
    1,    1,    1,    1,    1,    3,    3,    1,    3,    3,
    3,    2,    2,    1,    1,    3,    1,    1,    1,    1,
    1,    1,    3,
};
final static short yydefred[] = {                         0,
   51,   52,    0,   48,   50,    0,    0,    0,    0,    0,
    0,   49,    0,   47,    0,    0,    3,    4,    5,    6,
    7,    0,   10,   11,    0,    0,   23,    0,    0,    0,
   38,   44,    0,    1,    0,    9,   42,   43,   25,    0,
    0,    2,    0,    0,    0,   30,   29,   32,   34,   33,
   31,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   53,    8,    0,   24,    0,    0,    0,   39,   40,   41,
   46,    0,   17,    0,   14,    0,    0,    0,    0,    0,
   15,    0,   19,   16,   13,
};
final static short yydgoto[] = {                         15,
   16,   17,   18,   19,   20,   21,   22,   23,   24,   74,
   83,   25,   26,   27,   28,   29,   52,   30,   31,   32,
   33,
};
final static short yysindex[] = {                       174,
    0,    0,  174,    0,    0,  265,  265,  292,  292,  265,
  265,    0,  265,    0,    0,  174,    0,    0,    0,    0,
    0, -257,    0,    0, -229, -219,    0,  281, -205,  -93,
    0,    0, -231,    0, -239,    0,    0,    0,    0, -236,
 -233,    0,  265,  265,  265,    0,    0,    0,    0,    0,
    0,  292,  292,  292,  292,  292,  292,  292,  262,  262,
    0,    0, -219,    0, -205,  -93,  -93,    0,    0,    0,
    0, -190,    0, -204,    0,  235, -212,  205, -178,  262,
    0,  235,    0,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  105,   27,    0,  -12,  -90, -207,
    0,    0, -256,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   66,    0,  -51, -168, -129,    0,    0,    0,
    0,    0,    0,  144,    0,    0,    0,    0,    0,    0,
    0, -172,    0,    0,    0,
};
final static short yygindex[] = {                        17,
  -67,    0,  -16,    0,    0,    0,  416,    0,    0,  -34,
   21,    0,   55,   -4,    0,   51,    0,   16,   -8,    0,
    0,
};
final static int YYTABLESIZE=588;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         37,
   38,   45,   45,   45,   45,   39,   45,   45,   78,   45,
   82,   45,   45,   45,   82,   45,   45,   45,   45,   34,
   45,   45,   45,   45,   45,   75,   45,   45,   45,   43,
   45,   45,   42,   45,   45,   45,   45,   45,   44,   45,
   64,   45,   73,   73,   58,   85,   68,   69,   70,   71,
   35,   35,   35,   35,   59,   35,   35,   60,   35,   61,
   35,   35,   35,   73,   35,   35,   53,   54,   66,   67,
   35,   35,   35,   35,   76,   35,   35,   35,   77,   35,
   35,   80,   35,   35,   35,   35,   35,   84,   35,   36,
   36,   36,   36,   18,   36,   36,   79,   36,   63,   36,
   36,   36,   65,   36,   36,    0,    0,    0,    0,   36,
   36,   36,   36,    0,   36,   36,   36,    0,   36,   36,
    0,   36,   36,   36,   36,   36,    0,   36,   37,   37,
   37,   37,    0,   37,   37,    0,   37,    0,   37,   37,
   37,    0,   37,   37,    0,    0,    0,    0,   37,   37,
   37,   37,    0,   37,   37,   37,    0,   37,   37,    0,
   37,   37,   37,   37,   37,    0,   37,   27,   27,   27,
   27,    0,   27,   27,    0,   27,    0,   27,   27,   27,
   55,   56,    0,   57,    0,    0,    0,   27,   27,   27,
   27,    0,   27,   27,   27,    0,   27,   27,    0,   27,
   27,   27,   27,   27,    0,   27,   28,   28,   28,   28,
    0,   28,   28,    0,   28,    0,   28,   28,   28,    0,
    0,    0,    0,    0,    0,    0,   28,   28,   28,   28,
    0,   28,   28,   28,    0,   28,   28,    0,   28,   28,
   28,   28,   28,    0,   28,   26,   26,   26,   26,    0,
   26,   26,    0,   26,    0,   26,   26,   26,    0,   26,
   26,    0,    0,    0,    0,    0,    0,   26,   26,    0,
   26,   26,    0,    0,   26,    0,    0,    0,    0,   26,
   26,   26,    0,   26,   21,   21,   21,    0,    0,   21,
   21,    0,   21,    0,   21,   21,   21,    0,   21,   21,
    0,    0,    0,    0,    0,    0,   21,   21,    0,   21,
   21,    0,    0,   21,    0,    0,    0,    0,   21,   21,
   21,    0,   21,   22,   22,   22,    0,    0,   22,   22,
    0,   22,    0,   22,   22,   22,    0,   22,   22,    0,
    0,    0,    0,    0,    0,   22,   22,    0,   22,   22,
    0,    0,   22,    0,    0,    0,    0,   22,   22,   22,
    0,   22,   20,   20,   20,    0,    0,   20,   20,    0,
   20,    0,    0,   20,   20,    0,   20,   20,    0,    0,
    0,    0,    0,    0,   20,   20,    0,   20,   20,    0,
    0,   20,    0,    0,    0,    0,   20,   20,   20,    0,
   20,   12,   12,   12,    0,    0,   12,   12,    0,   12,
    0,    0,   12,   12,    0,   12,   12,    0,    0,    0,
    0,   35,   36,   12,   12,    0,   40,   12,   41,    0,
    0,    1,    2,    3,    0,   12,    4,    5,    0,   12,
    0,    0,    6,    7,    0,    8,    9,    0,    0,    0,
    0,    0,    0,   10,   11,    0,    0,   12,   62,    0,
    0,    0,    1,    2,    0,   13,    0,    4,    5,   14,
   81,    0,    0,    6,    7,    0,    8,    9,    0,    0,
    0,    0,    0,    0,   10,   11,    0,    0,   12,    0,
    0,    0,    1,    2,    0,    0,   13,    4,    5,    0,
   14,    0,    0,    6,    7,    0,    8,    9,    0,    0,
    0,    0,    0,    0,   10,   11,    0,    0,   12,    1,
    2,   72,    1,    2,    4,    5,   13,    4,    5,    0,
   14,    7,    0,    8,    9,    0,    8,    9,    0,    0,
    0,   10,    0,    0,   10,   12,    0,    0,   12,    1,
    2,    0,    0,   13,    4,    5,   13,   14,   46,   47,
   14,    0,    0,    8,    9,   48,    0,    0,   49,    0,
   50,   51,    0,    0,    0,   12,    0,    0,    0,    0,
    0,    0,    0,   13,    0,    0,    0,   14,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                          8,
    9,  258,  259,  260,  261,   10,  263,  264,   76,  266,
   78,  268,  269,  270,   82,  272,  273,  274,  275,    3,
  277,  278,  279,  280,  281,   60,  283,  284,  285,  287,
  287,  288,   16,  290,  291,  292,  293,  294,  268,  296,
   45,  261,   59,   60,  276,   80,   55,   56,   57,   58,
  258,  259,  260,  261,  294,  263,  264,  294,  266,  293,
  268,  269,  270,   80,  272,  273,  272,  273,   53,   54,
  278,  279,  280,  281,  265,  283,  284,  285,  283,  287,
  288,  294,  290,  291,  292,  293,  294,  266,  296,  258,
  259,  260,  261,  266,  263,  264,   76,  266,   44,  268,
  269,  270,   52,  272,  273,   -1,   -1,   -1,   -1,  278,
  279,  280,  281,   -1,  283,  284,  285,   -1,  287,  288,
   -1,  290,  291,  292,  293,  294,   -1,  296,  258,  259,
  260,  261,   -1,  263,  264,   -1,  266,   -1,  268,  269,
  270,   -1,  272,  273,   -1,   -1,   -1,   -1,  278,  279,
  280,  281,   -1,  283,  284,  285,   -1,  287,  288,   -1,
  290,  291,  292,  293,  294,   -1,  296,  258,  259,  260,
  261,   -1,  263,  264,   -1,  266,   -1,  268,  269,  270,
  274,  275,   -1,  277,   -1,   -1,   -1,  278,  279,  280,
  281,   -1,  283,  284,  285,   -1,  287,  288,   -1,  290,
  291,  292,  293,  294,   -1,  296,  258,  259,  260,  261,
   -1,  263,  264,   -1,  266,   -1,  268,  269,  270,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  278,  279,  280,  281,
   -1,  283,  284,  285,   -1,  287,  288,   -1,  290,  291,
  292,  293,  294,   -1,  296,  258,  259,  260,  261,   -1,
  263,  264,   -1,  266,   -1,  268,  269,  270,   -1,  272,
  273,   -1,   -1,   -1,   -1,   -1,   -1,  280,  281,   -1,
  283,  284,   -1,   -1,  287,   -1,   -1,   -1,   -1,  292,
  293,  294,   -1,  296,  258,  259,  260,   -1,   -1,  263,
  264,   -1,  266,   -1,  268,  269,  270,   -1,  272,  273,
   -1,   -1,   -1,   -1,   -1,   -1,  280,  281,   -1,  283,
  284,   -1,   -1,  287,   -1,   -1,   -1,   -1,  292,  293,
  294,   -1,  296,  258,  259,  260,   -1,   -1,  263,  264,
   -1,  266,   -1,  268,  269,  270,   -1,  272,  273,   -1,
   -1,   -1,   -1,   -1,   -1,  280,  281,   -1,  283,  284,
   -1,   -1,  287,   -1,   -1,   -1,   -1,  292,  293,  294,
   -1,  296,  258,  259,  260,   -1,   -1,  263,  264,   -1,
  266,   -1,   -1,  269,  270,   -1,  272,  273,   -1,   -1,
   -1,   -1,   -1,   -1,  280,  281,   -1,  283,  284,   -1,
   -1,  287,   -1,   -1,   -1,   -1,  292,  293,  294,   -1,
  296,  258,  259,  260,   -1,   -1,  263,  264,   -1,  266,
   -1,   -1,  269,  270,   -1,  272,  273,   -1,   -1,   -1,
   -1,    6,    7,  280,  281,   -1,   11,  284,   13,   -1,
   -1,  258,  259,  260,   -1,  292,  263,  264,   -1,  296,
   -1,   -1,  269,  270,   -1,  272,  273,   -1,   -1,   -1,
   -1,   -1,   -1,  280,  281,   -1,   -1,  284,   43,   -1,
   -1,   -1,  258,  259,   -1,  292,   -1,  263,  264,  296,
  266,   -1,   -1,  269,  270,   -1,  272,  273,   -1,   -1,
   -1,   -1,   -1,   -1,  280,  281,   -1,   -1,  284,   -1,
   -1,   -1,  258,  259,   -1,   -1,  292,  263,  264,   -1,
  296,   -1,   -1,  269,  270,   -1,  272,  273,   -1,   -1,
   -1,   -1,   -1,   -1,  280,  281,   -1,   -1,  284,  258,
  259,  260,  258,  259,  263,  264,  292,  263,  264,   -1,
  296,  270,   -1,  272,  273,   -1,  272,  273,   -1,   -1,
   -1,  280,   -1,   -1,  280,  284,   -1,   -1,  284,  258,
  259,   -1,   -1,  292,  263,  264,  292,  296,  278,  279,
  296,   -1,   -1,  272,  273,  285,   -1,   -1,  288,   -1,
  290,  291,   -1,   -1,   -1,  284,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  292,   -1,   -1,   -1,  296,
};
}
final static short YYFINAL=15;
final static short YYMAXTOKEN=296;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"NUMERO","TRUE","FALSE","SALTO","AND","FROM","ENTERO","REAL",
"INDENTA","DEINDENTA","ELIF","OR","IF","PRINT","RETURN","MAS","MENOS","MULT",
"DIV","EXP","MOD","MAYOR","MENOR","NOT","WHILE","FOR","ELSE","CADENA","MAYORIG",
"MENOSIG","IGUAL","DIST","MASIG","MENORIG","IGUALIG","PARIZQ","PARDER",
"DOSPUNTOS","PUNTOCOMA","IDENTIFICADOR",
};
final static String yyrule[] = {
"$accept : file_input",
"file_input : SALTO file_input",
"file_input : stmt file_input",
"stmt : compound_stmt",
"stmt : simple_stmt",
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

//#line 133 "/home/stein/Documentos/Semestres/Semestre20182/Compiladores/Compiladores/Proyectos/Proyecto_2/src/main/byaccj/parser.y"
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
//#line 434 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################
