package com.company.observer;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*
        publisher -> Subject
        subscriber -> Observer
        types of observers -> NewsReader, FoodWrapper

        you can create a folder in your machine called news
        whenever you have new news you can create a new text file and add the news to it and copy the text file into news folder
        our subject class can keep watching the news folder -> whenever new news is available it can notifyObservers
        then you can delete the text file with the news
        keep watching for more news

        create a small gui
        create a form to enter name and email address
        */

        Subject subject = new Subject();

        ObserverUI observerUI = new ObserverUI("Subscribe to ABC",subject);
        observerUI.setSize(800,500);
        observerUI.setVisible(true);

/*
        Observer observer1 = new Type1Observer("Sachini");
        Observer observer2 = new Type2Observer("Amal");
        Observer observer3 = new Type3Observer("Sunil","sunil@gmail.com");

        Subject subject = new Subject();

        subject.subscribe(observer1);
        subject.subscribe(observer2);

        subject.notifyAllObservers("ABC - March Issue");
        System.out.println("\n===============================================================\n");
        Thread.sleep(5000);

        subject.subscribe(observer3);

        subject.notifyAllObservers("ABC - April Issue");
        System.out.println("\n===============================================================\n");
        Thread.sleep(5000);

        subject.notifyAllObservers("ABC - May Issue");
        System.out.println("\n===============================================================\n");
        Thread.sleep(5000);

        subject.unsubscribe(observer2);

        subject.notifyAllObservers("ABC - June Issue");
        System.out.println("\n===============================================================\n");
        Thread.sleep(5000);
*/
    }
}
