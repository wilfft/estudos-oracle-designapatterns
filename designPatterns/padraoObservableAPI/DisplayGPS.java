package com.william.myproject.designPatterns.padraoObservableAPI;

import java.util.Observable;
import java.util.Observer;

public class DisplayGPS implements Observer, DisplayElement {
    private float temperatura;
    Observable observable;

    public DisplayGPS(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object obj) {
        if (obs instanceof DadosTemperatura){
            DadosTemperatura dadosTemperatura = (DadosTemperatura) obs;
            this.temperatura= dadosTemperatura.getTemperatura();
            display();

        }

    }

    @Override
    public void display() {
        System.out.println("temperatura mostrada pelo GPS: " + temperatura);
    }


}
