import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica005b {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        String cadenaOriginal;
        String cadenaInversa = "";
        StringBuilder cadenaSBOriginal;
        StringBuilder cadenaSBInversa;
        StringBuilder cadenaSBPrimos = new StringBuilder("");
        StringBuilder cadenaSBInversaPrimos = new StringBuilder("");
        boolean bEsPrimo = true;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Introduce una cadena de texto:\n");
        cadenaOriginal = entrada.nextLine();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        cadenaOriginal.trim();
        cadenaSBOriginal = new StringBuilder(cadenaOriginal);

        for (int p = (cadenaOriginal.length() - 1); p >= 0; p--) {
            cadenaInversa = cadenaInversa + cadenaOriginal.charAt(p);
        }

        for (int q = 0; q < cadenaSBOriginal.length(); q++) {
            if (q != 0) {
                for (int r = 2; r < cadenaSBOriginal.length(); r++) {
                    if ((r % q) == 0) {
                        bEsPrimo = false;
                    }
                    else {
                        bEsPrimo = true;
                    }
                }
                if (bEsPrimo == true) {
                    cadenaSBPrimos.append(Character.toUpperCase(cadenaSBOriginal.charAt(q)));
                } else {
                    cadenaSBPrimos.append(Character.toLowerCase(cadenaSBOriginal.charAt(q)));
                }
            } else {
                cadenaSBPrimos.append(Character.toLowerCase(cadenaSBOriginal.charAt(q)));
            }
        }

        for (int p = (cadenaSBPrimos.length() - 1); p >= 0; p--) {
            cadenaSBInversaPrimos.append(cadenaSBPrimos.charAt(p));
        }

        System.out.printf("\nCadena original: %s", cadenaOriginal);
        System.out.printf("\nCadena inversa: %s", cadenaInversa);
        System.out.printf("\nCadena StringBuilder inversa primos: %s", cadenaSBInversaPrimos);
    }
}