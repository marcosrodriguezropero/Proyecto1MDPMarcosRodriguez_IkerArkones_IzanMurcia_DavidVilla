package es.uah.matcomp.mp.e1.circle;
//Creamos la clase círculo
public class Circle {
    //Creamos la variable privada, no accesible fuera de la clase
    private double radius;

    //Funciones Públicas
    //Proveemos una función círculo con valor determinado por defecto para el radio
    public Circle() {
        radius = 1.0;
    }

    //Otra función con el radio dado
    public Circle(double r) {
        radius = r;
    }

    //Otra función para devolver el valor del radio
    public double getRadius() {
        return radius;
    }

    //Función para establecer el valor de la variable a otro nombre
    public void setRadius(double r) {
        this.radius = r;
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
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}