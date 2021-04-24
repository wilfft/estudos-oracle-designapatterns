package com.william.myproject.designPatterns.padraoObserverAll.observerPorMim;

public class Ouvinte2 implements Observer {


    private final Observable observable;

    public Ouvinte2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("sou o observador 2 ");
    }
}
