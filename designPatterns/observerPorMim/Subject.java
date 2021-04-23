package com.william.myproject.designPatterns.observerPorMim;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {
    private List<Observer> observerList = new ArrayList<>();


    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
