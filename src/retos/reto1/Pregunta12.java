package retos.reto1;
import java.util.Scanner;
/**
 * EN este programa se soluciona la pregunta 12 del examen 
 * @author eduar
 */
public class Pregunta12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int a = leer.nextInt();
        System.out.print("Numero 2: ");
        int b = leer.nextInt();
        System.out.print("Numero 3: ");
        int c = leer.nextInt();
        
        int menor = numeroMenor(a,b,c);
        System.out.println("El numero menor es: " + menor);
        
    }
    public static int numeroMenor(int a, int b, int c){
        if (a < b && a < c) return a;
        else if (b < c) return b;
        else return c;
    }
}
