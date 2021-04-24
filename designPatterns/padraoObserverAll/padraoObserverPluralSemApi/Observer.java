package com.william.myproject.designPatterns.padraoObserverAll.padraoObserverPluralSemApi;

public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
