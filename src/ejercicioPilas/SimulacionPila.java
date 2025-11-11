package ejercicioPilas;
import java.util.Arrays;
/**
 * Clase que me permite verificar mis operaciones con la pila
 * @author eduar
 */
public class SimulacionPila {
    public static void main(String[] args) {
        MiStack miPila = new MiStack(5);
        
        miPila.push("Uno");
        miPila.push("Dos");
        miPila.push("Tres");
        miPila.push("Cuatro");
        miPila.push("Cinco");
        
        System.out.println("Valor que esta en el tope " + miPila.peak());
        
        miPila.pop();
        miPila.pop();
        
        System.out.println("Todos los valores " + Arrays.toString(miPila.viewStack()));
    }
}
