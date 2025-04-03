import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica014d {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        String url = "jdbc:mariadb://localhost:3333";
        String usuario = "root", contrasena = "usuario";
        Connection conexion = null;
        Statement sentencia = null;
        PreparedStatement sentenciaPrepInsert = null, sentenciaPrepVoto = null, sentenciaPrepAdd = null, sentenciaPrepNombre = null;
        ResultSet resultado;
        String nombre;
        int iNumPart = 1, iNumVotos;
        //----------------------------------------------
        //     Entrada de datos + Procesamiento
        //----------------------------------------------
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            sentencia = conexion.createStatement();
            sentenciaPrepInsert = conexion.prepareStatement("INSERT INTO votaciones.votos VALUES (?, ?, ?)");
            sentenciaPrepVoto = conexion.prepareStatement("SELECT numVotos FROM votaciones.votos WHERE nombre = ?");
            sentenciaPrepAdd = conexion.prepareStatement("UPDATE votaciones.votos SET numVotos = ? WHERE nombre = ?");
            sentenciaPrepNombre = conexion.prepareStatement("SELECT nombre FROM votaciones.votos WHERE nombre = ?");
            conexion.setAutoCommit(false);
        } catch (java.lang.ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: Imposible conectar con BBDD.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        try {
            do {
                
                nombre = JOptionPane.showInputDialog(null, "Dime tu nombre.");
                if (nombre.isBlank()) { break; }
                sentenciaPrepNombre.setString(1, nombre);
                resultado = sentenciaPrepNombre.executeQuery();
                if (resultado.next()) { 
                    JOptionPane.showMessageDialog(null, "El participante ya existe.", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    sentenciaPrepInsert.setInt(1, iNumPart);
                    sentenciaPrepInsert.setString(2, nombre);
                    sentenciaPrepInsert.setInt(3, 0);
                    sentenciaPrepInsert.executeUpdate();
                }
            } while (!nombre.isBlank());
            conexion.commit();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: Creación/Acceso a base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
        try {
            nombre = JOptionPane.showInputDialog(null, "Indica el participante al que quieres votar.");
            try {
                sentenciaPrepVoto.setString(1, nombre);
                resultado = sentenciaPrepVoto.executeQuery();
                resultado.next();
                iNumVotos = resultado.getInt(1) + 1;

                sentenciaPrepAdd.setInt(1, iNumVotos);
                sentenciaPrepAdd.setString(2, nombre);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "¡Participante no encontrado!", "Información", JOptionPane.INFORMATION_MESSAGE);
                System.exit(1);
            }
            conexion.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: Actualización número de votos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}