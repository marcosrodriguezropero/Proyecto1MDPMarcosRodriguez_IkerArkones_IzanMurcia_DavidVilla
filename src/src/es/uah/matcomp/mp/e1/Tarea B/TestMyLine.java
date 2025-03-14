public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);
        MyLine line1 = new MyLine(p1, p2);
        System.out.println(line1);

        MyLine line2 = new MyLine(2, 3, 6, 7);
        System.out.println(line2);

        System.out.println("Length of line1: " + line1.getLength());
        System.out.println("Gradient of line1: " + Math.toDegrees(line1.getGradient()));

        System.out.println("Length of line2: " + line2.getLength());
        System.out.println("Gradient of line2: " + Math.toDegrees(line2.getGradient()));
    }
}
