import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class XXX {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        int iValor = 0;
        boolean bSalir, bEsPrimo;
        for (int j = 1; j <= 3; j++) {
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        bSalir = false;
            do {
                System.out.printf("Introduzca un valor: ");
                try {
                    iValor = entrada.nextInt();
                    bSalir = true;
                } catch (Exception e) {
                    System.out.printf("ERROR: ¡Valor no válido!\n\n");
                    entrada.nextLine();
                }
            } while (!bSalir);
            //----------------------------------------------
            //       Procesamiento + Salida de Resultados
            //----------------------------------------------
            if (iValor < 0) {
                System.out.printf("El valor es negativo.\n\n");
            } else {
                bEsPrimo = true;
                if (iValor <= 1) {
                    System.out.printf("El valor debe ser mayor.\n\n");
                } else {
                    for (int i = 2; i < iValor; i++) {
                        if (iValor % i == 0) {
                            bEsPrimo = false;
                            break;
                        }
                    }
                    if (bEsPrimo) {
                        System.out.printf("El número ES primo.\n\n");
                    } else {
                        System.out.printf("El número NO esprimo.\n\n");
                    }
                }
            }
        }
        entrada.close();
    }
}