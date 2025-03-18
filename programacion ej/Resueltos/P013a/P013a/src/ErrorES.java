/**
 *
 * @author Mattias Nygren Jiménez
 * @version 2.0
 */
public class ErrorES {
    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------
    private int iCodigo;
    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------
    public ErrorES() {
        this.iCodigo = 0;
    }
    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------
    public int obtenerCodigo() {
        return this.iCodigo;
    }
    public void cambiarCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }
    public String obtenerMensaje() {
        switch (this.iCodigo) {
            case 1:
                return "ERROR 1: Error al abrir el fichero.";
            case 2:
                return "ERROR 2: Error al crear el fichero.";
            case 3:
                return "ERROR 3: Error en la lectura de una línea de texto.";
            case 4:
                return "ERROR 4: Error en la escritura de una línea de texto.";
            case 5:
                return "ERROR 5: Error al cerrar el fichero.";
            default:
                return "ERROR 6: Error desconocido.";
        }
    }
}