package com.william.myproject.designPatterns.padraoFactoryBuilder;

public   class NYPizzaStore extends PizzaStoreFactory {

    public Pizza criarPizza(String tipo) {
        Pizza pizza = null;
        if (tipo.equals("chesse")) {
            pizza = new NYPizzaQueijo();
        } else if (tipo.equals("calabreza")) {
            pizza = new NYPizzaCalabreza();
        }
        return pizza;

    }
}
