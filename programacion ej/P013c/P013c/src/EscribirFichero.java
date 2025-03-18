import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class EscribirFichero {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private File fichero;
    private FileWriter ficEsc = null;
    private BufferedWriter ficEscBuf = null;
    private int iTipoError;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public EscribirFichero(String nombre) {
        try {
            this.fichero = new File(nombre);
            this.ficEsc = new FileWriter(fichero);
            this.ficEscBuf = new BufferedWriter(ficEsc);
        } catch (Exception e) {
            this.iTipoError = 1;
        }
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public void generaResultados(int[] aValores) {
        String cadena = String.format("Resumen de resultados:\n======================\n\nVocal A: %d\nVocal E: %d\nVocal I: %d\nVocal O: %d\nVocal U: %d\nOtras: %d", aValores[0], aValores[1], aValores[2], aValores[3], aValores[4], aValores[5]);
        try {
            ficEscBuf.write(cadena);
        } catch (Exception e) {
            this.iTipoError = 2;
        }
    }
    public void cerrarFichero() {
        try {
            ficEscBuf.close();
            ficEsc = null;
            ficEscBuf = null;
        } catch (Exception e) {
            this.iTipoError = 3;
        }
    }
    public int obtenerEstado() { return this.iTipoError; }
}