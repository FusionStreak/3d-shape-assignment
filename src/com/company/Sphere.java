package com.company;

import static java.lang.Math.*;

public class Sphere implements $3D_Shape {
    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    public float getVolume() {
        return (float) ((4/3) * PI * pow(radius,3));
    }

    @Override
    public float getSurfaceArea() {
        return (float) (4 * PI * pow(radius, 2));
    }

    @Override
    public String volumeExplain() {
        return null;
    }

    @Override
    public String surfaceAreaExplain() {
        return null;
    }
}
