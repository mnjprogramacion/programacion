import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class test {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static boolean esPrimo(int iEntero) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        boolean bEsPrimo = true;

        if (iEntero < 2) {
            return false;
        }
        if (iEntero == 2 || iEntero == 3) {
            return true;
        }
        for (int q = 3; q < iEntero - 1; q++) {
            if (iEntero % q == 0) {
                bEsPrimo = false;
                break;
            }
        }
        return bEsPrimo;
    }
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        String cadena = "", cadenaResult = "";
        StringBuilder cadBuilder;
        char cCaracter;
        long lTiempo;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        if (esPrimo(13)) {
            System.out.printf("Es primo");
        }
        lTiempo = System.currentTimeMillis();
        System.out.printf("Introduce texto a analizar: ");
        cadena = entrada.nextLine().trim();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        for (int q = 0; q < cadena.length(); q++) {
            if (esPrimo(q)) {
                cadenaResult += Character.toUpperCase(cadena.charAt(q));
            } else {
                cadenaResult += Character.toLowerCase(cadena.charAt(q));
            }
        }
        System.out.printf("Cadena original: %s\n", cadena);
        System.out.printf("Cadena resultado: %s\n", cadenaResult);
        System.out.printf("Número en ms: %d\n", (lTiempo - System.currentTimeMillis()));

        cadBuilder = new StringBuilder(cadena);

        for (int q = 0; q < cadena.length(); q++) {
            cCaracter = Character.toUpperCase(cadBuilder.charAt(q));
            if (esPrimo(q)) {
                cCaracter += Character.toUpperCase(cadena.charAt(q));
            } else {
                cCaracter += Character.toLowerCase(cadena.charAt(q));
            }
            cadBuilder.setCharAt(q, cCaracter);
        }

        lTiempo = System.currentTimeMillis();

        System.out.printf("Cadena original: %s\n", cadena);
        System.out.printf("Cadena resultado: %s\n", cadBuilder);
        System.out.printf("Número en ms: %d\n", (lTiempo - System.currentTimeMillis()));

        entrada.close();
    }
}