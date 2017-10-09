package com.company;

public class Square extends $2D_Shape {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }
}
