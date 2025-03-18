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
        Scanner entrada = new Scanner(System.in);
        int iValor;
        double dAltura;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        System.out.printf("Dame tu edad: ");
        if (entrada.hasNextInt()){
            iValor = entrada.nextInt();
            System.out.printf("Tu edad es: %d.\n", iValor);
        } else {
            System.out.printf("¡El valor introducido no es un entero!\n");
            entrada.nextLine();
        }

        System.out.printf("Dime tu altura: ");
        if (entrada.hasNextDouble()) {
            dAltura = entrada.nextDouble();
            System.out.printf("Tu altura es %.2f.\n", dAltura);
        } else {
            System.out.printf("¡El valor introducido no es un real!");
        }

        entrada.close();
    }
}