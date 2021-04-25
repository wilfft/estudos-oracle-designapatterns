package com.william.myproject.designPatterns.padraoFactoryBuilder;

public abstract class PizzaStoreFactory {

    public Pizza fazerPedidoPizza(String tipo) {
        Pizza pizza;
        pizza = criarPizza(tipo);
        pizza.preparar();
        pizza.voila();
        return pizza;
    }

    abstract Pizza criarPizza(String tipo);
}
