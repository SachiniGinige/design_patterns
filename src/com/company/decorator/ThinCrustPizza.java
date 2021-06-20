package com.company.decorator;

public class ThinCrustPizza extends Pizza{

    ThinCrustPizza(){
        this.description="Thin crust pizza";
    }

    @Override
    public double getCost() {
        return 1200;
    }
}
