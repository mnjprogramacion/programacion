/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Almacen<T extends Number> {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private T listaDeCosas;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Almacen(T valor) {
        this.listaDeCosas = valor;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public T consultor() { return this.listaDeCosas; }
}