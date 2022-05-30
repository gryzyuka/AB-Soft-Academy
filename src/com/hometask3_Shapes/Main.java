package com.hometask3_Shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Circle radius: ");
        Circle circle = new Circle(scanner.nextDouble());
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.print("Rectangle a: ");
        rectangle.a = scanner.nextDouble();
        System.out.print("Rectangle b: ");
        rectangle.b = scanner.nextDouble();
        System.out.println(rectangle);
    }
}
