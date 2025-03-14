package es.uah.matcomp.mp.e1.Movable2;

import es.uah.matcomp.mp.e1.Movable.Movable;
import es.uah.matcomp.mp.e1.MovablePoint.MovablePoint;

public class MovableCircle implements Movable2 {
    //Variables privadas compuestas con Movablepoint
    private int radius;
    private MovablePoint2 center;

    //Métodos públicos
    public MovableCircle(int x, int y, int xspeed, int yspeed ,int radius) {
        this.center = new MovablePoint2(x,y,xspeed,yspeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return center.toString() + ", radius=" + radius;
    }
}
