package com.william.myproject.designPatterns.padraoObserver;

public interface Subject {

    void registraObservador(Observer obs);

    void removeObserver(Observer obs);

    void notificaTodoMundo();


}
