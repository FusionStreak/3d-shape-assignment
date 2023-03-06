import static java.lang.System.lineSeparator;

class TriPrism extends Prism {

    TriPrism(float side, float height) {
        base = new Equilateral_Triangle(side);
        this.height = height;
    }

    @Override
    public float getVolume() {
        return base.getArea() * height;
    }

    @Override
    public float getSurfaceArea() {
        return (2 * (base.getArea())) + (3 * (height * getBase().getSide()));
    }

    private Equilateral_Triangle getBase() {
        return (Equilateral_Triangle) this.base;
    }

    @Override
    public String volumeExplain() {
        final String message;
        message = "Area of base x height =  Volume" + lineSeparator() + getBase().areaExplain() + lineSeparator()
                + "Multiply by " + height + " = " + getVolume();
        return message;
    }

    @Override
    public String surfaceAreaExplain() {
        final String message;
        message = "2 times the area of base) + 3 times the area of the rectangular faces" + lineSeparator()
                + getBase().areaExplain() + lineSeparator() + this.getRectangularFace().areaExplain() + lineSeparator()
                + getSurfaceArea();
        return message;
    }

    @Override
    protected Rectangle getRectangularFace() {
        Rectangle rFace = new Rectangle(getBase().getSide(), height);
        return rFace;
    }
}
