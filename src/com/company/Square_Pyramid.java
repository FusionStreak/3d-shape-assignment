package com.company;

public class Square_Pyramid extends Pyramid {
    public Square_Pyramid(float side, float height) {
        base = new Square(side);
    }

    @Override
    public float getVolume() {
        return 0;
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
