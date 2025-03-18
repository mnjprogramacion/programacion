import java.io.*;
import java.nio.charset.Charset;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class LecturaFich {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private File fichero;
    private FileReader fichLect;
    private BufferedReader fichLectBuf;

    private FileInputStream fichLectStream;
    private BufferedInputStream fichLectStreamBuf;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public LecturaFich(String nombre) {
        this.fichero = new File(nombre);
        this.fichLect = null; this.fichLectBuf = null;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public void abrirFichero() throws Exception {
        if (this.fichLectBuf != null) { throw new Exception("ERROR 1"); }
        else {
            try {
                this.fichLect = new FileReader(this.fichero, Charset.forName("UTF-8"));
                this.fichLectBuf = new BufferedReader(fichLect, 2048);
            } catch (IOException e) { throw new Exception("ERROR 1", e); }
        }

        if (this.fichLectBuf != null) { throw new Exception("ERROR 1"); }
        else {
            try {
                this.fichLectStream = new FileInputStream(this.fichero);
                this.fichLectStreamBuf = new BufferedInputStream(fichLectStream);
            } catch (IOException e) { throw new Exception("ERROR 1", e); }
        }
    }
    public String leerFichero() throws Exception {
        try {
            return this.fichLectBuf.readLine();
        } catch (IOException e) { throw new Exception("ERROR 2"); }
    }
    public void cerrarFichero() throws Exception {
        try {
            this.fichLectBuf.close();
        } catch (IOException e) { throw new Exception("ERROR 3"); }
    }
}