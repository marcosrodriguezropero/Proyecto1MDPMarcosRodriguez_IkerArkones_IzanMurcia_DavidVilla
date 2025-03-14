package es.uah.matcomp.mp.e1.MyCircle;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(3,4,5);
        MyCircle c2 = new MyCircle( 6,7, 7);

        System.out.println("Primer círculo: " + c1);
        System.out.println("Segundo círculo: " + c2);

        System.out.println("Área1:" + c1.getArea());
        System.out.println("Perimeter1:" + c1.getCircumference());
        System.out.println("Área2:" + c2.getArea());
        System.out.println("Perimeter2:" + c2.getCircumference());

        System.out.println("Distancia entre círculos:" + c1.distance(c2));
    }
}