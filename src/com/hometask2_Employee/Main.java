package com.hometask2_Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        EmployeePrinter employeePrinter = new EmployeePrinter();
        employeePrinter.print(employee);
    }
}
