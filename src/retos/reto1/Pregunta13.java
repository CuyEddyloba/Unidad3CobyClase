package retos.reto1;
import java.util.Scanner;
/**
 *
 * @author eduar
 */
public class Pregunta13 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int a;
        System.out.print("Numero: ");
        a = leer.nextInt();

        serieDescendente(a);
    }

    public static void serieDescendente(int z) {
        if (z >= 0) {
            System.out.println(z);
            serieDescendente(z - 1);
        }
    }

}
