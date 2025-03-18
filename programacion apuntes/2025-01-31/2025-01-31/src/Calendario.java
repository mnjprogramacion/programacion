import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public /*abstract*/ class Calendario implements MisReglas, Comparator<Calendario> {
    //----------------------------------------------
    //       Clase interna
    //----------------------------------------------
    public class Semana {
        private int iNumSem;

        public Semana(int iNumSem) {
            this.iNumSem = iNumSem;
            fecha = LocalDate.of(2025, 1, 1);
        }

        public int obtenerSemana() { return this.iNumSem; }
    }
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private LocalDate fecha;
    private Semana semana;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Calendario(int iAño) {
        assert iAño > 0 : "Desafortunadamente el año es negativo";
        this.semana = new Semana(10);
        this.semana = new Semana(iSemana);
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public /*abstract*/ void Saludar() {}

    @Override
    public void miMetodo1(int iX, int iY) {
        System.out.printf("Hola");
    }

    public int obtenerSemana() { return this.semana.obtenerSemana(); }
    @Override
    public void mensaje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mensaje'");
    }
    @Override
    public void miMensaje(int iValor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'miMensaje'");
    }
    @Override
    public int compare(Calendario o1, Calendario o2) {
        if (o1.semana.obtenerSemana() == o2.semana.obtenerSemana()) {
            return 0;
        } else {
            if (o1.semana.obtenerSemana() < o2.semana.obtenerSemana()) {
                return 0;
            } else 
    }
}