import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Plantilla {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner (System.in);
        String cadena;
        LocalDate fecha;
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        System.out.printf("Dame una fecha (DD-MM-YYYY)");
        cadena = entrada.nextLine();
        assert cadena != null : "No esperaba que la cadena fuera distinta de null";
        fecha = LocalDate.parse(cadena, formateador);
        entrada.close();
    }

    /*
    public static void A() throws Exception {
        throw new Exception();
    }

    public static void B() {
        try { A(); } catch (Exception e) {}
    }
    */
}