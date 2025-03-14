package es.uah.matcomp.mp.e1.MyPoint;

public class MyPoint {
    //Variables privadas
    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    //Establecer variables
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Devolver el valor de la variable x
    public int getX() {
        return x;
    }

    //Establecer el nombre de la variable
    public void setX(int x) {
        this.x = x;
    }

    //Devolver el valor de la variable y
    public int getY() {
        return y;
    }

    //Establecer el nombre de la variable
    public void setY(int y) {
        this.y = y;
    }

    //Devolver una varibale con x e y
    public int[] getXY() {
        return new int[] {x, y};
    }

    //Establecer los valores de x e y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Salida
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    //Devolver el valor de la distancia del punto 1
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    //Devolver el valor de la distancia del punto 2
    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
    }

    //Devolver la distancia total
    public double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}