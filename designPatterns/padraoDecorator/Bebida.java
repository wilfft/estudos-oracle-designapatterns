package com.william.myproject.designPatterns.padraoDecorator;

public abstract class Bebida {
    String descricao = "Bebida desconhecida";

    public enum tamanho {
        GRANDE,
        MEDIO,
        PEQUENO
    }

    ;

    public String getDescricao() {
        return descricao;
    }

    public abstract double custo();

 /*   public abstract void setSize(

    );

    public abstract void getSize();
*/

}
