public class LineSub extends Point {
    private Point end;  // Punto de fin

    // Constructor
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);  // Construye el punto de inicio
        this.end = new Point(endX, endY);  // Construye el punto de fin
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());  // Reinicia el punto de inicio
        this.end = end;
    }

    // Métodos públicos
    public String toString() {
        return "Line from " + super.toString() + " to " + end.toString();
    }

    public Point getBegin() {
        return this;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        setX(begin.getX());
        setY(begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getLength() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.atan2(yDiff, xDiff);
    }
}
