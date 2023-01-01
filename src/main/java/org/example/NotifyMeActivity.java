package org.example;

import org.example.Notification.EmailNotification;
import org.example.Notification.MobileNotification;
import org.example.Observable.IphoneObservable;
import org.example.Observable.StocksObservable;
import org.example.Observer.Observer;

public class NotifyMeActivity {
    public static void main(String[] args)
    {

        StocksObservable stocksObservable = new IphoneObservable();

        Observer person_one = new Observer("Sabarish",new MobileNotification(),"1234456", stocksObservable);
        Observer person_two = new Observer("Mass", new EmailNotification(),"kernaldev1@gmail.com", new IphoneObservable());
        Observer person_three = new Observer("XYZ", new EmailNotification(),"xyz@yahoo.com", stocksObservable);

        stocksObservable.addObserver(person_one);
        stocksObservable.addObserver(person_two);
        stocksObservable.addObserver(person_three);

       stocksObservable.stateChange(100);





    }
}