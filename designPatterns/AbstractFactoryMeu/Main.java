package com.william.myproject.designPatterns.AbstractFactoryMeu;

public class Main {

    public static void main(String[] args) {
        Celular celular1;
        Fabrica fabricaAmericana = new FabricaCelularAmericana();
        celular1 = fabricaAmericana.fazerPedido("Iphone");
        celular1.montarCelular();
        System.out.println(celular1);
    }
}