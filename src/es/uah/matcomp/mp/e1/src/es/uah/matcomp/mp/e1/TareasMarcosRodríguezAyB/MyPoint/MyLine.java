package es.uah.matcomp.mp.e1.MyPoint;

public class MyLine {
    //Variables privadas
    private MyPoint begin;
    private MyPoint end;

    //Función pública que determina las variables con otras
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    //Funciones que establecen las variables privadas iniciales
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    //begin
    public void setBegin (MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getBegin () {
        return begin;
    }

    //end
    public void setEnd (MyPoint end) {
        this.end = end;
    }

    public MyPoint getEnd () {
        return end;
    }

    //"x"
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    //"y"
    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    //Devolver y establecer el valor de las coordenadas de inicio y final por las variables "x" e "y"
    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    //Longitud
    public double getLength() {
        return begin.distance(end);
    }

    //Diferencia de x e y
    public double getGradient(){
        int xdiff = end.getX() - begin.getX();
        int ydiff = end.getY() - begin.getY();
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    //Salida
    @Override
    public String toString() {
        return "MyLine[begin=" + begin.toString() + ",end=" + end.toString() + "]";
    }
}
