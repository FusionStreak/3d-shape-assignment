package com.company;

import static java.lang.System.*;

public class Cuboid extends Prism {
    public Cuboid(float length, float width, float height) {
        base = new Rectangle(width, length);
        this.height = height;


    }

    @Override
    public float getVolume(){
        return base.getArea() * height ;
    }

    @Override
    public float getSurfaceArea(){
        return (2*(getBase().getWidth() * height)) + (2*(getBase().getLength() * height)) + (2* base.getArea());
    }

    private Rectangle getBase() {
        return (Rectangle)this.base;
    }

    @Override
    public String volumeExplain(){
        final String message;
        message = "Area of the Cross Section: " + String.format("%.2f", getBase().getLength()) + " x " + String.format("%.2f", getBase().getWidth()) + " = " + String.format("%.2f", (base.getArea())) + lineSeparator() + "Multiply by the length: " + String.format("%.2f", height) + " x " + String.format("%.2f", (base.getArea())) + " = " + getVolume();
        return message;
    }

    @Override
    public String surfaceAreaExplain(){
        final String message;
        message = "";
        return message;
    }
}
