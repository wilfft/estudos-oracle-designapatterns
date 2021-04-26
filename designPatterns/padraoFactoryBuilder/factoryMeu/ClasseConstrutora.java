package com.william.myproject.designPatterns.padraoFactoryBuilder.factoryMeu;

public abstract class ClasseConstrutora {

    protected Produto produtoFactory(String nomeDoProduto) {
        Produto produto;
        produto = criarProduto(nomeDoProduto);
        produto.preparar();
        return produto;

    }

    public abstract Produto criarProduto(String nomeDoProduto);


}
