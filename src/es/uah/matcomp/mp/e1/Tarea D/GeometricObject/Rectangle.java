package es.uah.matcomp.mp.e1.GeometricObject;

public class Rectangle implements GeometricObject {
    //Variables privadas
    private double width;
    private double height;

    //Métodos públicos de la clase relacionados con la interfaz
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width * height;
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",height=" + height + "]";
    }
}
