package es.uah.matcomp.mp.e1.Shape;

public class Rectangle extends Shape {
    //Variables privadas
    private double width;
    private double height;

    //Funciones públicas
    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    //Establecer la variable "width"
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Establecer la variable "height"
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Establecemos la variable "Length"
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2*(width + height);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + "width=" + width + ", height=" + height + "]";
    }
}
