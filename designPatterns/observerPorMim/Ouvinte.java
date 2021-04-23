package com.william.myproject.designPatterns.observerPorMim;

public class Ouvinte implements Observer {

    private final Observable observable;

    public Ouvinte(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("sou o observador 1 ");
    }
}
