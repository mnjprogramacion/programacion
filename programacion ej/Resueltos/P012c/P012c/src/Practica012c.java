import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica012c {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de constantes
        //----------------------------------------------
        final String[] aLISTANOMBRES = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
        final int[] aLISTANUMEROS = {1, 2, 3, 4, 5, 6};
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        Vector<Producto> lista = new Vector<>(aLISTANOMBRES.length);
        Iterator<Producto> iterador;
        Producto prod;
        String lectura;
        int iValor;
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        for (int q = 0; q < aLISTANOMBRES.length; q++) {
            lista.add(new Producto(aLISTANUMEROS[q], aLISTANOMBRES[q]));
        }

        // Orden decreciente
        // Clase en línea != clase interna (las que se definen encima de la clase main)
        lista.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                if (o1.obtenerNumero() == o1.obtenerNumero()) { return 0; }
                else {
                    if (o1.obtenerNumero() < o1.obtenerNumero()) { return 1; }
                    else { return -1; }
                }
            }
            
        });

        iterador = lista.iterator();
        while(iterador.hasNext()) {
            prod = iterador.next();
            System.out.printf("\nNombre: %s / Número: %d / Valor: %.2f",
                prod.obtenerNombre(), prod.obtenerNumero(), prod.obtenerResultado());
        }
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        System.out.printf("\nBúsqueda de valores:\n");
        do {
            System.out.printf("\tDame el número a buscar: ");
            lectura = entrada.nextLine();
            try {
                iValor = Integer.valueOf(lectura);
                if (iValor == 0) { break; }
                else {
                    if (lista.contains(new Producto(iValor, "test"))) {
                        System.out.printf("\t\t¡El valor está en la lista!\n");
                    } else {
                        System.out.printf("\t\t¡El valor NO está en la lista!\n");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.printf("\t\t¡Se pide un número!\n");
            }
        } while (true);
        entrada.close();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        iterador = lista.iterator();
        iValor = 1;

        while (iterador.hasNext()) {
            prod = iterador.next();
            if (iValor == 3 || iValor == 4) { iterador.remove(); }
            iValor++;
        }

        // Mismo bucle que antes pero hecho con for
        /*
        for (iValor = 1; iterador.hasNext(); iValor++) {
            prod = iterador.next();
            if (iValor == 3 || iValor == 4) { iterador.remove(); }
        }
        */

        lista.add(2, new Producto(7, "siete"));

        while(iterador.hasNext()) {
            prod = iterador.next();
            System.out.printf("\nNombre: %s / Número: %d / Valor: %.2f",
                prod.obtenerNombre(), prod.obtenerNumero(), prod.obtenerResultado());
        }
    }
}