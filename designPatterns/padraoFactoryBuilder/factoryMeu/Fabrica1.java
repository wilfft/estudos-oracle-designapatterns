package com.william.myproject.designPatterns.padraoFactoryBuilder.factoryMeu;

public class Fabrica1 extends ClasseConstrutora {
    @Override
    public Produto criarProduto(String nomeDoProduto) {
        Produto produto = null;
        if (nomeDoProduto.equals("filho")) {
            return produto = new FilhoDeProduto();
        } else
            return produto;
    }
}
