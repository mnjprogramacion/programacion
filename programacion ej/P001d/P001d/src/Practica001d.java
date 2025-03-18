/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica001d {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de constantes 
        //----------------------------------------------
        enum eDiasSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        System.out.println("Días de la semana");
        System.out.println("=================");
        System.out.println(eDiasSemana.LUNES);
        System.out.println(eDiasSemana.MARTES);
        System.out.println(eDiasSemana.MIERCOLES);
        System.out.println(eDiasSemana.JUEVES);
        System.out.println(eDiasSemana.VIERNES);
        System.out.println(eDiasSemana.SABADO);
        System.out.println(eDiasSemana.DOMINGO);
    }
}