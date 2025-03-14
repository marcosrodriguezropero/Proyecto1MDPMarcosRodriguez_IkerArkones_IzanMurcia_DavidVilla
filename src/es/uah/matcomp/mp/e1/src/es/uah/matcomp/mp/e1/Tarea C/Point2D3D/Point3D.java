package es.uah.matcomp.mp.e1.Point2D3D;

public class Point3D extends Point2D {
    //Variables privadas
    private float z;

    //Funciones públicas
    public Point3D() {
        z = 0.0f;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    //Devolver y establecer la variable "z"
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    //Establecer la distancia de puntos
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }


}
