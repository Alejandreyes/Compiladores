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
      //pw = new PrintWriter(fichero);
    }
    catch(FileNotFoundException ex) {
      System.out.println(ex.getMessage() + " No se encontró el archivo;");
    }
    catch (IOException e) {

    }
  }

  public void analiza(){
    String l ="";
    try{
      l= lexer.yylex() ;
      while( l !=null ){
        System.out.print(l);
        fichero.write(l);
        l = lexer.yylex() ;
      }
      fichero.close();
      fichero = null ;
    }catch(RuntimeException ex){
      System.out.println("\n"+ex.getMessage());
      l+="\n"+ex.getMessage();
    }
    catch (IOException ex) {
      System.out.println("\n"+ex.getMessage());
      l+="\n"+ex.getMessage();
    }
    finally{
      try{
        if(fichero!= null){

          fichero.write(l);
          fichero.close();
        }

      }catch (Exception e) {

      }

    }
  }
}
