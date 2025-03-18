import java.util.*;

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
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        ArrayList<String> lista = new ArrayList<>(10);
        Vector<String> lista2 = new Vector<>(10);
        Iterator<String> iterador;
        String cadena;
        int iValor = 1;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista2.add("Uno");

        iterador = lista.iterator();
        while (iterador.hasNext()) {
            cadena = iterador.next();
            if (iValor++ % 2 == 0) { iterador.remove(); };
            System.out.printf("%s\n", cadena);
        }

        System.out.printf("\n");
        iterador = lista.iterator();
        while (iterador.hasNext()) {
            cadena = iterador.next();
            System.out.printf("%s\n", cadena);
        }
    }
}