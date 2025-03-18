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
        //          Declaración de constantes 
        //----------------------------------------------

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        int iValor = -1;
        Scanner entrada = new Scanner(System.in);
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------

        /*
        System.out.printf("Introduzca su edad: ");
        if (entrada.hasNextInt()) {
            iValor = entrada.nextInt();
        } else {
            System.out.printf("¡Has introducido un valor no válido!\n\n");
        }
        */

        /*
        System.out.printf("Introduzca su edad: ");
        try {
            iValor = entrada.nextInt();
        }
        catch (Exception e) {
            System.out.printf("%s", e.getMessage());
        }
        */
        
        /*
        System.out.printf("Introduzca su edad: ");
        try {
            iValor = entrada.nextInt();
        }
        catch (Exception e) {
            System.out.printf("¡Has introducido un valor no válido!\n\n");
        }
        */
        /*
        do {
            System.out.printf("Introduzca su edad: ");
            try {
                iValor = entrada.nextInt();
            }
            catch (Exception e) {
                System.out.printf("¡Has introducido un valor no válido!\n\n");
                entrada.nextLine();
            }
        } while (iValor < 0 || iValor > 120);
        */

        /*
        do {
            System.out.printf("Introduzca su edad: ");
            try {
                iValor = entrada.nextInt();
                if (iValor >= 0 && iValor <= 120) {
                    break;
                } else {
                    System.out.printf("¡La edad no está en rango!\n\n");
                }
            }
            catch (Exception e) {
                System.out.printf("¡Has introducido un valor no válido!\n\n");
                entrada.nextLine();
            }
        } while (true);
         */

        while (iValor < 0 || iValor > 120) {
            System.out.printf("Introduzca su edad: ");
            try {
                iValor = entrada.nextInt();
                if (iValor >= 0 && iValor <= 120) {
                    break;
                } else {
                    System.out.printf("¡La edad no está en rango!\n\n");
                }
            } catch (Exception e) {
                System.out.printf("¡Has introducido un valor no válido!\n\n");
                entrada.nextLine();
            }
        }

        entrada.close();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
    }
}