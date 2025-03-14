package es.uah.matcomp.mp.e1.Ball;
//Clase pública Ball
public class Ball {
    //Variables privadas
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    //Funciones públicas
    //Función Ball con todas las variables
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = x - this.x;
        this.yDelta = y - this.y;
    }

    //Función que devuleve el valor x
    public float getX() {
        return x;
    }

    //Función que establece la variable "x" donde almacenar el valor x
    public void setX(float x) {
        this.x = x;
    }

    //Función que devuelve el valor y
    public float getY() {
        return y;
    }

    //Función que establece la varaible "y" donde almacenar el valor y
    public void setY(float y) {
        this.y = y;
    }

    //Función que devuelve el valor Radius
    public int getRadius() {
        return radius;
    }

    //Función que establece la variable "radius" donde almacenar el valor del radio
    public void setRadius(int radius) {
        this.radius = radius;
    }

    //Función que devuelve el valor de XDelta
    public float getXDelta() {
        return xDelta;
    }

    //Función que establece la variable "xDelta" donde almacenar el valor de xDelta
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    //Función que devuelve el valor de YDelta
    public float getYDelta() {
        return yDelta;
    }

    //Función que establece la variable "yDelta" donde almacenar el valor de yDelta
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    //Función para moverse por x e y
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    //Función para el reflejo horizontal
    public void reflectHorizontal() {
        this.xDelta = -this.xDelta;
    }

    //Función para el reflejo vertical
    public void reflectVertical() {
        this.yDelta = -this.yDelta;
    }

    //Función que determina como escribir la salida
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}
