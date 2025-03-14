package es.uah.matcomp.mp.e1.Movable;

import static org.junit.jupiter.api.Assertions.*;

class TestMain21 {
    public static void main(String[] args) {
        Movable p1 = new MovablePoint(2, 4,6,8);
        System.out.println("El punto " + p1);

        p1.moveUp();
        System.out.println("Suavesito para arriba... " + p1);

        p1.moveDown();
        System.out.println("Suavesito para abajo..." + p1);

        p1.moveLeft();
        System.out.println("Suavesito para la izquierda..." + p1);

        p1.moveRight();
        System.out.println("Suavesito para la derecha..." + p1);
    }
}