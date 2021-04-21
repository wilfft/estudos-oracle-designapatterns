package com.william.myproject.padraoStrategy.tiposDePato;

import com.william.myproject.padraoStrategy.models.Pato;

public class PatoMalhado  extends Pato {
    @Override
    public void display() {
        System.out.println("sou um pato malhado");
    }
}
