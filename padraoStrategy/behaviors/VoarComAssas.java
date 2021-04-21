package com.william.myproject.padraoStrategy.behaviors;

import com.william.myproject.padraoStrategy.interfaces.VoarComportamento;

public class VoarComAssas implements VoarComportamento {


    @Override
    public void voar() {
        System.out.println("Estou voando com minhas assas");
    }
}
