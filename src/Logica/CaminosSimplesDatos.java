package Logica;

import Style.CaminosSimples;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruce Castillo
 */
public class CaminosSimplesDatos {
    
    private List<CaminosSimples> caminos;
    
    public CaminosSimplesDatos() {
        caminos = new ArrayList<>();
    }
    
    public boolean addCamino(CaminosSimples camino){
        caminos.add(camino);
        return true;
    } 
    
    public void removeall() {
        caminos.clear();
    }
    
    public List<CaminosSimples> getCaminos() {
        return caminos;
    }
}
