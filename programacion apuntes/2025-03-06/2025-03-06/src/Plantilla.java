import java.io.*;
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

        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
      
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------

        /* 
        File nombre1 = new File("quijote.txt");
        File nombre2 = new File("salida.dat");
        try {
            FileInputStream fichEnt = new FileInputStream(nombre1);
            FileOutputStream fichSal = new FileOutputStream(nombre2);

            BufferedInputStream fichEntBuf = new BufferedInputStream(fichEnt, 1024);
            BufferedOutputStream fichSalBuf = new BufferedOutputStream(fichSal, 1024);

            DataInputStream fichDatEnt = new DataInputStream(fichEntBuf);
            DataOutputStream fichDatSal = new DataOutputStream(fichSalBuf);

            String nombre = "Andrea Pérez Ruiz";
            int iEdad = 50;
            double dAltura = 1.88;

            fichDatSal.writeUTF(nombre);
            fichDatSal.writeInt(iEdad);
            fichDatSal.writeDouble(dAltura);

            fichDatEnt.close();
            fichDatSal.close();
        } catch (IOException e) {
            System.out.printf("ERROR");
        }
            */

        /*
        File nombre2 = new File("salida.dat");
        Scanner entrada = new Scanner(System.in);
        int iPosicion, iValor;
        try{
            RandomAccessFile fichero = new RandomAccessFile(nombre2, "rw");
            for (int q = 0; q < 10; q++) {
                fichero.writeInt(q + 1);
            }
            System.out.printf("\nDime la posición a leer: ");
            iPosicion = entrada.nextInt();
            fichero.seek(iPosicion * 4); // Cada entero ocupa 4 bytes
            iValor = fichero.readInt();
            System.out.printf("\nEl valor leído es: %d\n", iValor);
            fichero.close();
        } catch (IOException e) { System.out.printf("\nERROR"); }
        entrada.close();
        */

        File nombre2 = new File("salida.dat");
        Scanner entrada = new Scanner(System.in);
        try{
            RandomAccessFile fichero = new RandomAccessFile(nombre2, "rw");
            String cadena = "Hola";
            int iValor = 20;
            double dAltura= 30;

            fichero.writeUTF(cadena);
            cadena.toCharArray();
            fichero.writeInt(iValor);
            fichero.writeDouble(dAltura);

            fichero.close();
        } catch (IOException e) { System.out.printf("\nERROR"); }
        entrada.close();
    }
}