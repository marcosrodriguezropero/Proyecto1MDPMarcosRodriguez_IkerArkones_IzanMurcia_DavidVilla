package es.uah.matcomp.mp.e1.Movable2;

import es.uah.matcomp.mp.e1.Movable.Movable;

public class MovablePoint2 implements Movable2 {
    //Variables privadas
    private int x;
    private int y;
    private int xspeed;
    private int yspeed;

    public MovablePoint2(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public void moveUp() {
        y += yspeed;
    }

    @Override
    public void moveDown() {
        y -= yspeed;
    }

    @Override
    public void moveLeft() {
        x -= xspeed;
    }

    @Override
    public void moveRight() {
        x += xspeed;
    }

    //Salida
    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xspeed + ", " + yspeed + ")";
    }
}
