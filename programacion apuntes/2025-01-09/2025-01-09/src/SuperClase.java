/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class SuperClase {
    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    // public lo ve todo el mundo
    // protected solo lo ven las clases que heredan (subclases)
    // private no lo ve nadie
    protected int iValor;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public SuperClase() {
        this.iValor = 10;
    }

    public SuperClase(int iValor) {
        this();
        this.iValor = iValor;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    // public final void para que la subclase no pueda hacer override
    public void miMetodo() {
        // No hago nada
    }
}