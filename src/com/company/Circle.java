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

    public float getRadius() {
        return radius;
    }

    public float getCircumference() {
        return (float)( 2 * radius * Math.PI);
    }

}
