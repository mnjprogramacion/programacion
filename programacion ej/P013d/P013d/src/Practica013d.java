import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica013d {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de constantes
        //----------------------------------------------
        final String indicador1 = "OREO";
        final String indicador2 = "SOR";
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        String url = "jdbc:mariadb://localhost.3333/";
        String usuario = "root", contraseña = "1234";
        Connection conexion;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.printf("ERROR");
        }
        try {
            conexión = DriverManager.getConnection(url, usuario, contraseña);
            // operaciones CRUD: Create-Read-Update-Delete
            conexion.close()
        } catch (SQLException e) {
            System.out.printf("ERROR");
        }




        Scanner entrada = new Scanner(System.in);
        FileOutputStream ficSal = null;
        BufferedOutputStream ficSalBuf = null;
        DataOutputStream ficSalData = null;
        FileInputStream ficEnt = null;
        BufferedInputStream ficEntBuf = null;
        DataInputStream ficEntData = null;
        String nombre = "fichero.dat";
        String fechaCadena;
        LocalDate fechaLocalDate;
        char cLectura1, cLectura2, cLectura3, cLectura4;
        boolean bComprobacion;
        HashSet<Integer> numeros = new HashSet<>(6);
        Iterator<Integer> iterador;
        int iComprobacion = 0;
        int iNumero;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        try {
            ficSal = new FileOutputStream(nombre);
            ficSalBuf = new BufferedOutputStream(ficSal, 1024);
            ficSalData = new DataOutputStream(ficSalBuf);

            ficSalData.writeUTF(indicador1);
        } catch (IOException e) {
            System.out.printf("\nError al abrir el fichero.");
            System.exit(1);
        }

        System.out.printf("\nFicheros binarios");
        System.out.printf("\n=================\n");
        do {
            bComprobacion = true;
            System.out.printf("\nIntroduce la fecha (AAAA-MM-DD): ");
            fechaCadena = entrada.nextLine();
            try {
                fechaLocalDate = LocalDate.parse(fechaCadena, DateTimeFormatter.ofPattern("uuuu-MM-dd"));
            } catch (Exception e) {
                bComprobacion = false;
            }
            if (fechaCadena.isBlank()){
                System.exit(1);;
            }
        } while (!bComprobacion);
        entrada.close();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        System.out.printf("\nGenerando números de sorteo...");
        for (int q = 0; q < 6; q++) {
            iComprobacion = numeros.size();
            while (numeros.size() > iComprobacion) {
                numeros.add((int) Math.random() * 49 + 1);
            }
        }
        try {
            ficSalData.writeUTF(fechaCadena);
            ficSalData.writeUTF(indicador2);
            iterador = numeros.iterator();
            while (iterador.hasNext()) {
                iNumero = iterador.next();
                ficSalData.writeInt(iNumero);
            }
            ficSalData.writeUTF(indicador2);
        } catch (IOException e) {
            System.out.printf("\nError en la escritura del fichero.");
            System.exit(1);
        }

        try {
            ficSalData.close();
        } catch (IOException error) {
            System.out.printf("\nError al cerrar el fichero.");
            System.exit(1);
        }
        
        System.out.printf("\n\nLectura del archivo");
        System.out.printf("\n===================\n");

        try {
            ficEnt = new FileInputStream(nombre);
            ficEntBuf = new BufferedInputStream(ficEnt);
            ficEntData = new DataInputStream(ficEntBuf);
        } catch (IOException error) {
            System.out.printf("\nError al abrir el fichero.");
            System.exit(1);
        }

        try {
            cLectura1 = ficEntData.readChar();
            cLectura2 = ficEntData.readChar();
            cLectura3 = ficEntData.readChar();
            cLectura4 = ficEntData.readChar();
            if (cLectura1 != 'O' || cLectura2 != 'R' || cLectura3 != 'E' || cLectura4 != 'o') {
                System.out.printf("\nError de formato.");
                System.exit(1);
            }
            ficEntData.skip(20);
            System.out.printf("\n%d, %d, %d, %d, %d, %d", ficEntData.readInt(), ficEntData.readInt(), ficEntData.readInt(), ficEntData.readInt(), ficEntData.readInt(), ficEntData.readInt());
        } catch (IOException e) {
            System.out.printf("\nError al leer el fichero.");
        }
    }
}