package retos.reto2;
import java.util.Scanner;
import static retos.reto2.Listas.linea;
/**
 * Es lo mismo que en la clase de Listas pero 
 * con la lofica chingona del profe 
 * @author eduar
 */
public class FilaTortillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("Tortillas Tec");
        Persona inicioFila = null;
        do{
            System.out.println("1...Nuevo Cliente");
            System.out.println("2...Atender Cliente");
            System.out.println("3...Cliente ENojado");
            System.out.println("4...Terminar Servicio");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
            case 1:
                System.out.print("Dame un nombre: ");
                String nombre = sc.nextLine();
                Persona personaNueva = new Persona();
                personaNueva.nombre = nombre;
                if(inicioFila == null)
                    inicioFila = personaNueva;
                else {
                    Persona siguiente = inicioFila;
                    while (siguiente.vieneAtras != null){
                        siguiente = siguiente.vieneAtras;
                    }
                    siguiente.vieneAtras = personaNueva;
                }
                imprimirLista(inicioFila);    
                break;
            case 2:
                    if (inicioFila != null);
                    inicioFila = inicioFila.vieneAtras;
                    imprimirLista(inicioFila);
                    break;
            case 3:
                System.out.println("A quien quieres eliminar?: ");
                String elimina = sc.nextLine();
                Persona buscado = inicioFila;
                Persona atras = null;
                while(!buscado.nombre.equals(elimina) && buscado != null){
                    atras = buscado;
                    buscado = buscado.vieneAtras;
                }
                // Caso 1 
                if (buscado != null){
                    // Caso 1
                    if (atras == null) inicioFila = inicioFila.vieneAtras;
                    // Caso 3
                    else if(buscado.vieneAtras == null) atras.vieneAtras = null;
                    // Caso 2
                    else atras.vieneAtras = buscado.vieneAtras;
                }
                
                break;
            case 4:
                imprimirLista(inicioFila);
                break;
        }
        }while (opc !=4);
    }
    public static void imprimirLista(Persona persona){
        if (persona != null)
            System.out.println(persona.nombre);
            imprimirLista(persona.vieneAtras);
    }
}

class Persona{
    String nombre;
    Persona vieneAtras;
}
