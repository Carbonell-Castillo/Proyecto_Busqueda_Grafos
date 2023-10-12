package Logica;

import Style.Lineas;
import java.util.List;

/**
 * @author Bruce Castillo
 */
public class AristasCalc {
    
    private static Aristas lineasDatos = new Aristas();
    
    public static boolean addLine(Lineas linea) {
        return lineasDatos.addLine(linea);
    }

    public static boolean removeLine(char v) {
        return lineasDatos.removeLine(v);
    }
    
    public static boolean removeAllLines() {
        return lineasDatos.removeAllLines();
    }
    
    public static List<Lineas> getCirculos() {
       return lineasDatos.getCirculos();
   }
}
