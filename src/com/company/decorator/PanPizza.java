package com.company.decorator;

public class PanPizza extends Pizza{

    PanPizza(){
        this.description="Pan pizza";
    }

    @Override
    public double getCost() {
        return 1000;
    }
}
