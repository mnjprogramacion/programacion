import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
        Connection conexión = null;
        Statement sentencia;
        ResultSet resultado;
        int iNumValores = 0;
        int iMax = 0, iSigClave = 0, iEdad, iNumCambios;
        String cadena, cadena2, nombre, apellidos;
        Scanner entrada = new Scanner(System.in);
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexión = DriverManager.getConnection("jdbc.mariadb://localhost:3333/", "root", "usuario");
        } catch (java.lang.ClassNotFoundException | SQLException e) {
            System.out.printf("\nERROR: Clase no encontrada / Conexión no establecida.");
            System.exit(1);
        }

        try {
            sentencia = conexión.createStatement();
            resultado = sentencia.executeQuery("SELECT COUNT(*) FROM ejemplo.tabla1;");
            while (resultado.next()) {
                iNumValores = resultado.getInt(1);
            }
            System.out.printf("\n%d", iNumValores);
        } catch (SQLException e) {
            System.out.printf("\nERROR: Manipulación de BBDD.");
            System.exit(1);
        }

        try {
            sentencia = conexión.createStatement();
            resultado = sentencia.executeQuery("SELECT MAX(id) FROM ejemplo.tabla1;");
            while (resultado.next()) {
                iMax = resultado.getInt(1);
            }
            System.out.printf("\n%d", iMax + 1);
        } catch (SQLException e) {
            System.out.printf("\nERROR: Manipulación de BBDD.");
            System.exit(1);
        }

        try {
            sentencia = conexión.createStatement();
            cadena = String.format("SELECT * FROM ejemplo.tabla1 WHERE id = '%s'", cadena2);
            resultado = sentencia.executeQuery("SELECT COUNT(*) FROM ejemplo.tabla1;");
            while (resultado.next()) {
                iNumValores = resultado.getInt(1);
            }
            System.out.printf("\n%d", iNumValores);
        } catch (SQLException e) {
            System.out.printf("\nERROR: Manipulación de BBDD.");
            System.exit(1);
        }

        try {
            sentencia = conexión.createStatement();
            resultado = sentencia.executeQuery("SELECT MAX(id) FROM ejemplo.tabla1;");
            while (resultado.next()) {
                iSigClave = resultado.getInt(1) + 1;
            }
            conexión.setAutoCommit(false); // Desactivo autovolcado a la base de datos
            System.out.printf("Dame datos: ");
            nombre = entrada.nextLine();
            apellidos = entrada.nextLine();
            iEdad = entrada.nextInt();
            cadena = String.format("INSERT INTO tabla1 VALUES(%d, '%s', '%s', %d);",
                iSigClave, nombre, apellidos, iEdad);
            iNumCambios = sentencia.executeUpdate(cadena);
            System.out.printf("\nSe han producido %d cambios.", iNumCambios);
            System.out.printf("\n%d", iNumValores);
            conexión.commit(); // Vuelco los datos de forma manual

            cadena = String.format("CREATE TABLE tabla2 (fecha DATE);");
            sentencia.executeUpdate(cadena);
            cadena = String.format("INSERT INTO ejemplo.tabla2 VALUES('2024-01-01');");
            sentencia.executeUpdate(cadena);

            // DATE -> LocalDate
            cadena = "SELECT * FROM ejemplo.tabla2;";
            resultado = sentencia.executeQuery(cadena);
            while (resultado.next()) {
                String cad = resultado.getString("fecha");
                LocalDate fech = LocalDate.parse(cad, DateTimeFormatter.ofPattern("uuuu-MM-dd"));
                System.out.printf("\nFecha: %s", fech.format(DateTimeFormatter.ofPattern("dd/MM/uuuu")));
            }

            conexión.close(); // Cierro la base de datos
        } catch (SQLException e) {
            System.out.printf("\nERROR: Manipulación de BBDD.");
            System.exit(1);
        }
    }
}