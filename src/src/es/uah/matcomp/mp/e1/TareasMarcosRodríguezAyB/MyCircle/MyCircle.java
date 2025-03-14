package es.uah.matcomp.mp.e1.MyCircle;

import es.uah.matcomp.mp.e1.MyPoint.MyPoint;

public class MyCircle {
    //Variables privadas
    private MyPoint center;
    private int radius;

    //2 funciones públicas de MyCircle
    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    //Devolver radius
    public int getRadius() {
        return radius;
    }

    //Establecer Radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    //Devolver y establecer centro
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    //Devolver y establecer "X" del centro
    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    //Devolver y establecer "Y" del centro
    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    //Devolver y establecer los valores de "x" e "y" en el centro
    public int[] getCenterXY() {
        return new int[]{getCenterX(), getCenterY()};
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
    }

    //Valor del área
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Valor del perímetro
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

    public String toString() {
        return "MyCircle" + "[radius=" + radius + ",center=" + center.toString() + "]";
    }
}
