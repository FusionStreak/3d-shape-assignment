package com.company;

// This class assumes an equilateral base, and an apex of the center of the base.
// Volume is  a third of (the area of base times the height of the pyramid perpendicular to the base)
// The surface area A + 3/2bh, where A is the area of the base, and b is the length of one side of the base,
// and h is the slant height of one of the triangular faces.
class TriPyramid {
    private float bL;
    private float H;
    private float h;
    TriPyramid(float baseLength, float perpendicularHeight, float slantHeight){
        bL = baseLength;
        H = perpendicularHeight;
        h = slantHeight;
    }
    float getVolume(){
        double A = Math.pow(bL,2);
        return ((float) A * H) / 3;
    }
}
