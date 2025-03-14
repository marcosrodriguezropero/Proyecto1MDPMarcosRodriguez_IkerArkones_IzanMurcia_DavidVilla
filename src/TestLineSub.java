public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);  // Output: Line from Point: (0,0) to Point: (3,4)

        Point p1 = new Point(5, 5);
        Point p2 = new Point(8, 9);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);  // Output: Line from Point: (5,5) to Point: (8,9)
    }
}