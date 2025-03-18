import java.io.*;
import java.time.LocalDate;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class test {
    private static final long serialVersionUID = 1L;
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        File fichero;
        ObjectOutputStream fichObj = null;
        ObjectInputStream fichObj2 = null;
        Empleado emp;
        //----------------------------------------------
        //     Procesamientos 
        //----------------------------------------------
        fichero = new File("fichero.dat");
        try {
            fichObj = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fichero), 1024));
            fichObj.writeObject(new Empleado("Pedro", 1.68, 2025, 1, 1));
            fichObj.writeObject(new Empleado("Silvia", 1.75, 2025, 1, 1));
            fichObj.close();
        } catch (IOException e) {}

        try {
            fichObj2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fichero), 1024));
            emp = (Empleado) fichObj2.readObject();
            System.out.printf("Nombre: %s\n", emp.obtenerNombre());
            System.out.printf("Altura: %s\n", emp.obtenerAltura());
            System.out.printf("Nombre: %s\n", emp.obtenerFecha().toString());
            fichObj2.close();
        } catch (IOException e) {}

    }
}