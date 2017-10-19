package com.company;

public class Cylinder extends Prism {
    public Cylinder(float radius, float height) {
        base = new Circle(radius);
        this.height = height;
    }

    @Override
    public float getVolume() {
        return base.getArea() * height;
    }

    @Override
    public float getSurfaceArea() {
        return (getBase().getCircumference() * height) + (2 * (base.getArea()));
    }

    private Circle getBase(){ return (Circle)this.base;}

    @Override
    public String volumeExplain() {

        return null;
    }

    @Override
    public String surfaceAreaExplain() {
        return null;
    }
}
