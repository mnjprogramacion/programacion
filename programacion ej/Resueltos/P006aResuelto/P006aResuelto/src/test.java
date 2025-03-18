import java.util.Scanner;

/**
 *
 * @author XXXX
 * @version XX
 */
public class test {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        int iNumElem;
        double []aLista;
        double dSuma = 0, dSuma2 = 0;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        do {
            System.out.printf("Dame el número de elementos del array: ");
            try {
                iNumElem = entrada.nextInt();
                if (iNumElem < 2 || iNumElem > 20) {
                    System.out.printf("ERROR: Rango no válido.\n\n");
                    entrada.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.printf("ERROR: Valor no válido\n\n");
                entrada.nextLine();
            }
        } while (true);
        aLista = new double[iNumElem];
        for (int q = 0; q < aLista.length; q++) {
            System.out.printf("Dame elemento Nº %d: ", q + 1);
            aLista[q] = entrada.nextDouble();
        }
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        for (int q = 0; q < iNumElem; q++) {
            dSuma += aLista[q];
            if (true) {}
            }
        }
        System.out.printf("Suma de elementos: %.2f\n", dSuma);
        System.out.printf("Suma de elementos: %.2f\n", dSuma/iNumElem);
        entrada.close();
    }
}