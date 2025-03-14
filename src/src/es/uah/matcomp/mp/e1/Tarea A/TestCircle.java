public class TestCircle {
    public static void main(String[] args) {
        // Creación de instancias de Circle
        Circle c1 = new Circle();
        System.out.println("Círculo 1: " + c1);

        Circle c2 = new Circle(2.5);
        System.out.println("Círculo 2: " + c2);

        Circle c3 = new Circle(3.5, "blue");
        System.out.println("Círculo 3: " + c3);

        // Probando getters y setters
        c3.setRadius(4.0);
        c3.setColor("green");
        System.out.println("Círculo 3 modificado: " + c3);

        // Imprimiendo valores individuales
        System.out.println("Radio de c3: " + c3.getRadius());
        System.out.println("Color de c3: " + c3.getColor());
        System.out.println("Área de c3: " + c3.getArea());
    }
}