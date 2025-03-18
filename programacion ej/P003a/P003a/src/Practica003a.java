import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica003a {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        double dCoeficienteA;
        double dCoeficienteB;
        double dCoeficienteC;
        double dResultado1;
        double dResultado2;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Introduce los coeficientes para la ecuación \"ax**2 + bx + c = 0\":");
        System.out.print("a = ");
        dCoeficienteA = entrada.nextInt();
        System.out.print("b = ");
        dCoeficienteB = entrada.nextInt();
        System.out.print("c = ");
        dCoeficienteC = entrada.nextInt();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        double dRaiz =  StrictMath.pow(dCoeficienteB, 2) - 4 * dCoeficienteA * dCoeficienteC;
        if (dRaiz <= 0){
            dResultado1 = - dCoeficienteB + StrictMath.sqrt(dRaiz);
            dResultado2 = - dCoeficienteB - StrictMath.sqrt(dRaiz);

            System.out.printf("Raíz 1: %f\nRaíz 2: %f", dResultado1, dResultado2);
        } else {
            System.out.printf("La ecuación no tiene raíces reales.");
        }

        entrada.close();
    }
}