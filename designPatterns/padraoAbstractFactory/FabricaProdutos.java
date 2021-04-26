package com.william.myproject.designPatterns.padraoAbstractFactory;

public abstract class FabricaProdutos {

    public Produto pedirProduto(String nome) {
        Produto produto;
        produto = criarProduto(nome);
        produto.entregarProduto();
        return produto;
    }

      abstract Produto criarProduto(String nome);


}
