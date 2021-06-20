package com.company.observer;

public class Type1Observer implements Observer{

    String name;

    public Type1Observer(String name){
        this.name = name;
    }

    @Override
    public void notifyObserver(String news) {
        System.out.println(name+" is reading from newspaper: " + news);
    }
}
