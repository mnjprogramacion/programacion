import java.math.BigInteger;
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
        
        //Clase, no lleva notación húngara

        Scanner entrada = new Scanner(System.in);
        BigInteger valor1 = new BigInteger("123456789");
        BigInteger valor2 = new BigInteger("987654321");
        valor1 = valor1.add(valor2);
        valor1 = valor1.pow(2);
        System.out.printf("Valor: %d\n", valor1);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
    }
}