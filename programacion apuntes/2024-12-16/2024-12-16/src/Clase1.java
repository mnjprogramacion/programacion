/**
 *
 * @author XXXX
 * @version XXX
 */
public class Clase1 {
    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private static int iMiCampo = 10;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Clase1() {
        int iVar = Clase1.iMiCampo;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    static {
        Clase1.iMiCampo = 10 * 20 +20;
        Clase1.iMiCampo = Clase1.iMiCampo = (int) Math.random();
    }
}