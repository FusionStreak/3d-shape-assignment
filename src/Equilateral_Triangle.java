public class Equilateral_Triangle extends Triangle {
    private float side;

    public Equilateral_Triangle(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return (float) (Math.sqrt(3) / 4) * (side * side);
    }

    @Override
    public String areaExplain() {
        final String message;
        message = "Area of a Equilateral Triangle ( (√3)/4 x side^2): " + "(√3)/4 x " + getSide() + "^2 = " + getArea();
        return message;
    }

    public float getSide() {
        return side;
    }
}
