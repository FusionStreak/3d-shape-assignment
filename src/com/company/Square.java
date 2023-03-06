package com.company;

public class Square implements  $2D_Shape {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public String areaExplain() {
        final String message;
        message = "Area of a square (side^2): " +  getSide() + "^2 = " + getArea();
        return message;
    }

    public float getSide() {
        return side;
    }
}
