package com.william.myproject.designPatterns.padraoAbstractFactory;

public abstract class Produto {

    protected String nome;

    public void entregarProduto() {
        System.out.println("Produto entregue: " + getNome());
    }

    private String getNome() {
        return this.nome;
    }
}
