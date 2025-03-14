package es.uah.matcomp.mp.e1.GeometricObject2;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    public static void main(String[] args) {
        GeometricObject2 circle = new Circle2(5);

        System.out.println(circle);
        System.out.println("Área: " + circle.getArea());
        System.out.println("Perímetro: " + circle.getPerimeter());
    }
}