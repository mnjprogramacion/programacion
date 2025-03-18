import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica004c {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean bEsPrimo = true;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        for (int q = 1; q <= 3; q++) {
            bEsPrimo = true;
            do {
                try {
                    System.out.printf("\nIntroduce el valor nº %d: ", q);
                    num = entrada.nextInt();
                    //----------------------------------------------
                    //       Procesamiento + Salida de Resultados
                    //----------------------------------------------
                    if (num < 0) {
                        System.out.printf("\nEl valor es negativo.\n");
                        break;
                    } else if (num <= 1) {
                        System.out.printf("\nEl valor debe ser más grande.\n");
                        break;
                    } else {
                        for (int r = (num - 1); r >= 2; r--) {
                            if ((num % r) == 0) {
                                bEsPrimo = false;
                                break;
                            }
                        }
                        if (bEsPrimo == false) {
                            System.out.printf("\nEl valor no es primo.\n");
                        } else {
                            System.out.printf("\nEl valor es primo.\n");
                        }
                        break;
                    }
                } catch (Exception e) {
                    System.out.printf("\nValor no válido, introduce un número entero.\n");
                    entrada.nextLine();
                }
            } while (true);
        }
        entrada.close();
    }
}