package com.william.myproject.designPatterns.padraoAbstractFactory;

public abstract class Produto {

    protected String nome;
    Tela tela;
    Display display;
    AltoFalante altoFalante;
    Teclado teclado;

    abstract void montar();

    public void entregarProduto() {
        System.out.println("Produto entregue: " + getNome());
    }

    private String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
