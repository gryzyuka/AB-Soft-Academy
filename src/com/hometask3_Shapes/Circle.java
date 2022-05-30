package com.hometask3_Shapes;

public class Circle implements Shape {

    Double radius;

    Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle square: " + getSquare();
    }
}
