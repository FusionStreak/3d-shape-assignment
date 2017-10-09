package com.company;

public class Circle implements $2D_Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) ((radius * radius) * Math.PI);
    }
}
