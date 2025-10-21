package retos.reto2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * En este programa se hará una simulación de una fila 
 * en la cual las variables avanzan y pueden salir 
 * @author eduar
 */
public class Listas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        int opcion;
        do{
            linea();
            System.out.println("1...Agregar persona");
            System.out.println("2...Avanzar fila");
            System.out.println("3...Persona se sale");
            System.out.println("4...Mostrar fila");
            System.out.println("5...Salir");
            System.out.print("Seleccióne una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
            case 1:
                System.out.print("Nombre: ");
                String nombre = leer.next();
                fila.add(nombre);
                break;
            case 2:
                if (!fila.isEmpty()) {
                    System.out.println("Avanza: " + fila.poll());
                } else {
                    System.out.println("La fila está vacía.");
                }
                break;
            case 3:
                System.out.print("Persona que se quiere ir: ");
                String sacar = leer.next();
                if (fila.remove(sacar)) {
                    System.out.println(sacar + " mejor se fué a la verga todo enojado.");
                } else {
                    System.out.println("No se encontró a " + sacar + " en la fila.");
                }
                break;
            case 4:
                System.out.println("Fila actual: " + fila);
                break;
            case 5:
                System.out.println("Ya cerramos! Personas sin atender: " + fila);
                break;
        }

    }while (opcion !=5);
}
    public static void linea(){
        System.out.println("-----------------------------------------------------------------------");
    }
}