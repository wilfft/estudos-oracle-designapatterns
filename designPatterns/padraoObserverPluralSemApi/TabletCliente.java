package com.william.myproject.designPatterns.padraoObserverPluralSemApi;

public class TabletCliente extends Observer {
    public TabletCliente(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void addMensagem(String mensagem) {
        subject.setState(mensagem + " - enviado pelo tablete");
    }

    @Override
    void update() {
        System.out.println("Tablet mensagem: " + subject.getState());
    }
}
