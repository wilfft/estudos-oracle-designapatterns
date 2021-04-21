package com.william.myproject.padraoStrategy.models;

import com.william.myproject.padraoStrategy.interfaces.QuackComportamento;
import com.william.myproject.padraoStrategy.interfaces.VoarComportamento;

public abstract class Pato {

    protected QuackComportamento quackComportamento;
    protected VoarComportamento voarComportamento;

    public abstract void display();

    public void levantarVoo() {
        voarComportamento.voar();
    }

    public void fazerQuack() {
        quackComportamento.quack();
    }

    public void setQuackComportamento(QuackComportamento quackComportamento) {
        this.quackComportamento = quackComportamento;
    }

    public void setVoarComportamento(VoarComportamento voarComportamento) {
        this.voarComportamento = voarComportamento;
    }
}
