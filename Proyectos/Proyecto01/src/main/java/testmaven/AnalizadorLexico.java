package testmaven;
import java.io.*;

public class AnalizadorLexico {
    Flexer lexer;
    FileWriter fichero = null;
    PrintWriter pw = null;

    public AnalizadorLexico(String archivoLectura,String archivoEscritura){
      try {
        Reader lector = new FileReader(archivoLectura);
        lexer = new Flexer(lector);
        fichero = new FileWriter(archivoEscritura);
        pw = new PrintWriter(fichero);
      }
      catch(FileNotFoundException ex) {
        System.out.println(ex.getMessage() + " No se encontró el archivo;");
      }
      catch (IOException e) {
          
      }
    }

    public void analiza(){
      try{
        String l = lexer.yylex() ;
        while( l !=null ){
          System.out.print(l);
          pw.print(l);
          l = lexer.yylex() ;
        }
        pw.close();

      }catch(IOException ex){
        System.out.println("\n"+ex.getMessage());
        pw.close();
      }
    }

}
