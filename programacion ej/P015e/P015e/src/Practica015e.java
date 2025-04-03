import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica015e {
    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    JFrame ventana;
    JPanel panel;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
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
        Practica015e app = new Practica015e();
        GridBagConstraints restriccion = new GridBagConstraints();
        ImageIcon imagen = new ImageIcon("primitiva.png", "Logotipo");
        String textoEtiqueta = "<html><p>Gestor de números de lotería primitiva.</p><p>Introduzca la fecha del sorteo y los números.</p><p>El resultado aparecerá al final del proceso.</p></html>";
        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2;
        //----------------------------------------------
        //     Entrada de datos + Procesamiento
        //----------------------------------------------
        app.ventana = new JFrame("Lotería primitiva V.0.1");
        app.ventana.setSize(300, 400);
        app.ventana.setResizable(false);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.ventana.setLocationRelativeTo(null);

        app.panel = new JPanel(new GridBagLayout());
        app.ventana.setContentPane(app.panel);

        etiqueta1.setText(textoEtiqueta);
        etiqueta1.setFont(new Font("sansserif", Font.PLAIN, 11));
        if (imagen.getImageLoadStatus() == MediaTracker.COMPLETE) {
            restriccion.gridy = 0;
            etiqueta1.setIcon(imagen);
            app.panel.add(etiqueta1, restriccion);
        }
        else {
            etiqueta2 = new JLabel("Lotería primitiva");
            restriccion.gridy = 0;
            app.panel.add(etiqueta1, restriccion);
            restriccion.gridy = 1;
            app.panel.add(etiqueta2, restriccion);
        }



        app.ventana.setVisible(true);
    }
}