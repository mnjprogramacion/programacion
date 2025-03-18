import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica005a {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido1;
        String apellido2;
        String resultado1;
        double numRandom = 0;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        System.out.printf("Introduce tu primer apellido: ");
        apellido1 = entrada.nextLine();
        System.out.printf("Introduce tu segundo apellido: ");
        apellido2 = entrada.nextLine();

        entrada.close();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        nombre = nombre.strip().toUpperCase();
        apellido1 = apellido1.strip().toUpperCase();
        apellido2 = apellido2.strip().toUpperCase();

        if (apellido1.compareTo(apellido2) == 0) {
            apellido2 = "";
        } else {
            apellido2 = apellido2.substring(0, 3);
        }
        
        nombre = nombre.substring(0, 3);
        apellido1 = apellido1.substring(0, 3);

        resultado1 = nombre + apellido1 + apellido2;
        numRandom = (StrictMath.random() * 99 + 1) + 100;

        System.out.printf("Resultado 1: %s", resultado1);
        System.out.printf("\nResultado 2: %s%.0f", resultado1, numRandom);
    }
}