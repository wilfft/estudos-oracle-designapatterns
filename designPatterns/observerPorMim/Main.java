package com.william.myproject.designPatterns.observerPorMim;

public class Main {

    public static void main(String[] args) {


        Observable subject = new Subject();

        Ouvinte ouvinte1 = new Ouvinte(subject);
        subject.notifyObservers();


        System.out.println("adicionando ouvinte 2");
        Ouvinte2 ouvinte2 = new Ouvinte2(subject);
        subject.notifyObservers();
    }
}
