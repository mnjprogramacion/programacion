import javax.crypto.AEADBadTagException;

/**
 *
 * @author XXXX
 * @version XX
 */
public class Test {
    //----------------------------------------------
    //     Declaración de campos constantes
    //----------------------------------------------

    // En caso de usar array bidimensional, usar array de cadenas para la salida.
    // private final String[] aSALIDAS = {"Seno: ", "aCoseno: ", "aTangente: "};

    //----------------------------------------------
    //     Declaración de campos
    //----------------------------------------------

    // Array bidimensional para evitar repetir código
    // private double[][] aValores;

    private double[] aSeno, aCoseno, aTangente;

    //----------------------------------------------
    //     Declaración de constructores
    //----------------------------------------------

    //----------------------------------------------
    //     Declaración de métodos
    //----------------------------------------------
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de constantes
        //----------------------------------------------

        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Test app = new Test();
        int iAngulo = 40;
        double dRadianes;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        app.aSeno = new double[iAngulo/10 + 1];
        app.aCoseno = new double[iAngulo/10 + 1];
        app.aTangente = new double[iAngulo/10 + 1];

        for (int q = 0, w = 0; q < iAngulo; q += 10, w++) {
            dRadianes = Math.toRadians(q);
            app.aSeno[w] = Math.sin(dRadianes);
            app.aCoseno[w] = Math.sin(dRadianes);
            if (app.aCoseno[w] == 0) {
                app.aTangente[w] = 0;
            } else {
                app.aTangente[w] = app.aSeno[w] / app.aCoseno[w];
            }
        }

        System.out.printf("\nSeno: ");
        for (int q = 0; q < app.aSeno.length; q++) {
            System.out.printf("%.2f ", app.aSeno[q]);
        }

        System.out.printf("\n\nCoseno: ");
        for (int q = 0; q < app.aSeno.length; q++) {
            System.out.printf("%.2f ", app.aCoseno[q]);
        }

        System.out.printf("\n\nTangente: ");
        for (int q = 0; q < app.aSeno.length; q++) {
            System.out.printf("%.2f ", app.aTangente[q]);
        }
    }
}