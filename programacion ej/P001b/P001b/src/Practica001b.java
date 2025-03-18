/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica001b {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        byte byEntero1 = 120;
        short sEntero2 = 30_000;
        int iEntero3 = 1_000_000;
        long lEntero4 = 3_000_000_000_000L;

        float fFlotante1 = 7.5F;
        double dFlotante2 = 20_000.5D;

        char cCaracter = 'a';

        boolean bBooleano = true;
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        System.out.println("La variable byEntero1 es de tipo byte y contiene el valor: " + byEntero1);
        System.out.println("La variable sEntero2 es de tipo short y contiene el valor: " + sEntero2);
        System.out.println("La variable iEntero3 es de tipo int y contiene el valor: " + iEntero3);
        System.out.println("La variable lEntero4 es de tipo long y contiene el valor: " + lEntero4);

        System.out.println("La variable fFlotante1 es de tipo float y contiene el valor: " + fFlotante1);
        System.out.println("La variable dFlotante2 es de tipo double y contiene el valor: " + dFlotante2);

        System.out.println("La variable cCaracter es de tipo char y contiene el valor: " + cCaracter);

        System.out.println("La variable bBooleano es de tipo boolean y contiene el valor: " + bBooleano);
    }
}