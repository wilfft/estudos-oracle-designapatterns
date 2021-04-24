package com.william.myproject.designPatterns.padraoObserverAll.padraoObserver;

public interface Subject {

    void registraObservador(Observer obs);

    void removeObserver(Observer obs);

    void notificaTodoMundo();


}
