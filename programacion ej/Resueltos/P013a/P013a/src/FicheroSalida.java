import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class FicheroSalida {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private FileWriter ficEsc;
    private BufferedWriter ficBufEsc = null;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public FicheroSalida(ErrorES error, String nombre) {
        File fichero = new File(nombre);
        try {
            this.ficEsc = new FileWriter(fichero, Charset.forName("UTF-8"), false);
            this.ficBufEsc = new BufferedWriter(ficEsc);
        } catch (Exception e) {
            error.cambiarCodigo(2);
        }
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public void abrirArchivo() {

    }
    public void escribirLinea(ErrorES error, String cadena) {
        try {
            ficBufEsc.write(cadena, 0, cadena.length());
            ficBufEsc.newLine();
        } catch (Exception e) {
            error.cambiarCodigo(4);
        }
    }
    public void cerrarArchivo(ErrorES error) {
        try {
            this.ficBufEsc.close();
        } catch (Exception e) {
            error.cambiarCodigo(5);
        }
    }
}