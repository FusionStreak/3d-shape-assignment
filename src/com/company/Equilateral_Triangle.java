package com.company;

public class Equilateral_Triangle extends Triangle {
    private float side;

    public Equilateral_Triangle(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return (float) (Math.sqrt(3)/4) * (side * side);
    }

    public float getSide() {
        return side;
    }
}
