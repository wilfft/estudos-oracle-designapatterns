package com.william.myproject.designPatterns.padraoObserverPlural;

public class Main {
    public static void main(String[] args) {
        LinkedinStream messageStream = new LinkedinStream();

        Usuario usuario1 = new Usuario("Marcos");
        Usuario usuario2 = new Usuario("João");
        messageStream.addObserver(usuario1);
        messageStream.addObserver(usuario2);
        messageStream.alguemPostou();
    }


}

