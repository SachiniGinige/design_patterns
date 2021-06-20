package com.company.decorator;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new ThinCrustPizza();
        Pizza bbqChickenPizza = new BBQChicken(pizza);
        Pizza bbqChickenWithExtraCheese = new ExtraCheese(bbqChickenPizza);
//        double cost = bbqChickenWithExtraCheese.getCost();

        System.out.println("Cost of BBQ Chicken Pizza with Extra Cheese: "+bbqChickenWithExtraCheese.getCost());

        Pizza pizza2 = new PanPizza();
        Pizza tandooriChickenPizza = new TandooriChicken(pizza2);
        Pizza tandooriChickenWithBbqChicken = new BBQChicken(tandooriChickenPizza);

        System.out.println("Cost of Tandoori Chicken and BBQ Chicken Pizza: "+tandooriChickenWithBbqChicken.getCost());
    }
}
