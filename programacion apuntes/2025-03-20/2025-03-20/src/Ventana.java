import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana implements ActionListener{
    //----------------------------------------------
    //           Declaración de campos
    //----------------------------------------------

    private JFrame ventana;
    private JPanel panelCont, panelCont2;
    private JLabel etiq, etiq2;
    private JDialog ventana2;
    private JButton boton;
    private JButton[] aBotones;

    //----------------------------------------------
    //           Declaración de métodos
    //----------------------------------------------

    @Override
    public void actionPerformed(ActionEvent e) {
        this.ventana2.setVisible(true);
    }
    

    public static void main(String[] args){
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        Ventana app = new Ventana();
        String nombre;
        int iOpcion;
        String[] aPosiciones = { BorderLayout.NORTH, BorderLayout.WEST, BorderLayout.CENTER, BorderLayout.EAST, BorderLayout.SOUTH };

        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------

        //Valores del JFrame
        app.ventana = new JFrame("Mi ventana");
        app.ventana.setSize(new Dimension(800, 400));
        app.ventana.setResizable(true);
        app.ventana.setLocationRelativeTo(null);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel de contenido
        app.panelCont = new JPanel(new BorderLayout());
        app.ventana.setContentPane(app.panelCont);
        
        //Etiqueta
        //app.etiq = new JLabel("¡Bienvenido a mi primera ventana!");
        //app.panelCont.add(app.etiq, BorderLayout.CENTER);

        //Botón
        //app.boton = new JButton("¡Púlsame!");
        //app.boton.addActionListener(app);
        //app.panelCont.add(app.boton, BorderLayout.CENTER);

        //Colores
        //app.panelCont.setBackground(Color.RED);

        app.aBotones = new JButton[5];
        for(int i = 0; i < app.aBotones.length; i++){
            app.aBotones[i] = new JButton(String.format("Botón %d", i + 1));
            app.panelCont.add(app.aBotones[i], aPosiciones[i]);
        }

        //¿Es visible?
        app.ventana.setVisible(true);

        //Diálogo

        app.ventana2 = new JDialog(app.ventana);
        app.ventana2.setSize(new Dimension(400, 200));
        app.ventana2.setResizable(false);
        app.ventana2.setLocationRelativeTo(null);
        app.ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Panel de contenido
        app.panelCont2 = new JPanel(new BorderLayout());
        app.ventana2.setContentPane(app.panelCont2);
        
        //Etiqueta
        app.etiq2 = new JLabel("Esto es un diálogo de la ventana.");
        app.panelCont2.add(app.etiq2, BorderLayout.CENTER);

        //¿Es visible?
        app.ventana2.setVisible(false);

        //Inputs
        nombre = JOptionPane.showInputDialog(app.ventana, "Dime tu nombre", "Consulta de edad", JOptionPane.QUESTION_MESSAGE);
        iOpcion = JOptionPane.showConfirmDialog(app.ventana, "¿Estás seguro?", "Salida del programa", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(app.ventana, String.format("Tu nombre es %s%n¿Estás seguro?", nombre), "Confirmación de nombre" , JOptionPane.INFORMATION_MESSAGE);
        if(iOpcion == JOptionPane.YES_OPTION){ app.ventana.setVisible(false); System.exit(0); }
        else{
            nombre = JOptionPane.showInputDialog(app.ventana, "Dime tu nombre", "Consulta de edad", JOptionPane.QUESTION_MESSAGE);
        }
    }
}
