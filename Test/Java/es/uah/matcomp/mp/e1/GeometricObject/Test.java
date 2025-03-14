package es.uah.matcomp.mp.e1.GeometricObject;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(3.2);
        GeometricObject r1 = new Rectangle(2.7, 5.8);

        System.out.println("Nuestro bonito círculo" + c1);
        System.out.println("Su área es..." + c1.getArea());
        System.out.println("Y su perímetro..." + c1.getPerimeter());

        System.out.println("Nuestro precioso rectángulo" + r1);
        System.out.println("Su área..." + r1.getArea());
        System.out.println("Y su perímetro..." + r1.getPerimeter());

    }
}