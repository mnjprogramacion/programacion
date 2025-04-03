import java.awt.event.*;
import java.util.*;
import javax.swing.JButton;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Accion implements ActionListener {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private HashSet<Integer> numeros;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Accion() {
        this.numeros = new HashSet<>();
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = new JButton();
        boton = (JButton) e.getSource();
        this.numeros.add(Integer.parseInt(boton.getText()));
    }

    public String resultado() {
        Iterator<Integer> iterador = this.numeros.iterator();
        String resultado = "Números pulsados: ";
        int iNum;
        while (iterador.hasNext()) {
            iNum = iterador.next();
            if (iterador.hasNext()) { resultado += String.format("%d, ", iNum); }
            else { resultado += String.format("%d.", iNum); }
        }
        return resultado;
    }
}