import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica005c {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        String cadenaOriginal;
        String cadenaNueva;
        String cadenaCaracterASustituir;
        String cadenaCaracterSustituto;
        char cCaracterASustituir;
        char cCaracterSustituto;
        char cCaracterBufer;
        int iNumeroDeSustituciones;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("Intercambiador de caracteres\n");
        System.out.printf("============================\n\n");
        System.out.printf("Introduce una cadena de texto:\n");
        cadenaOriginal = entrada.nextLine().trim();

        if (cadenaOriginal != "") {
            iNumeroDeSustituciones = 0;

            do {
                iNumeroDeSustituciones = 0;
                System.out.printf("\nIntroduce el carácter a sustituir: ");
                cadenaCaracterASustituir = entrada.nextLine().trim();
                cCaracterASustituir = cadenaCaracterASustituir.charAt(0);

                if (cadenaCaracterASustituir.equals("0")) {
                    break;
                }

                System.out.printf("\nIntroduce el carácter sustituto: ");
                cadenaCaracterSustituto = entrada.nextLine().trim();

                //----------------------------------------------
                //       Procesamiento + Salida de Resultados
                //----------------------------------------------

                cCaracterSustituto = cadenaCaracterSustituto.charAt(0);
                cadenaNueva = "";
                for (int q = 0; q < cadenaOriginal.length(); q++) {
                    cCaracterBufer  = cadenaOriginal.charAt(q);
                    if (cCaracterBufer == cCaracterASustituir) {
                        cCaracterBufer = cCaracterSustituto;
                        iNumeroDeSustituciones++;
                    }
                    cadenaNueva += cCaracterBufer;
                }

                cadenaOriginal = cadenaNueva;

            
                System.out.printf("\nCadena nueva: %s\nNumero de sustituciones: %d\n", cadenaOriginal, iNumeroDeSustituciones);
            } while (cCaracterASustituir != '0');
        }
        entrada.close();
    }
}