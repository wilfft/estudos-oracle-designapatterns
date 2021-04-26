package com.william.myproject.designPatterns.padraoAbstractFactory;

public class FabricaConcreta extends FabricaProdutos {


    Produto criarProduto(String nome) {
        Produto produto = null;
        FabricaComponentesProduto componentesChineses = new ComponentesChineses();

        if (nome.equals("armario")) {
            produto = new ProdutoConcreto(componentesChineses);
            produto.setNome(nome);
        }
        if (nome.equals("mesa")) {
            produto = new ProdutoConcreto(componentesChineses);
        }
        return produto;
    }


}
