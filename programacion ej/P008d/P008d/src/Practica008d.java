import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica008d {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //     Declaración de constantes
        //----------------------------------------------
        Articulo articulos[] = new Articulo[10];
        //----------------------------------------------
        //     Declaración de variables 
        //----------------------------------------------
        String nombre;
        double dPrecio;
        int iStock;
        int iNumArticulos = 0;

        Scanner entrada = new Scanner(System.in);
        //----------------------------------------------
        //     Entrada de datos 
        //----------------------------------------------
        System.out.printf("\nClase Artículo");
        System.out.printf("\n==============\n");

        do {
            System.out.printf("\nIntroduce el nombre del artículo: ");
            nombre = entrada.nextLine();
            if (nombre.isBlank()) {
                break;
            }

            do {
                try {
                    System.out.printf("Introduce el precio: ");
                    dPrecio = entrada.nextDouble();
                    System.out.printf("Introduce el stock: ");
                    iStock = entrada.nextInt();
                    iNumArticulos++;

                    articulos[iNumArticulos-1] = new Articulo(nombre);
                    articulos[iNumArticulos-1].cambiarPrecio(dPrecio);
                    articulos[iNumArticulos-1].cambiarStock(iStock);

                    entrada.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.printf("\nDebe ser un número.\n");
                    entrada.nextLine();
                } catch (MiExcepcion e) {
                    System.out.printf("%s\n", MiExcepcion.getMessage());
                }
            } while (true);

        } while (iNumArticulos < 10);
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------

        System.out.printf("\nListado de artículos:");
        System.out.printf("\n=====================");
        if (iNumArticulos == 0) {
            System.out.printf("\nNo se ha registrado ningún artículo.");
        } else {
            for (int q = 0; q < iNumArticulos; q++) {
                System.out.printf("\nProducto %d", q+1);
                System.out.printf("\n\tNombre: %s", articulos[q].getNombre());
                System.out.printf("\n\tPrecio (con IVA): %.2f", articulos[q].precioVenta());
                System.out.printf("\n\tStock: %d unidades.", articulos[q].getStock());
            }
        }
    }
}