
/**
 * Ejemplo Basico de un automata
 *
 * @author Los Compiladores
 */
public class Automata {

    //private int EstadoActual;

    private char[] alfabeto;
    private int[] estados;
    private int edoInicial;
    private int[] edoFinal;
    
    private Tercia[][] fTransicion;
    
    public Automata(char[] alfabeto, int[] estados, int edoInicial, int[] edoFinal, Tercia[][] fTransicion) {
        this.alfabeto = alfabeto;
        this.estados = estados;
        this.edoInicial = edoInicial;
        this.edoFinal = edoFinal;
        this.fTransicion = fTransicion;

//        this.EstadoActual = edoInicial; // se toma como primer estado el edo incial         

    }

    /**
     * Automata propuesto por la ayudante del laboratorio
     */
    public Automata() {
        char[] alfabeto = {'a', 'b', 'c'};
        this.alfabeto = alfabeto;
        int[] estados = {0, 1, 2, 3};
        this.estados = estados;
        int[] edosFinales = {2, 3};
        this.edoFinal = edosFinales;
        this.edoInicial = 0;
        //this.EstadoActual = edoInicial; // se toma como primer estado el edo incial         
        fTransicion = new Tercia[estados.length][estados.length];
        init();

    }

    /**
     * Inicializa el automata finito determinista propuesto en clase
     */
    private void init() {
        fTransicion[0][0] = new Tercia();
        fTransicion[0][0].setEstadoActual(0);
        fTransicion[0][0].setElem('a');
        fTransicion[0][0].setEdoFinal(1);
        fTransicion[1][1] = new Tercia();
        fTransicion[1][1].setEstadoActual(1);
        fTransicion[1][1].setElem('b');
        fTransicion[1][1].setEdoFinal(2);
        fTransicion[2][0] = new Tercia();
        fTransicion[2][0].setEstadoActual(2);
        fTransicion[2][0].setElem('a');
        fTransicion[2][0].setEdoFinal(1);
        fTransicion[2][2] = new Tercia();
        fTransicion[2][2].setEstadoActual(2);
        fTransicion[2][2].setElem('c');
        fTransicion[2][2].setEdoFinal(3);
    }

    public boolean aceptado(int estado) {
        for (int i = 0; i < edoFinal.length; i++) {
            if (estado == edoFinal[i]){
                return true;
            }
        }
        return false;
    }
    
    public int getEstadoResultante(int estado, char c) throws TransaccionNoEspecificada{
        if(fTransicion[estado][lugarAlfabeto(c)] != null){
            return fTransicion[estado][lugarAlfabeto(c)].getEdoFinal();
        }
        throw new TransaccionNoEspecificada("Transaccion no especificada"); 
    }

    private byte lugarAlfabeto(char c) throws RuntimeException {
        int pos = 0;
        for (byte i = 0; i < alfabeto.length; i++) {
            if (alfabeto[i] == c) {
                return i;
            }
        }
        throw new RuntimeException("caracter no valido para el automata");
    }
    
    public boolean transaccionEspecificada(int estado, char c){
        return fTransicion[estado][lugarAlfabeto(c)] != null;
    }
    
    public char[] getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(char[] alfabeto) {
        this.alfabeto = alfabeto;
    }

    public int[] getEstados() {
        return estados;
    }

    public void setEstados(int[] estados) {
        this.estados = estados;
    }

    public int getEdoInicial() {
        return edoInicial;
    }

    public void setEdoInicial(int edoInicial) {
        this.edoInicial = edoInicial;
    }

    public int[] getEdoFinal() {
        return edoFinal;
    }

    public void setEdoFinal(int[] edoFinal) {
        this.edoFinal = edoFinal;
    }

    public Tercia[][] getfTransicion() {
        return fTransicion;
    }

    public void setfTransicion(Tercia[][] fTransicion) {
        this.fTransicion = fTransicion;
    }

    

    /**
     * Clase que simula una tupla de las funciones de Transicion
     */
    private static class Tercia {

        private int estadoActual;
        private char elem;
        private int edoFinal;

        public Tercia() {
        }

        public int getEstadoActual() {
            return estadoActual;
        }

        public void setEstadoActual(int estadoActual) {
            this.estadoActual = estadoActual;
        }

        public char getElem() {
            return elem;
        }

        public void setElem(char elem) {
            this.elem = elem;
        }

        public int getEdoFinal() {
            return edoFinal;
        }

        public void setEdoFinal(int edoFinal) {
            this.edoFinal = edoFinal;
        }

    }

}
