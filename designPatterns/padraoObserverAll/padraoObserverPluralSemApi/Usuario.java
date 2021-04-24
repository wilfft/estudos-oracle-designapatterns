package com.william.myproject.designPatterns.padraoObserverAll.padraoObserverPluralSemApi;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {
      private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update: "+ nome+", postou algo");
    }
}
