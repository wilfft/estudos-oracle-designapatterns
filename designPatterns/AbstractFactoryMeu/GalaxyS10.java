package com.william.myproject.designPatterns.AbstractFactoryMeu;

public class GalaxyS10 extends Celular {
    FabricaComponentes fabricaComponentes;

    public GalaxyS10(FabricaComponentes fabricaComponentes, String nome) {
        this.fabricaComponentes = fabricaComponentes;
        this.nome = nome;
    }


    @Override
    void montarCelular() {
        System.out.println("montando celular");
        display = fabricaComponentes.createDisplay();

    }
}
