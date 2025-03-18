 /**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class App {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        SuperClase objeto1 = new SuperClase();
        objeto1.miMetodo();
        SubClase objeto2 = new SubClase();
        objeto2.miMetodo(10);
        objeto2.miMetodo("10");

        // Casting
        objeto1 = objeto2;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
    }
}