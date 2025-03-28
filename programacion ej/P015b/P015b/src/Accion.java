import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Accion implements ActionListener {

    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private JFrame ventana;
    private JPanel panel;
    private JLabel etiqueta;
    private boolean bVisible;
    private String boton;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Accion(String boton) {
        this.boton = boton;
        this.ventana = new JFrame(boton);
        this.ventana.setSize(new Dimension(200, 100));
        this.ventana.setResizable(true);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel(new BorderLayout());
        this.ventana.setContentPane(this.panel);

        this.bVisible = false;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!bVisible) {
            this.etiqueta = new JLabel(boton);
            this.panel.add(this.etiqueta);
    
            this.ventana.setVisible(true);
            this.bVisible = true;
        } else {
            this.panel.removeAll();
            this.ventana.setVisible(false);
            this.bVisible = false;
        }
    }
}