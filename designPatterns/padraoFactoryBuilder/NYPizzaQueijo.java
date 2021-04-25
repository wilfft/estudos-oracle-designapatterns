package com.william.myproject.designPatterns.padraoFactoryBuilder;

public class NYPizzaQueijo extends Pizza {
    public NYPizzaQueijo() {
        nome = "ChessePizza Ny Style";
        descricao = "Saindo uma no estilo Nova Iorquino, com MUITO QUEIJO";
        adicionais.add("queijo");
        adicionais.add("tomate");
    }
}
