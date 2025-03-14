public class Ball {
    private float x, y;
    private int radius;
    private float xDelta, yDelta;

    // Constructor
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Mueve la pelota según su velocidad
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Invierte la dirección horizontal
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Invierte la dirección vertical
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    // toString()
    @Override
    public String toString() {
        return String.format("Ball at (%.2f, %.2f) with velocity (%.2f, %.2f)", x, y, xDelta, yDelta);
    }
}
