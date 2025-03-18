import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica006a {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        double[] aArrayUsuario;
        int iLongitud = 0;
        double dValorUsuario;
        double dSumaValores = 0;
        double dSumaValoresPositivos = 0;
        int iNumValoresPositivos = 0;
        double dMediaValores;
        double dMediaValoresPositivos;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        do {
            System.out.printf("Introduce un valor entre 2 y 20: ");
            try {
                iLongitud = entrada.nextInt();
            } catch (Exception e) {
                System.out.printf("\nValor no válido, introduce un número entero.\n\n");
                entrada.nextLine();
            }
        } while (iLongitud < 2 || iLongitud > 20);

        aArrayUsuario = new double[iLongitud];

        for (int q = 0; q < aArrayUsuario.length; q++) {
            System.out.printf("\nIntroduce el valor %d decimal para el array: ", (q + 1));
            dValorUsuario = entrada.nextDouble();
            aArrayUsuario[q] = dValorUsuario;
            dSumaValores += dValorUsuario;
            if (dValorUsuario > 0) {
                dSumaValoresPositivos += dValorUsuario;
                iNumValoresPositivos++;
            }
        }
        
        entrada.close();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        dMediaValores = dSumaValores / aArrayUsuario.length;
        dMediaValoresPositivos = dSumaValoresPositivos / iNumValoresPositivos;

        System.out.printf("\nSuma de todos los valores: %.2f", dSumaValores);
        System.out.printf("\nMedia de todos los valores: %.2f", dMediaValores);
        System.out.printf("\nSuma de los valores positivos: %.2f", dSumaValoresPositivos);
        System.out.printf("\nMedia de los valores positivos: %.2f", dMediaValoresPositivos);
    }
}