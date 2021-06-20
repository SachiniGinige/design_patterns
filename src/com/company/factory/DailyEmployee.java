package com.company.factory;

public class DailyEmployee extends  Employee{

    int daysWorked;
    double rate;

    public DailyEmployee(String id, String name, int daysWorked, double rate){
        this.id=id;
        this.name=name;
        this.daysWorked=daysWorked;
        this.rate=rate;
    }

    @Override
    public double calcSalary() {
        return this.daysWorked * this.rate;
    }
}
