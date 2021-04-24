package com.william.myproject.designPatterns.padraoFactoryBuilder;

public abstract class PizzaStoreFactory {

    public Pizza fazerPedidoPizza(String tipo) {
        Pizza pizza;
        pizza = criarPizza(tipo);
        pizza.preparar();
        return pizza;
    }

    abstract Pizza criarPizza(String tipo);
}
