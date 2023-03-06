import static java.lang.System.lineSeparator;

class Cuboid extends Prism {
    Cuboid(float length, float width, float height) {
        base = new Rectangle(width, length);
        this.height = height;

    }

    @Override
    public float getVolume() {
        return base.getArea() * height;
    }

    @Override
    public float getSurfaceArea() {
        return (2 * (getBase().getWidth() * height)) + (2 * (getBase().getLength() * height)) + (2 * base.getArea());
    }

    private Rectangle getBase() {
        return (Rectangle) this.base;
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
        Rectangle lFace = new Rectangle(getBase().getLength(), height);
        Rectangle wFace = new Rectangle(getBase().getWidth(), height);
        message = "Total area of each face. 2(length x width) + 2(length x height) + 2(width x height)"
                + lineSeparator() + getBase().areaExplain() + lineSeparator() + lFace.areaExplain() + lineSeparator()
                + wFace.areaExplain() + lineSeparator() + "Add all together and multiply by 2" + lineSeparator()
                + getSurfaceArea();
        return message;
    }

    @Override
    protected Rectangle getRectangularFace() {
        return null;
    }
}
