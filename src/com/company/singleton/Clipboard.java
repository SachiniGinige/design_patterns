package com.company.singleton;

public class Clipboard {

    //the variables should be private so that they cannot be accessed from outside the class
    private String content;

    private static Clipboard clipboard; //the Clipboard object should be static to ensure it has only one instance

    private Clipboard(){
        //since the constructor is private it can only be accessed from inside the class
        System.out.println("Clipboard object created");
    }

    //the method to a new instance if none already available and return it, or otherwise return the available instance
    //it should be public as well as static
    public static Clipboard getInstance(){
        if(clipboard==null){
            clipboard=new Clipboard();
        }
        return clipboard;
    }

    //copy
    public void copy(String text){
        this.content=text;
    }

    //paste
    public void paste(){
        System.out.println(this.content);
    }
}
