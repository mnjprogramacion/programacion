import java.util.Scanner;

/**
 *
 * @author XXXX
 * @version XX
 */
public class Test {
    public static int CuentaOcurrencias(char[] aVariantes, String cadena) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        int iCuenta = 0;
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        for (int q = 0; q < cadena.length(); q++) {
            for (int w = 0; w < aVariantes.length; w++) {
                if (cadena.charAt(q) == aVariantes[w]) {
                    iCuenta++;
                    break;
                }
            }
        }

        return iCuenta;
    }
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de constantes 
        //----------------------------------------------
        final char[][] aCARACTERES = {
            {'a', 'A', 'á', 'Á'},
            {'e', 'E', 'é', 'É'},
            {'i', 'I', 'í', 'Í'},
            {'o', 'O', 'ó', 'Ó'},
            {'u', 'U', 'ú', 'Ú'}
        };
        final String[] aSALIDA = {"Número de A'es: ", "Número de E'es: ", "Número de I'es: ", "Número de O'es: ", "Número de U'es: "};
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        String cadena;
        int[] aCuenta = new int[aCARACTERES.length];
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("\n\nAnalizador de cadenas:\n");
        System.out.printf("======================\n");
        System.out.printf("Introduzca cadena a analizar: ");
        cadena = entrada.nextLine().trim();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        if (!cadena.isEmpty()) {
            for (int q = 0; q < aCARACTERES.length; q++){
                aCuenta[q] = CuentaOcurrencias(aCARACTERES[q], cadena);
                System.out.printf("%s%d\n", aSALIDA[q], aCuenta[q]);
            }
        }
        System.out.printf("");

        entrada.close();
    }
}