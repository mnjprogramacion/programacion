/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class SubClase extends SuperClase {
    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    // Los constructores nunca se heredan
    // super. para referirse a un valor de la superclase
    public SubClase() {
        super();
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    // Override para volver a definir un método ya presente en la superclase
    // Mismo nombre, mismas variables en parentesis, pero funciona distinto
    @Override
    public void miMetodo() {
        // Hago cualquier cosa
        iValor = 10;
    }

    public void miMetodo(int iValor) {
        // Hago cualquier cosa
        iValor = 10;
    }

    public void miMetodo(String cadena) {

    }
}