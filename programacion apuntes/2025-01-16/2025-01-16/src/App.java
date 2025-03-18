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
        
        //----------------------------------------------
        //     Entrada de datos
        //----------------------------------------------

        try {
            Persona yo = new Persona("Andrea", -20);
        } catch (Exception e) {
            System.out.printf("\n%s\n", e.getMessage());;
        }

        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
    }
}