package com.company;

public class Square_Pyramid extends Pyramid {
    Square_Pyramid(float side, float height) {
        base = new Square(side);
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (1f/3f) * (base.getArea() * height);
    }

    @Override
    public float getSurfaceArea() {
        return 0;
    }

    @Override
    public String volumeExplain() {
    return "";
    }

    @Override
    public String surfaceAreaExplain() {
        return null;
    }
}
