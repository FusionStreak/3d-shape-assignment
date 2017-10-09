package com.company;

import static java.lang.System.*;

class Cuboid extends Prism {
    Cuboid(float length, float width, float height) {
        base = new Rectangle(width, length);
    }

    @Override
    public float getVolume(){
        return l * h * w;
    }

    @Override
    public float getSurfaceArea(){
        return (2*(w * h)) + (2*(l * h)) + (2*(l * w));
    }

    @Override
    public void volumeExplain(){
        out.println("Area of the Cross Section: " + String.format("%.2f", h) + " x " + String.format("%.2f", w) + " = " + String.format("%.2f", (h * w)) );
        out.println("Multiply by the length: " + String.format("%.2f",l) + " x " + String.format("%.2f", (h * w)) +  " = " + getVolume() );
    }
    @Override
    public void surfaceAreaExplain(){

    }
}
