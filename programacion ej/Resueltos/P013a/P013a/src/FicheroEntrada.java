import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class FicheroEntrada {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private FileReader ficLec;
    private BufferedReader ficBufLec = null;
    private String cadena;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public FicheroEntrada(ErrorES error, String nombre) {
        File fichero = new File(nombre);
        try {
            this.ficLec = new FileReader(fichero, Charset.forName("UTF-8"));
            this.ficBufLec = new BufferedReader(ficLec, 1024);
        } catch (Exception e) {
            error.cambiarCodigo(1);
        }
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public String obtenerCadena() {
        return this.cadena;
    }
    public void leerLinea(ErrorES error) {
        try {
            cadena = ficBufLec.readLine();
        } catch (Exception e) {
            error.cambiarCodigo(3);
        }
    }
    public void cerrarArchivo(ErrorES error) {
        try {
            this.ficBufLec.close();
            this.ficLec = null;
            this.ficBufLec = null;
        } catch (Exception e) {
            error.cambiarCodigo(5);
        }
    }
}