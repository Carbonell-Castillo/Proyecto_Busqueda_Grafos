package Logica;

import Style.Circulo;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Josue
 */
public class CirculoDatos {
    
   private List<Circulo> circulos;
   
   public CirculoDatos() {
       circulos = new ArrayList<>();
   }
   
   public int buscar(char identificardor){
       int n = -1;
       try {
           for (int i = 0; i < circulos.size(); i++) {
               if (circulos.get(i).getIdentificador() == identificardor) {
                   n = i;
                   break;
               }
           }
       } catch (Exception e) {
           System.out.println("Lista vacia, Circulos");
       }
       return n;
   }
   
   public boolean addCircle(Circulo circulo){
       if (buscar(circulo.getIdentificador()) == -1) {
          circulos.add(circulo); 
          return true;
       } else{
           return false;
       }
   }
   
   public boolean removeCircle(char identificador){
       if(buscar(identificador) != -1){
           circulos.remove(buscar(identificador));
           return true;
       } else{
           return false;
       }
   }
   
   public boolean removeAllCircles(){
       circulos.clear();
       return true;
   }
   
   public List<Circulo> getCirculos() {
       return circulos;
   }
}
