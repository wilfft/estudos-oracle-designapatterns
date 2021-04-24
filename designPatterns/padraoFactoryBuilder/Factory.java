package com.william.myproject.designPatterns.padraoFactoryBuilder;

public abstract class Factory {

    public Pizza fazerPedidoPizza(String tipo) {
        Pizza pizza;
        pizza = criarPizza(tipo);
        pizza.preparar();
        return pizza;
    }

   protected abstract Pizza criarPizza(String tipo);
}
