package com.company;

import static java.lang.System.err;

class $3DShapeFactory {

    static $3D_Shape create3DShape($3DShapeEnum shapeType, Float dimension1, Float dimension2, Float dimension3) {
        $3D_Shape shape = null;
        switch (shapeType) {
            case SPHERE:
                if ( dimension1 == null)
                    err.print("Radius of sphere should be provided as dimension1");
                else shape = new Sphere(dimension1);
                break;
            case CYLINDER:
                Float height = dimension2;

                if (dimension1 != null && height != null ) {
                    shape = new Cylinder(dimension1, height);
                }
                else {
                    if (dimension1 == null) {
                        err.print("Radius of cylinder should be provided as dimension1");
                    }
                    if (height == null) {
                        err.print("Height of cylinder should be provided as dimension2");
                    }

                }
                break;
            case CUBOID:
                height = dimension3;

                if ((dimension2 != null) && (dimension1 != null) && (height != null)) {
                    shape = new Cuboid(dimension1, dimension2, height);
                }
                else {
                    if (dimension1 == null) {
                        err.print("Length of cuboid should be provided as dimension1");
                    }
                    if (dimension2 == null) {
                        err.print("Width of cuboid should be provided as dimension2");
                    }
                    if (height == null) {
                        err.print("Height of cuboid should be provided as dimension3");
                    }

                }
                break;
            case TRIPRISM:
                Float side = dimension1;
                height = dimension2;

                if (side != null && height != null ) {
                shape = new TriPrism(side, height);
                }
                else {
                    if (side == null) {
                        err.print("Side of triangular face should be provided as dimension1");
                    }
                    if (height == null) {
                        err.print("Height of triangular prism should be provided as dimension2");
                    }
                }
                break;
            case TRIPYRAMID:
                side = dimension1;
                height = dimension2;

                if (side != null && height != null ) {
                    shape = new TriPyramid(side, height);
                }
                else {
                    if (side == null) {
                        err.print("Side of triangular base should be provided as dimension1");
                    }
                    if (height == null) {
                        err.print("Height of triangle based pyramid should be provided as dimension2");
                    }
                }
                break;
            case SQUAREPYRAMID:
                side = dimension1;
                height = dimension2;

                if (side != null && height != null ) {
                    shape = new Square_Pyramid(side, height);
                }
                else {
                    if (side == null) {
                        err.print("Side of square base should be provided as dimension1");
                    }
                    if (height == null) {
                        err.print("Height of square based pyramid should be provided as dimension2");
                    }
                }

                break;
            default:
                err.print("Unknown Shape type: " + shapeType);
        }
        return shape;
    }

    static $3D_Shape create3DShape($3DShapeEnum shapeType, float d1) {
        return create3DShape( shapeType, d1, null, null);
    }

    static $3D_Shape create3DShape($3DShapeEnum shapeType, float d1, float d2) {
        return create3DShape( shapeType, d1, d2, null);
    }


    public enum $3DShapeEnum {
        SPHERE, CYLINDER, CUBOID, TRIPRISM, TRIPYRAMID, SQUAREPYRAMID
    }
}
