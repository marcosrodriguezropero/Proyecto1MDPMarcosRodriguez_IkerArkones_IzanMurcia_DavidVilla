package es.uah.matcomp.mp.e1.MovablePoint;

import static org.junit.jupiter.api.Assertions.*;

class TestMain17 {
    public static void main(String[] args) {
        Point p1 = new Point(2.0f, 5.0f);
        System.out.println("Y el punto maravilloso es..." + p1);

        p1.setXY(6.5f,3.5f);
        System.out.println("Y el punto cambiado maravillosamente es..." + p1);

        MovablePoint mp1 = new MovablePoint(2.0f, 5.0f, 6.5f,3.5f);
        System.out.println("El punto maravilloso con su velocidad es..." + mp1);

        mp1.move();
        System.out.println("Si mueves suavesito el punto maravilloso..." + mp1);

        mp1.move();
        System.out.println("Otra vez..." + mp1);
    }
}