package es.uah.matcomp.mp.e1.Shape;

public class Square extends Rectangle {

    //Funciones públicas
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    //Definimos la variable "side"
    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    //Establecemos las variables "Height" y "Width"
    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setHeight(double height) {
        super.setHeight(height);
    }

    //Salida
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
