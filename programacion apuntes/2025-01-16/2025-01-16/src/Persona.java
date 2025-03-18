import java.io.IOException;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Persona {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private String nombre;
    private int iEdad;
    private boolean bError;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------

    /*
    public Persona(String nombre, int iEdad) {
        this.nombre = nombre;
        if (iEdad < 0) {
            this.iEdad = 0;
            this.bError = true;
        } else {
            this.iEdad = iEdad;
            this.bError = false;
        }
    }
    */

    /*
    public Persona(String nombre, int iEdad) throws Exception {
        this.nombre = nombre;
        if (iEdad < 0) {
            throw new Exception("La edad no es correcta.");
        } else {
            this.iEdad = iEdad;
            this.bError = false;
        }
    }
    */

    
    public Persona(String nombre, int iEdad) throws IOException {
        this.nombre = nombre;
        if (iEdad < 0) {
            throw new IOException("La edad no es correcta.");
        } else {
            this.iEdad = iEdad;
            this.bError = false;
        }
    }

    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public boolean hayError() {
        return this.bError;
    }
}