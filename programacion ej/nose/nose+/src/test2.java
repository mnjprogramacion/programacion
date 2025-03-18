import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class test2 {
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
        final int iNUMLETRAS = 27;
        final int iLETRASPORLINEA = 3;
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        String cadena;
        char cCaracter;
        int[] aContabilidad = new int[iNUMLETRAS];
        int iContador = 0, iPorLinea = 0, iPosicion;
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
                iPosicion = cCaracter - 'a';
                if (iPosicion >= 0 && iPosicion <= 25) {
                    aContabilidad[iPosicion]++;
                    iContador++;
                } else if (iPosicion == 100) {
                    aContabilidad[26]++;
                    iContador++;
                }
            }
            for (int q = 0; q < iNUMLETRAS; q++) {
                dResultado = (double) aContabilidad[q]/iContador * 100;
                System.out.printf("%c: %.2f\t", 'a' + q, dResultado);
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