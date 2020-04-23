/*  Nathanael Gastelum
    April 22, 2020
    Purpose: The Stock class uses the Subject interface to keep track of
    and notify Traders registered to it*/

import java.util.ArrayList;

public class Stock implements Subject {

    private String name;
    private ArrayList<Observer> observers;
    private Trade latestTrade;

    public Stock(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    // Adds new trader to observer list
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    // Removes trader from observer list
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // Notifies all traders in observer list
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(latestTrade);
        }
    }

    // Makes new trade and notifies traders
    public void makeTrade(Trade latestTrade) {
        this.latestTrade = latestTrade;

        notifyObservers();
    }

    // Returns stock ticker symbol
    @Override
    public String toString() {
        return name;
    }
}
