public class TestLine {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Line l1 = new Line(p1, p2);
        System.out.println(l1);  // Output: Line from Point: (0,0) to Point: (3,4)

        Line l2 = new Line(0, 0, 3, 4);
        System.out.println(l2);  // Output: Line from Point: (0,0) to Point: (3,4)
    }
}