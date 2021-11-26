/*
 Agregar lo correspondiente para que el proceso siguiente permita
 sumar las notas en cada iteración y presentar en la cadena final el
 valor de la suma.
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author valeriayunga
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        double suma;
        boolean bandera = true;
        int salida;
        do {
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, nota);

            System.out.println("Ingrese (-111) si desea salir del ciclo ");
            salida = entrada.nextInt();

            if (salida == -111) {
                bandera = false;
            }

        } while (bandera); // (bandera==true)
        
        System.out.printf("Listado de Notas\n%s\n", cadenaFinal);
    }
}
