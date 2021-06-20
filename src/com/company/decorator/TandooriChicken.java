package com.company.decorator;

public class TandooriChicken extends PizzaDecorator{

    TandooriChicken(Pizza p) {
        this.pizza=p;
    }

    @Override
    public double getCost() {
        return pizza.getCost()+300;
    }
}
