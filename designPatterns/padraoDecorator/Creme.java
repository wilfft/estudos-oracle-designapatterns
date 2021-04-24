package com.william.myproject.designPatterns.padraoDecorator;

//Decorador concreto
public class Creme extends CondimentoDecorator {

    Bebida bebida;

    public Creme(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public double custo() {
        return .30+bebida.custo();
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao()+ ", Creme";
    }
}
