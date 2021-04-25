package com.william.myproject.designPatterns.padraoFactoryBuilder;

public class Main {

    public static void main(String[] args) {
        PizzaStoreFactory nyPizzaStore = new NYPizzaStore();

        Pizza pizza = nyPizzaStore.fazerPedidoPizza("queijo");
        System.out.println("Preparado`: " + pizza.getName());
    }

}
