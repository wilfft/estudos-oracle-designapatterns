package com.william.myproject.designPatterns.padraoStrategy.tiposDePato;

import com.william.myproject.designPatterns.padraoStrategy.models.Pato;

public class PatoMalhado  extends Pato {
    @Override
    public void display() {
        System.out.println("sou um pato malhado");
    }
}
