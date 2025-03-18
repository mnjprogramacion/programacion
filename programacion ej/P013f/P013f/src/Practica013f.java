import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica013f {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = null;
        String dni = "", nombre;
        int anno = 0, mes = 0, dia = 0;
        boolean checkAnno, checkMes, checkDia;
        File fichero;
        ObjectOutputStream fichObjOut = null;
        ObjectInputStream fichObjIn = null;
        int conteoClientes = 1;

        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        fichero = new File("cliente.dat");
        try {
            fichObjOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fichero), 1024));
        } catch (IOException e) {
            System.out.printf("\nERROR: creación del fichero.");
            System.exit(1);
        }

        System.out.printf("\n\nSerialización");
        System.out.printf("\n=============\n");

        do {
            // Introduce DNI
            do {
                System.out.printf("\nIntroduce el DNI: ");
                dni = entrada.nextLine();
                if (dni.isBlank()) { break; }
                if (!Cliente.comprobarDNI(dni)) {
                    System.out.printf("\nDNI incorrecto, vuelve a intentarlo:\n");
                }
            } while (!Cliente.comprobarDNI(dni));
            if (dni.isBlank()) { break; }

            // Introduce nombre
            System.out.printf("Introduce el nombre: ");
            nombre = entrada.nextLine();

            // Introduce año
            do {
                System.out.printf("Introduce el año de nacimiento: ");
                try {
                    anno = entrada.nextInt();
                    entrada.nextLine();
                    checkAnno = true;
                } catch (Exception e) {
                    System.out.printf("\nValor incorrecto, introduce un número entero.\n");
                    entrada.nextLine();
                    checkAnno = false;
                }
            } while (!checkAnno);

            // Introduce mes
            do {
                System.out.printf("Introduce el mes de nacimiento: ");
                try {
                    mes = entrada.nextInt();
                    entrada.nextLine();
                    checkMes = true;
                } catch (Exception e) {
                    System.out.printf("\nValor incorrecto, introduce un número entero.\n");
                    entrada.nextLine();
                    checkMes = false;
                }
            } while (!checkMes);

            // Introduce día
            do {
                System.out.printf("Introduce el dia de nacimiento: ");
                try {
                    dia = entrada.nextInt();
                    entrada.nextLine();
                    checkDia = true;
                } catch (Exception e) {
                    System.out.printf("\nValor incorrecto, introduce un número entero.\n");
                    entrada.nextLine();
                    checkDia = false;
                }
            } while (!checkDia);

            try {
                cliente = new Cliente(dni, nombre, anno, mes, dia);
            } catch (Exception e) {
                System.out.printf("\nERROR: creación de objeto.");
            }
        
            try {
                fichObjOut.writeObject(cliente);
            } catch (IOException e) {
                System.out.printf("\nERROR: escritura en el archivo.");
                System.exit(1);
            }
            
        } while (!dni.isBlank());
        entrada.close();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        try {
            fichObjOut.close();
        } catch (IOException e) {
            System.out.printf("\nERROR: cerrado del archivo.");
            System.exit(1);
        }

        System.out.printf("\n\nLectura del archivo.");
        System.out.printf("\n====================\n");

        try {
            fichObjIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fichero), 1024));
            do {
                try {
                    cliente = (Cliente) fichObjIn.readObject();
                } catch (EOFException e) { break; }
                catch (Exception e) {
                    System.out.printf("\nERROR: entrada y salida.");
                    System.exit(1);;
                }
                System.out.printf("\nCliente %d", conteoClientes);
                System.out.printf("\n\tDNI: %s", cliente.obtenerDNI());
                System.out.printf("\n\tNombre: %s", cliente.obtenerNombre());
                System.out.printf("\n\tFecha de nacimiento: %s\n", cliente.obtenerFechaNac());
                conteoClientes++;
            } while (true);
        } catch (IOException e) {
            System.out.printf("\nERROR: apertura del archivo.");
            System.exit(1);
        }

        try {
            fichObjIn.close();
        } catch (IOException e) {
            System.out.printf("\nERROR: cerrado del archivo.");
            System.exit(1);
        }
    }
}