
//import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Los Compiladores
 */
public class Tokenizer {
	
	

    
    
    private boolean[][] failedPreviously;
    private Stack<Par> stack;

    public Tokenizer() {
        stack = new Stack<>();
    }

    public boolean Tokenizer(Automata m, String s) {
        int Bottom = m.getEstados().length - 1;
        failedPreviously = new boolean[m.getEstados().length][s.length()];
        for (int q : m.getEstados()) {
            for (int i = 0; i < s.length(); i++) {
                failedPreviously[q][i] =  false ;
            }
        }
        int i = 0;
        while (true) {
        	int q = m.getEdoInicial();
            stack.push(new Par(m.getEstados()[Bottom], i));
            while (i < s.length() && m.transaccionEspecificada(q, s.charAt(i))) {
                if (failedPreviously[q][i]) {
                    break;    
                }
                if (m.aceptado(q)) {
                	stack.removeAllElements();
                }
                stack.push(new Par(q, i));
                q = m.getEstadoResultante(q, s.charAt(i));
                i++;
            }
         
            while (!m.aceptado(q)) {
            	if(i< s.length()) {
            		failedPreviously[q][i] = true;
                	
            	}
                Par temp = stack.pop();
                q = temp.estado;
                i = temp.letra;
                if (q == Bottom) {
                    return false;
                }
            }
            System.out.println(i-1);
            if (  i >= s.length()) {
                return true;
            }
        }
    }
    private class Par implements Comparable<Par> {

        private int estado;
        private int letra;

        public Par(int estado, int letra) {
            this.estado = estado;
            this.letra = letra;
        }

        public int getEstado() {
            return estado;
        }

        public void setEstado(int estado) {
            this.estado = estado;
        }

        public int getLetra() {
            return letra;
        }

        public void setLetra(int letra) {
            this.letra = letra;
        }

        @Override
        public int compareTo(Par o) {
            if (estado < o.getEstado()) {
                return -1;
            }
            if (estado == o.getEstado()) {
                return Integer.compare(letra, o.getLetra());
            }
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Par) {
                Par s = (Par) obj;
                return estado == s.getEstado() && letra == s.getLetra();
            }
            return false;

        }
    }
}
