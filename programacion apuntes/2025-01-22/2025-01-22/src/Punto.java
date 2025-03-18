/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.00
 */
public class Punto {
    public class Coma {
        private int iValor;

        public Coma(int iValor) { this.iValor = iValor; }

        public int obtenerValor() { dCoordX = 20;  return this.iValor; }
    }
    //----------------------------------------------
    //           Declaración de campos
    //----------------------------------------------
    private double dCoordX, dCoordY, dCoordZ;
    private Coma miComa;
    //----------------------------------------------
    //        Declaración de constructores
    //----------------------------------------------
    public Punto(double dCoordX, double dCoordY, double dCoordZ) {
        this.miComa = new Coma(5);
        this.dCoordX = dCoordX;
        this.dCoordY = dCoordY;
        this.dCoordZ = dCoordZ;
    }
    //----------------------------------------------
    //           Declaración de métodos
    //----------------------------------------------
    public double obtenerCoordX() { return this.dCoordX; }
    public double obtenerCoordY() { return this.dCoordY; }
    public double obtenerCoordZ() { return this.dCoordZ; }
    public void establecerXY(double dCoordX, double dCoordY, double dCoordZ) {
        this.dCoordX = dCoordX;
        this.dCoordY = dCoordY;
        this.dCoordZ = dCoordZ;
    }
    public void mover(double dDespX, double dDespY, double dDespZ) {
        this.dCoordX += dDespX;
        this.dCoordY += dDespY;
        this.dCoordZ += dDespZ;
    }
    public StringBuilder imprime() {
        return new StringBuilder(String.format("(%.3f, %.3f, %.3f)", this.dCoordX, this.dCoordY, this.dCoordZ));
    }
    public double distancia(Punto punto) {
        double dDistX = this.dCoordX - punto.dCoordX;
        double dDistY = this.dCoordY - punto.dCoordY;
        double dDistZ = this.dCoordZ - punto.dCoordZ;
        return Math.sqrt(Math.pow(dDistX, 2) + Math.pow(dDistY, 2) + Math.pow(dDistZ, 2));
    }
}