public class Point {
    private int x; // Coordenada x
    private int y; // Coordenada y

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos públicos
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
