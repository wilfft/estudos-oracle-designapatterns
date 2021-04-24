package com.william.myproject.designPatterns.padraoDecorator;

public class CaféTorrado extends Bebida {

    public CaféTorrado() {
        //herda de BEBIDA
        descricao = "Café torrado";
    }

    @Override //herda de BEBIDA
    public double custo() {
        return 2.99;
    }
}
