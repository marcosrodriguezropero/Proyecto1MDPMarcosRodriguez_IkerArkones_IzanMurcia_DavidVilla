package es.uah.matcomp.mp.e1.Movable2;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    public static void main(String[] args) {
        MovableCircle mv1 = new MovableCircle(3,4,5,6,7);
        System.out.println(mv1);

        mv1.moveUp();
        System.out.println("Lo subimos y... " + mv1);

        mv1.moveDown();
        System.out.println("Lo bajamos y... " + mv1);

        mv1.moveLeft();
        System.out.println("Izquierdazo y... " + mv1);

        mv1.moveRight();
        System.out.println("Derechamos y... " + mv1);
    }
}