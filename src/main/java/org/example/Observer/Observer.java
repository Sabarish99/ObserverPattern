package org.example.Observer;

import org.example.Notification.NotificationType;
import org.example.Observable.StocksObservable;

public class Observer implements ObserverInterface {

    String name;
    NotificationType notificationType;
    String notifAddorPhone;
    StocksObservable observable ;

    public Observer(String name, NotificationType notificationType, String notifAddorPhone, StocksObservable stocksObservable)
    {
        this.name = name;
        this.notificationType = notificationType;
        this.notifAddorPhone = notifAddorPhone;
        observable = stocksObservable;
    }

    @Override
    public void updateObserver() {

        notificationType.sendNotification(notifAddorPhone, observable.getProductName());
    }
}
