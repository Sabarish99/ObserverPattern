package org.example.Observable;

import org.example.Observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StocksObservable {

    List<ObserverInterface> observerList = new ArrayList<>();

    int availableStocks;

    public String getProductName() {
        return productName;
    }

    private final String productName = "iPhone 13 Pro";
    @Override
    public void addObserver(ObserverInterface observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
            observerList.remove(observer);
    }

    @Override
    public void stateChange(int currentState) {
        int oldState;

       // if(currentState == 0)
        //here need to implement BL
            notifyObservers();
    }

    @Override
    public void notifyObservers() {

        for( ObserverInterface observer : observerList)
            observer.updateObserver();
    }
}
