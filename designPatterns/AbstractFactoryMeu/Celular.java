package com.william.myproject.designPatterns.AbstractFactoryMeu;

public abstract class Celular {
    String nome;
    Display display;

    abstract void montarCelular();

    //lista de componentes
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", display=" + display.getTipo() +
                '}';
    }
}
