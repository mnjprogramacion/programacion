/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Hija extends Padre {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    //Padre clasePadre;
    
    private int iCampo3;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    /*
    public Hija() {
        this.clasePadre = new Padre();
        this.clasePadre.iValor = 10;
        super.iValor = 10;
    }
    */

    public Hija(int iCampo1, int iCampo2, int iCampo3) {
        super(iCampo1, iCampo2);
        this.iCampo3 = iCampo3;
        System.out.printf("Constructor hija\n");
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public int obtenerCampo3() {
        return this.iCampo3;
    }
}