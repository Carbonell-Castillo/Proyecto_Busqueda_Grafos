package Logica;

import Style.Lineas;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Josue
 */
public class LineasDatos {

    private List<Lineas> lineas;

    public LineasDatos() {
        lineas = new ArrayList<>();
    }

    public int buscar(char v1, char v2) {
        int n = -1;
        try {
            for (int i = 0; i < lineas.size(); i++) {
                if ((lineas.get(i).getV1() == v1 && lineas.get(i).getV2() == v2)
                        || (lineas.get(i).getV1() == v2 && lineas.get(i).getV2() == v1)) {
                    n = i;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Lista vacia, Lineas");
        }
        return n;
    }

    public int buscar(char v) {
        int n = -1;
        try {
            for (int i = 0; i < lineas.size(); i++) {
                if (lineas.get(i).getV1() == v || lineas.get(i).getV2() == v) {
                    n = i;
                    break;
                }
            }
        } catch (Exception e) {
        }
        return n;
    }

    public boolean addLine(Lineas linea) {
        if (buscar(linea.getV1(), linea.getV2()) == -1) {
            lineas.add(linea);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeLine(char v) {
        if (buscar(v) != -1) {
            lineas.remove(buscar(v));
            return removeLine(v);
        } else {
            return true;
        }
    }

    public boolean removeAllLines() {
        lineas.clear();
        return true;
    }

    public List<Lineas> getCirculos() {
        return lineas;
    }
}
