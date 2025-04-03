import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Mattias Nygren Jiménez
<<<<<<< HEAD
 * @version 2.0
=======
 * @version 3.0
>>>>>>> dd87a7e6f8ee9e44570b562f75a8135751fb34dc
 */
public class Practica015c {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private JFrame ventana;
    private JPanel panelBL, panelGL;
    private JButton boton;
    private JLabel etiqueta;
    private ImageIcon imagen;
    private JTextField texto1, texto2, texto3, texto4;

    class Accion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String num1string = texto1.getText();
            String num2string = texto2.getText();
            String num3string = texto3.getText();
            String num4string = texto4.getText();
            String mensaje;
            int iNum1, iNum2, iNum3, iNum4, iResultado;
            boolean bNumInvalido = false;
            try {
                iNum1 = Integer.parseInt(num1string);
                iNum2 = Integer.parseInt(num2string);
                iNum3 = Integer.parseInt(num3string);
                iNum4 = Integer.parseInt(num4string);
            } catch (Exception a) {
                iNum1 = 0;
                iNum2 = 0;
                iNum3 = 0;
                iNum4 = 0;
                bNumInvalido = true;
            }
            iResultado = iNum1 + iNum2 + iNum3 + iNum4;

            if (!bNumInvalido) {
                mensaje = String.format("El resultado del cálculo es: %d", iResultado);
                JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                mensaje = "Los valores en las cajas de texto deben ser numéricos.";
                JOptionPane.showMessageDialog(null, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Practica015c app = new Practica015c();
        Practica015c.Accion accion = app.new Accion();
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        app.ventana = new JFrame("Realizando cálculos...");
        app.ventana.setSize(new Dimension(400, 200));
        app.ventana.setResizable(false);
        app.ventana.setLocationRelativeTo(null);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.panelBL = new JPanel(new BorderLayout(10, 10));
        app.ventana.setContentPane(app.panelBL);

        app.etiqueta = new JLabel("Cálculos matemáticos");
        app.etiqueta.setHorizontalTextPosition(JLabel.CENTER);
        app.etiqueta.setVerticalTextPosition(JLabel.TOP);
        app.etiqueta.setHorizontalAlignment(JLabel.CENTER);
        app.etiqueta.setVerticalAlignment(JLabel.TOP);
        app.imagen = new ImageIcon("mosaico.png");
        app.etiqueta.setIcon(app.imagen);
        app.panelBL.add(app.etiqueta, BorderLayout.NORTH);

        app.panelGL = new JPanel(new GridLayout(2, 2, 10, 10));
        app.panelBL.add(app.panelGL, BorderLayout.CENTER);

        app.texto1 = new JTextField(10);
        app.texto1.setHorizontalAlignment(JTextField.RIGHT);
        app.panelGL.add(app.texto1);
        app.texto2 = new JTextField(10);
<<<<<<< HEAD
        
        app.panelGL.add(app.texto2);
        app.texto3 = new JTextField(10);
        app.panelGL.add(app.texto3);
        app.texto4 = new JTextField(10);
=======
        app.texto2.setHorizontalAlignment(JTextField.RIGHT);
        app.panelGL.add(app.texto2);
        app.texto3 = new JTextField(10);
        app.texto3.setHorizontalAlignment(JTextField.RIGHT);
        app.panelGL.add(app.texto3);
        app.texto4 = new JTextField(10);
        app.texto4.setHorizontalAlignment(JTextField.RIGHT);
>>>>>>> dd87a7e6f8ee9e44570b562f75a8135751fb34dc
        app.panelGL.add(app.texto4);

        app.boton = new JButton("Calcular");
        app.boton.addActionListener(accion);
        app.panelBL.add(app.boton, BorderLayout.SOUTH);

        app.ventana.setVisible(true);
    }
}