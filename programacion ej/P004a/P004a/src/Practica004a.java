import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica004a {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        int iValor;
        int iMult1 = 1;
        int iMult2 = 1;
        int iResultado;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        do {
            System.out.printf("Introduce un número entre 1 y 30 (usa 0 para salir del programa): ");
            try {
                iValor = entrada.nextInt();
                if ((iValor >= 0) && (iValor <= 30)) {
                    break;
                } else {
                    System.out.printf("\nValor no válido.\n\n");
                }
            } catch (Exception e) {
                System.out.printf("\nValor no válido.\n\n");
                entrada.next();
            }
        } while (true);

        entrada.close();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        if (iValor != 0) {
            while (iMult1 <= iValor) {
                System.out.printf("\nTabla del %d:\n", iMult1);
                System.out.printf("=============\n");
                while (iMult2 <= 15) {
                    iResultado = iMult1 * iMult2;
                    System.out.printf("%d\tx\t%d\t=\t%d\n", iMult1, iMult2, iResultado);
                    iMult2++;
                }
                iMult1++;
                iMult2 = 1;
            }
        }
    }
}