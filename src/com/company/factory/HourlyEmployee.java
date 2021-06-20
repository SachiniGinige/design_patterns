package com.company.factory;

public class HourlyEmployee extends Employee{

    int hrsWorked;
    double rate;

    public HourlyEmployee(String id, String name, int hrsWorked, double rate){
        this.id=id;
        this.name=name;
        this.hrsWorked=hrsWorked;
        this.rate=rate;
    }

    @Override
    public double calcSalary() {
        return this.hrsWorked * this.rate;
    }
}
