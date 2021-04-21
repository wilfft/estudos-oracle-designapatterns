package com.william.myproject.padraoStrategy.behaviors;

import com.william.myproject.padraoStrategy.interfaces.VoarComportamento;

public class VoarComFoguete implements VoarComportamento {


    @Override
    public void voar() {
        System.out.println("Estou voando com um foguete");
    }
}
