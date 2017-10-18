package com.company;

public class TriPrism extends Prism {

    public TriPrism(float side, float height) {
        base = new Equilateral_Triangle(side);
        this.height = height;
    }

    @Override
    public float getVolume() {
        return base.getArea()*height;
    }

    @Override
    public float getSurfaceArea() {
        return (2*(base.getArea())) + (3*(height * getBase().getSide()));
    }

    private Equilateral_Triangle getBase(){return (Equilateral_Triangle)this.base;}
    @Override
    public String volumeExplain() {
        return null;
    }

    @Override
    public String surfaceAreaExplain() {
        return null;
    }
}
