/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class Practica013a {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        ErrorES error = new ErrorES();

        System.out.printf("Mezclador de ficheros:\n");
        System.out.printf("======================\n");
        System.out.printf("Abriendo ficheros fuente...\n");

        FicheroEntrada ficheroEntrada1 = new FicheroEntrada(error, "fichero1.txt");
        FicheroEntrada ficheroEntrada2 = new FicheroEntrada(error, "fichero2.txt");
        if (error.obtenerCodigo() != 0) { System.out.printf("\t%s\n", error.obtenerMensaje()); System.exit(1); }
        FicheroSalida ficheroSalida = new FicheroSalida(error, "ficheroS.txt");
        if (error.obtenerCodigo() != 0) { System.out.printf("\t%s\n", error.obtenerMensaje()); System.exit(1); }
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        System.out.printf("Procesando ficheros...\n");

        do {
            ficheroEntrada1.leerLinea(error);
            if (ficheroEntrada1.obtenerCadena() != null) {
                ficheroSalida.escribirLinea(error, ficheroEntrada1.obtenerCadena());
                if (error.obtenerCodigo() != 0) { System.out.printf("\t%s\n", error.obtenerMensaje()); break; }
            }
            ficheroEntrada2.leerLinea(error);
            if (ficheroEntrada2.obtenerCadena() != null) {
                ficheroSalida.escribirLinea(error, ficheroEntrada2.obtenerCadena());
                if (error.obtenerCodigo() != 0) { System.out.printf("\t%s\n", error.obtenerMensaje()); break; }
            }
        } while (ficheroEntrada1.obtenerCadena() != null || ficheroEntrada2.obtenerCadena() != null);
        
        ficheroEntrada1.cerrarArchivo(error);
        ficheroEntrada2.cerrarArchivo(error);
        ficheroSalida.cerrarArchivo(error);
        if (error.obtenerCodigo() != 0) { System.out.printf("\t%s\n", error.obtenerMensaje()); System.exit(1); }
    }
}