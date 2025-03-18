import java.util.Scanner;

/**
 *
 * @author Mattias Nygren Jiménez
 * @version 1.0
 */
public class Practica004d {
    /**
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        Scanner entrada = new Scanner(System.in);
        int iSeleccion = 0, iNumIntentos = 0, iTope = 0, iNumOculto, iIntento = 0;
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.printf("\nAdivina... adivinanza...\n");
        System.out.printf("========================\n");
        do {
            try {
                System.out.printf("\n1. Configurar. / 2. Jugar / 3. Salir: ");
                iSeleccion = entrada.nextInt();
                switch (iSeleccion) {
                    case 1:
                        System.out.printf("\nIndica el número de intentos permitidos: ");
                        iNumIntentos = entrada.nextInt();
                        System.out.printf("Indica el valor máximo aleatorio que se puede generar: ");
                        iTope = entrada.nextInt();
                        break;
                    case 2:
                        if (iNumIntentos > 0) {
                            System.out.printf("\nTienes %d intentos para adivinar un número entre 0 y %d.\n\n", iNumIntentos, iTope);
                            iNumOculto = (int) Math.round(Math.random() * iTope);
                            for (int q = 1; q <= iNumIntentos; q++) {
                                System.out.printf("Intento %d/%d: ", q, iNumIntentos);
                                iIntento = entrada.nextInt();
                                //----------------------------------------------
                                //       Procesamiento + Salida de Resultados
                                //----------------------------------------------
                                if (iIntento == iNumOculto) {
                                    System.out.printf("¡Enhorabuena! Has adivinado el número oculto.\n");
                                    break;
                                } else {
                                    if (iIntento > iNumOculto) {
                                        System.out.printf("El valor a adivinar es más pequeño.\n\n");
                                    } else {
                                        System.out.printf("El valor a adivinar es más grande.\n\n");
                                    }
                                }
                            }
                            if (iIntento != iNumOculto) {
                                System.out.printf("¡Has agotado el número de intentos! El número oculto era: %d.\n", iNumOculto);
                            }
                        } else {
                            System.out.printf("\nNecesitas configurar el juego antes de poder jugar.\n");
                        }
                        break;
                    case 3:
                        break;
                    default:
                        break;
                } 
            } catch (Exception e) {
                System.out.printf("\nEntrada no válida.\n");
                entrada.nextLine();
            }
        } while (iSeleccion != 3);

        entrada.close();
    }
}