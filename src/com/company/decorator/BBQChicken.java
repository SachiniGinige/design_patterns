package com.company.decorator;

public class BBQChicken extends PizzaDecorator{

    BBQChicken(Pizza p) {
        this.pizza=p;
    }

    @Override
    public double getCost() {
        return pizza.getCost()+400;
    }
}
