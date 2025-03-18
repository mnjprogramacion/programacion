import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class test {
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
        final char[] aLETRAS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ñ'};
        final int iLETRASPORLINEA = 3;
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        String cadena;
        char cCaracter;
        int[] aContabilidad = new int[aLETRAS.length];
        int iContador = 0, iPorLinea = 0;
        double dResultado;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        System.out.printf("*********************\n");
        System.out.printf("Análisis de un texto:\n");
        System.out.printf("*********************\n");
        System.out.printf("Introduzca texto a analizar:\n");
        cadena = entrada.nextLine().trim().toLowerCase();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        if (!cadena.isEmpty()) {
            System.out.printf("\n\nEstadísticas:\n");
            System.out.printf("=============\n");
            for (int q = 0; q < cadena.length(); q++) {
                cCaracter = cadena.charAt(q);
                for (int w = 0; w < aLETRAS.length; w++) {
                    if (cCaracter == aLETRAS[w]) {
                        aContabilidad[w]++;
                        iContador++;
                    }
                }
            }
            for (int q = 0; q < aLETRAS.length; q++) {
                dResultado = (double) aContabilidad[q]/iContador * 100;
                System.out.printf("%c: %.2f\t", aLETRAS[q], dResultado);
                iPorLinea++;
                if (iPorLinea == iLETRASPORLINEA) {
                    System.out.printf("\n");
                    iPorLinea = 0;
                }
            }
        }
        entrada.close();
    }
}