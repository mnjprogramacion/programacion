import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica003b {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        double dValorA;
        double dValorB;
        double dValorC;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("Introduce el primer valor (A): ");
        if (!entrada.hasNextDouble()){
            System.exit(1);
        }
        dValorA = entrada.nextDouble();

        System.out.printf("Introduce el segundo valor (B): ");
        if (!entrada.hasNextDouble()){
            System.exit(1);
        }
        dValorB = entrada.nextDouble();

        System.out.printf("Introduce el tercer valor (C): ");
        if (!entrada.hasNextDouble()){
            System.exit(1);
        }
        dValorC = entrada.nextDouble();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        if (dValorA >= dValorB && dValorA >= dValorC) {
            if (dValorB >= dValorC) {
                System.out.printf("\nRelación entre los valores:\n===========================\n %.2f >= %.2f >= %.2f", dValorA, dValorB, dValorC);
            } else {
                System.out.printf("\nRelación entre los valores:\n===========================\n %.2f >= %.2f >= %.2f", dValorA, dValorC, dValorB);
            }
        }
        if (dValorB > dValorA && dValorB > dValorC) {
            if (dValorA > dValorC){
                System.out.printf("\nRelación entre los valores:\n===========================\n %.2f >= %.2f >= %.2f", dValorB, dValorA, dValorC);
            } else {
                System.out.printf("\nRelación entre los valores:\n===========================\n %.2f >= %.2f >= %.2f", dValorB, dValorC, dValorA);
            }
        }
        if (dValorC > dValorA && dValorC > dValorB) {
            if (dValorA > dValorB){
                System.out.printf("\nRelación entre los valores:\n===========================\n %.2f >= %.2f >= %.2f", dValorC, dValorA, dValorB);
            } else {
                System.out.printf("\nRelación entre los valores:\n===========================\n %.2f >= %.2f >= %.2f", dValorC, dValorB, dValorA);
            }
        }
        
        
    }
}