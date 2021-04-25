package com.william.myproject.designPatterns.padraoFactoryBuilder;

public class NYPizzaCalabreza extends Pizza {
    public NYPizzaCalabreza() {
        nome = "Pizza de calabreza no estilo Nova Iorquino, com MUITA CEBOLA";
        adicionais.add("cebola");
        adicionais.add("bacon");
    }

    void cortar(){
        System.out.println("Cortada em aperitivo");
    }
}

