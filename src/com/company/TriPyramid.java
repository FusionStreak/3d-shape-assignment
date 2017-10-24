package com.company;

// This class assumes an equilateral base, and an apex of the center of the base.
// Volume is  a third of (the area of base times the height of the pyramid perpendicular to the base)
// The surface area A + 3/2bh, where A is the area of the base, and b is the length of one side of the base,
// and h is the slant height of one of the triangular faces.
class TriPyramid extends Pyramid {
    TriPyramid(float baseLength, float height) {
        this.base = new Equilateral_Triangle(baseLength);
        this.height = height;
    }

    @Override
    public float getSurfaceArea() {
        return 0;
    }

    @Override
    public String volumeExplain() {
        return null;
    }

    @Override
    public String surfaceAreaExplain() {
        return null;
    }

    @Override
    public float getVolume(){
        return (1f/3f) * (base.getArea() * height);
    }
}
