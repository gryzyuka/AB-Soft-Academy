package com.hometask3_Shapes;

public class Rectangle implements Shape{

    double a, b;

    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle square: " + getSquare();
    }
}
