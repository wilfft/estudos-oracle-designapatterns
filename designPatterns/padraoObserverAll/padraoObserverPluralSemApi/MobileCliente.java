package com.william.myproject.designPatterns.padraoObserverAll.padraoObserverPluralSemApi;

public class MobileCliente extends Observer {
    public MobileCliente(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void addMensagem(String mensagem) {
        subject.setState(mensagem + " - enviado pelo cel");
    }

    @Override
    void update() {
        System.out.println("Cel mensagem: " + subject.getState());
    }
}
