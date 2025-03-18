import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class test {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        String cadenaUsuario;
        StringBuilder cadenaOriginalFormato = new StringBuilder("");
        StringBuilder cadenaInversaFormato = new StringBuilder("");
        char[] aCaracteresOriginal;
        char[] aCaracteresInverso;
        char cCaracterTemporal;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("\nInvirtiendo una cadena usando un «array»");
        System.out.printf("\n========================================\n");
        System.out.printf("\nIntroduce una cadena: ");
        cadenaUsuario = entrada.nextLine().trim();

        entrada.close();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        aCaracteresOriginal = new char[cadenaUsuario.length()];
        for (int q = 0; q < cadenaUsuario.length(); q++) {
            cCaracterTemporal = cadenaUsuario.charAt(q);
            aCaracteresOriginal[q] = cCaracterTemporal;
        }

        
        aCaracteresInverso = new char[aCaracteresOriginal.length];
        for (int i = 0; i < aCaracteresOriginal.length; i++) {
            aCaracteresInverso[aCaracteresOriginal.length - i - 1] = aCaracteresOriginal[i];
        }
        
        for (int p = 0; p < aCaracteresOriginal.length; p++) {
            cadenaOriginalFormato.append("'");
            cadenaOriginalFormato.append(aCaracteresOriginal[p]);
            cadenaOriginalFormato.append("'");
            if (p < aCaracteresOriginal.length - 1) {
                cadenaOriginalFormato.append(", ");
            }
        }
        System.out.printf("\nCadena original: %s", cadenaOriginalFormato);

        for (int r = 0; r < aCaracteresInverso.length; r++) {
            cadenaInversaFormato.append("'");
            cadenaInversaFormato.append(aCaracteresInverso[r]);
            cadenaInversaFormato.append("'");
            if (r < aCaracteresInverso.length - 1) {
                cadenaInversaFormato.append(", ");
            }
        }
        System.out.printf("\nCadena inversa: %s", cadenaInversaFormato);
    }
}