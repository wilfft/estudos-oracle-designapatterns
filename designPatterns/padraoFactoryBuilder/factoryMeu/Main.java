package com.william.myproject.designPatterns.padraoFactoryBuilder.factoryMeu;

public class Main {

    public static void main(String[] args) {
        Produto produto;
        ClasseConstrutora fabrica1 = new Fabrica1();
        produto = fabrica1.produtoFactory("filho");
        System.out.println(produto.nome);

        ClasseConstrutora fabrica2 = new Fabrica2();
        produto = fabrica2.produtoFactory("filho");
        System.out.println(produto.nome);
    }


}
