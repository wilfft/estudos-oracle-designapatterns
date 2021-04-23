package com.william.myproject.designPatterns.padraoObservableAPI;

import java.util.Observable;

public class DadosTemperatura extends Observable {

    private float temperatura;

    public float getTemperatura() {
        return temperatura;
    }

    public void mediçoesAlteradas() {
        setChanged();
        notifyObservers();
    }

    public void setMediçoes(float temperatura) {
        this.temperatura = temperatura;
        mediçoesAlteradas();
    }
}
