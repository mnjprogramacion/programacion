import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Test implements ActionListener {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private JFrame ventana;
    private JPanel panel;
    private JButton[] aBotones;
    private CardLayout disposicion;
    private JPanel panel2;
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Test app = new Test();
        // BorderLayout disposicion;
        // GridLayout disposicion;
        
        // BorderLayout disposicion1;
        // FlowLayout disposicion2;
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        app.ventana = new JFrame("Mi primera ventana");
        app.ventana.setSize(new Dimension(500, 300));
        app.ventana.setResizable(false);
        app.ventana.setLocationRelativeTo(null);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // disposicion = new BorderLayout(20, 10);
        // disposicion = new GridLayout(2, 3, 10, 20);
        // disposicion1 = new BorderLayout(10, 20);
        app.panel = new JPanel(new BorderLayout(10, 20));
        app.ventana.setContentPane(app.panel);

        // JLabel etiqueta = new JLabel("Etiqueta");
        // app.panel.add(etiqueta, BorderLayout.CENTER);

        app.disposicion = new CardLayout();
        app.panelSuperior = new JPanel(app.disposicion);
        app.panel.add(app.panelSuperior, BorderLayout.CENTER);
        JButton btn1 = new JButton("Hoja 1");
        app.panelSuperior.add(btn1);
        JButton btn2 = new JButton("Hoja 2");
        app.panelSuperior.add(btn2);
        JButton btn3 = new JButton("Hoja 3");
        app.panelSuperior.add(btn3);
        JButton btn4 = new JButton("Hoja 4");
        app.panelSuperior.add(btn4);


        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(Color.RED);
        app.panel.add(panelInferior, BorderLayout.SOUTH);




        // disposicion2 = new FlowLayout(FlowLayout.CENTER, 10, 20);
        // disposicion.setHgap(20);
        // disposicion.setVgap(10);
        // app.panel = new JPanel(disposicion2);
        app.ventana.setContentPane(app.panel);

        // NULL - gestor de disposición absoluto
        /*
        app.panel = new JPanel(null);
        */

        // NULL
        /*
        app.aBotones = new JButton[5];
        app.aBotones[0] = new JButton("Boton 1");
        app.aBotones[0].setBounds(10, 10, 100, 30);
        */



        /*
        app.aBotones = new JButton[5];
        app.aBotones[0] = new JButton("Boton 1");
        app.aBotones[0].addActionListener(app);
        app.panel.add(app.aBotones[0]);
        // app.panel.add(app.aBotones[0], BorderLayout.NORTH);
        app.aBotones[0].addActionListener(app);
        app.aBotones[1] = new JButton("Boton 2");
        app.panel.add(app.aBotones[1]);
        // pp.panel.add(app.aBotones[1], BorderLayout.WEST);
        app.aBotones[1].addActionListener(app);
        app.aBotones[2] = new JButton("Boton 3");
        app.panel.add(app.aBotones[2]);
        // app.panel.add(app.aBotones[2], BorderLayout.CENTER);
        app.aBotones[3] = new JButton("Boton 4");
        app.panel.add(app.aBotones[3]);
        // app.panel.add(app.aBotones[3], BorderLayout.EAST);
        app.aBotones[4] = new JButton("Boton 5");
        app.panel.add(app.aBotones[4]);
        // app.panel.add(app.aBotones[4], BorderLayout.SOUTH);
        */

        /* 
        app.aBotones = new JButton[5];
        app.aBotones[0] = new JButton("Boton 1");
        app.aBotones[0].addActionListener(app);
        panelInferior.add(app.aBotones[0]);
        app.aBotones[0].addActionListener(app);
        app.aBotones[1] = new JButton("Boton 2");
        panelInferior.add(app.aBotones[1]);
        app.aBotones[1].addActionListener(app);
        app.aBotones[2] = new JButton("Boton 3");
        panelInferior.add(app.aBotones[2]);
        app.aBotones[3] = new JButton("Boton 4");
        panelInferior.add(app.aBotones[3]);
        app.aBotones[4] = new JButton("Boton 5");
        panelInferior.add(app.aBotones[4]);
        */

        /* 
        app.aBotones = new JButton[5];
        app.aBotones[0] = new JButton("Pasar siguiente");
        app.aBotones[0].addActionListener(app);
        panelInferior.add(app.aBotones[0]);
        */

        app.ventana.setVisible(true);
    }
    /* 
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre;

        switch (e.getActionCommand()) {
            case "Boton 1":
                JOptionPane.showMessageDialog(this.ventana, "Has pulsado Boton1", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Boton 2":
            JOptionPane.showMessageDialog(this.ventana, "Has pulsado Boton2", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
        */
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre;

        this.disposicion.next(app.panelSuperior);

        }
    
}