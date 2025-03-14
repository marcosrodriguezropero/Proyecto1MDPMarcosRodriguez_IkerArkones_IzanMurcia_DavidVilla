package es.uah.matcomp.mp.e1.Shape;

public class Circle extends Shape {
    //Variables privadas
    private double radius;

    //Funciones públicas
    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //Establecer la variable "radius"
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Obtenemos el área
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Obtenemos el perímetro
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //Salida
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
