package com.company.observer;

public class Type2Observer implements Observer{

    String name;

    public Type2Observer(String name){
        this.name = name;
    }

    @Override
    public void notifyObserver(String news) {
        System.out.println(name+" is wrapping food using the news: " + news);
    }
}
