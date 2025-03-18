import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica013g {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        File file;
        DataInputStream dataIN = null;
        String fichero, lecturaString;
        int iLectura;
        short sLectura;
        Byte lecturaByte1, lecturaByte2;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        System.out.printf("\nAnalizando el formato de un BMP");
        System.out.printf("\n===============================\n");
        try {
            System.out.printf("\nIntroduce el nombre del archivo: ");
            fichero = entrada.nextLine();
            file = new File(fichero);
            dataIN = new DataInputStream(new BufferedInputStream(new FileInputStream(file), 1024));
        } catch (IOException e) {
            System.out.printf("\nERROR: Apertura del fichero.");
        }
        entrada.close();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        try {
            // Identificador BM
            lecturaByte1 = dataIN.readByte();
            lecturaString = Character.toString(lecturaByte1);
            lecturaByte2 = dataIN.readByte();
            lecturaString += Character.toString(lecturaByte2);
            System.out.printf("\nIdentificador: %s", lecturaString);
            if (!lecturaString.equals("BM")){
                System.out.printf("\nERROR: Fichero no es BMP.");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.printf("\nERROR: Lectura del fichero.");
            System.exit(1);
        }

        try {
            // Tamaño
            iLectura = dataIN.readInt();
            iLectura = Integer.reverseBytes(iLectura);
            System.out.printf("\nTamaño: %d bytes", iLectura);

            // Reservado
            dataIN.readInt();

            // Desplazamiento
            iLectura = dataIN.readInt();
            iLectura = Integer.reverseBytes(iLectura);
            System.out.printf("\nDesplazamiento en el fichero: %d", iLectura);

            // Cabecera
            iLectura = dataIN.readInt();
            iLectura = Integer.reverseBytes(iLectura);
            System.out.printf("\nTamaño de la cabecera: %d", iLectura);

            // Píxeles H
            iLectura = dataIN.readInt();
            iLectura = Integer.reverseBytes(iLectura);
            System.out.printf("\nNº de píxeles horizontales: %d", iLectura);

            // Píxeles V
            iLectura = dataIN.readInt();
            iLectura = Integer.reverseBytes(iLectura);
            System.out.printf("\nNº de píxeles verticales: %d", iLectura);

            // Planos de color
            sLectura = dataIN.readShort();
            sLectura = Short.reverseBytes(sLectura);
            System.out.printf("\nNº de planos de color: %d", sLectura);

            // Profundidad de color
            sLectura = dataIN.readShort();
            sLectura = Short.reverseBytes(sLectura);
            System.out.printf("\nProfundidad de color: %d", sLectura);

            // Compresión
            iLectura = dataIN.readInt();
            iLectura = Integer.reverseBytes(iLectura);
            if (iLectura == 0) { System.out.printf("\nNo tiene compresión."); }
            else { System.out.printf("\nCompresión desconocida."); }
            
            // Reservado
            dataIN.readInt();

            // Reservado
            dataIN.readInt();

            // Cantidad de colores usados
            iLectura = dataIN.readInt();
            iLectura = Integer.reverseBytes(iLectura);
            System.out.printf("\nCantidad de colores usados: %d", iLectura);

            // Cantidad de colores importantes
            iLectura = dataIN.readInt();
            iLectura = Integer.reverseBytes(iLectura);
            System.out.printf("\nCantidad de colores importantes: %d", iLectura);
            
        } catch (IOException e) {
            System.out.printf("\nERROR: Lectura del fichero.");
            System.exit(1);
        }

        try {
            dataIN.close();
            dataIN = null;
        } catch (IOException e) {
            System.out.printf("\nERROR: Cerrado del fichero.");
            System.exit(1);
        }
    }
}