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
        int iNumMax;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("Tabla de multiplicar\n");
        do {
            System.out.printf("Introduzca límite superior: ");
            if (entrada.hasNextInt()) {
                iNumMax = entrada.nextInt();
                if (iNumMax >= 0 && iNumMax <= 30) {
                    break;
                } else {
                    System.out.printf("ERROR: Número fuera de rango (1-30).\n");
                    entrada.nextLine();
                }
            } else {
                System.out.printf("ERROR: Tipo de dato no válido.\n");
                entrada.nextLine();
            }
        } while (true);
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        entrada.close();
        if (iNumMax != 0) {
            for (int w = 1; w <= iNumMax; w++) {
                System.out.printf("Tabla de multiplicar del %d\n", w);
                for (int q = 1; q <= 15; q++) {
                    System.out.printf("%2d x %2d = %3d\n", w, q, w * q);
                }
                System.out.printf("\n");
            }
        }
    }
}