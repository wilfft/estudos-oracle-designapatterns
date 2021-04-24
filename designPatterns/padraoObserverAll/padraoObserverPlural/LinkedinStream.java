package com.william.myproject.designPatterns.padraoObserverAll.padraoObserverPlural;

import java.util.Observable;

//classe concreta
public class LinkedinStream extends Observable {
    public void alguemPostou() {
        setChanged();
        notifyObservers();
    }
}
