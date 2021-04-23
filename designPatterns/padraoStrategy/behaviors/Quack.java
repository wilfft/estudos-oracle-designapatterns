package com.william.myproject.designPatterns.padraoStrategy.behaviors;

import com.william.myproject.designPatterns.padraoStrategy.interfaces.QuackComportamento;

public class Quack implements QuackComportamento {

    @Override
    public void quack() {
        System.out.println("Quackkkk comummm");
    }
}
