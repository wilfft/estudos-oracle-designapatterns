package com.william.myproject.designPatterns.padraoObserverAll.padraoObserverPluralSemApi;

import java.util.Observable;

//classe concreta
public class LinkedinStream extends Observable {
    public void alguemPostou() {
        setChanged();
        notifyObservers();
    }
}
