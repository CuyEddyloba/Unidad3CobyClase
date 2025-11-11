package ejercicio1.datos;

import java.util.List;
import java.util.ArrayList;

/**
 * Esta clase me permite mantener la informacion entre las ventanas
 * @author eduar
 * 14 de Octubre
 */
public class KardexDatos {
    
    //public static String[][] listasMaterias = new String[10][3];
    public static ArrayList<Materias> listasMaterias = new ArrayList<>();
    public static int index = 0;

    

    public static void setMaterias(List<KardexDatos> materias) {
        KardexDatos.listasMaterias = listasMaterias;
    }

}
