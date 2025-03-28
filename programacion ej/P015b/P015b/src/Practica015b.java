import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica015b {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private JFrame ventana;
    private JPanel panel;
    private JButton supIzq, supDer, infIzq, infDer;
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Practica015b app = new Practica015b();
        Accion accionSupIzq = new Accion("SuperIzq");
        Accion accionSupDer = new Accion("SuperDer");
        Accion accionInfIzq = new Accion("InfIzq");
        Accion accionInfDer = new Accion("InfDer");
        GridBagConstraints rest = new GridBagConstraints();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        app.ventana = new JFrame("Practica015b");
        app.ventana.setSize(new Dimension(400, 200));
        app.ventana.setResizable(true);
        app.ventana.setLocationRelativeTo(null);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.panel = new JPanel(new GridBagLayout());
        app.ventana.setContentPane(app.panel);

        // botón superior izquierda
        app.supIzq = new JButton("SuperIzq");
        rest.gridx = 0; rest.gridy = 0;
        rest.gridheight = 1; rest.gridwidth = 1;
        rest.weightx = 0.5; rest.weighty = 0.5;
        rest.anchor = GridBagConstraints.CENTER;
        app.panel.add(app.supIzq, rest);
        app.supIzq.addActionListener(accionSupIzq);

        // botón superior derecha
        app.supDer = new JButton("SuperDer");
        rest.gridx = 1; rest.gridy = 0;
        rest.weightx = 0.5; rest.weighty = 0.5;
        app.panel.add(app.supDer, rest);
        app.supDer.addActionListener(accionSupDer);

        // botón inferior izquierda
        app.infIzq = new JButton("InfIzq");
        rest.gridx = 0; rest.gridy = 1;
        rest.weightx = 0.5; rest.weighty = 0.5;
        app.panel.add(app.infIzq, rest);
        app.infIzq.addActionListener(accionInfIzq);

        // botón inferior derecha
        app.infDer = new JButton("InfDer");
        rest.gridx = 1; rest.gridy = 1;
        rest.weightx = 0.5; rest.weighty = 0.5;
        app.panel.add(app.infDer, rest);
        app.infDer.addActionListener(accionInfDer);

        app.ventana.setVisible(true);
    }
}