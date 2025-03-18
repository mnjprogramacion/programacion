/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class Practica013c {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Contabilidad contabilidad;
        LeerFichero leerFichero;
        EscribirFichero escribirFichero;
        String ficheroLec = "quijote.txt";
        String ficheroEsc = "nuevo.txt";
        String error = "Error de fichero, finalizando el programa...";
        boolean bBucle;
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        contabilidad = new Contabilidad();
        leerFichero = new LeerFichero(ficheroLec);
        if (leerFichero.obtenerEstado() != 0) {
            System.out.printf("\n%s", error);
            System.exit(1);
        }
        escribirFichero = new EscribirFichero(ficheroEsc);
        if (escribirFichero.obtenerEstado() != 0) {
            System.out.printf("\n%s", error);
            System.exit(1);
        }

        System.out.printf("\nNombre del fichero de lectura: %s", ficheroLec);
        System.out.printf("\nNombre del fichero de escritura: %s", ficheroEsc);

        do {
            bBucle = leerFichero.procesaLinea(contabilidad);
            if (bBucle == false) {
                break;
            }
            if (leerFichero.obtenerEstado() != 0) {
                System.out.printf("\n%s", error);
                System.exit(1);
            }
        } while (bBucle == true);

        escribirFichero.generaResultados(contabilidad.resultado());
        if (escribirFichero.obtenerEstado() != 0) {
            System.out.printf("\n%s", error);
            System.exit(1);
        }
        
        leerFichero.cerrarFichero();
        if (leerFichero.obtenerEstado() == 3) {
            System.out.printf("\n%s", error);
            System.exit(1);
        }
        escribirFichero.cerrarFichero();
        if (leerFichero.obtenerEstado() == 3) {
            System.out.printf("\n%s", error);
            System.exit(1);
        }

        System.out.printf("\n\nResumen de resultados:");
        System.out.printf("\n======================\n");
        System.out.printf("\nVocal A: %d", contabilidad.resultado()[0]);
        System.out.printf("\nVocal E: %d", contabilidad.resultado()[1]);
        System.out.printf("\nVocal I: %d", contabilidad.resultado()[2]);
        System.out.printf("\nVocal O: %d", contabilidad.resultado()[3]);
        System.out.printf("\nVocal U: %d", contabilidad.resultado()[4]);
        System.out.printf("\nOtras: %d", contabilidad.resultado()[5]);
    }
}