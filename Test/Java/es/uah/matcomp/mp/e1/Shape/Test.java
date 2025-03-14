package es.uah.matcomp.mp.e1.Shape;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    public static void main(String[] args) {
        Shape c1 = new Circle(2.5, "blue", false);
        System.out.println(c1);

        Shape r1 = new Rectangle(6,8,"blue", true);
        System.out.println(r1);

        Shape s1 = new Square(6,"yellow", false);
        System.out.println(s1);
    }


}