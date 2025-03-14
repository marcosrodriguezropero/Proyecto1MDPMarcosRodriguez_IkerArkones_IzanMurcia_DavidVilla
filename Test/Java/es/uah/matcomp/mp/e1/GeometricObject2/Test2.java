package es.uah.matcomp.mp.e1.GeometricObject2;

import static org.junit.jupiter.api.Assertions.*;

class TestMain24 {
    public static void main(String[] args) {
        Circle2 RC = new ResizableCircle(5);
        System.out.println(RC);
        System.out.println("Área inicial: " + RC.getArea());
        System.out.println("Perímetro inicial: " + RC.getPerimeter());

        ResizableCircle RC2 = new ResizableCircle(7); {
            System.out.println(RC2);
            RC2.resize(200);
            System.out.println("La segunda área del segundo círculo engrandecido...  " + RC2.getArea());
            System.out.println("El segundo perímetro del segundo círculo engrandecido... " + RC2.getPerimeter());
        }
    }
}