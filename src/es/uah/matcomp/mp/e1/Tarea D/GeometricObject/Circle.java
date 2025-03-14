package es.uah.matcomp.mp.e1.GeometricObject;

public class Circle implements GeometricObject {
    //Variables privadas
    private double radius;

    //Métodos públicos
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius +"]";
    }
}
