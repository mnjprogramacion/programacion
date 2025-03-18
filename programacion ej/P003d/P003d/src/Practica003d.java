import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica003d {
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
        Scanner entrada = new Scanner(System.in);
        float fValor;
        int iValorRound;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("Análisis de un número\n");
        System.out.printf("=====================\n");

        do {
            System.out.printf("Introduzca un número real:\n");
            try {
                fValor = entrada.nextFloat();
                break;
            } catch (Exception e) {
                System.out.printf("Entrada no válida.\n\n");
                entrada.nextLine();
            }
        } while (true);

        entrada.close();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        iValorRound = (int) Math.round(fValor);

        System.out.printf("Resultado:\n");
        System.out.printf("==========\n");
        System.out.printf("¿Es el número 0? %b\n", ((iValorRound == 0)? true : false));
        System.out.printf("¿Es el número positivo? %b\n", ((iValorRound >= 0)? true : false));
        System.out.printf("¿Es el número menor que 100? %b\n", ((iValorRound < 100)? true : false));
        System.out.printf("¿Es el número par? %b\n", (((iValorRound % 2) == 0)? true : false));
    }
}