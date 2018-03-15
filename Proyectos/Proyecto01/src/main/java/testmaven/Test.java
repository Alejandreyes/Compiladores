package testmaven;
import java.io.*;

public class Test {

    public static void main (String[] args){
      AnalizadorLexico al = new AnalizadorLexico("src/main/resources/FizzBuzz.py");
      al.analiza();
      System.out.println();
      System.out.println("/********************************************************************************"
      +"+++++++++++++++++++++++++CAso Error cadena"+
      "/********************************************************************************");


      try{
        al = new AnalizadorLexico("src/main/resources/fz_error_cadena.py");
        al.analiza();
      }catch (RuntimeException e) {
        System.out.println("\n"+e);
      }
        System.out.println();
      System.out.println("/********************************************************************************"
      +"+++++++++++++++++++++++++CAso Error lexema"+
      "/********************************************************************************");
      try {
        al = new AnalizadorLexico("src/main/resources/fz_error_lexema.py");
        al.analiza();
      }catch (RuntimeException e) {
        System.out.print("\n"+e);
      }
        System.out.println();
      System.out.println("/********************************************************************************"
      +"+++++++++++++++++++++++++CAso Error identacion"+
      "/********************************************************************************");
      try{
        al = new AnalizadorLexico("src/main/resources/fz_error_identacion.py");
        al.analiza();
      }catch (RuntimeException e) {
        System.out.println("\n"+e);
  }

    }
}
