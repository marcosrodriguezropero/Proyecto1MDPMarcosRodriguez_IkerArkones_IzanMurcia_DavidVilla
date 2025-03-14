package es.uah.matcomp.mp.e1.MovablePoint;

public class Point {
    //Variables privadas
    private float x;
    private float y;

    //Funciones públicas
    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //Devolvemos y establecemos las variables x e y
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    //XY con las variables x e y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    //Salida
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
