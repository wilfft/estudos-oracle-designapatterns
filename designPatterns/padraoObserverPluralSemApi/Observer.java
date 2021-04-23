package com.william.myproject.designPatterns.padraoObserverPluralSemApi;

public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
