/**
 *
 * @author Mattias Nygren Jiménez 
 * @version 1.0
 */
public class Practica002a {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        float fValor1 = 10.0F;
        float fValor2 = 0.0F;
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        fValor2 = (fValor2 == 0)? 1 : fValor2 ;

        System.out.println("Cálculos aritméticos");
        System.out.println("====================");
        System.out.println("Valor 1: " + fValor1);
        System.out.println("Valor 2: " + fValor2 + "\n");
        System.out.println("Resultado");
        System.out.println("====================");
        System.out.println("Doble del primer número: " + (fValor1 * 2));
        System.out.println("Mitad del segundo número: " + (fValor2 / 2));
        System.out.println("Cuadrado de la suma de ambos números: " + (StrictMath.pow(fValor1 + fValor2, 2)));
        System.out.println("Décima parte de la suma de los cuadrados de ambos números: " + ((StrictMath.pow(fValor1, 2) + StrictMath.pow(fValor2, 2)) / 10));
        System.out.println("Primer valor dividido entre segundo valor: " + (fValor1 / fValor2));
        System.out.println("Inverso del segundo valor: " + (1/fValor2));
        System.out.println("Inverso de la suma de ambos números: " + (1/(fValor1 + fValor2)));
        System.out.println("Raíz cúbica del primer número: " + (StrictMath.cbrt(fValor1)));
    }
}