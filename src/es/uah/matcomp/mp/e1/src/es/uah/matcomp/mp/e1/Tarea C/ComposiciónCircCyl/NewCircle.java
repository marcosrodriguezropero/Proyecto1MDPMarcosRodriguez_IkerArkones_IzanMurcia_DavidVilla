package es.uah.matcomp.mp.e1.ComposiciónCircCyl;

public class NewCircle {
    //Creamos la variable privada, no accesible fuera de la clase
    private double radius;
    private String color;

    //Funciones Públicas
    //Proveemos una función círculo con valor determinado por defecto para el radio
    public NewCircle() {
        this.radius = 1.0;
        this.color = "red";
    }

    //Otra función con el radio dado
    public NewCircle(double r) {
        this.radius = r;
        this.color = "red";
    }

    public NewCircle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    //Otra función para devolver el valor del radio
    public double getRadius() {
        return radius;
    }

    //Función para establecer el valor de la variable a otro nombre
    public void setRadius(double r) {
        this.radius = r;
    }

    //Establecer variable "color"
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Función para devolver el valor del área mediante la librería "Math" y el valor de la variable "radius"
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Función para devolver el valor del perímetro
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    //Función para determinar como mostrar el valor correspondiente
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

}
