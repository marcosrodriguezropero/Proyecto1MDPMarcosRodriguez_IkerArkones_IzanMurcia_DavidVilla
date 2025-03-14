package es.uah.matcomp.mp.e1.MyPoint;

import static org.junit.jupiter.api.Assertions.*;
class Test {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);

        System.out.println(line.toString());
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());
    }
}