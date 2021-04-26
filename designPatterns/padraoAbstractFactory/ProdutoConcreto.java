package com.william.myproject.designPatterns.padraoAbstractFactory;

public class ProdutoConcreto extends Produto {
    FabricaComponentesProduto fabricaComponentesProduto;

    public ProdutoConcreto(FabricaComponentesProduto fabricaDeComponentes) {

        this.fabricaComponentesProduto = fabricaDeComponentes;
    }

    @Override
    void montar() {
        System.out.println("Montando: " + nome);
        display = fabricaComponentesProduto.createDisplay();
        tela = fabricaComponentesProduto.createTela();
        teclado = fabricaComponentesProduto.createTeclado();
        altoFalante = fabricaComponentesProduto.createAltoFalante();

    }
}
