import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Timer;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Test {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private JFrame ventana;
    private JPanel panel;
    private BorderLayout disposicion;
    private JLabel etiqueta = new JLabel("Etiqueta de ejemplo");

    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Test app = new Test();
        app.ventana = new JFrame("Practica015a");
        
        Timer tempo = new Timer();
        Temporizador temporizador;

        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        app.ventana.setSize(500, 300);
        app.ventana.setResizable(false);
        app.ventana.setLocationRelativeTo(null);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.disposicion = new BorderLayout(10, 20);
        app.panel = new JPanel(app.disposicion);
        app.ventana.setContentPane(app.panel);

        ImageIcon imagen = new ImageIcon("icono1.png");

        app.etiqueta.setFont( new Font("Arial", Font.BOLD, 30));
        app.etiqueta.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        app.etiqueta.setHorizontalAlignment(JLabel.CENTER);
        app.etiqueta.setVerticalAlignment(JLabel.CENTER);
        app.etiqueta.setHorizontalTextPosition(JLabel.CENTER);
        app.etiqueta.setVerticalTextPosition(JLabel.TOP);

        app.etiqueta.setIconTextGap(-120);
        if(imagen.getImageLoadStatus() == MediaTracker.COMPLETE) { app.etiqueta.setIcon(imagen); }
        app.panel.add(app.etiqueta);
        

        

        app.ventana.setVisible(true);
    }
}