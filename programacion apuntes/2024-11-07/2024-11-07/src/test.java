import java.util.Scanner;
import java.util.regex.Pattern;

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
        Scanner entrada = new Scanner(System.in);
        String dni;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        do {
            System.out.printf("Introduzca su DNI: ");
            dni = entrada.nextLine();
            if (Pattern.matches("[0-9]{8}[a-zA-z]", dni)) {
                break;
            } else {
                System.out.printf("ERROR: Formato de DNI no válido.\n\n");
            }
        } while (true);

        {
            int a = 0;
            {
                System.out.println(a);
            }
        } // Al salir, el recolector de basura destruye la variable a

        entrada.close();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
    }
}