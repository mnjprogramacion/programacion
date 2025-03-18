import java.time.LocalDate;
import java.util.Comparator;
import java.util.regex.Pattern;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Cliente implements Comparator<Cliente> {
    //----------------------------------------------
    //       Clase interna
    //----------------------------------------------
    private class Persona {
        // Campos
        private String nombre, apellido1, apellido2;
        private LocalDate fechaNac;
        // Constructor
        public Persona (String nombre, String apellido1, String apellido2, LocalDate fechaNac) {
            this.nombre = nombre;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
            this.fechaNac = fechaNac;
        }
        public String obtenerNombre() { return this.nombre; }
        public String obtenerApellido1() { return this.apellido1; }
        public String obtenerApellido2() { return this.apellido2; }
        public LocalDate obtenerFechNac() { return this.fechaNac; }
    }
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private String dni;
    private Persona persona;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Cliente(String dni, String nombre, String apellido1, String apellido2, String fechaNac) throws Exception {
        LocalDate fecha = LocalDate.parse(fechaNac);
        if (Pattern.matches("[0-9]{8}[a-zA-Z]", dni)) { this.dni = dni; }
        else { throw new Exception("¡El formato del DNI no es válido!"); }
        persona = new Persona(nombre, apellido1, apellido2, fecha);

    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public String obtenerDNI() { return this.dni; }
    public String obtenerNombreCompleto() { return String.format("%s %s, %s",
        this.persona.obtenerApellido1(), this.persona.obtenerApellido2(), this.persona.obtenerNombre()); }
    public LocalDate obtenerFechaNac() { return this.persona.obtenerFechNac(); }

    public static boolean verificaDNI(String dni) {
        if (Pattern.matches("[0-9]{8}[a-zA-Z]", dni)) { return true; }
        else { return false; }
    }

        public static boolean validarFechaNac(String fechaNac) {
            try {
                LocalDate.parse(fechaNac);
                return true;
            } catch (Exception e) {} { return false; }
        }

        @Override
        public int compare(Cliente o1, Cliente o2) {
            return o1.dni.compareTo(o2.dni);
        }
}