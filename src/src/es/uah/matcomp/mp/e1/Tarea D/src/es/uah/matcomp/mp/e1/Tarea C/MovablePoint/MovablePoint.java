package es.uah.matcomp.mp.e1.MovablePoint;

public class MovablePoint extends Point {
    //Variables privadas
    private float xspeed;
    private float yspeed;

    //Funciones públicas
    public MovablePoint() {
        xspeed = 0.0f;
        yspeed = 0.0f;
    }

    public MovablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MovablePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    //Variables xspeed e yspeed
    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

    //Definir Speed total
    public void setSpeed(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float[] getSpeed() {
        return new float[]{xspeed, yspeed};
    }

    public MovablePoint move() {
        setX(getX() + xspeed);
        setY(getY() + yspeed);
        return this;
    }

    //Salida
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xspeed + ", " + yspeed + ")";
    }
}
