package com.company.observer;

public class Type3Observer implements Observer{

    //accept the email address as a parameter
    String name;
    String email;

    public Type3Observer(String name, String email){
        this.name=name;
        this.email=email;
    }

    @Override
    public void notifyObserver(String news) {
        //send an actual email
        System.out.println("Email sent to "+name+" on: "+email);
        System.out.println(name+" is reading from e-copy: " + news);
    }
}
