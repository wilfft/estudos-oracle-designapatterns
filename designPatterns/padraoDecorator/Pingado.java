package com.william.myproject.designPatterns.padraoDecorator;

public class Pingado extends Bebida {

    public Pingado() {
        //herda de BEBIDA
        descricao = "Pingado da casa";
    }

    @Override //herda de BEBIDA
    public double custo() {
        return .89;
    }
}
