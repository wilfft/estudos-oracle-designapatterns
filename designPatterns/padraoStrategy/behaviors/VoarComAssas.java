package com.william.myproject.designPatterns.padraoStrategy.behaviors;

import com.william.myproject.designPatterns.padraoStrategy.interfaces.VoarComportamento;

public class VoarComAssas implements VoarComportamento {


    @Override
    public void voar() {
        System.out.println("Estou voando com minhas assas");
    }
}
