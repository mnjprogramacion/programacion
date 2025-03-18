/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class Practica002b {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        float fX = 4.5f, fY = 3.0f;
        int iI = 2, iJ;

        double dX = 2.0, dZ;

        byte byX = 5, byY = 2, byZ;

        short sX = 5, sY = 2, sZ;

        char cX = '\uFFFF';
        int iZ;
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        iJ = (int) ( iI * fX);
        System.out.printf("Conversiones entre enteros y coma flotante:\n");
        System.out.printf("Producto de int por float: iJ = %d * %.2f = %d\n\n", iI, fX, iJ);

        dZ = (double) (dX * fY);
        System.out.printf("Producto de double por float: dZ = dX * fY = %.2f\n\n", dZ);

        byZ = (byte) (byX - byY);
        System.out.printf("Operaciones con bytes:\nbyte: %d - %d = %d\n\n", byX, byY, byZ);
        byX = -128;
        byY = 1;
        System.out.printf("byte: %d - %d = %d\n", byX, byY, (byte) (byX - byY));
        System.out.printf("int: %d - %d = %d\n\n", byX, byY, (int) (byX - byY));
        
        sZ = (short) (sX - sY);
        System.out.printf("Operaciones con short:\nshort: %d - %d = %d\n\n", sX, sY, sZ);
        sX = 32767;
        sY = 1;
        sZ = (short) (sX + sY);
        System.out.printf("short: %d + %d = %d\n\n", sX, sY, sZ);

        iZ = (int) (cX);
        sX = (short) (cX);
        System.out.printf("int: %d / short: %d\n\n", iZ, sX);

        sX = -32768;
        cX = (char) (sX);
        iZ = (int) (sX);
        System.out.printf("short: %d / char: %d / int: %d\n\n", sX, (int) cX, iZ);

        sX = -1;
        cX = (char) (sX);
        iZ = (int) (cX);
        System.out.printf("short: %d / char: %d / int: %d", sX, (int) cX, iZ);
    }
}