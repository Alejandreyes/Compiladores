import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Los Compiladores 
 */
public class Practica0251 {   
    
    public static void main(String[] args) throws IOException {
        String archivo = "ejemplo.txt";
    	if(args.length >0) {
    		archivo = args[0];
        }
    	
    	String cadena  ;
    	FileReader f;
    	BufferedReader b;
    	ArrayList<String> cadenas = new ArrayList<>(); 
		f = new FileReader(archivo);
    	b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
		    cadenas.add(cadena);
		}
		b.close();
    	Automata a = new Automata();
        Tokenizer t = new Tokenizer();
        for(String cadenaAux : cadenas) {
        	if ( t.Tokenizer(a, cadenaAux)) {
                System.out.println("Cadena: " +cadenaAux);
                System.out.println("OK");     
            }else{
                System.out.println("Cadena: " +cadenaAux);
                System.out.println("Error : cadena mal formada");
            }

            
            
        }
    }
    
}
