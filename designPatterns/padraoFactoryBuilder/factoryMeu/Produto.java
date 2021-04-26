package com.william.myproject.designPatterns.padraoFactoryBuilder.factoryMeu;

import java.util.ArrayList;

public abstract class Produto {

    protected String nome;
    protected ArrayList<String> adicionais = new ArrayList<>();


    public void preparar() {
        adicionais.stream().forEach(System.out::println);
        System.out.println("Produto preparado");
    }
}
