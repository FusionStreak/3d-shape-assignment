public class Rectangle implements $2D_Shape {
    private float width;
    private float length;

    public Rectangle(float width, float length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float getArea() {
        return width * length;
    }

    @Override
    public String areaExplain() {
        final String message;
        message = "Area of a rectangle (width x length): " + getWidth() + " x " + getLength() + " = " + getArea();
        return message;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }
}
