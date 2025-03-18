import java.io.Serializable;
import java.util.regex.Pattern;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Cliente implements Serializable {
    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------
    private static final long serialVersionID = 1234567L;
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private String dni;
    private String nombre;
    private String fechaNac;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Cliente(String dni, String nombre, int anno, int mes, int dia) throws Exception {
        if (!Pattern.matches("[0-9]{8}[A-Z]", dni)) {
            throw new Exception("ERROR: dni inválido.");
        }
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = String.format("%04d-%02d-%02d", anno, mes, dia);
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public String obtenerDNI() { return this.dni; }
    public String obtenerNombre() { return this.nombre; }
    public String obtenerFechaNac() { return this.fechaNac; }
    public static boolean comprobarDNI(String dni) {
        if (!Pattern.matches("[0-9]{8}[A-Z]", dni)) { return false; }
        else { return true; }
    }
}