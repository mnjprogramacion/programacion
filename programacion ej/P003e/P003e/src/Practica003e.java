import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica003e {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        int iTalla;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        do {
            System.out.printf("Introduce tu talla numérica entera: ");
            try {
                iTalla = entrada.nextInt();
                break;
            } catch (Exception e) {
                System.out.printf("\n¡Debes introducir un valor entero!\n\n");
                entrada.nextLine();
            }
        } while (true);

        entrada.close();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        switch (iTalla) {
            case 40:
                System.out.printf("\nTu talla es la S.");
                break;
            case 42: case 44:
                System.out.printf("\nTu talla es la M.");   
                break;
            case 46:
                System.out.printf("\nTu talla es la L.");
                break;
            case 48: case 50:
                System.out.printf("\nTu talla es la XL.");
                break;
            default :
                System.out.printf("\n¡La talla indicada no es válida!");
                break;
        }
    }
}