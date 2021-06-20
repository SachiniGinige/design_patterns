package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    // java Lists can contain any no. of elements as opposed to Arrays tht need to be initialized specifying the no. of elements
    //ArrayList is one kind of List
    List <Observer> observers = new ArrayList<>();

    //subscribe
    public void subscribe(Observer observer){

        //In a real world app the observer should be added to the database
        observers.add(observer);
        System.out.println("\n===============================================================\n");
        observer.notifyObserver("Thanks for subscribing to ABC!"+"\n\n===============================================================\n");
    }

    //unsubscribe
    public void unsubscribe(Observer observer){

        //In a real world app the observer should be removed from the database or some indication must be made to show they have unsubscribed
        observers.remove(observer);
        System.out.println("\n===============================================================\n");
        observer.notifyObserver("You have unsubscribed from ABC"+"\n\n===============================================================\n");
    }

    //when a new news item / newspaper is available-> You want to notify all observers
    public void notifyAllObservers(String news){

        for (Observer observer : observers) {
            observer.notifyObserver(news);
        }
    }

/*
        //Instead of manually calling the subscribe, unsubscribe and NotifyAll methods
        //we can use a forever running loop to watch an API
        //it can trigger the necessary function as needed
        //that loop can be started using the following function
        public void start(){
            // start forever loop watching an API
        }
*/

}
