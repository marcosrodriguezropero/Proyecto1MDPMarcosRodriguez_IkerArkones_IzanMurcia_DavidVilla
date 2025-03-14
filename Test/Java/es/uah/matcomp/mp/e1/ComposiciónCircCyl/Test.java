package es.uah.matcomp.mp.e1.ComposiciónCircCyl;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(4.5, 8.0, "blue");
        System.out.println("Y nuestro cilindro hermoso..." + cyl);
        cyl.getVolume();
        System.out.println("Y su respectivo volumen..." + cyl.getVolume());
    }
}