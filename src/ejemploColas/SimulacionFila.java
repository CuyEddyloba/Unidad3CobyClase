package ejemploColas;

import java.util.Arrays;

/**
 * Metodo para probar el funcionamiento de una fila
 * @author eduar
 */
public class SimulacionFila {
    public static void main(String[] args) {
        MiFila fila = new MiFila(5);
        
        fila.Offer("Lalo");
        fila.Offer("Janeth");
        fila.Offer("Pedro");
        
        System.out.println("Valores: " + Arrays.toString(fila.aArreglo()));
        System.out.println("Atendido: " + fila.poll());
        System.out.println("Valores: "+ Arrays.toString(fila.aArreglo()));
        System.out.println("Al frente: " + fila.peek());
    }
}
