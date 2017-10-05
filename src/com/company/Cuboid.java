package com.company;

import static java.lang.System.*;

class Cuboid {
    private float l;
    private float w;
    private float h;
    Cuboid(float length, float width, float height) {
        l = length;
        w = width;
        h = height;
    }

    float getVolume(){
        return l * h * w;
    }

    float getSurfaceArea(){
        return (2*(w * h)) + (2*(l * h)) + (2*(l * w));
    }

    void volumeExplain(){
        out.println("Area of the Cross Section: " + String.format("%.2f", h) + " x " + String.format("%.2f", w) + " = " + String.format("%.2f", (h * w)) );
        out.println("Multiply by the length: " + String.format("%.2f",l) + " x " + String.format("%.2f", (h * w)) +  " = " + getVolume() );
    }
    void surfaceAreaExplain(){

    }
}
