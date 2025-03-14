package es.uah.matcomp.mp.e1.GeometricObject2;

public class ResizableCircle extends Circle2 implements Resizable {

    public ResizableCircle (double radius) {
        super(radius);
    }

    public void resize(int percentage) {
        this.radius *= (percentage/100);
    }

    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}
