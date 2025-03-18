/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Test {
    //----------------------------------------------
    //     Declaración de campos constantes
    //----------------------------------------------
    // Campos constantes, generalmente públicos
    public final double dNUMEROE = 2.42;
    //----------------------------------------------
    //     Declaración de campos
    //----------------------------------------------
    // Campos variables, generalmente privados
    private int iValor;
    //----------------------------------------------
    //     Declaración de constructores
    //----------------------------------------------
    // Constructores generalmente públicos, privados si sólo queremos crearlos en el mismo archivo
    public Test() {
        System.out.printf("Hola\n");
        this.iValor = 20;

    }
    //----------------------------------------------
    //     Declaración de métodos
    //----------------------------------------------
    private void soporte() {
        
    }
    public void miMetodo(int iValor) {
        // this.variable para referirse a los valores de los campos
        Test ej1 = new Test();
        
        System.out.printf("%d\n", this.iValor);
    }

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
        String cadena = new String("Hola");
        Test ej = new Test();
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
    }
}