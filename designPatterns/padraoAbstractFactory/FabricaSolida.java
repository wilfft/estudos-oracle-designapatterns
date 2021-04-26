package com.william.myproject.designPatterns.padraoAbstractFactory;

public class FabricaSolida extends FabricaProdutos {

    Produto produto = null;

    Produto criarProduto(String nome) {
        if (nome.equals("geladeira")) {
            produto = new ProdutoSolido(nome);
        }
        return produto;
    }


}
