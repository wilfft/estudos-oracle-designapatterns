package com.william.myproject.designPatterns.padraoFactoryBuilder;

public class BRPizzaStore extends PizzaStoreFactory {

    public Pizza criarPizza(String tipo) {
        Pizza pizza = null;
        if (tipo.equals("chesse")) {
            pizza = new BRPizzaQueijo();
        } else if (tipo.equals("calabreza")) {
            pizza = new BRPizzaCalabreza();
        }
        return pizza;

    }
}
