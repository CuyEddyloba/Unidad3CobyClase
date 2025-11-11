package ejercicioPilas;
/**
 * En esta clase trabajamos con los datos en LIFO 
 * Es una pila estática para manipular datos
 * @author eduar
 */
public class MiStack {
    private final int MAXIMO;
    private final String[] STACK;
    private int tope;
    
    /**
     * Metodo que me permita ver el contenido de la pila
     * @return un arreglo con los datos
     */
    
    public String[] viewStack(){
        int topeVirtual = tope + 1;
        String[] values = new String[topeVirtual];
        int index = 0;
        for (int i = tope; i >= 0; i--){
            values[index] = STACK[i];
            index++;
        } 
        return values;
    }
    
    /**
     * Metodo que te permite mostrar los elementos que tiene la pula en el tope 
     * @return el valor, si no existe, regresa vacio 
     */
    
    public String peak(){
        String value = "";
        if (tope >= 0){
            value = STACK[tope];
        }
        return value;
    }
    
    /**
     * Metodo que permite sacar el valor que tenemos en el tope de la pila
     * @return regresa el valor que tenemos en el final de la pila 
     *          Si el valor no existe, regresa vacia
     */
    
    public String pop(){
        String value = "";
        if (tope>=0){
            value = STACK[tope];
            tope--;
        }
        return value;
    }
    
    /**
     * Metodo para agregar valores a la pila 
     * @param value es el elemento que se agrega
     * @return verdadero si logro entrar
     */
    
    public boolean push(String value){
        boolean isSuccess;
        if(tope<MAXIMO){
            tope++;
            STACK[tope] = value;
            isSuccess = true;
        } else {
            isSuccess = false;
        }
        return isSuccess;
    }
    
    public MiStack(){
        this(10);
    }
    
    public MiStack(int max){
        MAXIMO = max;
        STACK = new String[MAXIMO];
        tope = -1;
    }
}
