package com.william.myproject.designPatterns.padraoFactoryBuilder;

import java.util.ArrayList;

public abstract class Pizza {
    String nome;
    String descricao;
    ArrayList<String> adicionais = new ArrayList<>();

    protected void preparar() {

        System.out.println("Preparando sua pizza: " + getName());
        for (String adic : adicionais) {
            System.out.println("Adicionando: (MUITO)" + adic +"...");
        }
    }

    protected void voila() {
        System.out.println(descricao);
    }

    protected String getName() {
        return nome;
    }

    void cortar() {
        System.out.println("Cortado em fatias diagonais");
    }
}
