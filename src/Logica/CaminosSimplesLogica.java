package Logica;

import Style.CaminosSimples;
import java.util.List;

/**
 * @author Bruce Castillo
 */
public class CaminosSimplesLogica {
    
    private static CaminosSimplesDatos caminosDatos = new CaminosSimplesDatos();
    
    public static boolean addCamino(CaminosSimples camino){
        return caminosDatos.addCamino(camino);
    } 
    
    public static void removeall() {
        caminosDatos.removeall();
    }
    
    public static List<CaminosSimples> getCaminos() {
        return caminosDatos.getCaminos();
    }
}
