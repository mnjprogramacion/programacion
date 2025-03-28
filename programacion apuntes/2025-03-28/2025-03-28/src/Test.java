import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
    private JTextArea areaTexto;
    private JButton boton1, boton2, boton3, boton4;
    private JTextField campoTexto;
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Test app = new Test();
        GridBagConstraints rest = new GridBagConstraints();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        app.ventana = new JFrame("Test");
        app.ventana.setSize(new Dimension(500, 300));
        app.ventana.setResizable(true);
        app.ventana.setLocationRelativeTo(null);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.panel = new JPanel(new GridBagLayout());
        app.ventana.setContentPane(app.panel);

        /* Fila 1 */
        app.areaTexto = new JTextArea("Este es un texto");
        rest.gridx = 0; rest.gridy = 0;
        rest.gridheight = 2; rest.gridwidth = 2;
        rest.weightx = 1.0; rest.weighty = 1.0;
        rest.anchor = GridBagConstraints.NORTHWEST;
        rest.fill = GridBagConstraints.BOTH;
        app.panel.add(app.areaTexto, rest);
        app.boton1 = new JButton("Botón1");
        rest.gridx = 2; rest.gridy = 0;
        rest.gridheight = 1; rest.gridwidth = 1;
        rest.weightx = 0.0; rest.weighty = 1.0;
        rest.anchor = GridBagConstraints.CENTER;
        rest.fill = GridBagConstraints.NONE;
        app.panel.add(app.boton1, rest);
        /* Fila 2 */
        app.boton2 = new JButton("Botón2");
        rest.gridx = 2; rest.gridy = 1;
        app.panel.add(app.boton2, rest);
        /* Fila 3 */
        app.boton3 = new JButton("Botón3");
        rest.gridx = 0; rest.gridy = 2;
        rest.weightx = 0.0; rest.weighty = 0.0;
        app.panel.add(app.boton3, rest);
        app.campoTexto = new JTextField("Hola");
        rest.gridx = 1; rest.gridy = 2;
        rest.fill = GridBagConstraints.HORIZONTAL;
        app.panel.add(app.campoTexto, rest);
        app.boton4 = new JButton("Botón4");
        rest.gridx = 2; rest.gridy = 2;
        rest.fill = GridBagConstraints.NONE;
        app.panel.add(app.boton4, rest);

        app.ventana.setVisible(true);
    }
}