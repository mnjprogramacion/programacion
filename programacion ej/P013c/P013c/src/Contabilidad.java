/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class Contabilidad {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private int[] aValores;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Contabilidad() {
        this.aValores = new int[6];
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public void cuenta(String cadena) {
        char caracter;
        for (int q = 0; q < cadena.length(); q++) {
            caracter = cadena.charAt(q);
            switch (caracter) {
                case ('a'):
                    aValores[0]++;
                    break;
                case 'e':
                    aValores[1]++;
                    break;
                case 'i':
                    aValores[2]++;
                    break;
                case 'o':
                    aValores[3]++;
                    break;
                case 'u':
                    aValores[4]++;
                    break;
                default:
                    aValores[5]++;
                    break;
            }
        }
    }
    public void resetea() {
        aValores = new int[6];
    }
    public int[] resultado() {
        return this.aValores;
    }
}