package com.william.myproject.designPatterns.padraoObserverAll.observerPorMim;

public interface Observable {



    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
