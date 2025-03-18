import java.util.Objects;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Persona {
    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private String dni;
    private String nombre;
    private String apellidos;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    @Override
    public boolean equals (Object obj) {
        Persona conversor;
        if (this == obj) { return true; }
        if (this == null || this.getClass() == obj.getClass()) { return false; }
        conversor = (Persona) obj;
        return true;
    }

    /*
    @Override
    public int hashCode() {
        return 1;
    }
    */

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellidos);
    }
}