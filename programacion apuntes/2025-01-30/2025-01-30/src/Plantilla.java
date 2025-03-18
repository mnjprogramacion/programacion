import java.time.LocalDate;

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
        //     Declaración de constantes
        //----------------------------------------------
        final String[] aMESES = {"Enero", "Febrero"};
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.of(1970, 1, 1);
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        System.out.printf("El año es: %d\n", fecha.getYear());
        System.out.printf("El mes es: %s\n", aMESES[fecha.getMonthValue()-1]);
        System.out.printf("El día es: %d\n", fecha.getDayOfMonth());
        fecha = fecha.plusDays(3);
        System.out.printf("El año es: %d\n", fecha.getYear());
        System.out.printf("El mes es: %d\n", fecha.getMonthValue());
        System.out.printf("El día es: %d\n", fecha.getDayOfMonth());
        if (fecha.compareTo(fecha2) == 0) {

        }

    }
}