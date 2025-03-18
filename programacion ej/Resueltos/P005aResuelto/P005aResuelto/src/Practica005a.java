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
        String nombre, apellido1, apellido2, result;
        int iValor;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("Generador de nombres de usuario:\n");
        System.out.printf("Introduzca nombre: ");
        nombre = entrada.nextLine().trim().toUpperCase();
        System.out.printf("Introduzca primer apellido: ");
        apellido1 = entrada.nextLine().trim().toUpperCase();
        System.out.printf("Introduzca segundo apellido: ");
        apellido2 = entrada.nextLine().trim().toUpperCase();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        result = nombre.substring(0, Math.min(3, nombre.length())) + apellido1.substring(0, Math.min(3, apellido1.length()));
        if (!apellido1.equals(apellido2)) {
            result += apellido2.substring(0,Math.min(3, apellido2.length()));
        }
        System.out.printf("Resultado 1: %s\n", result);
        iValor = 100 + (int) Math.round(Math.random() * 100);
        System.out.printf("Resultado 2: %s%d", result, iValor);
        entrada.close();
    }
}