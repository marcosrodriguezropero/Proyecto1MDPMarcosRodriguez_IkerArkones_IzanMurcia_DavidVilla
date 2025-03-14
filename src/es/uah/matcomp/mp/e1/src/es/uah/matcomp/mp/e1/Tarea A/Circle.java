public class Circle {
    // Atributos privados
    private double radius;
    private String color;

    // Constructores
    /** Constructor por defecto */
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructor con radio especificado */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    /** Constructor con radio y color especificados */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Métodos Getter
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    // Métodos Setter
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}