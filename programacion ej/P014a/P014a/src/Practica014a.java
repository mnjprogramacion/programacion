import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica014a {
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
        String url = "jdbc:mariadb://localhost:3333";
        String usuario = "root", contraseña = "usuario";
        Connection conexión;
        Statement sentencia;
        ResultSet resultado;
        LocalDate fechaLD;
        String fechaString, autor = "";
        int idAutor;
        DateTimeFormatter formateador1 = DateTimeFormatter.ofPattern("uuuu-MM-dd");
        DateTimeFormatter formateador2 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.printf("ERROR: Clase no encontrada."); return;
        }

        try {
            conexión = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexión.createStatement();
            resultado = sentencia.executeQuery("SELECT * FROM biblioteca.Autor;");
            System.out.printf("\nTabla Autor:");
            System.out.printf("\n============\n");
            while (resultado.next()) {
                System.out.printf("\nIdentificador: %d", resultado.getInt("idAutor"));
                System.out.printf("\n\tNombre: %s", resultado.getString("nombre"));
                System.out.printf("\n\tNacionalidad: %s", resultado.getString("nacionalidad"));
                fechaLD = LocalDate.parse(resultado.getString("fechaNac"), formateador1);
                fechaString = fechaLD.format(formateador2);
                System.out.printf("\n\tFecha de nacimiento: %s", fechaString);
                fechaLD = LocalDate.parse(resultado.getString("fechaDef"), formateador1);
                fechaString = fechaLD.format(formateador2);
                System.out.printf("\n\tFecha de nacimiento: %s\n", fechaString);
            }

            resultado = sentencia.executeQuery("SELECT * FROM biblioteca.Libro;");
            System.out.printf("\nTabla Libro:");
            System.out.printf("\n============\n");
            while (resultado.next()) {
                System.out.printf("\nIdentificador: %d", resultado.getInt("idLibro"));
                System.out.printf("\n\tIdentificador autor: %d", resultado.getInt("idAutor"));
                System.out.printf("\n\tTítulo: %s", resultado.getString("titulo"));
                System.out.printf("\n\tTítulo original: %s", resultado.getString("tituloOriginal"));
                System.out.printf("\n\tAño: %d\n", resultado.getInt("año"));
            }

            resultado = sentencia.executeQuery("SELECT * FROM biblioteca.Libro;");
            System.out.printf("\nTabla Libro con autor:");
            System.out.printf("\n======================\n");
            while (resultado.next()) {
                System.out.printf("\nIdentificador: %d", resultado.getInt("idLibro"));
                idAutor = resultado.getInt("idAutor");
                switch (idAutor) {
                    case 1:
                        autor = "Miguel de Cervantes";
                        break;
                    case 2:
                        autor = "Federico García Lorca";
                        break;
                }
                System.out.printf("\n\tAutor: %s", autor);
                System.out.printf("\n\tTítulo: %s", resultado.getString("titulo"));
                System.out.printf("\n\tTítulo original: %s", resultado.getString("tituloOriginal"));
                System.out.printf("\n\tAño: %d\n", resultado.getInt("año"));
            }

            conexión.close();
        } catch(SQLException e) { System.out.printf("ERROR: Operación en BBDD."); }
    }
}