package com.company;

public class Main {

    public static void main(String[] args) {
        Cuboid cube = new Cuboid(5,5,5);
        cube.volumeExplain();
        TriPyramid triP = new TriPyramid(3,4,5);
        System.out.println(triP.getVolume());
    }
}
