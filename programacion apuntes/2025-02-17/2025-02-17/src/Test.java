import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Test {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        File fichero;
        FileWriter fichEsc;
        FileReader fichLect;
        BufferedWriter fichBufEsc = null;
        BufferedReader fichBufLect = null;
        String cadena1 = "Hola";
        String cadena2 = "desde Java";
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        fichero = new File("mifichero.txt"); // "C:\\Users\\Matt\\..."

        if (fichero.exists()) {}
        // Escritura
        try {
            fichEsc = new FileWriter(fichero, Charset.forName("UTF-8"), false);
            fichBufEsc = new BufferedWriter(fichEsc, 1024);
            fichBufEsc.write(cadena1, 0, cadena1.length());
            fichBufEsc.flush();
            fichBufEsc.newLine();
            fichBufEsc.write(cadena2);
        } catch (IOException e) { System.out.printf("ERROR DE E/S\n"); }
        finally {
            try { fichBufEsc.close(); fichBufEsc = null; } catch (IOException e) {}
        }

        // Lectura
        try {
            fichLect = new FileReader(fichero);
            fichBufLect = new BufferedReader(fichLect, 1024);
            do {
                cadena1 = fichBufLect.readLine();
                if (cadena1 != null) { System.out.printf("%s\n", cadena1); }
            } while (cadena1 != null);
        } catch (Exception e) { System.out.printf("ERROR DE LECTURA\n"); }
        finally {
            try { fichBufLect.close(); } catch (Exception e) {}
        }
    }
}