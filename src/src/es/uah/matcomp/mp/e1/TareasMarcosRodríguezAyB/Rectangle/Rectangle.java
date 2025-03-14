package es.uah.matcomp.mp.e1.Rectangle;
//Clase pública rectángulo
public class Rectangle {
    //Las varibales privadas "length" y "width" admitidas como valor racional
    private float length;
    private float width;

    //Función pública rectángulo para proveer al valor por defecto a la longitud y al ancho
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    //Función pública para determinar al valor de las varibales otros nombres diferentes
    public Rectangle(float l, float w) {
        this.length = l;
        this.width = w;
    }

    //Función pública para devolver el valor de la longitud
    public float getLength() {
        return length;
    }

    //Función pública protegida para establecer el valor de la longitud a otro
    public void setLength(float l) {
        this.length = l;
    }

    //Función pública para devolver el valor del ancho
    public float getWidth() {
        return width;
    }

    //Función pública protegida para establecer el valor del ancho a otro
    public void setWidth(float w) {
        this.width = w;
    }

    //Función pública para determinar el valor del área
    public double getArea() {
        return length * width;
    }

    //Función pública para determinar el valor del perímetro
    public double getPerimeter() {
        return 2 * (length + width);
    }

    //Función pública para
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width +"]";
    }
}


