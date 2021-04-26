package com.william.myproject.designPatterns.padraoAbstractFactory;

public class Main {
    public static void main(String[] args) {
        FabricaProdutos concreta = new FabricaConcreta();

        Produto produto = concreta.pedirProduto("mesa");
        Produto produto2 = concreta.pedirProduto("armario");
        FabricaProdutos solido = new FabricaSolida();

        Produto produto3 = solido.pedirProduto("geladeira");
    }
}
