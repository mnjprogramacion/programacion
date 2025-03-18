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
        /*
        Calendario cal;
        Calendario cal1 = new Calendario(); // Abstracta, no se puede
        */
        Calendario cal1 = new Calendario(-10);

        MisReglas variable = cal1; // Puedo almacenar un calendario porque sigue las reglas
        Calendario.Semana sem = cal1.new Semana(10);

        Calendario cal2 = new Calendario(20);
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        if (cal1.compare(cal1, cal2) == 0) {};
    }
}