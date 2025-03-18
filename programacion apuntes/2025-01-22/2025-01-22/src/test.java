/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class test {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de constantes
        //----------------------------------------------

        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Tallas miTalla = Tallas.P;
        
        Punto miPunto;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        System.out.printf("Has escogido la talla: %s\n", miTalla.obtenerCadena());
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        miPunto = new Punto(10, 20, 30);
        Punto.Coma miComa = miPunto.new Coma(10);
    }
}