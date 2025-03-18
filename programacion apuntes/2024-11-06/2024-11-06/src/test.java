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
        String cadena1 = new String("Hola");
        String cadena2 = "Adios";
        cadena1 = cadena1 + 6;

        //StringBuilder para cadenas que van a recibir muchos cambios, son mucho más rápidas
        StringBuilder cadena3 = new StringBuilder("asdf");
        //Al indicar una cadena, reserva espacio de más
        StringBuilder cadena4 = new StringBuilder(40);
        //Reserva el espacio indicado (40 caracteres)
        cadena3 = cadena3.append(6);
        //Se pierde la sobrecarga de operadores, siempre hay que usar métodos

        cadena3.insert(0, "Ejemplo");
        cadena3.reverse();
        System.out.printf("%s\n", cadena3.toString());

        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------

        cadena1 = cadena1 + cadena2;
        cadena1 = cadena1.concat(cadena2);

        //no se puede: cadena1 == cadena2
        if (cadena1.equals(cadena2)) {break;}
        if (cadena1.compareTo(cadena2) == 0) {break;}


    }
}