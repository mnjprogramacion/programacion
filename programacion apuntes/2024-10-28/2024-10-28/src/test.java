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
        int iPeso;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------

        /*
        System.out.printf("Dame tu peso (valor entero): ")
        if (entrada.hasNextInt()) {
            iPeso = entrada.nextInt();
            System.out.printf("Tu peso es: %d.%n", iPeso);
        } else {
            entrada.nextLine();
        }
        */
        do {
            System.out.printf("Dame tu peso (valor entero): ");
            try {
                iPeso = entrada.nextInt();
                System.out.printf("Tu peso es: %d.%n ", iPeso);
                break;
            } catch (Exception e) {
                System.out.printf("¡Has introducido un valor no válido!%n");
                entrada.nextLine();
            }
        } while (true);

        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        // entrada.close();
    }
}