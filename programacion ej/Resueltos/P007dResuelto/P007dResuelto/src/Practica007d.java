/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica007d{
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Primo []aPrimo;
        int iNumPrimos;
        Scanner entrada = new Scanner(System.in);
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        System.out.printf("Dime el número de primos que necesitas: ");
        do {
            try (
                iNumPrimos = entrada.nextInt();
                if (iNumPrimos > 0 && iNumPrimos < 20) {
                    break;
                
            } catch (Exception e) {
                entrada.nextLine();
            }
        }
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        aPrimos
    }
}