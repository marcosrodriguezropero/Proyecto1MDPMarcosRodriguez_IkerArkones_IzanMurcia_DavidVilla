package es.uah.matcomp.mp.e1.GeometricObject2;

import es.uah.matcomp.mp.e1.GeometricObject.GeometricObject;

public class Circle2 implements GeometricObject2 {
    //Variables privadas
    protected double radius;

    //Métodos públicos
    public Circle2(double radius) {
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
