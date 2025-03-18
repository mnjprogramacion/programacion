import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
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
        String autor, nacionalidad, fechaNac, fechaDef, autorAdd, autorCheck;
        int iNumAutores;
        ArrayList<String> autores = new ArrayList<>();
        Iterator<String> iterador;
        boolean bCheckAutor = false, bCheckFechaNac = false, bCheckFechaDef = false;
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

        try {
            do {
                app.resultado = app.sentencia.executeQuery("SELECT * FROM biblioteca.autor;");
                do {
                    autorAdd = app.resultado.getString("nombre");
                    if (autorAdd == null) { break; }
                    autores.add(autorAdd);
                } while ((autorAdd != null) );

                System.out.printf("\nIntroduce el autor: ");
                autor = entrada.nextLine();

                if (autorAdd.isBlank()) { break; }

                bCheckAutor = true;
                iterador = autores.iterator();
                while (iterador.hasNext()) {
                    autorCheck = iterador.next().toString();
                    if (autorAdd.equals(autorCheck)) {
                        bCheckAutor = false;
                        break;
                    }
                }
                if (!bCheckAutor) {
                    System.out.printf("\nEl autor ya existe en la base de datos.");
                }
            } while ((!bCheckAutor) || autorAdd.isBlank());

        } catch (SQLException e) {
            System.out.printf("\nERROR: Acceso a la base de datos");
            System.out.printf(e.getMessage());
            System.exit(1);
        }

        System.out.printf("\nIntroduce la nacionalidad: ");
        nacionalidad = entrada.nextLine();

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
        
        do {
            System.out.printf("\nIntroduce la fecha de defunción (YYYY-MM-DD): ");
            fechaDef = entrada.nextLine();
            try {
                LocalDate.parse(fechaDef, formato);
                bCheckFechaDef = true;
            } catch (DateTimeParseException e) {
                System.out.printf("\nFormato no válido.");
                bCheckFechaDef = false;
            }
        } while (!bCheckFechaDef);

        try {
            app.resultado = app.sentencia.executeQuery("SELECT idAutor FROM autor ORDER BY idAutor DESC LIMIT 1;");
            iNumAutores = app.resultado.getInt("idAutor");

            // Me falta añadir los datos a la tabla, no me ha dado tiempo

        } catch (SQLException e) {
            System.out.printf("\nERROR: Acceso a la base de datos");
            System.out.printf(e.getMessage());
            System.exit(1);
        }

        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
    }
}