/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class punto {
    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------

    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
      
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Punto(double dCoordX, double dCoordY) {
        this.dCoordY = dCoordY;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public double obtenerX() {
        return this.dCoordX;
    }

    public double obtenerY() {
        return this.dCoordY;
    }

    public void mover (double dDespX, double dDespY) {
        this.dCoordX += dDespx;
        this.dCoordY += dDespY;
    }

    public StringBuilder imprime() {
        return new StringBuilder(String.format("(%.3f, %%.3f)", this.dCoordX, this.dCoordY))
    }

    public double distancia(Punto punto) {
        double dDistX = this.dCoordX - punto.dCoordX;
        double dDistY = this.dCoordY - punto.dCoordY;
    }

    // Sin terminar

}