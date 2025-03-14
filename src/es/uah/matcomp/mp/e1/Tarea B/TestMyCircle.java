public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println(c2);

        MyPoint p = new MyPoint(1, 1);
        MyCircle c3 = new MyCircle(p, 7);
        System.out.println(c3);

        System.out.println("Radius of c2: " + c2.getRadius());
        System.out.println("Center of c3: " + c3.getCenter());

        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Circumference of c2: " + c2.getCircumference());

        System.out.println("Distance between c1 and c2: " + c1.distance(c2));
    }
}
