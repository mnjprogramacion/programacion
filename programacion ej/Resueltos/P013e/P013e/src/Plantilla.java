import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Plantilla {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de constantes
        //----------------------------------------------
        final int iTAMCADENA = 50;
        final int iTAMREG = (iTAMCADENA * 2) + 8 + (4 * 3);
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        File fichero;
        RandomAccessFile fichAlea = null;
        Scanner entrada = new Scanner(System.in);
        String nombre, fecha;
        char[] aCaracteres;
        LocalDate fechaObj = null;
        double dAltura = 0.0;
        int iNumReg, iTamFich;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        System.out.printf("etc");
        System.out.printf("%s\n", "-".repeat(44));
        fichero = new File("fichero.dat");

        // Pedir datos

        // Escritura
        try {
            aCaracteres = nombre.toCharArray();
            aCaracteres = Arrays.copyOf(aCaracteres, iTAMCADENA);
            for (int q = 0; q < iTAMCADENA; q++) { fichAlea.writeChar(aCaracteres[q]); }
            fichAlea.writeDouble(dAltura);
            fichAlea.writeInt(fechaObj.getYear());
            fichAlea.writeInt(fechaObj.getMonthValue());
            fichAlea.writeInt(fechaObj.getDayOfYear());
        } catch (IOException e) {
            System.out.printf("\tERROR");
            try { fichAlea.close() } catch (IOException r) { System.out.printf("\tERROR"); }
        }

        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        // Lectura

        try {
            iTamFich = (int) fichAlea.length() / iTAMREG;
            do {
                do {
                    System.out.printf("\nNumero de registro: ");
                }
            }
        }

    }
}