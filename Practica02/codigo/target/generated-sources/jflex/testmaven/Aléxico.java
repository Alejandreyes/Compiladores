/* The following code was generated by JFlex 1.4.3 on 22/02/18 03:33 PM */

package testmaven;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 22/02/18 03:33 PM from the specification file
 * <tt>/home/alan/Compiladores7008/Practicas/Practica_2/codigo/src/main/jflex/Atomos.jflex</tt>
 */
public class Aléxico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\40\1\0\1\36\3\0\16\40\7\0\1\35\1\37\11\0\1\1"+
    "\1\0\1\3\11\2\7\0\5\37\1\4\7\37\1\20\5\37\1\26"+
    "\6\37\4\0\1\37\1\0\1\5\1\23\1\11\1\24\1\10\1\12"+
    "\1\31\1\30\1\13\1\37\1\33\1\6\1\22\1\14\1\21\1\32"+
    "\1\37\1\15\1\7\1\16\1\17\1\37\1\27\1\34\1\25\1\37"+
    "\4\0\41\40\2\0\4\37\4\0\1\37\2\0\1\40\7\0\1\37"+
    "\4\0\1\37\5\0\27\37\1\0\37\37\1\0\u01ca\37\4\0\14\37"+
    "\16\0\5\37\7\0\1\37\1\0\1\37\21\0\160\40\5\37\1\0"+
    "\2\37\2\0\4\37\10\0\1\37\1\0\3\37\1\0\1\37\1\0"+
    "\24\37\1\0\123\37\1\0\213\37\1\0\5\40\2\0\236\37\11\0"+
    "\46\37\2\0\1\37\7\0\47\37\7\0\1\37\1\0\55\40\1\0"+
    "\1\40\1\0\2\40\1\0\2\40\1\0\1\40\10\0\33\37\5\0"+
    "\3\37\15\0\5\40\6\0\1\37\4\0\13\40\5\0\53\37\37\40"+
    "\4\0\2\37\1\40\143\37\1\0\1\37\10\40\1\0\6\40\2\37"+
    "\2\40\1\0\4\40\2\37\12\40\3\37\2\0\1\37\17\0\1\40"+
    "\1\37\1\40\36\37\33\40\2\0\131\37\13\40\1\37\16\0\12\40"+
    "\41\37\11\40\2\37\4\0\1\37\5\0\26\37\4\40\1\37\11\40"+
    "\1\37\3\40\1\37\5\40\22\0\31\37\3\40\104\0\1\37\1\0"+
    "\13\37\67\0\33\40\1\0\4\40\66\37\3\40\1\37\22\40\1\37"+
    "\7\40\12\37\2\40\2\0\12\40\1\0\7\37\1\0\7\37\1\0"+
    "\3\40\1\0\10\37\2\0\2\37\2\0\26\37\1\0\7\37\1\0"+
    "\1\37\3\0\4\37\2\0\1\40\1\37\7\40\2\0\2\40\2\0"+
    "\3\40\1\37\10\0\1\40\4\0\2\37\1\0\3\37\2\40\2\0"+
    "\12\40\4\37\7\0\1\37\5\0\3\40\1\0\6\37\4\0\2\37"+
    "\2\0\26\37\1\0\7\37\1\0\2\37\1\0\2\37\1\0\2\37"+
    "\2\0\1\40\1\0\5\40\4\0\2\40\2\0\3\40\3\0\1\40"+
    "\7\0\4\37\1\0\1\37\7\0\14\40\3\37\1\40\13\0\3\40"+
    "\1\0\11\37\1\0\3\37\1\0\26\37\1\0\7\37\1\0\2\37"+
    "\1\0\5\37\2\0\1\40\1\37\10\40\1\0\3\40\1\0\3\40"+
    "\2\0\1\37\17\0\2\37\2\40\2\0\12\40\1\0\1\37\17\0"+
    "\3\40\1\0\10\37\2\0\2\37\2\0\26\37\1\0\7\37\1\0"+
    "\2\37\1\0\5\37\2\0\1\40\1\37\7\40\2\0\2\40\2\0"+
    "\3\40\10\0\2\40\4\0\2\37\1\0\3\37\2\40\2\0\12\40"+
    "\1\0\1\37\20\0\1\40\1\37\1\0\6\37\3\0\3\37\1\0"+
    "\4\37\3\0\2\37\1\0\1\37\1\0\2\37\3\0\2\37\3\0"+
    "\3\37\3\0\14\37\4\0\5\40\3\0\3\40\1\0\4\40\2\0"+
    "\1\37\6\0\1\40\16\0\12\40\11\0\1\37\7\0\3\40\1\0"+
    "\10\37\1\0\3\37\1\0\27\37\1\0\12\37\1\0\5\37\3\0"+
    "\1\37\7\40\1\0\3\40\1\0\4\40\7\0\2\40\1\0\2\37"+
    "\6\0\2\37\2\40\2\0\12\40\22\0\2\40\1\0\10\37\1\0"+
    "\3\37\1\0\27\37\1\0\12\37\1\0\5\37\2\0\1\40\1\37"+
    "\7\40\1\0\3\40\1\0\4\40\7\0\2\40\7\0\1\37\1\0"+
    "\2\37\2\40\2\0\12\40\1\0\2\37\17\0\2\40\1\0\10\37"+
    "\1\0\3\37\1\0\51\37\2\0\1\37\7\40\1\0\3\40\1\0"+
    "\4\40\1\37\10\0\1\40\10\0\2\37\2\40\2\0\12\40\12\0"+
    "\6\37\2\0\2\40\1\0\22\37\3\0\30\37\1\0\11\37\1\0"+
    "\1\37\2\0\7\37\3\0\1\40\4\0\6\40\1\0\1\40\1\0"+
    "\10\40\22\0\2\40\15\0\60\37\1\40\2\37\7\40\4\0\10\37"+
    "\10\40\1\0\12\40\47\0\2\37\1\0\1\37\2\0\2\37\1\0"+
    "\1\37\2\0\1\37\6\0\4\37\1\0\7\37\1\0\3\37\1\0"+
    "\1\37\1\0\1\37\2\0\2\37\1\0\4\37\1\40\2\37\6\40"+
    "\1\0\2\40\1\37\2\0\5\37\1\0\1\37\1\0\6\40\2\0"+
    "\12\40\2\0\4\37\40\0\1\37\27\0\2\40\6\0\12\40\13\0"+
    "\1\40\1\0\1\40\1\0\1\40\4\0\2\40\10\37\1\0\44\37"+
    "\4\0\24\40\1\0\2\40\5\37\13\40\1\0\44\40\11\0\1\40"+
    "\71\0\53\37\24\40\1\37\12\40\6\0\6\37\4\40\4\37\3\40"+
    "\1\37\3\40\2\37\7\40\3\37\4\40\15\37\14\40\1\37\17\40"+
    "\2\0\46\37\1\0\1\37\5\0\1\37\2\0\53\37\1\0\u014d\37"+
    "\1\0\4\37\2\0\7\37\1\0\1\37\1\0\4\37\2\0\51\37"+
    "\1\0\4\37\2\0\41\37\1\0\4\37\2\0\7\37\1\0\1\37"+
    "\1\0\4\37\2\0\17\37\1\0\71\37\1\0\4\37\2\0\103\37"+
    "\2\0\3\40\40\0\20\37\20\0\125\37\14\0\u026c\37\2\0\21\37"+
    "\1\0\32\37\5\0\113\37\3\0\3\37\17\0\15\37\1\0\4\37"+
    "\3\40\13\0\22\37\3\40\13\0\22\37\2\40\14\0\15\37\1\0"+
    "\3\37\1\0\2\40\14\0\64\37\40\40\3\0\1\37\3\0\2\37"+
    "\1\40\2\0\12\40\41\0\3\40\2\0\12\40\6\0\130\37\10\0"+
    "\51\37\1\40\1\37\5\0\106\37\12\0\35\37\3\0\14\40\4\0"+
    "\14\40\12\0\12\40\36\37\2\0\5\37\13\0\54\37\4\0\21\40"+
    "\7\37\2\40\6\0\12\40\46\0\27\37\5\40\4\0\65\37\12\40"+
    "\1\0\35\40\2\0\13\40\6\0\12\40\15\0\1\37\130\0\5\40"+
    "\57\37\21\40\7\37\4\0\12\40\21\0\11\40\14\0\3\40\36\37"+
    "\15\40\2\37\12\40\54\37\16\40\14\0\44\37\24\40\10\0\12\40"+
    "\3\0\3\37\12\40\44\37\122\0\3\40\1\0\25\40\4\37\1\40"+
    "\4\37\3\40\2\37\11\0\300\37\47\40\25\0\4\40\u0116\37\2\0"+
    "\6\37\2\0\46\37\2\0\6\37\2\0\10\37\1\0\1\37\1\0"+
    "\1\37\1\0\1\37\1\0\37\37\2\0\65\37\1\0\7\37\1\0"+
    "\1\37\3\0\3\37\1\0\7\37\3\0\4\37\2\0\6\37\4\0"+
    "\15\37\5\0\3\37\1\0\7\37\16\0\5\40\32\0\5\40\20\0"+
    "\2\37\23\0\1\37\13\0\5\40\5\0\6\40\1\0\1\37\15\0"+
    "\1\37\20\0\15\37\3\0\33\37\25\0\15\40\4\0\1\40\3\0"+
    "\14\40\21\0\1\37\4\0\1\37\2\0\12\37\1\0\1\37\3\0"+
    "\5\37\6\0\1\37\1\0\1\37\1\0\1\37\1\0\4\37\1\0"+
    "\13\37\2\0\4\37\5\0\5\37\4\0\1\37\21\0\51\37\u0a77\0"+
    "\57\37\1\0\57\37\1\0\205\37\6\0\4\37\3\40\2\37\14\0"+
    "\46\37\1\0\1\37\5\0\1\37\2\0\70\37\7\0\1\37\17\0"+
    "\1\40\27\37\11\0\7\37\1\0\7\37\1\0\7\37\1\0\7\37"+
    "\1\0\7\37\1\0\7\37\1\0\7\37\1\0\7\37\1\0\40\40"+
    "\57\0\1\37\u01d5\0\3\37\31\0\11\37\6\40\1\0\5\37\2\0"+
    "\5\37\4\0\126\37\2\0\2\40\2\0\3\37\1\0\132\37\1\0"+
    "\4\37\5\0\51\37\3\0\136\37\21\0\33\37\65\0\20\37\u0200\0"+
    "\u19b6\37\112\0\u51cd\37\63\0\u048d\37\103\0\56\37\2\0\u010d\37\3\0"+
    "\20\37\12\40\2\37\24\0\57\37\1\40\4\0\12\40\1\0\31\37"+
    "\7\0\1\40\120\37\2\40\45\0\11\37\2\0\147\37\2\0\4\37"+
    "\1\0\4\37\14\0\13\37\115\0\12\37\1\40\3\37\1\40\4\37"+
    "\1\40\27\37\5\40\20\0\1\37\7\0\64\37\14\0\2\40\62\37"+
    "\21\40\13\0\12\40\6\0\22\40\6\37\3\0\1\37\4\0\12\40"+
    "\34\37\10\40\2\0\27\37\15\40\14\0\35\37\3\0\4\40\57\37"+
    "\16\40\16\0\1\37\12\40\46\0\51\37\16\40\11\0\3\37\1\40"+
    "\10\37\2\40\2\0\12\40\6\0\27\37\3\0\1\37\1\40\4\0"+
    "\60\37\1\40\1\37\3\40\2\37\2\40\5\37\2\40\1\37\1\40"+
    "\1\37\30\0\3\37\2\0\13\37\5\40\2\0\3\37\2\40\12\0"+
    "\6\37\2\0\6\37\2\0\6\37\11\0\7\37\1\0\7\37\221\0"+
    "\43\37\10\40\1\0\2\40\2\0\12\40\6\0\u2ba4\37\14\0\27\37"+
    "\4\0\61\37\u2104\0\u016e\37\2\0\152\37\46\0\7\37\14\0\5\37"+
    "\5\0\1\37\1\40\12\37\1\0\15\37\1\0\5\37\1\0\1\37"+
    "\1\0\2\37\1\0\2\37\1\0\154\37\41\0\u016b\37\22\0\100\37"+
    "\2\0\66\37\50\0\15\37\3\0\20\40\20\0\7\40\14\0\2\37"+
    "\30\0\3\37\31\0\1\37\6\0\5\37\1\0\207\37\2\0\1\40"+
    "\4\0\1\37\13\0\12\40\7\0\32\37\4\0\1\37\1\0\32\37"+
    "\13\0\131\37\3\0\6\37\2\0\6\37\2\0\6\37\2\0\3\37"+
    "\3\0\2\37\3\0\2\37\22\0\3\40\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\24\3\1\4\1\5\1\0\1\3"+
    "\1\6\7\3\1\6\16\3\2\7\41\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[86];
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
    "\0\0\0\41\0\102\0\143\0\204\0\245\0\306\0\347"+
    "\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c\0\u01ad\0\u01ce\0\u01ef"+
    "\0\u0210\0\u0231\0\u0252\0\u0273\0\u0294\0\u02b5\0\u02d6\0\u02f7"+
    "\0\u0318\0\41\0\u0339\0\u035a\0\u037b\0\u039c\0\u03bd\0\u03de"+
    "\0\u03ff\0\u0420\0\u0441\0\u0462\0\347\0\u0483\0\u04a4\0\u04c5"+
    "\0\u04e6\0\u0507\0\u0528\0\u0549\0\u056a\0\u058b\0\u05ac\0\u05cd"+
    "\0\u05ee\0\u060f\0\u0630\0\u0651\0\u0672\0\u0693\0\u06b4\0\u06d5"+
    "\0\u06f6\0\u0717\0\u0738\0\u0759\0\u077a\0\u079b\0\u07bc\0\u07dd"+
    "\0\u07fe\0\u081f\0\u0840\0\u0861\0\u0882\0\u08a3\0\u08c4\0\u08e5"+
    "\0\u0906\0\u0927\0\u0948\0\u0969\0\u098a\0\u09ab\0\u09cc\0\u09ed"+
    "\0\u0a0e\0\u0a2f\0\u0a50\0\u0a71\0\u0a92\0\u0ab3";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[86];
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
    "\2\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\20"+
    "\1\21\1\10\1\22\1\23\1\24\1\25\1\26\1\10"+
    "\1\27\1\30\2\10\1\31\1\32\1\10\1\2\42\0"+
    "\1\33\2\3\36\0\1\33\1\0\1\4\37\0\3\10"+
    "\1\34\27\10\2\0\2\10\2\0\5\10\1\35\4\10"+
    "\1\36\20\10\2\0\2\10\2\0\3\10\1\37\27\10"+
    "\2\0\2\10\2\0\33\10\2\0\2\10\2\0\4\10"+
    "\1\40\25\10\1\41\2\0\2\10\2\0\4\10\1\30"+
    "\12\10\1\42\13\10\2\0\2\10\2\0\11\10\1\43"+
    "\1\10\1\44\3\10\1\21\13\10\2\0\2\10\2\0"+
    "\5\10\1\45\2\10\1\45\1\10\1\45\5\10\1\46"+
    "\12\10\2\0\2\10\2\0\17\10\1\47\13\10\2\0"+
    "\2\10\2\0\3\10\1\50\2\10\1\51\24\10\2\0"+
    "\2\10\2\0\13\10\1\52\17\10\2\0\2\10\2\0"+
    "\17\10\1\53\13\10\2\0\2\10\2\0\13\10\1\45"+
    "\17\10\2\0\2\10\2\0\13\10\1\54\17\10\2\0"+
    "\2\10\2\0\6\10\1\55\24\10\2\0\2\10\2\0"+
    "\11\10\1\56\21\10\2\0\2\10\2\0\13\10\1\57"+
    "\17\10\2\0\2\10\2\0\11\10\1\60\14\10\1\61"+
    "\4\10\2\0\2\10\2\0\4\10\1\62\26\10\2\0"+
    "\2\10\2\0\3\10\1\63\27\10\2\0\2\10\36\31"+
    "\1\0\2\31\2\0\1\64\1\65\37\0\4\10\1\66"+
    "\26\10\2\0\2\10\2\0\5\10\1\67\25\10\2\0"+
    "\2\10\2\0\22\10\1\45\10\10\2\0\2\10\2\0"+
    "\20\10\1\70\12\10\2\0\2\10\2\0\5\10\1\71"+
    "\3\10\1\72\21\10\2\0\2\10\2\0\7\10\1\73"+
    "\23\10\2\0\2\10\2\0\12\10\1\74\20\10\2\0"+
    "\2\10\2\0\12\10\1\75\20\10\2\0\2\10\2\0"+
    "\17\10\1\76\13\10\2\0\2\10\2\0\30\10\1\77"+
    "\2\10\2\0\2\10\2\0\12\10\1\100\1\10\1\45"+
    "\16\10\2\0\2\10\2\0\11\10\1\66\21\10\2\0"+
    "\2\10\2\0\14\10\1\101\16\10\2\0\2\10\2\0"+
    "\23\10\1\45\7\10\2\0\2\10\2\0\12\10\1\71"+
    "\20\10\2\0\2\10\2\0\6\10\1\102\24\10\2\0"+
    "\2\10\2\0\4\10\1\45\3\10\1\45\22\10\2\0"+
    "\2\10\2\0\6\10\1\103\24\10\2\0\2\10\2\0"+
    "\15\10\1\71\15\10\2\0\2\10\2\0\14\10\1\104"+
    "\16\10\2\0\2\10\2\0\11\10\1\105\21\10\2\0"+
    "\2\10\2\0\17\10\1\106\13\10\2\0\2\10\2\0"+
    "\5\10\1\107\25\10\2\0\2\10\2\0\2\64\40\0"+
    "\1\65\37\0\5\10\1\71\25\10\2\0\2\10\2\0"+
    "\6\10\1\110\24\10\2\0\2\10\2\0\21\10\1\111"+
    "\11\10\2\0\2\10\2\0\6\10\1\45\24\10\2\0"+
    "\2\10\2\0\10\10\1\45\22\10\2\0\2\10\2\0"+
    "\6\10\1\112\24\10\2\0\2\10\2\0\14\10\1\113"+
    "\16\10\2\0\2\10\2\0\3\10\1\114\27\10\2\0"+
    "\2\10\2\0\20\10\1\45\12\10\2\0\2\10\2\0"+
    "\17\10\1\110\13\10\2\0\2\10\2\0\4\10\1\115"+
    "\26\10\2\0\2\10\2\0\15\10\1\116\15\10\2\0"+
    "\2\10\2\0\3\10\1\117\27\10\2\0\2\10\2\0"+
    "\4\10\1\36\26\10\2\0\2\10\2\0\26\10\1\45"+
    "\4\10\2\0\2\10\2\0\4\10\1\71\26\10\2\0"+
    "\2\10\2\0\21\10\1\120\11\10\2\0\2\10\2\0"+
    "\5\10\1\45\25\10\2\0\2\10\2\0\13\10\1\121"+
    "\17\10\2\0\2\10\2\0\22\10\1\122\10\10\2\0"+
    "\2\10\2\0\30\10\1\121\2\10\2\0\2\10\2\0"+
    "\11\10\1\123\21\10\2\0\2\10\2\0\4\10\1\124"+
    "\26\10\2\0\2\10\2\0\17\10\1\125\13\10\2\0"+
    "\2\10\2\0\13\10\1\126\17\10\2\0\2\10\2\0"+
    "\31\10\1\45\1\10\2\0\2\10\2\0\3\10\1\124"+
    "\27\10\2\0\2\10\2\0\14\10\1\45\16\10\2\0"+
    "\2\10\2\0\3\10\1\45\27\10\2\0\2\10\2\0"+
    "\12\10\1\57\20\10\2\0\2\10\2\0\4\10\1\45"+
    "\26\10\2\0\2\10\2\0\7\10\1\45\23\10\2\0"+
    "\2\10\2\0\12\10\1\45\20\10\2\0\2\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2772];
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
    "\1\0\1\11\27\1\1\11\1\0\73\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[86];
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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Aléxico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Aléxico(java.io.InputStream in) {
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
    while (i < 2214) {
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
  public int yylex() throws java.io.IOException {
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
        case 6: 
          { System.out.print("Palabra reservada("+yytext()+")");
          }
        case 8: break;
        case 4: 
          { System.out.print("COMMENT( "+yytext() + ")");
          }
        case 9: break;
        case 2: 
          { System.out.print("ENTERO("+yytext() + ")");
          }
        case 10: break;
        case 5: 
          { System.out.print(yytext());
          }
        case 11: break;
        case 7: 
          { System.out.println("FLOAT ("+yytext()+")");
          }
        case 12: break;
        case 3: 
          { System.out.print("ID_PYTHON("+yytext() + ")");
          }
        case 13: break;
        case 1: 
          { 
          }
        case 14: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Aléxico <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        Aléxico scanner = null;
        try {
          scanner = new Aléxico( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
