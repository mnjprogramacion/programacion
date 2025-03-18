import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica003c {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de constantes 
        //----------------------------------------------
        double dANCHURA = 21.0;
        double dALTURA = 29.7;
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        int iFoliosHorizontales;
        int iFoliosVerticales;
        double dAnchuraTotal;
        double dAlturaTotal;
        double dAreaTotal;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("Constantes y variables\n");
        System.out.printf("======================\n");

        do {
            try {
                System.out.printf("Folios horizontales: ");
                break;
            } catch (Exception e) {
                entrada.next();
            }
        } while (true);
        iFoliosHorizontales = entrada.nextInt();

        do {
            try {
                System.out.printf("Folios verticales: ");
                break;
            } catch (Exception e) {
                entrada.next();
            }
        } while (true);
        iFoliosVerticales = entrada.nextInt();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        dAnchuraTotal = (double) iFoliosHorizontales * dANCHURA;
        dAlturaTotal = (double) iFoliosVerticales * dALTURA;
        dAreaTotal = dAnchuraTotal * dAlturaTotal;

        System.out.printf("\nResultado:\n");
        System.out.printf("==========\n");
        System.out.printf("Tamaño horizontal mosaico: %.2f\nTamaño vertical mosaico: %.2f\nÁrea del mosaico: %.2f", dAnchuraTotal, dAlturaTotal, dAreaTotal);

        entrada.close();
    }
}