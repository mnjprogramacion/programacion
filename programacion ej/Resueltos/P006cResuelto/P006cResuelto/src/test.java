import java.util.Scanner;

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
        //          Declaración de constantes 
        //----------------------------------------------
        final int iTOPE = 10;
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        int[] aLista = new int[iTOPE];
        int iPosicion = 0, iValor = 0;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("\nListado: ");
        for (int q = 0; q < iTOPE; q++) {
            aLista[q] = (int) Math.round(Math.random() * 9 + 1);
            if (q == iTOPE - 1) {
                System.out.printf("%d\n\n", aLista[q]);
            } else {
                System.out.printf("%d, ", aLista[q]);
            }
        }

        do {
            do {
                System.out.printf("Dame la posición (-1 = Salir): ");
                if (entrada.hasNextInt()) {
                    iPosicion = entrada.nextInt();
                    entrada.nextLine();
                } else {
                    entrada.nextLine();
                }
            } while ((iPosicion <= 0 || iPosicion > iTOPE) && iPosicion != -1);

            if (iPosicion != - 1) {
                do {
                    System.out.printf("Dame el valor (1-10): ");
                    if (entrada.hasNextInt()) {
                        iValor = entrada.nextInt();
                        entrada.nextLine();
                    } else {
                        entrada.nextLine();
                    }
                } while (iValor < 1 || iValor > 10);
            }
            aLista[iPosicion - 1] = iValor;
        } while (iPosicion != -1);
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        for (int q = 0; q < iTOPE; q++) {
            if (q == iTOPE - 1) {
                System.out.printf("%d\n\n", aLista[q]);
            } else {
                System.out.printf("%d, ", aLista[q]);
            }
        }
    }
}