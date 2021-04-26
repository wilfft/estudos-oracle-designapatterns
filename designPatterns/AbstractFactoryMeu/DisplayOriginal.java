package com.william.myproject.designPatterns.AbstractFactoryMeu;

public class DisplayOriginal implements Display {

    public DisplayOriginal() {
        System.out.println("Criando display original");
    }

    @Override
    public String getTipo() {
        return "Display Original";
    }
}
