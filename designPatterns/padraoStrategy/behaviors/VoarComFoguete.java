package com.william.myproject.designPatterns.padraoStrategy.behaviors;

import com.william.myproject.designPatterns.padraoStrategy.interfaces.VoarComportamento;

public class VoarComFoguete implements VoarComportamento {


    @Override
    public void voar() {
        System.out.println("Estou voando com um foguete");
    }
}
