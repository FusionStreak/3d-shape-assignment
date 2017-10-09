package com.company;

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
}
