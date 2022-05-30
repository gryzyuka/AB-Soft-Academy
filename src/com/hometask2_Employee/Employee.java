package com.hometask2_Employee;

import java.util.Scanner;

public class Employee {

    String FirstName;
    String LastName;
    Integer Age;

    Employee () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Name: ");
        this.FirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        this.LastName = scanner.nextLine();
        System.out.print("Age: ");
        this.Age = scanner.nextInt();
    }

}
