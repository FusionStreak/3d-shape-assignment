package com.company;

public class Cuboid {
    private float l;
    private float w;
    private float h;
    Cuboid(float length, float width, float height) {
        l = length;
        w = width;
        h = height;
    }

    private float getVolume(){
        return l * h * w;
    }

    private float getSurfaceArea(){
        return (2*(w * h)) + (2*(l * h)) + (2*(l * w));
    }

    public void volumeExplain(){
        System.out.println("Area of the Cross Section: " + String.format("%.2f", h) + " x " + String.format("%.2f", w) + " = " + String.format("%.2f", (h * w)) );
        System.out.println("Multiply by the length: " + String.format("%.2f",l) + " x " + String.format("%.2f", (h * w)) +  " = " + getVolume() );
    }
    public void surfaceAreaExplain(){

    }
}
