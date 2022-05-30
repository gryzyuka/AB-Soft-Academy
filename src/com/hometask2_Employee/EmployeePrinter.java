package com.hometask2_Employee;

public class EmployeePrinter implements Printer{
    @Override
    public void print(Employee employee) {
        System.out.println("First Name: " + employee.FirstName);
        System.out.println("Last Name: " + employee.LastName);
        System.out.println("Age: " + employee.Age);
    }
}
