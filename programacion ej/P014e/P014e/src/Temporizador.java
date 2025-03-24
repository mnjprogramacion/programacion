import java.awt.Color;
import java.util.TimerTask;
import javax.swing.JPanel;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Temporizador extends TimerTask {
    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------
    private static final Color[] aCOLORES = {
        Color.RED,
        Color.BLUE,
        Color.YELLOW,
        Color.GREEN,
        Color.MAGENTA,
        Color.GRAY
        };
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private JPanel panel;
    private int selec = 0;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Temporizador(JPanel panel) {
        this.panel = panel;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public Color[] obtenerColores() {
        return aCOLORES;
    }

    public void cambiarSelec() {

    }

    @Override
    public void run() {
        this.panel.setBackground(aCOLORES[this.selec]);
        if (this.selec < 5) { this.selec++; }
        else { this.selec = 0; }
    }
}