import java.util.Arrays;

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
        //          Declaración de variables 
        //----------------------------------------------
        /*
        int[] aHoras = {1, 2, 3};
        String[] aCadenas = {"Hola",
                            " Adios",
                            "Saludos",
                            };
        System.out.printf("%d", aHoras[0]);
        aHoras[0] = 20;
        for (int q = 0; q < aHoras.length; q++) {
            aHoras[q] = 10;
        }
        int[] aLista = new int[20],
        for (int q = 0; q < 20; q++);
        */

        /*
        int[] aHoras = {1, 2, 3};
        int[] aCopia = aHoras;
    
        aHoras[1] = 100;
        System.out.printf("\n%d\n", aCopia[1]);
        */

        int[] aHoras = {1, 2, 3};
        int[] aCopia = Arrays.copyOf(aHoras, aHoras.length-1);
    
        aHoras[1] = 100;
        System.out.printf("\n%d\n", aCopia[1]);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
    }
}