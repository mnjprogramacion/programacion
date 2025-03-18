import java.util.Scanner;

/**
 *
 * @author XXXX
 * @version XX
 */
public class test {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        //Creación de objetos
        //La creación de cadenas está simplificada por su uso
        //String cadena = new String("");
        //String cadena = new String();
        String cadena = "";
        cadena = "" + "Hola";
        //Las cadenas en Java son inmutables
        //Una vez creada, no se puede cambiar

        String cadena1 = new String("A");
        String cadena2 = "B";

        String cadena3 = "Hipopotamo";
        String cadena4 = "popo";

        String cadena5;

        Scanner entrada = new Scanner(System.in);
        String nombre;

        String cadena6;
        String cadena7 = "";
        
        StringBuilder cadena8 = new String("");
        //check

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("Dime tu nombre: ");
        nombre = entrada.nextLine();

        System.out.printf("Introduzca cadena a invertir: ");
        cadena6 = entrada.nextLine().trim().toLowerCase();
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        System.out.printf("Cadena original: %s\n", cadena6);
        for (int q = cadena6.length() - 1; q >= 0; q--) {
            cadena7 = cadena7 + cadena6.charAt(q);
        }
        System.out.printf("Cadena final: %s\n", cadena7);



        System.out.printf("Tu nombre es %s: ", nombre.strip());

        //.strip() quita los espacios al principio y al final
        //.stripLeading() sólo al principio
        //.stripTrailing() sólo al final

        System.out.printf("Tu nombre es %s", cadena3.substring(2, 6));

        System.out.printf(cadena3.toUpperCase());

        //.toUpperCase() convierte la cadena a mayúsculas
        //.toLowerCase() convierte la cadena a minúsculas

        System.out.printf(cadena3.repeat(3));

        if ("pepe".equals("pepe")) {
            System.out.printf("Las cadenas son iguales\n");
        }

        if ("pepe".compareTo("pepe") == 0) {
            System.out.printf("Las cadenas son iguales\n");
        }



        for (int q = 0; q < cadena.length(); q++) {
            System.out.printf("%c\n", cadena.charAt(q));
        }

        System.out.printf("\n")

        for (int q = cadena.length() - 1; q >= 0; q++) {
            System.out.printf("%c\n", cadena.charAt(q));
        }

        if (cadena1.compareTo(cadena2) == 0) {
            System.out.printf("Las cadenas son iguales\n");
        }

        if (cadena1.compareTo(cadena2) < 0) {
            System.out.printf("\'A\' es mejor que \'B\'.\n");
        }

        //.compareToIgnoreCase() funciona igual, pero ignora las mayúsculas

        if (cadena1.contains(cadena2)) {
            System.out.printf("Está contenida.\n");
        }

        cadena5 = String.format("%d x %d = %d\n", 5, 4, 20);
        System.out.printf("%s", cadena2);

        System.out.printf("%d", cadena3.indexOf(cadena4));
    }
}