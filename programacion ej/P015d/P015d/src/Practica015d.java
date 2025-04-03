import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica015d {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    JFrame ventana;
    JPanel panelBL, panelFLL;
    JButton botonResultado;
    JButton[] botones;
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de constantes
        //----------------------------------------------
        int iMaxBotones = 9;
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Practica015d app = new Practica015d();
        Accion accion = new Accion();
        JLabel etiqueta;
        //----------------------------------------------
        //     Entrada de datos + Procesamiento
        //----------------------------------------------
        app.ventana = new JFrame("Agregando a conjuntos...");
        app.ventana.setSize(400, 200);
        app.ventana.setResizable(false);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.ventana.setLocationRelativeTo(null);

        app.panelBL = new JPanel(new BorderLayout(10, 10));
        app.ventana.setContentPane(app.panelBL);

        etiqueta = new JLabel("Pulse el número a almacenar");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        etiqueta.setHorizontalTextPosition(JLabel.CENTER);
        etiqueta.setVerticalTextPosition(JLabel.TOP);
        app.panelBL.add(etiqueta, BorderLayout.NORTH);

        app.panelFLL = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        app.botones = new JButton[iMaxBotones];
        for (int q = 0; q < iMaxBotones; q++) {
            app.botones[q] = new JButton(String.format("%d", q+1));
            app.botones[q].addActionListener(accion);
            app.panelFLL.add(app.botones[q]);
        }
        app.panelBL.add(app.panelFLL, BorderLayout.CENTER);

        app.botonResultado = new JButton("Resultado");
        app.botonResultado.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, accion.resultado(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        });
        app.panelBL.add(app.botonResultado, BorderLayout.SOUTH);

        app.ventana.setVisible(true);
    }
}