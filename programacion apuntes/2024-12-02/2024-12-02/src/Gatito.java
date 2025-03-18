/**
 *
 * @author XXXX
 * @version XX
 */
public class Gatito {
    //----------------------------------------------
    //     Declaración de campos constantes
    //----------------------------------------------

    //----------------------------------------------
    //     Declaración de campos
    //----------------------------------------------
    private String nombre;
    private int añoNacimiento;
    //----------------------------------------------
    //     Declaración de constructores
    //----------------------------------------------

    public Gatito () {
        this.nombre = "Sin nombre";
        this.añoNacimiento = 2024;
    }

    // this.variable hace referencia al campo, el siguiente es el parámetro

    public Gatito (String nombre, int añoNacimiento) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
    }

    /* Alternativa
    public Gatito (String nombre, int añoNacimiento) {
        if (nombre.isEmpty()) {
            this.nombre = "Sin nombre";
        } else {
            this.nombre = "Nombre";
        }

        if (añoNacimiento.isEmpty()) {
            this.añoNacimiento = 2024;
        } else {
            this.añoNacimiento = añoNacimiento;
        }
    }
    */
    //----------------------------------------------
    //     Declaración de métodos
    //----------------------------------------------
    public String obtenerNombre() {
        return "¡" +  this.nombre + "!";
    }

    public int obtenerAñoNacimiento() {
        return this.añoNacimiento;
    }

    public void establecerAñoNacimiento(int año) {
        if (año < 0) {
            this.añoNacimiento = 2024;
        } else {
            this.añoNacimiento = año;
        }
    }
}