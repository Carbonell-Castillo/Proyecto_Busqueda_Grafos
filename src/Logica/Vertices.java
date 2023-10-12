package Logica;

import Style.Vertice;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruce Castillo
 */
public class Vertices {
    
   private List<Vertice> circulos;
   
   public Vertices() {
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
   
   public boolean addCircle(Vertice circulo){
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
   
   public List<Vertice> getCirculos() {
       return circulos;
   }
}
