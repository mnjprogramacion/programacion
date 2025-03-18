/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Test {
    //----------------------------------------------
    //          Declaración de campos 
    //----------------------------------------------
    private int iValor;
    /*
    private class ClaseInterna {
        public int iValor10;
        public String Cadena;
        public ClaseInterna() {}
    }
    */
    //----------------------------------------------
    //          Declaración de métodos 
    //----------------------------------------------
    public static void cambiar(StringBuilder cadena) {
            // cadena = cadena + "A";
            cadena.append('A');
        }
        /**
         * @param args Argumentos de la línea de comandos
         */
        public static void main(String[] args) {
            //----------------------------------------------
            //          Declaración de constantes 
            //----------------------------------------------
    
            //----------------------------------------------
            //          Declaración de variables 
            //----------------------------------------------   
            // String cadena = "Hola";
            StringBuilder cadena = new StringBuilder("Hola");
            //----------------------------------------------
            //                Entrada de datos 
            //----------------------------------------------
            
            //----------------------------------------------
            //       Procesamiento + Salida de Resultados
            //----------------------------------------------
            cambiar(cadena);
            System.out.printf("%s\n", cadena);
    }
}