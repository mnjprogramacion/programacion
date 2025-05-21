import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica015f {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private JFrame ventana;
    private JPanel panelBL, panelCL, panelFL;
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de constantes
        //----------------------------------------------
        int iNUMPANELES = 4;
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Practica015f app = new Practica015f();
        ImageIcon[] imagenes;
        String[] direcciones = {"1.png", "2.png", "3.png", "4.png"};
        String[] nombres = {"Uno", "Dos", "Tres", "Cuatro"};
        JLabel[] etiquetas;
        JButton[] botones;
        CardLayout carta = new CardLayout();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        app.ventana = new JFrame("Usando un CardLayout");
        app.ventana.setSize(400, 600);
        app.ventana.setResizable(false);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.ventana.setLocationRelativeTo(null);

        app.panelBL = new JPanel(new BorderLayout());
        app.ventana.setContentPane(app.panelBL);
        app.panelCL = new JPanel(carta);
        app.panelBL.add(app.panelCL, BorderLayout.CENTER);

        app.panelFL = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        app.panelFL.setBackground(new Color(214, 142, 159));
        app.panelBL.add(app.panelFL, BorderLayout.SOUTH);

        imagenes = new ImageIcon[iNUMPANELES];
        etiquetas = new JLabel[iNUMPANELES];
        for (int q = 0; q < iNUMPANELES; q++) {
            etiquetas[q] = new JLabel();
            imagenes[q] = new ImageIcon(direcciones[q]);
            etiquetas[q].setIcon(imagenes[q]);
            etiquetas[q].setHorizontalAlignment(JLabel.CENTER);
            etiquetas[q].setVerticalAlignment(JLabel.CENTER);
        }

        for (int q = 0; q < iNUMPANELES; q++) {
            if (imagenes[q].getImageLoadStatus() != MediaTracker.COMPLETE) { etiquetas[q].setText(nombres[q]); }
            app.panelCL.add(etiquetas[q], nombres[q]);
        }

        botones = new JButton[iNUMPANELES];
        for (int q = 0; q < iNUMPANELES; q++) {
            botones[q] = new JButton(nombres[q]);
            botones[q].addActionListener((ActionEvent e) -> {
                JButton boton = (JButton) e.getSource();
                String nombre = boton.getActionCommand();

                for (int s = 0; s < iNUMPANELES; s++) { botones[s].setEnabled(true); }
                boton.setEnabled(false);

                carta.show(app.panelCL, nombre);
            });
            botones[0].setEnabled(false);
            app.panelFL.add(botones[q]);
        }
        app.ventana.setVisible(true);
    }
}