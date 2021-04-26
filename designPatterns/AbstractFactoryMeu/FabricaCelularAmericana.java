package com.william.myproject.designPatterns.AbstractFactoryMeu;

//Cliente
public class FabricaCelularAmericana extends Fabrica {

    FabricaComponentes componentesOriginais= new FabricaComponentesOriginais();


    public Celular criarProduto(String nome) {
        Celular celular = null;
        if (nome.equals("Iphone")) {
            celular = new Iphone(componentesOriginais, nome);
        }
        return celular;
    }
}

