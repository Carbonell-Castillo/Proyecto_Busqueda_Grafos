package Logica;

import Style.Circulo;
import java.util.List;

/**
 * @author Josue
 */
public class CirculoLogica {

    private static CirculoDatos circulosDatos = new CirculoDatos();

    public static boolean addCircle(Circulo circulo) {
        return circulosDatos.addCircle(circulo);
    }

    public static boolean removeCircle(char identificador) {
        return circulosDatos.removeCircle(identificador);
    }

    public static boolean removeAllCircles() {
        return circulosDatos.removeAllCircles();
    }
    
    public static List<Circulo> getCirculos() {
       return circulosDatos.getCirculos();
   }
}
