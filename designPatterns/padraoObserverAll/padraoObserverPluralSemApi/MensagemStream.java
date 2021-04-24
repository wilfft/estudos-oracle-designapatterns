package com.william.myproject.designPatterns.padraoObserverAll.padraoObserverPluralSemApi;

import java.util.ArrayDeque;
import java.util.Deque;

public class MensagemStream extends Subject {

    private Deque<String> historicoMensagem = new ArrayDeque<String>();

    @Override
    void setState(String mensagem) {
        historicoMensagem.add(mensagem);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return historicoMensagem.getLast();
    }
}
