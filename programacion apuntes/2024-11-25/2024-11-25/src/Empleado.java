// Fichero Empleado,java
public class Empleado {
    private String nombre;
    private double dSalario;
    // Constructores
    public Empleado(String nom, double dSal) {
        nombre = nom;
        dSalario = dSal;
    }
    // Métodos
    public String obtenerNombre() {
        return nombre;
    }
    public double obtenerSalario() {
        return dSalario;
    }
}