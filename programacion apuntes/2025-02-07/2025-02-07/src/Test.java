import java.util.Arrays;
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
        Cliente[] aClientes = new Cliente[2];
        Vector<Cliente> lista = new Vector<>(5);
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        try {
            aClientes[0] = new Cliente("10101010A", "Andrea", "Perez", "Ruiz", "2000-01-01");
            aClientes[1] = new Cliente("20202020A", "Jesus", "Sanchez", "Perandres", "2000-01-01");
        } catch (Exception e) { System.out.printf("ERROR INTERNO"); }
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        Arrays.sort(aClientes, aClientes[0]);
        for (int q = 0; q < aClientes.length; q++) {
            System.out.printf("DNI: %s\n", aClientes[q].obtenerDNI());
        }
    }
}