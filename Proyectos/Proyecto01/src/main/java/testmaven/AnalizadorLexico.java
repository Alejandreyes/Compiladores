package testmaven;
import java.io.*;

public class AnalizadorLexico {
    Flexer lexer;

    public AnalizadorLexico(String archivo){
        try {
            Reader lector = new FileReader(archivo);
            lexer = new Flexer(lector);
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage() + " No se encontró el archivo;");
        }
    }

    public void analiza(){
        try{
            String l = lexer.yylex() ;
              while( l !=null ){
                      System.out.println(l);
                      l = lexer.yylex() ;
              }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
