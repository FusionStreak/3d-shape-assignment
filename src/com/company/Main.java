
package com.company;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        boolean validShape = false;
        $3D_Shape theShape = null;
        out.println("Choose a shape from the choices below (spell it exactly as it is below, all triangles are assumed equilateral):");
        String[] shapes = {"-Sphere", "-Triangular Prism", "-Cylinder", "-Cuboid", "-Triangle Based Pyramid", "-Square Based Pyramid"};
        for (String shape : shapes) out.println(shape);
        Scanner scan = new Scanner(in);
        String input;
        while (!validShape) {
            input = scan.nextLine();
            out.println(input);
            switch (input) {
                case "Sphere":
                    out.println("Enter Radius:");
                    float radius = scan.nextFloat();
                    theShape = $3DShapeFactory.create3DShape($3DShapeFactory.$3DShapeEnum.SPHERE, radius);
                    validShape = true;
                    break;
                case "Triangular Prism":
                    out.println("Enter triangle side length");
                    float side = scan.nextFloat();
                    out.println("Enter prism height");
                    float height = scan.nextFloat();
                    theShape = $3DShapeFactory.create3DShape($3DShapeFactory.$3DShapeEnum.TRIPRISM, side, height);
                    validShape = true;
                    break;
                case "Cylinder":
                    out.println("Enter radius of circle base");
                    radius = scan.nextFloat();
                    out.println("Enter prism height");
                    height = scan.nextFloat();
                    theShape = $3DShapeFactory.create3DShape($3DShapeFactory.$3DShapeEnum.CYLINDER, radius, height);
                    validShape = true;
                    break;
                case "Cuboid":
                    out.println("Enter width of cuboid");
                    float width = scan.nextFloat();
                    out.println("Enter cuboid length");
                    float length = scan.nextFloat();
                    out.println("Enter height of cuboid");
                    height = scan.nextFloat();
                    theShape = $3DShapeFactory.create3DShape($3DShapeFactory.$3DShapeEnum.CUBOID, width, length, height);
                    validShape = true;
                    break;
                case "Triangle Based Pyramid":
                    out.println("Enter side length of triangle base");
                    side = scan.nextFloat();
                    out.println("Enter vertical height");
                    height = scan.nextFloat();
                    theShape = $3DShapeFactory.create3DShape($3DShapeFactory.$3DShapeEnum.TRIPYRAMID, side, height);
                    validShape = true;
                    break;
                case "Square Based Pyramid":
                    out.println("Enter length of the side of the square base");
                    side = scan.nextFloat();
                    out.println("Enter vertical height");
                    height = scan.nextFloat();
                    theShape = $3DShapeFactory.create3DShape($3DShapeFactory.$3DShapeEnum.SQUAREPYRAMID, side, height);
                    validShape = true;
                    break;
                default:
                    out.println("Invalid shape, please try again");

            }
        }

        boolean validMethod = false;
        Boolean another = null;
        String[] methods = {"-Get Volume", "-Get Surface Area", "-Explain Volume", "-Explain Surface Area"};
        out.println("Select one of the following methods");
        for (String method : methods) out.println(method);
        if (scan.hasNext())
            scan.nextLine();

        while (!validMethod || another) {
            input = scan.nextLine();
            out.println(input);
            switch (input) {
                case "Get Volume":
                    out.println(theShape.getVolume());
                    validMethod = true;
                    break;
                case "Get Surface Area":
                    out.println(theShape.getSurfaceArea());
                    validMethod = true;
                    break;
                case "Explain Volume":
                    out.println(theShape.volumeExplain());
                    validMethod = true;
                    break;
                case "Explain Surface Area":
                    out.println(theShape.surfaceAreaExplain());
                    validMethod = true;
                    break;
                default:
                    out.println("Invalid method, please try again");
            }
            another = null;
            while (another == null) {
                out.println("Want to use another method (Y/N)");
                input = scan.nextLine();
                switch (input) {
                    case "Y":
                        another = true;
                        out.println("Select one of the following methods");
                        for (String method : methods) out.println(method);
                        break;
                    case "N":
                        another = false;
                        break;
                    default:
                        out.println("Invalid");
                }
            }

        }


    }
}
