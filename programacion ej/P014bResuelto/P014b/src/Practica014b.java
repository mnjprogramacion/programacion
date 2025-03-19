import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class Practica014b {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private String url = "jdbc:mariadb://localhost:3333";
    private String usuario = "root", contraseña = "usuario";
    private Connection conexión;
    private Statement sentencia;
    private ResultSet resultado;
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Practica014b app = new Practica014b();
        Scanner entrada = new Scanner(System.in);
        String nombre = "", nacionalidad, fechaNac, fechaDef, sentenciaFormat;
        int iNumAutores = 0, iNumAct;
        boolean bCheckAutor = true, bCheckFechaNac = false, bCheckFechaDef = false;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("uuuu-MM-dd");
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            app.conexión = DriverManager.getConnection(app.url, app.usuario, app.contraseña);
            app.sentencia = app.conexión.createStatement();
            app.conexión.setAutoCommit(false);
        } catch (java.lang.ClassNotFoundException | SQLException e) {
            System.out.printf("\nERROR: Clase no encontrada / Conexión BBDD.");
            System.exit(1);;
        }

        System.out.printf("\nGestión de la BBDD");
        System.out.printf("\n==================\n");

        // Solicita nombre y comprueba si está en la base de datos
        try {
            do {
                System.out.printf("\nIntroduce el autor: ");
                nombre = entrada.nextLine();
                if (nombre.isBlank()) { System.exit(1); }

                app.resultado = app.sentencia.executeQuery("SELECT nombre FROM biblioteca.autor;");

                while (app.resultado.next()) {
                    if (nombre.equals(app.resultado.getString("nombre"))) {
                        bCheckAutor = false;
                        break;
                    }
                }

                if (!bCheckAutor) {
                    System.out.printf("\nEl autor ya existe en la base de datos.");
                }
            } while ((!bCheckAutor) || nombre.isBlank());

        } catch (SQLException e) {
            System.out.printf("\nERROR: Acceso a la base de datos");
            System.exit(1);
        }

        // Solicita nacionalidad
        System.out.printf("\nIntroduce la nacionalidad: ");
        nacionalidad = entrada.nextLine();

        // Solicita fechaNac y comprueba formato
        do {
            System.out.printf("\nIntroduce la fecha de nacimiento (YYYY-MM-DD): ");
            fechaNac = entrada.nextLine();
            try {
                LocalDate.parse(fechaNac, formato);
                bCheckFechaNac = true;
            } catch (DateTimeParseException e) {
                System.out.printf("\nFormato no válido.");
                bCheckFechaNac = false;
            }
        } while (!bCheckFechaNac);
        
        // Solicita fechaDef y comprueba formato
        do {
            System.out.printf("\nIntroduce la fecha de defunción (YYYY-MM-DD): ");
            fechaDef = entrada.nextLine();
            if (fechaDef.isBlank()) {
                fechaDef = null;
                bCheckFechaDef = true;
                break;
            }
            try {
                LocalDate.parse(fechaDef, formato);
                bCheckFechaDef = true;
            } catch (DateTimeParseException e) {
                System.out.printf("\nFormato no válido.");
                bCheckFechaDef = false;
            }
        } while (!bCheckFechaDef);
        entrada.close();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        // Actualiza la base de datos
        try {
            app.resultado = app.sentencia.executeQuery("SELECT idAutor FROM biblioteca.autor ORDER BY idAutor DESC LIMIT 1;");
            while (app.resultado.next()) {
                iNumAutores = app.resultado.getInt("idAutor");
            }

            if (fechaDef == null) {
                sentenciaFormat = String.format("INSERT INTO biblioteca.autor VALUES(%d, '%s', '%s', '%s', %s);",
                    iNumAutores+1, nombre, nacionalidad, fechaNac, fechaDef);
            } else {
                sentenciaFormat = String.format("INSERT INTO biblioteca.autor VALUES(%d, '%s', '%s', '%s', '%s');",
                    iNumAutores+1, nombre, nacionalidad, fechaNac, fechaDef);
            }

            iNumAct = app.sentencia.executeUpdate(sentenciaFormat);
            app.conexión.commit();
            System.out.printf("\nBase de datos actualizada, número de actualizaciones: %d", iNumAct);

        } catch (SQLException e) {
            System.out.printf("\nERROR: Registro no escrito en la base de datos.");
            System.exit(1);
        }
    }
}