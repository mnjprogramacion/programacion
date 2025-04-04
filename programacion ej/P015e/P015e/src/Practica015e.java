import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class Practica015e {
    //----------------------------------------------
    //       Declaración de clases
    //----------------------------------------------
    public class Accion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String fechaString = "", entradaString, resultado;
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-uuuu");
            boolean bCheckFormato = false, bCheckIntAL;
            int iMaxBolas = 7, iEntrada, iNum;
            ArrayList<Integer> bolas = new ArrayList<>();
            Iterator<Integer> iterador;

            do {
                try {
                    fechaString = JOptionPane.showInputDialog(null, "Introduce la fecha del sorteo (DD-MM-YYYY).", "Fecha del sorteo", JOptionPane.INFORMATION_MESSAGE);
                    if (fechaString.isBlank()) { System.exit(1); }
                    LocalDate.parse(fechaString, formato);
                    bCheckFormato = true;
                } catch (DateTimeParseException r) {
                    JOptionPane.showMessageDialog(null, "La fecha especificada no es válida.", "Error de formato", JOptionPane.ERROR_MESSAGE);
                }
            } while (!bCheckFormato);

            do {
                try {
                    bCheckIntAL = true;
                    entradaString = JOptionPane.showInputDialog(null, "Introduce los valores de las seis bolas del sorteo.", "Valores del sorteo", JOptionPane.INFORMATION_MESSAGE);
                    if (entradaString.isBlank()) { System.exit(1); }
                    iEntrada = Integer.parseInt(entradaString);
                    if (iEntrada < 1 || iEntrada > 49) { 
                        JOptionPane.showMessageDialog(null, "El valor debe estar comprendido entre 1 y 49.", "Valor incorrecto", JOptionPane.ERROR_MESSAGE);
                    } else {
                        iterador = bolas.iterator();
                        while (iterador.hasNext()) {
                            iNum = (int) iterador.next();
                            if (iNum == iEntrada) {
                                JOptionPane.showMessageDialog(null, "La bola ya está incluida en el sorteo.", "Valor ya introducido", JOptionPane.ERROR_MESSAGE);
                                bCheckIntAL = false;
                                break;
                            }
                        }
                        if (bCheckIntAL) { bolas.add(iEntrada); }
                    }
                } catch (NumberFormatException r) {
                    JOptionPane.showMessageDialog(null, "El valor introducido no es entero.", "Error de formato", JOptionPane.ERROR_MESSAGE);
                }
            } while (bolas.size() < iMaxBolas);

            resultado = String.format("Lotería del %s\nValores: ", fechaString);
            iterador = bolas.iterator();
            iNum = (int) iterador.next();
            resultado += String.format("%d", iNum);
            while (iterador.hasNext()) {
                iNum = (int) iterador.next();
                if (iterador.hasNext()) {
                    resultado += String.format(", %d", iNum);
                } else {
                    resultado += String.format("\nValor complementario: %d", iNum);
                }
            }
            JOptionPane.showMessageDialog(null, resultado, "Resultado de la lotería", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    JFrame ventana;
    JPanel panel;
    JButton boton;
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        Practica015e app = new Practica015e();
        Accion accion = app.new Accion();
        GridBagConstraints restriccion = new GridBagConstraints();
        ImageIcon imagen = new ImageIcon("primitiva.png", "Logotipo");
        String textoEtiqueta = "<html><p>Gestor de números de lotería primitiva.</p><p>Introduzca la fecha del sorteo y los números.</p><p>El resultado aparecerá al final del proceso.</p></html>";
        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2;
        //----------------------------------------------
        //     Entrada de datos + Procesamiento
        //----------------------------------------------
        app.ventana = new JFrame("Lotería primitiva V.0.1");
        app.ventana.setSize(300, 400);
        app.ventana.setResizable(false);
        app.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.ventana.setLocationRelativeTo(null);

        app.panel = new JPanel(new GridBagLayout());
        app.ventana.setContentPane(app.panel);

        etiqueta1.setText(textoEtiqueta);
        etiqueta1.setFont(new Font("sansserif", Font.PLAIN, 11));
        restriccion.gridy = 0;
        restriccion.weighty = 1;
        if (imagen.getImageLoadStatus() == MediaTracker.COMPLETE) {
            etiqueta1.setIcon(imagen);
            etiqueta1.setHorizontalTextPosition(JLabel.CENTER);
            etiqueta1.setVerticalTextPosition(JLabel.BOTTOM);
            app.panel.add(etiqueta1, restriccion);
            restriccion.gridy = 1;
        }
        else {
            etiqueta2 = new JLabel("Lotería primitiva");
            etiqueta2.setFont(new Font("sansserif", Font.PLAIN, 11));
            etiqueta2.setHorizontalTextPosition(JLabel.CENTER);
            app.panel.add(etiqueta2, restriccion);
            restriccion.gridy = 1;
            app.panel.add(etiqueta1, restriccion);
            restriccion.gridy = 2;
        }
        
        app.boton = new JButton("Sorteo");
        app.boton.setPreferredSize(new Dimension(100, 20));
        app.boton.addActionListener(accion);
        app.panel.add(app.boton, restriccion);
        app.ventana.setVisible(true);
    }
}