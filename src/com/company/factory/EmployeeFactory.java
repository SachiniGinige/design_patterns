package com.company.factory;

import java.util.Scanner;

public class EmployeeFactory {

    public Employee getInstance(String type, String name, double rate){
        Scanner sc = new Scanner(System.in);

        Employee employee = null;

        if (type.equals("hourly")){
            System.out.println("Enter hours worked: ");
            int hrsWorked = sc.nextInt();

            employee = new HourlyEmployee("1", name, hrsWorked, rate);
        }

        else if(type.equals("monthly")){
            employee = new MonthlyEmployee("2", name, rate);
        }

        else if (type.equals("daily")){
            System.out.println("Enter days worked: ");
            int daysWorked = sc.nextInt();

            employee = new DailyEmployee("3", name, daysWorked, rate);
        }

        return employee;
    }
}
