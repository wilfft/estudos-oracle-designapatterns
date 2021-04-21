package com.william.myproject.padraoStrategy.behaviors;

import com.william.myproject.padraoStrategy.interfaces.QuackComportamento;
import com.william.myproject.padraoStrategy.interfaces.VoarComportamento;

public class Quack implements QuackComportamento {

    @Override
    public void quack() {
        System.out.println("Quackkkk comummm");
    }
}
