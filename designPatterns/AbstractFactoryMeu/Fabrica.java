package com.william.myproject.designPatterns.AbstractFactoryMeu;

public abstract class Fabrica {


    public Celular fazerPedido(String tipo) {
        Celular celular;
        celular = criarProduto(tipo);
        celular.setNome(tipo);
        return celular;
    }

    public abstract Celular criarProduto(String tipo);


}
