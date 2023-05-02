package Style;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Josue
 */
public class Circulo {
    
    //Atributos de la clase
    private char identificador;
    private String texto;
    private int x, y, radius;
    private Color color;

    //Constructor
    public Circulo(char identificador,int x, int y) {
        this.identificador = identificador;
        this.texto = String.valueOf(identificador);
        this.x = x;
        this.y = y;
        this.radius = 10;
        this.color = Color.ORANGE;
    }
    
    //Getter and Setters
    public char getIdentificador() {
        return identificador;
    }

    public void setIdentificador(char identificador) {
        this.identificador = identificador;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
