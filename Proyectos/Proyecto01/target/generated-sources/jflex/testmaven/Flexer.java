/* The following code was generated by JFlex 1.4.3 on 15/03/18 12:08 AM */

package testmaven;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15/03/18 12:08 AM from the specification file
 * <tt>/home/stein/Documentos/Semestres/Semestre20182/Compiladores/Compiladores/Proyectos/Proyecto01/src/main/jflex/Flexer.jflex</tt>
 */
public class Flexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ESPACIOS = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\40\1\43\1\26\3\0\16\40\4\0\1\41\1\31\1\25\1\36"+
    "\1\37\1\31\2\0\1\42\1\42\1\32\1\31\1\0\1\31\1\1"+
    "\1\33\1\13\11\12\1\30\1\0\1\34\1\35\1\34\2\0\5\37"+
    "\1\6\15\37\1\2\6\37\1\0\1\27\2\0\1\37\1\0\1\7"+
    "\2\37\1\15\1\5\1\20\1\37\1\22\1\23\2\37\1\10\1\37"+
    "\1\14\1\16\1\24\1\37\1\3\1\11\1\17\1\4\1\37\1\21"+
    "\3\37\4\0\41\40\2\0\4\37\4\0\1\37\2\0\1\40\7\0"+
    "\1\37\4\0\1\37\5\0\27\37\1\0\37\37\1\0\u01ca\37\4\0"+
    "\14\37\16\0\5\37\7\0\1\37\1\0\1\37\21\0\160\40\5\37"+
    "\1\0\2\37\2\0\4\37\10\0\1\37\1\0\3\37\1\0\1\37"+
    "\1\0\24\37\1\0\123\37\1\0\213\37\1\0\5\40\2\0\236\37"+
    "\11\0\46\37\2\0\1\37\7\0\47\37\7\0\1\37\1\0\55\40"+
    "\1\0\1\40\1\0\2\40\1\0\2\40\1\0\1\40\10\0\33\37"+
    "\5\0\3\37\15\0\5\40\6\0\1\37\4\0\13\40\5\0\53\37"+
    "\37\40\4\0\2\37\1\40\143\37\1\0\1\37\10\40\1\0\6\40"+
    "\2\37\2\40\1\0\4\40\2\37\12\40\3\37\2\0\1\37\17\0"+
    "\1\40\1\37\1\40\36\37\33\40\2\0\131\37\13\40\1\37\16\0"+
    "\12\40\41\37\11\40\2\37\4\0\1\37\5\0\26\37\4\40\1\37"+
    "\11\40\1\37\3\40\1\37\5\40\22\0\31\37\3\40\104\0\1\37"+
    "\1\0\13\37\67\0\33\40\1\0\4\40\66\37\3\40\1\37\22\40"+
    "\1\37\7\40\12\37\2\40\2\0\12\40\1\0\7\37\1\0\7\37"+
    "\1\0\3\40\1\0\10\37\2\0\2\37\2\0\26\37\1\0\7\37"+
    "\1\0\1\37\3\0\4\37\2\0\1\40\1\37\7\40\2\0\2\40"+
    "\2\0\3\40\1\37\10\0\1\40\4\0\2\37\1\0\3\37\2\40"+
    "\2\0\12\40\4\37\7\0\1\37\5\0\3\40\1\0\6\37\4\0"+
    "\2\37\2\0\26\37\1\0\7\37\1\0\2\37\1\0\2\37\1\0"+
    "\2\37\2\0\1\40\1\0\5\40\4\0\2\40\2\0\3\40\3\0"+
    "\1\40\7\0\4\37\1\0\1\37\7\0\14\40\3\37\1\40\13\0"+
    "\3\40\1\0\11\37\1\0\3\37\1\0\26\37\1\0\7\37\1\0"+
    "\2\37\1\0\5\37\2\0\1\40\1\37\10\40\1\0\3\40\1\0"+
    "\3\40\2\0\1\37\17\0\2\37\2\40\2\0\12\40\1\0\1\37"+
    "\17\0\3\40\1\0\10\37\2\0\2\37\2\0\26\37\1\0\7\37"+
    "\1\0\2\37\1\0\5\37\2\0\1\40\1\37\7\40\2\0\2\40"+
    "\2\0\3\40\10\0\2\40\4\0\2\37\1\0\3\37\2\40\2\0"+
    "\12\40\1\0\1\37\20\0\1\40\1\37\1\0\6\37\3\0\3\37"+
    "\1\0\4\37\3\0\2\37\1\0\1\37\1\0\2\37\3\0\2\37"+
    "\3\0\3\37\3\0\14\37\4\0\5\40\3\0\3\40\1\0\4\40"+
    "\2\0\1\37\6\0\1\40\16\0\12\40\11\0\1\37\7\0\3\40"+
    "\1\0\10\37\1\0\3\37\1\0\27\37\1\0\12\37\1\0\5\37"+
    "\3\0\1\37\7\40\1\0\3\40\1\0\4\40\7\0\2\40\1\0"+
    "\2\37\6\0\2\37\2\40\2\0\12\40\22\0\2\40\1\0\10\37"+
    "\1\0\3\37\1\0\27\37\1\0\12\37\1\0\5\37\2\0\1\40"+
    "\1\37\7\40\1\0\3\40\1\0\4\40\7\0\2\40\7\0\1\37"+
    "\1\0\2\37\2\40\2\0\12\40\1\0\2\37\17\0\2\40\1\0"+
    "\10\37\1\0\3\37\1\0\51\37\2\0\1\37\7\40\1\0\3\40"+
    "\1\0\4\40\1\37\10\0\1\40\10\0\2\37\2\40\2\0\12\40"+
    "\12\0\6\37\2\0\2\40\1\0\22\37\3\0\30\37\1\0\11\37"+
    "\1\0\1\37\2\0\7\37\3\0\1\40\4\0\6\40\1\0\1\40"+
    "\1\0\10\40\22\0\2\40\15\0\60\37\1\40\2\37\7\40\4\0"+
    "\10\37\10\40\1\0\12\40\47\0\2\37\1\0\1\37\2\0\2\37"+
    "\1\0\1\37\2\0\1\37\6\0\4\37\1\0\7\37\1\0\3\37"+
    "\1\0\1\37\1\0\1\37\2\0\2\37\1\0\4\37\1\40\2\37"+
    "\6\40\1\0\2\40\1\37\2\0\5\37\1\0\1\37\1\0\6\40"+
    "\2\0\12\40\2\0\4\37\40\0\1\37\27\0\2\40\6\0\12\40"+
    "\13\0\1\40\1\0\1\40\1\0\1\40\4\0\2\40\10\37\1\0"+
    "\44\37\4\0\24\40\1\0\2\40\5\37\13\40\1\0\44\40\11\0"+
    "\1\40\71\0\53\37\24\40\1\37\12\40\6\0\6\37\4\40\4\37"+
    "\3\40\1\37\3\40\2\37\7\40\3\37\4\40\15\37\14\40\1\37"+
    "\17\40\2\0\46\37\1\0\1\37\5\0\1\37\2\0\53\37\1\0"+
    "\u014d\37\1\0\4\37\2\0\7\37\1\0\1\37\1\0\4\37\2\0"+
    "\51\37\1\0\4\37\2\0\41\37\1\0\4\37\2\0\7\37\1\0"+
    "\1\37\1\0\4\37\2\0\17\37\1\0\71\37\1\0\4\37\2\0"+
    "\103\37\2\0\3\40\40\0\20\37\20\0\125\37\14\0\u026c\37\2\0"+
    "\21\37\1\0\32\37\5\0\113\37\3\0\3\37\17\0\15\37\1\0"+
    "\4\37\3\40\13\0\22\37\3\40\13\0\22\37\2\40\14\0\15\37"+
    "\1\0\3\37\1\0\2\40\14\0\64\37\40\40\3\0\1\37\3\0"+
    "\2\37\1\40\2\0\12\40\41\0\3\40\2\0\12\40\6\0\130\37"+
    "\10\0\51\37\1\40\1\37\5\0\106\37\12\0\35\37\3\0\14\40"+
    "\4\0\14\40\12\0\12\40\36\37\2\0\5\37\13\0\54\37\4\0"+
    "\21\40\7\37\2\40\6\0\12\40\46\0\27\37\5\40\4\0\65\37"+
    "\12\40\1\0\35\40\2\0\13\40\6\0\12\40\15\0\1\37\130\0"+
    "\5\40\57\37\21\40\7\37\4\0\12\40\21\0\11\40\14\0\3\40"+
    "\36\37\15\40\2\37\12\40\54\37\16\40\14\0\44\37\24\40\10\0"+
    "\12\40\3\0\3\37\12\40\44\37\122\0\3\40\1\0\25\40\4\37"+
    "\1\40\4\37\3\40\2\37\11\0\300\37\47\40\25\0\4\40\u0116\37"+
    "\2\0\6\37\2\0\46\37\2\0\6\37\2\0\10\37\1\0\1\37"+
    "\1\0\1\37\1\0\1\37\1\0\37\37\2\0\65\37\1\0\7\37"+
    "\1\0\1\37\3\0\3\37\1\0\7\37\3\0\4\37\2\0\6\37"+
    "\4\0\15\37\5\0\3\37\1\0\7\37\16\0\5\40\32\0\5\40"+
    "\20\0\2\37\23\0\1\37\13\0\5\40\5\0\6\40\1\0\1\37"+
    "\15\0\1\37\20\0\15\37\3\0\33\37\25\0\15\40\4\0\1\40"+
    "\3\0\14\40\21\0\1\37\4\0\1\37\2\0\12\37\1\0\1\37"+
    "\3\0\5\37\6\0\1\37\1\0\1\37\1\0\1\37\1\0\4\37"+
    "\1\0\13\37\2\0\4\37\5\0\5\37\4\0\1\37\21\0\51\37"+
    "\u0a77\0\57\37\1\0\57\37\1\0\205\37\6\0\4\37\3\40\2\37"+
    "\14\0\46\37\1\0\1\37\5\0\1\37\2\0\70\37\7\0\1\37"+
    "\17\0\1\40\27\37\11\0\7\37\1\0\7\37\1\0\7\37\1\0"+
    "\7\37\1\0\7\37\1\0\7\37\1\0\7\37\1\0\7\37\1\0"+
    "\40\40\57\0\1\37\u01d5\0\3\37\31\0\11\37\6\40\1\0\5\37"+
    "\2\0\5\37\4\0\126\37\2\0\2\40\2\0\3\37\1\0\132\37"+
    "\1\0\4\37\5\0\51\37\3\0\136\37\21\0\33\37\65\0\20\37"+
    "\u0200\0\u19b6\37\112\0\u51cd\37\63\0\u048d\37\103\0\56\37\2\0\u010d\37"+
    "\3\0\20\37\12\40\2\37\24\0\57\37\1\40\4\0\12\40\1\0"+
    "\31\37\7\0\1\40\120\37\2\40\45\0\11\37\2\0\147\37\2\0"+
    "\4\37\1\0\4\37\14\0\13\37\115\0\12\37\1\40\3\37\1\40"+
    "\4\37\1\40\27\37\5\40\20\0\1\37\7\0\64\37\14\0\2\40"+
    "\62\37\21\40\13\0\12\40\6\0\22\40\6\37\3\0\1\37\4\0"+
    "\12\40\34\37\10\40\2\0\27\37\15\40\14\0\35\37\3\0\4\40"+
    "\57\37\16\40\16\0\1\37\12\40\46\0\51\37\16\40\11\0\3\37"+
    "\1\40\10\37\2\40\2\0\12\40\6\0\27\37\3\0\1\37\1\40"+
    "\4\0\60\37\1\40\1\37\3\40\2\37\2\40\5\37\2\40\1\37"+
    "\1\40\1\37\30\0\3\37\2\0\13\37\5\40\2\0\3\37\2\40"+
    "\12\0\6\37\2\0\6\37\2\0\6\37\11\0\7\37\1\0\7\37"+
    "\221\0\43\37\10\40\1\0\2\40\2\0\12\40\6\0\u2ba4\37\14\0"+
    "\27\37\4\0\61\37\u2104\0\u016e\37\2\0\152\37\46\0\7\37\14\0"+
    "\5\37\5\0\1\37\1\40\12\37\1\0\15\37\1\0\5\37\1\0"+
    "\1\37\1\0\2\37\1\0\2\37\1\0\154\37\41\0\u016b\37\22\0"+
    "\100\37\2\0\66\37\50\0\15\37\3\0\20\40\20\0\7\40\14\0"+
    "\2\37\30\0\3\37\31\0\1\37\6\0\5\37\1\0\207\37\2\0"+
    "\1\40\4\0\1\37\13\0\12\40\7\0\32\37\4\0\1\37\1\0"+
    "\32\37\13\0\131\37\3\0\6\37\2\0\6\37\2\0\6\37\2\0"+
    "\3\37\3\0\2\37\3\0\2\37\22\0\3\40\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\1\2\2\5\3\2\4\6\3\1\2\1\5\1\6"+
    "\4\1\1\7\2\10\1\11\2\12\4\3\1\12\1\3"+
    "\1\13\2\3\1\0\1\14\1\15\5\3\1\0\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[49];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\154\0\220\0\264\0\330\0\374"+
    "\0\u0120\0\u0144\0\u0168\0\u018c\0\u01b0\0\u01d4\0\u01f8\0\u021c"+
    "\0\u0240\0\u0264\0\110\0\110\0\110\0\u0288\0\u02ac\0\u02d0"+
    "\0\u02f4\0\110\0\u0318\0\u033c\0\u0360\0\u0384\0\u03a8\0\u03cc"+
    "\0\u03f0\0\u0414\0\154\0\u0438\0\264\0\u045c\0\u0480\0\u04a4"+
    "\0\u04a4\0\u0318\0\u04c8\0\u04ec\0\u0510\0\u0534\0\u0558\0\u0264"+
    "\0\264";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[49];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\2\6\1\7\1\10\1\11\2\6"+
    "\1\12\1\13\1\14\1\6\1\15\1\6\1\16\1\17"+
    "\1\6\1\20\1\21\1\22\1\23\1\3\1\24\1\25"+
    "\1\26\1\27\2\30\1\31\1\6\1\3\2\32\2\3"+
    "\1\4\1\5\2\6\1\7\1\10\1\11\2\6\1\12"+
    "\1\13\1\14\1\6\1\15\1\6\1\16\1\17\1\6"+
    "\1\20\1\21\1\22\1\23\1\3\1\24\1\25\1\26"+
    "\1\27\2\30\1\31\1\6\1\3\1\33\1\32\1\34"+
    "\56\0\1\35\1\36\32\0\1\6\1\37\21\6\12\0"+
    "\2\6\5\0\23\6\12\0\2\6\5\0\6\6\1\40"+
    "\14\6\12\0\2\6\5\0\5\6\1\41\15\6\12\0"+
    "\2\6\5\0\12\6\1\42\10\6\12\0\2\6\4\0"+
    "\1\43\10\0\2\12\31\0\1\43\11\0\1\13\32\0"+
    "\14\6\1\44\6\6\12\0\2\6\5\0\1\6\1\45"+
    "\21\6\12\0\2\6\5\0\14\6\1\15\6\6\12\0"+
    "\2\6\5\0\20\6\1\46\2\6\12\0\2\6\5\0"+
    "\16\6\1\45\4\6\12\0\2\6\5\0\1\6\1\47"+
    "\21\6\12\0\2\6\3\0\25\50\1\51\1\0\15\50"+
    "\32\0\1\26\44\0\1\25\45\0\1\25\6\0\26\31"+
    "\1\0\15\31\41\0\1\52\1\0\1\34\41\0\1\34"+
    "\1\0\1\34\12\0\2\35\43\0\1\36\32\0\2\6"+
    "\1\53\20\6\12\0\2\6\5\0\7\6\1\54\11\6"+
    "\1\20\1\6\12\0\2\6\5\0\6\6\1\55\14\6"+
    "\12\0\2\6\5\0\13\6\1\45\7\6\12\0\2\6"+
    "\5\0\15\6\1\45\5\6\12\0\2\6\5\0\21\6"+
    "\1\56\1\6\12\0\2\6\5\0\21\6\1\57\1\6"+
    "\12\0\2\6\3\0\27\60\1\0\14\60\2\0\3\6"+
    "\1\61\17\6\12\0\2\6\5\0\3\6\1\45\17\6"+
    "\12\0\2\6\5\0\7\6\1\53\13\6\12\0\2\6"+
    "\5\0\6\6\1\54\14\6\12\0\2\6\5\0\12\6"+
    "\1\44\10\6\12\0\2\6\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1404];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\1\1\11\17\1\3\11\4\1\1\11\15\1\1\0"+
    "\7\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[49];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  /* %line Sirve para crear un identificador en que linea se encuentra el token que esta siendo reconozido*/
  ControladorAnalisisLexico controlador  = new ControladorAnalisisLexico();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Flexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Flexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2236) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public String yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 12: 
          { return "CADENA("+yytext() + ")";
          }
        case 15: break;
        case 3: 
          { return "ID_PYTHON("+yytext() + ")";
          }
        case 16: break;
        case 10: 
          { return "FLOAT ("+yytext()+")";
          }
        case 17: break;
        case 6: 
          { return "SEPARADOR("+yytext()+")";
          }
        case 18: break;
        case 11: 
          { return "RESERVADA("+yytext()+")";
          }
        case 19: break;
        case 2: 
          { throw new RuntimeException("Error en la linea: " + yyline);
          }
        case 20: break;
        case 4: 
          { return "ENTERO("+yytext()+")";
          }
        case 21: break;
        case 5: 
          { yybegin(ESPACIOS);
          }
        case 22: break;
        case 13: 
          { int espacios = yylength() ;
              yybegin(YYINITIAL);
              String resultado = controlador.representa(espacios,yyline);
              if(resultado==""){
                  return "SALTO\n";
              }

              return "SALTO\n"+(resultado+"("+espacios+")");
          }
        case 23: break;
        case 7: 
          { return "COMMENT( "+yytext() + ")";
          }
        case 24: break;
        case 1: 
          { return "OPERADOR("+yytext()+")";
          }
        case 25: break;
        case 9: 
          { int espacios = yytext().length();
                yybegin(YYINITIAL);
                String resultado = controlador.representa(espacios,yyline);
                if(resultado==""){
                  return "\n";
                }
                return "SALTO\n"+(resultado+"("+espacios+")");
          }
        case 26: break;
        case 14: 
          { return "BOOLEAN("+yytext()+")";
          }
        case 27: break;
        case 8: 
          { 
          }
        case 28: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
