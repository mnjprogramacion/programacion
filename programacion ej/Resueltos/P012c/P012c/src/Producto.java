import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Producto implements ProductoInt {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private int iValor;
    private String nombre;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Producto(int iValor, String nombre) {
        this.iValor = iValor;
        this.nombre = nombre;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    @Override
    public int obtenerNumero() { return this.iValor; }
    @Override
    public String obtenerNombre() { return this.nombre; }
    @Override
    public double obtenerResultado() { return this.iValor * ProductoInt.dEULER; }
    @Override
    public boolean equals(Object prod) {
        if (this == prod) { return true; }
        if (this == null || this.getClass() != prod.getClass()) { return false; }
        if (this.iValor == ((Producto) prod).iValor) { return true; }
        else { return false; }
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.iValor, this.nombre);
    }
}