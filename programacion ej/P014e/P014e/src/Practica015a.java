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
public class Practica015a {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private JFrame ventana;
    private JPanel panel;
    private BorderLayout disposicion;

    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Practica015a app = new Practica015a();
        app.ventana = new JFrame("Practica015a");
        JLabel etiqueta = new JLabel("Mattias Nygren Jiménez");
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
        temporizador = new Temporizador(app.panel);
        
        app.panel.add(etiqueta, BorderLayout.CENTER);

        tempo.schedule(temporizador, 0, 2000);

        temporizador.run();

        app.ventana.setVisible(true);
    }
}