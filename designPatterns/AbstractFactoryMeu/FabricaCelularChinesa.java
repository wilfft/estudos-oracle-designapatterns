package com.william.myproject.designPatterns.AbstractFactoryMeu;

//Cliente
public class FabricaCelularChinesa extends Fabrica {
    FabricaComponentes componentes = new FabricaComponentesChineses();


    public Celular criarProduto(String nome) {
        Celular celular = null;
        if (nome.equals("GalaxyS10")) {
            celular = new Iphone(componentes, nome);
        }
        return celular;
    }
}