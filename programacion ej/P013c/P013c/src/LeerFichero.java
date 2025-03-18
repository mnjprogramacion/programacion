import java.io.*;
import java.nio.charset.Charset;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class LeerFichero {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private File fichero;
    private FileReader ficLec = null;
    private BufferedReader ficLecBuf = null;
    private int iTipoError;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public LeerFichero(String nombre) {
        try {
            this.fichero = new File(nombre);
            this.ficLec = new FileReader(fichero, Charset.forName("UTF-8"));
            this.ficLecBuf = new BufferedReader(ficLec, 1024);
        } catch (Exception e) {
            this.iTipoError = 1;
        }
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public boolean procesaLinea(Contabilidad contabilidad) {
        try {
            contabilidad.cuenta(ficLecBuf.readLine());
            return true;
        } catch (Exception e) {
            this.iTipoError = 2;
            return false;
        }
    }
    public void cerrarFichero() {
        try {
            ficLecBuf.close();
            ficLec = null;
            ficLecBuf = null;
        } catch (Exception e) {
            this.iTipoError = 3;
        }
    }
    public int obtenerEstado() { return this.iTipoError; }
}