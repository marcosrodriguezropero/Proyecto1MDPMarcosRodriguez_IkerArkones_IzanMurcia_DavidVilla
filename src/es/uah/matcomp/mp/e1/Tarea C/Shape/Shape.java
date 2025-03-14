package es.uah.matcomp.mp.e1.Shape;

public class Shape {
    private String color;
    private boolean filled;

    //Funciones públicas
    public Shape() {
        color = "red";
        filled = true;
    };

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //Establecer la variable "color"
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Establecer la variable "Filled"
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Salida
    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}

