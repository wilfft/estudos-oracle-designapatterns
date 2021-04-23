package com.william.myproject.designPatterns.padraoObserver;

import java.util.ArrayList;

public class DadosTemperatura implements Subject {
    private ArrayList observers;
    private float temperatura;

    public DadosTemperatura() {
        observers = new ArrayList();
    }

    @Override
    public void registraObservador(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notificaTodoMundo() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperatura);
        }
    }

    public void mediçoesAlteradas() {
        notificaTodoMundo();
    }

    public void setMediçoes(float temperatura) {
        this.temperatura = temperatura;
        mediçoesAlteradas();
    }
}
