/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Articulo {
    //----------------------------------------------
    //       Declaración de campos constantes
    //----------------------------------------------
    private static double dIVA = 21;
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private String nombre;
    private double dPrecio;
    private int iStock;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public Articulo(String nombre) throws Exception {
        if (nombre.isEmpty()) { throw new Exception("El nombre no puede estar vacío."); }
        this.nombre = nombre;
        this.dPrecio = 0;
        this.iStock = 0;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public double getIVA() {
        return Articulo.dIVA;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.dPrecio;
    }

    public int getStock() {
        return this.iStock;
    }

    public double precioVenta() {
        double dPrecioVenta = this.dPrecio + (this.dPrecio* (Articulo.dIVA*0.01));
        return dPrecioVenta;
    }

    /*
    public void cambiarPrecio(double dPrecio) throws Exception {

        if (dPrecio > 0) {
            throw new Exception("El número no puede ser negativo.");
        } else {
            this.dPrecio = dPrecio;
        }

    }
    */

    public void cambiarPrecio(double dPrecio) throws MiExcepcion {

        if (dPrecio > 0) {
            throw new MiExcepcion("El número no puede ser negativo.");
        } else {
            this.dPrecio = dPrecio;
        }

    }

    class MiExcepcion extends Exception {
        private String miMensaje;

        public MiExcepcion() {
            this.miMensaje = "Error inespecífico.";
        }

        public MiExcepcion(String mensaje) {
            this.miMensaje = mensaje;
        }

        @Override
        public String getMessage() {
            return this.miMensaje;
        }
    }








    public boolean cambiarStock(int iStock) {
        boolean bValidez;

        if (iStock >= 0) {
            this.iStock = iStock;
            bValidez = true;
        } else {
            bValidez = false;
        }

        return bValidez;
    }

    public boolean vender(int iNumUnidades) {
        boolean bValidez;

        if (iNumUnidades >= 0) {
            this.iStock = iStock - iNumUnidades;
            bValidez = true;
        } else {
            bValidez = false;
        }

        return bValidez;
    }
}