package org.example.Observable;

import org.example.Observer.ObserverInterface;

public interface StocksObservable {

   public void addObserver(ObserverInterface observerInterface);
   public void removeObserver(ObserverInterface observerInterface);
   public void stateChange(int state);
   public void notifyObservers();

   public  String getProductName();

}
