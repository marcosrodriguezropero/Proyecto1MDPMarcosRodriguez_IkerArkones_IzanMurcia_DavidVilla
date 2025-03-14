package es.uah.matcomp.mp.e1.Point2D3D;

public class Point2D {
    //Variables privadas
    private float x;
    private float y;

    //Funciones públicas con variables
    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //Devolver y establecer el valor de "x" e "y"
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

    //Determinamos un array {x, y} y definimos las variables
    public float[] getXY() {
        float[] result = new float[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //Salida
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
