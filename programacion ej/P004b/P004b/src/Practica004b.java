import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica004b {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        int iEscalones;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------

        System.out.printf("\nEscalera de asteriscos\n");
        System.out.printf("======================\n");
        System.out.printf("Dime el número de escalones de la escalera: ");
        do {
            try {
                iEscalones = entrada.nextInt();
                if (iEscalones >= 1 && iEscalones <= 15) {
                    break;
                } else {
                    System.out.printf("\nEntrada no válida. Introduce un número entero del 1 al 15.\n\n");
                    entrada.nextLine();
                }
                
            } catch (Exception e) {
                System.out.printf("\nEntrada no válida. Introduce un número entero del 1 al 15.\n\n");
                entrada.nextLine();
            }
        } while (true);

        entrada.close();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------

        for (int q = 1; q <= iEscalones; q++) {
            for (int r = 1; r <= q; r++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}