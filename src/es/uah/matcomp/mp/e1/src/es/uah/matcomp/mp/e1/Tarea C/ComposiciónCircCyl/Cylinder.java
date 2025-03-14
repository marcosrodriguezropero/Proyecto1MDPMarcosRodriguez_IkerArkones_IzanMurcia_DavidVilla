package es.uah.matcomp.mp.e1.ComposiciónCircCyl;

import es.uah.matcomp.mp.e1.circle.Circle;

public class Cylinder {
    //Variables privadas
    private NewCircle base;
    private double height;

    //Construcción pública
    public Cylinder() {
        base = new NewCircle();
        height = 1.0;
    }

    public Cylinder(double radius ,double height, String color) {
        this.base = new NewCircle(radius, color);
        this.height = height;
    }

    //Establecer variable "height"
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Establecemos la variable "Radius"
    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "base=" + base + ", height=" + height + '}';
    }
}

