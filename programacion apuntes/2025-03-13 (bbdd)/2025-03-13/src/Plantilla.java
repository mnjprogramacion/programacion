import java.sql.*;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Plantilla {
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
        String url = "jdbc:mariadb://localhost:3333/";
        String usuario = "root", contraseña = "1234";
        Connection conexión;
        Statement sentencia;
        ResultSet resultado;
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.printf("\nERROR: Clase no encontrada.");
            System.exit(1);
        }

        try {
            conexión = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexión.createStatement();
            resultado = sentencia.executeQuery("SELECT * FROM ejemplo.tabla1;");
            while (resultado.next()) {
                System.out.printf("\nIdentificador: %d", resultado.getInt("id"));
                System.out.printf("\n\tNombre: %s", resultado.getString("nombre"));
                System.out.printf("\n\tApellidos: %s", resultado.getString("apellidos"));
                System.out.printf("\n\tEdad: %d\n", resultado.getInt("edad"));
            }

            conexión.close();
        } catch (SQLException e) { System.out.printf("\nERROR: Operación en BBDD."); }
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
    }
}