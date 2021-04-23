package com.william.myproject.designPatterns.padraoObserverPluralSemApi;

public class Main {
    public static void main(String[] args) {
        Subject subject = new MensagemStream();

        MobileCliente mobileCliente = new MobileCliente(subject);
        TabletCliente tabletCliente = new TabletCliente(subject);

        mobileCliente.addMensagem("Aqui está uma mensagem");
        tabletCliente.addMensagem("Mais uma mensage está uma mensagem");

        subject.getState();
    }


}

