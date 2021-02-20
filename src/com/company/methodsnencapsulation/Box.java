package com.company.methodsnencapsulation;

public class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
