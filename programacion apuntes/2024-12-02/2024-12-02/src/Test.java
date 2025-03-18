import javax.crypto.AEADBadTagException;

/**
 *
 * @author XXXX
 * @version XX
 */
public class Test {
    //----------------------------------------------
    //     Declaración de campos constantes
    //----------------------------------------------

    //----------------------------------------------
    //     Declaración de campos
    //----------------------------------------------

    //----------------------------------------------
    //     Declaración de constructores
    //----------------------------------------------

    //----------------------------------------------
    //     Declaración de métodos
    //----------------------------------------------
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
        Gatito gato1, gato2;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        gato1 = new Gatito("Misifu", 2023);
        gato2 = new Gatito("Miau", 2024);

        System.out.printf("Mi gatito se llama: %s\n", gato1.obtenerNombre());
    }
}