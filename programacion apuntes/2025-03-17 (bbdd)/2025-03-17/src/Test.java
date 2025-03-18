import java.sql.*;

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
        String url = "jdbc:mariadb://localhost:3333";
        String usuario = "root", contraseña = "usuario";
        Connection conexión = null;
        PreparedStatement sentenciaPreparada;
        Statement sentencia = null;
        int iNumAct;
        int[] aNumAct;
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexión = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexión.createStatement();
        } catch (java.lang.ClassNotFoundException | SQLException e) {
            System.out.printf("\nERROR: Clase no encontrada / Conexión BBDD.");
            return;
        }

        try {

            sentenciaPreparada = conexión.prepareStatement("INSERT INTO ejemplo.tabla1 VALUES (?, ?, ?, ?)");
            sentenciaPreparada.setInt(1, 5);
            sentenciaPreparada.setString(2, "Sebastian");
            sentenciaPreparada.setString(3, "Sanchez");
            sentenciaPreparada.setInt(4, 30);
            iNumAct = sentenciaPreparada.executeUpdate();
            System.out.printf("\nNúmero de actualizaciones: %d", iNumAct);


            sentencia.addBatch("CREATE DATABASE prueba;");
            sentencia.addBatch("USE prueba");
            sentencia.addBatch("CREATE TABLE prueba1 (id INT NOT NULL PRIMARY KEY, nombre VARCHAR(30))");
            aNumAct = sentencia.executeBatch();
            System.out.printf("\n%d", aNumAct[0]);

            conexión.close();
        } catch (SQLException e) {
            System.out.printf("\nERROR: Gestión de la BBDD\n");
            System.exit(1);
        }
    }
}