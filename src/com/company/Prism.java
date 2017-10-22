package com.company;

abstract class Prism implements $3D_Shape {
    protected $2D_Shape base;
    protected float height;

    protected abstract Rectangle getRectangularFace();
}
