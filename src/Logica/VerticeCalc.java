package Logica;

import Style.Vertice;
import java.util.List;

/**
 * @author Bruce Castillo
 */
public class VerticeCalc {

    private static Vertices circulosDatos = new Vertices();

    public static boolean addCircle(Vertice circulo) {
        return circulosDatos.addCircle(circulo);
    }

    public static boolean removeCircle(char identificador) {
        return circulosDatos.removeCircle(identificador);
    }

    public static boolean removeAllCircles() {
        return circulosDatos.removeAllCircles();
    }
    
    public static List<Vertice> getCirculos() {
       return circulosDatos.getCirculos();
   }
}
