package com.william.myproject.designPatterns.padraoObserver;

public class DisplayGPS implements Observer, DisplayElement {
    private float temperatura;
    private Subject wheater;


    public DisplayGPS(DadosTemperatura data) {
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
        System.out.println("temperatura mostrada pelo GPS: " + temperatura);
    }
}
