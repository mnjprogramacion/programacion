/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class test2 {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        int[][] aTabla;
        int iValor;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        // aTabla = new int[10][];
        // aTabla[0] = new int[20];
        // aTabla[1] = new int[30];

        /*
        aTabla = new int[10][20];
        for (int q = 0; q < aTabla.length; q++) {
            for (int w = 0; w < aTabla[q].length; w++) {

            }
        }
        */

        aTabla = new int[2][2];

        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        aTabla[0][0] = 10;
        aTabla[0][1] = 20;
        aTabla[1][0] = 30;
        aTabla[1][1] = 40;

        iValor = aTabla[0][0] * aTabla[1][1] - aTabla[0][1] * aTabla[1][0];
    }
}