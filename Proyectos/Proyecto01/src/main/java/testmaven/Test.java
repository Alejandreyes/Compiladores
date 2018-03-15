package testmaven;
import java.io.*;

public class Test {

    public static void main (String[] args){
      AnalizadorLexico al = new AnalizadorLexico("src/main/resources/FizzBuzz.py");
      al.analiza();
      System.out.println("/********************************************************************************"
      +"+++++++++++++++++++++++++CAso Error cadena"+
      "/********************************************************************************");
      al = new AnalizadorLexico("src/main/resources/fz_error_cadena.py");
      al.analiza();
      System.out.println("/********************************************************************************"
      +"+++++++++++++++++++++++++CAso Error cadena"+
      "/********************************************************************************");
      al = new AnalizadorLexico("src/main/resources/fz_error_cadena.py");
      al.analiza();
      System.out.println("/********************************************************************************"
      +"+++++++++++++++++++++++++CAso Error cadena"+
      "/********************************************************************************");
      al = new AnalizadorLexico("src/main/resources/fz_error_cadena.py");
      al.analiza();
      System.out.println("/********************************************************************************"
      +"+++++++++++++++++++++++++CAso Error cadena"+
      "/********************************************************************************");

    }
}
