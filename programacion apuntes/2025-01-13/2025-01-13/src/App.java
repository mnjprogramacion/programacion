/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class App {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {

        /*
            Herencia
                Nos permite usar los datos de la superclase en una subclase.
                Se extiende la superclase para añadir mas cosas que la superclase no necesita y evitas crear copias vacias.
                Se usa extends.

            Subclase
                Para crear una superclase añadimos extends y el nombre de la superclase para crearla
                para hacer referencia a los valores de la superclase pondremos super. así como this. cuando es de la misma clase.
                los constructores nunca se heredan. Siempre se tiene que invocar al constructor de la clase padre para llamar al constructor de la subclase. Haciendo referencia con la palabra super.
        */

        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Padre clasePadre = new Padre();
        Hija claseHija= new Hija();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        /*
        clasePadre.iValor = 10;
        // clasePedro.saludo();
        */

        clasePadre.obtenerCampo1();
        clasePadre.obtenerCampo3();
        claseHija.obtenerCampo1();
        claseHija.obtenerCampo3();
    }
}