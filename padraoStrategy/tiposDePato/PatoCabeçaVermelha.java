package com.william.myproject.padraoStrategy.tiposDePato;

import com.william.myproject.padraoStrategy.behaviors.Quack;
import com.william.myproject.padraoStrategy.behaviors.VoarComAssas;
import com.william.myproject.padraoStrategy.interfaces.QuackComportamento;
import com.william.myproject.padraoStrategy.models.Pato;

public class PatoCabeçaVermelha extends Pato {

    public PatoCabeçaVermelha() {
        quackComportamento = new Quack();
        voarComportamento = new VoarComAssas();
    }


    @Override
    public void display() {

    }
}
