package com.company.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee type: ");
        String type = sc.next();

        System.out.println("Enter employee name: ");
        String name = sc.next();

        System.out.println("Enter employee wage rate: ");
        double rate = sc.nextDouble();

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee = employeeFactory.getInstance(type, name, rate);

        System.out.println("Salary of "+name+" is: "+employee.calcSalary());
    }

}
//open close principle  -> open for extension, closed for modification