/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Padre{
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    protected int iValor;
    private int iCampo1, iCampo2;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Padre(int iCampo1, int iCampo2) {
        System.out.printf("Constructor padre\n");
        this.iCampo1 = iCampo1;
        this.iCampo2 = iCampo2;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    /*
    public void saludo() {
        System.out.printf("Hola\n");
    }
    */

    public int obtenerCampo1() {
        return this.iCampo1;
    }

    public int obtenerCampo2() {
        return this.iCampo2;
    }
}