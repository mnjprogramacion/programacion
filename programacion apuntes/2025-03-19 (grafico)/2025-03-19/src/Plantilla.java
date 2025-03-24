import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
      
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------

        // Creamos el marco
        JFrame vent = new JFrame("Ejemplo de ventana");
        // Configuramos sus dimensiones y comportamiento cuando se cierra
        vent.setSize(400, 200);
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Creamos un componente y lo colocamos dentro
        Container contenedor = vent.getContentPane();
        JLabel etiq = new JLabel("Esto es un ejemplo");
        contenedor.add(etiq, BorderLayout.CENTER);
        // Lo mostramos
        vent.setVisible(true);
    }
}