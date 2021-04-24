package com.william.myproject.designPatterns.padraoObserverAll.padraoObserver;

public class DisplayMobile implements Observer, DisplayElement {
    private float temperatura;
    private Subject wheater;


    public DisplayMobile(DadosTemperatura data) {
        this.wheater = data;
        wheater.registraObservador(this);
    }

    @Override
    public void update(float temperatura) {
        this.temperatura = temperatura;
        display();
    }

    @Override
    public void display() {
        System.out.println("temperatura mostrada pelo Mobile: " + temperatura);
    }
}
