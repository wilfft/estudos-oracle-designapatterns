package com.william.myproject.designPatterns.padraoDecorator;

public class Expresso extends Bebida {

    public Expresso() {
        //herda de BEBIDA
        descricao = "Expresso";
    }

    @Override //herda de BEBIDA
    public double custo() {
        return 1.99;
    }
}
