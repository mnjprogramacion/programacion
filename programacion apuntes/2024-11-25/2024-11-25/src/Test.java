/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Test {
    private int iValor;
    private String cadena;
    private int iEdad;
    public void setEdad(int iEdad) {

    }
    // Constructor de la clase
    public Test() {
        iValor = 10;
        cadena = "Hola";
    }
    public Test(int iValor2, String cadena2) {
        iValor = iValor2;
        cadena = cadena2;
    }

    // Métodos

    // Método que genera un objeto Empleado
    public Empleado obtenerEmpleado() {
        // Un montón de cosas
        return new Empleado(cadena, iEdad);
    }

    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de constantes 
        //----------------------------------------------

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Test miClase1, miClase2;
        
        // Test miTest = new Test();
        // String cadena = new String("Hola");

        // Test[100] miTest = new Test[100];

        // Test miTest; // No almacena nada todavía, solo está declarado

        /*
        Test miTest = new Test(); // Invoco el primer constructor
        Test miTest2 = new Test(10, "Hola"); // Invoco el segundo constructor
        */

        // Si no se definen constructores, Java los hace automáticamente
        // En cuanto se crea uno, Java se desentiende, se necesitan crear todos los necesario (con y sin parámetros)

        Empleado emp = new Empleado("Pepe", 10000);
        System.out.printf("%s\n", emp.nombre); // No se puede, es una variable privada
        System.out.printf("%s\n", emp.obtenerNombre()); // Así sí. Métodos para acceder a variables privadas
        System.out.printf("%f\n", emp.obtenerSalario());

        String cadena;

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        int[] aEnteros;
        aEnteros = new int[5];
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
    }
}   