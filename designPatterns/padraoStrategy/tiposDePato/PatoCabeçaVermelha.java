package com.william.myproject.designPatterns.padraoStrategy.tiposDePato;

import com.william.myproject.designPatterns.padraoStrategy.behaviors.Quack;
import com.william.myproject.designPatterns.padraoStrategy.behaviors.VoarComAssas;
import com.william.myproject.designPatterns.padraoStrategy.models.Pato;

public class PatoCabeçaVermelha extends Pato {

    public PatoCabeçaVermelha() {
        quackComportamento = new Quack();
        voarComportamento = new VoarComAssas();
    }


    @Override
    public void display() {

    }
}
