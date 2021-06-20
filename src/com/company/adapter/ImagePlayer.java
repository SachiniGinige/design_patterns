package com.company.adapter;

public class ImagePlayer {
    //Useful when reusing already written code
    //When we use code as plug-ins or libraries we cannot edit it
    //So we need to use an adapter class to adapt already existing methods to suit our application

    //Imagine this class is a read only class that cannot be edited as we wish
    public void show(){
        System.out.println("Showing image...");
    }
}
