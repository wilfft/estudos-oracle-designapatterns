package com.william.myproject.designPatterns.padraoDecorator;

//Decorador concreto
public class Mocha extends CondimentoDecorator {

    Bebida bebida;

    public Mocha(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public double custo() {
        return 0.20+bebida.custo();
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao()+ ", Mocha";
    }
}
