import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Test {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        HashMap<String, String> mapa = new HashMap<>();
        Collection<String> coleccion;
        ArrayList<String> lista;
        Vector<String> vector;

        mapa.put("Gato", "Animal mamifero...");
        mapa.put("Gato", "Hay que cortarle las uñas...");
        mapa.put("Perro", "Animal doméstico...");

        System.out.printf("%s\n", mapa.get("Gato"));
        coleccion = mapa.values();
        lista = new ArrayList<>(coleccion);
        vector = new Vector<>(coleccion);
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        
    }
}