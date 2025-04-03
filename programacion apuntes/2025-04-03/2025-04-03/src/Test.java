import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Test {
    private class Accion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String cadena;
            double dTotal = 0;
            try {
                for (int q = 0; q < cmpTxt.length; q++) {
                    cadena = cmpTxt[q].getText();
                    if (!cadena.isEmpty()) { dTotal += Double.parseDouble(cadena); }
                }
            } catch (NumberFormatException r) { JOptionPane.showMessageDialog(null, "ERROR: ALguno de los valores no es real.", "Error de conversión", JOptionPane.ERROR_MESSAGE); }
            JOptionPane.showMessageDialog(null, String.format("La suma es: %.2f", dTotal), "Resultado de la suma", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private JFrame vent;
    private JTextField []cmpTxt;
    private JButton boton;
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Test app = new Test();
        JPanel pnlCnt, pnlCentral;
        JLabel etiq;
        ImageIcon icono = new ImageIcon("mosaico");
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        app.vent = new JFrame("Practicando con cajas de texto...");
        app.vent.setSize(400, 200);
        app.vent.setResizable(false);
        app.vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.vent.setLocationRelativeTo(null);

        pnlCnt = new JPanel(new BorderLayout(10, 10));
        app.vent.setContentPane(pnlCnt);

        etiq = new JLabel("Cálculos matemáticos");
        etiq.setHorizontalAlignment(JLabel.CENTER);
        etiq.setVerticalTextPosition(JLabel.TOP);
        etiq.setHorizontalTextPosition(JLabel.CENTER);
        if (icono.getImageLoadStatus() == MediaTracker.COMPLETE) { etiq.setIcon(icono); }
        pnlCnt.add(etiq, BorderLayout.NORTH);
        
        pnlCentral = new JPanel(new GridLayout(2, 2));
        pnlCnt.add(new JPanel(), BorderLayout.WEST);
        pnlCnt.add(new JPanel(), BorderLayout.EAST);
        pnlCnt.add(pnlCentral, BorderLayout.CENTER);
        app.cmpTxt = new JTextField[4];
        for (int q = 0; q < 4; q++) {
            app.cmpTxt[q] = new JTextField(10);
            app.cmpTxt[q].setHorizontalAlignment(JTextField.RIGHT);
            pnlCentral.add(app.cmpTxt[q]);
        }

        app.boton = new JButton("Calcular");
        //app.boton.addActionListener(app.new Accion());
        app.boton.addActionListener((ActionEvent e) -> {
            String cadena;
            double dTotal = 0;
            try {
                for (int q = 0; q < app.cmpTxt.length; q++) {
                    cadena = app.cmpTxt[q].getText();
                    if (!cadena.isEmpty()) { dTotal += Double.parseDouble(cadena); }
                }
            } catch (NumberFormatException r) { JOptionPane.showMessageDialog(null, "ERROR: ALguno de los valores no es real.", "Error de conversión", JOptionPane.ERROR_MESSAGE); }
            JOptionPane.showMessageDialog(null, String.format("La suma es: %.2f", dTotal), "Resultado de la suma", JOptionPane.INFORMATION_MESSAGE);
        });
        pnlCnt.add(app.boton, BorderLayout.SOUTH);

        app.vent.setVisible(true);
    }
}