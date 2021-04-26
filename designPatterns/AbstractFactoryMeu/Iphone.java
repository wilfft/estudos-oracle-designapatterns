package com.william.myproject.designPatterns.AbstractFactoryMeu;

public class Iphone extends Celular {
    FabricaComponentes fabricaComponentes;

    public Iphone(FabricaComponentes fabricaComponentes, String nome) {
        this.fabricaComponentes = fabricaComponentes;
        System.out.println(fabricaComponentes);
        this.nome = nome;
    }


    @Override
    void montarCelular() {
        display = fabricaComponentes.createDisplay();


    }
}