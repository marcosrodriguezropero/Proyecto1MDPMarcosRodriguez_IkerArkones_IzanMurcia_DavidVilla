public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Área base=" + c1.getArea());
        System.out.println("Volumen=" + c1.getVolume());

        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2);
        System.out.println("Área base=" + c2.getArea());
        System.out.println("Volumen=" + c2.getVolume());

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3);
        System.out.println("Área base=" + c3.getArea());
        System.out.println("Volumen=" + c3.getVolume());
    }
}
