package com.company;

import static java.lang.System.lineSeparator;

class Cylinder extends Prism {
    Cylinder(float radius, float height) {
        base = new Circle(radius);
        this.height = height;
    }

    @Override
    public float getVolume() {
        return base.getArea() * height;
    }

    @Override
    public float getSurfaceArea() {
        return (this.getRectangularFace().getArea()) + (2 * (base.getArea()));
    }

    private Circle getBase(){ return (Circle)this.base;}

    @Override
    protected Rectangle getRectangularFace() {
        Rectangle rFace = new Rectangle(getBase().getCircumference(),height);
        return rFace;
    }

    @Override
    public String volumeExplain() {
        final String message;
        message = "Area of base x height =  Volume" + lineSeparator() + getBase().areaExplain() + lineSeparator() + "Multiply by " + height + " = " + getVolume();
        return message;
    }

    @Override
    public String surfaceAreaExplain() {
        final String message;
        message = "2(Area of base) + total area of each of the rectangular faces" + lineSeparator() + getBase().areaExplain() + lineSeparator() + this.getRectangularFace().areaExplain() + lineSeparator();
        return message;
    }
}
