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
public final static short IDENTIFICADOR=257;
public final static short NUMERO=258;
public final static short BOOLEANO=259;
public final static short SALTO=260;
public final static short AND=261;
public final static short FROM=262;
public final static short NOT=263;
public final static short WHILE=264;
public final static short FOR=265;
public final static short ELSE=266;
public final static short CADENA=267;
public final static short ELIF=268;
public final static short OR=269;
public final static short IF=270;
public final static short PRINT=271;
public final static short RETURN=272;
public final static short MAS=273;
public final static short MENOS=274;
public final static short MULT=275;
public final static short DIV=276;
public final static short EXP=277;
public final static short MOD=278;
public final static short MAYOR=279;
public final static short MENOR=280;
public final static short MAYORIG=281;
public final static short MENOSIG=282;
public final static short IGUAL=283;
public final static short DIST=284;
public final static short MASIG=285;
public final static short MENORIG=286;
public final static short IGUALIG=287;
public final static short PARIZQ=288;
public final static short PARDER=289;
public final static short DOSPUNTOS=290;
public final static short PUNTOCOMA=291;
public final static short ENDMARKER=292;
public final static short INDENTA=293;
public final static short DEINDENTA=294;
public final static short ENTERO=295;
public final static short REAL=296;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    0,    0,    1,    1,    2,    4,    4,    5,    6,
    3,    3,    8,    8,    9,   10,   10,   10,   11,   11,
    7,   12,   12,   13,   13,   14,   14,   15,   17,   17,
   18,   18,   18,   18,   18,   18,   16,   16,   16,   19,
   19,   19,   20,   20,   20,   21,   21,   22,   22,   22,
   22,   22,   22,
};
final static short yylen[] = {                            2,
    2,    2,    1,    1,    1,    2,    1,    1,    3,    2,
    1,    1,    4,    7,    4,    1,    3,    1,    1,    2,
    1,    3,    3,    3,    3,    2,    1,    2,    2,    1,
    1,    1,    1,    1,    1,    1,    3,    3,    1,    3,
    3,    3,    2,    2,    1,    1,    3,    1,    1,    1,
    1,    1,    3,
};
final static short yydefred[] = {                         0,
   48,   52,    0,    0,    0,   50,    0,    0,    0,    0,
    0,    3,   49,   51,    0,    0,    4,    5,    0,    7,
    8,    0,   11,   12,    0,    0,    0,   27,    0,   39,
    0,   45,    0,    1,   26,    0,    0,   10,   43,   44,
    0,    2,    6,    0,    0,    0,    0,    0,    0,    0,
   32,   31,   34,   36,   35,   33,    0,   28,    0,    0,
    0,    0,    0,    0,    0,   53,    9,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   40,   41,
   42,   47,    0,   18,   16,   15,    0,    0,    0,    0,
   17,    0,   20,   14,
};
final static short yydgoto[] = {                         15,
   16,   17,   18,   19,   20,   21,   22,   23,   24,   86,
   91,   25,   26,   27,   28,   29,   58,   59,   30,   31,
   32,   33,
};
final static short yysindex[] = {                      -253,
    0,    0, -253, -115, -115,    0, -115, -115,  -26,  -26,
 -115,    0,    0,    0,    0, -253,    0,    0, -232,    0,
    0, -252,    0,    0, -236, -200, -227,    0, -176,    0,
 -169,    0, -239,    0,    0, -246, -243,    0,    0,    0,
 -241,    0,    0, -115, -115, -115, -115, -115,  -26,  -26,
    0,    0,    0,    0,    0,    0, -258,    0,  -26,  -26,
  -26,  -26,  -26,  -58,  -58,    0,    0, -203, -203, -203,
 -203, -258, -169, -258, -169,  -26,  -26, -258,    0,    0,
    0,    0, -231,    0,    0,    0, -198,  -45, -226,  -45,
    0,  -58,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -25,    0,    0,    0,    0,    0,
    0,    0, -202,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0, -191,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0, -223,  -99,  -83,
  -37, -124,    0,  -92,    0,    0,    0, -186,    0,    0,
    0,    0,    0,    0,    0,    0, -142,    0,    0, -247,
    0,    0,    0,    0,
};
final static short yygindex[] = {                         9,
  -85,  -56,    0,    0,    0,    0,   19,    0,    0,  -36,
  -10,    0,   42,   88,    0,  -27,    0,    0,    0,   -9,
    0,    0,
};
final static int YYTABLESIZE=270;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         39,
   40,   57,   90,    1,   90,    2,    3,   85,   85,    4,
    5,   34,   19,    6,   76,   77,    7,    8,   19,    9,
   10,   72,   74,   36,   42,   37,   38,   43,   87,   41,
   44,   78,   45,   48,   11,   85,   22,   63,   12,   73,
   75,   13,   14,   64,   19,   22,   65,   66,   72,   74,
   79,   80,   81,   82,   46,   94,   46,   46,   46,   22,
   46,   88,   67,   92,   46,   22,   22,   89,   47,   30,
   46,   46,   46,   46,   29,   46,   46,   46,   46,   93,
    1,   46,    2,   46,   46,   46,   68,   69,   70,   71,
    6,   35,   46,   46,    0,    0,   49,   50,    0,    0,
    0,    0,   51,   52,   53,   60,   61,   54,   62,   55,
   56,   11,    0,    0,   13,    0,   13,   13,   13,   14,
   13,   13,    0,    0,   13,    0,    0,   13,   13,    0,
   13,   13,   37,    0,   37,    0,   37,    0,    0,    0,
    0,    1,   37,    2,    0,   13,    0,    4,    0,   13,
    0,    6,   13,   13,   37,   37,   37,    9,   10,   37,
   25,   37,   37,   37,   38,    0,   38,    0,   38,   25,
   37,   37,   11,    0,   38,    0,   23,    0,    0,   13,
   14,    0,    0,   25,    0,   23,   38,   38,   38,   25,
   25,   38,    0,   38,   38,   38,    0,    0,    1,   23,
    2,   83,   38,   38,    4,   23,   23,    0,    6,    0,
    0,    1,    8,    2,    9,   10,    0,    4,    5,    0,
    0,    6,   24,    0,    7,    8,    0,    9,   10,   11,
    1,   24,    2,    0,   21,   84,   13,   14,    0,    0,
    6,    0,   11,    0,    0,   24,    9,   10,    0,   13,
   14,   24,   24,    0,    0,    0,    0,   21,    0,    0,
    0,   11,    0,   21,   21,    0,    0,    0,   13,   14,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                          9,
   10,   29,   88,  257,   90,  259,  260,   64,   65,  263,
  264,    3,  260,  267,  273,  274,  270,  271,  266,  273,
  274,   49,   50,    5,   16,    7,    8,  260,   65,   11,
  283,   59,  269,  261,  288,   92,  260,  277,  292,   49,
   50,  295,  296,  290,  292,  269,  290,  289,   76,   77,
   60,   61,   62,   63,  257,   92,  259,  261,  261,  283,
  261,  293,   44,  290,  267,  289,  290,  266,  269,  261,
  273,  274,  275,  276,  261,  278,  279,  280,  281,   90,
  257,  284,  259,  286,  287,  288,   45,   46,   47,   48,
  267,    4,  295,  296,   -1,   -1,  273,  274,   -1,   -1,
   -1,   -1,  279,  280,  281,  275,  276,  284,  278,  286,
  287,  288,   -1,   -1,  257,   -1,  259,  260,  295,  296,
  263,  264,   -1,   -1,  267,   -1,   -1,  270,  271,   -1,
  273,  274,  257,   -1,  259,   -1,  261,   -1,   -1,   -1,
   -1,  257,  267,  259,   -1,  288,   -1,  263,   -1,  292,
   -1,  267,  295,  296,  279,  280,  281,  273,  274,  284,
  260,  286,  287,  288,  257,   -1,  259,   -1,  261,  269,
  295,  296,  288,   -1,  267,   -1,  260,   -1,   -1,  295,
  296,   -1,   -1,  283,   -1,  269,  279,  280,  281,  289,
  290,  284,   -1,  286,  287,  288,   -1,   -1,  257,  283,
  259,  260,  295,  296,  263,  289,  290,   -1,  267,   -1,
   -1,  257,  271,  259,  273,  274,   -1,  263,  264,   -1,
   -1,  267,  260,   -1,  270,  271,   -1,  273,  274,  288,
  257,  269,  259,   -1,  260,  294,  295,  296,   -1,   -1,
  267,   -1,  288,   -1,   -1,  283,  273,  274,   -1,  295,
  296,  289,  290,   -1,   -1,   -1,   -1,  283,   -1,   -1,
   -1,  288,   -1,  289,  290,   -1,   -1,   -1,  295,  296,
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
null,null,null,"IDENTIFICADOR","NUMERO","BOOLEANO","SALTO","AND","FROM","NOT",
"WHILE","FOR","ELSE","CADENA","ELIF","OR","IF","PRINT","RETURN","MAS","MENOS",
"MULT","DIV","EXP","MOD","MAYOR","MENOR","MAYORIG","MENOSIG","IGUAL","DIST",
"MASIG","MENORIG","IGUALIG","PARIZQ","PARDER","DOSPUNTOS","PUNTOCOMA",
"ENDMARKER","INDENTA","DEINDENTA","ENTERO","REAL",
};
final static String yyrule[] = {
"$accept : file_input",
"file_input : SALTO file_input",
"file_input : stmt file_input",
"file_input : ENDMARKER",
"stmt : simple_stmt",
"stmt : compound_stmt",
"simple_stmt : small_stmt SALTO",
"small_stmt : expr_stmt",
"small_stmt : print_stmt",
"expr_stmt : test IGUAL test",
"print_stmt : PRINT test",
"compound_stmt : if_stmt",
"compound_stmt : while_stmt",
"if_stmt : IF test DOSPUNTOS suite",
"if_stmt : IF test DOSPUNTOS suite ELSE DOSPUNTOS suite",
"while_stmt : WHILE test DOSPUNTOS suite",
"suite : simple_stmt",
"suite : SALTO INDENTA stmtEst",
"suite : DEINDENTA",
"stmtEst : stmt",
"stmtEst : stmt stmtEst",
"test : or_test",
"or_test : or_test OR and_test",
"or_test : and_test OR and_test",
"and_test : not_test AND and_test",
"and_test : and_test AND and_test",
"not_test : NOT not_test",
"not_test : comparison",
"comparison : expr comparisonAux",
"comparisonAux : comp_op expr",
"comparisonAux : expr",
"comp_op : MENOR",
"comp_op : MAYOR",
"comp_op : IGUALIG",
"comp_op : MAYORIG",
"comp_op : MENORIG",
"comp_op : DIST",
"expr : expr MAS expr",
"expr : expr MENOS expr",
"expr : term",
"term : factor MULT factor",
"term : factor DIV factor",
"term : factor MOD factor",
"factor : MAS factor",
"factor : MENOS factor",
"factor : power",
"power : atom",
"power : atom EXP factor",
"atom : IDENTIFICADOR",
"atom : ENTERO",
"atom : CADENA",
"atom : REAL",
"atom : BOOLEANO",
"atom : PARIZQ test PARDER",
};

//#line 114 "/home/stein/Documentos/Semestres/Semestre20182/Compiladores/Compiladores/Proyectos/Proyecto_2/src/main/byaccj/parser.y"
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
//#line 373 "Parser.java"
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
