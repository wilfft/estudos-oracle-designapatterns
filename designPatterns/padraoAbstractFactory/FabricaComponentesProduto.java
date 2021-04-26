package com.william.myproject.designPatterns.padraoAbstractFactory;

public interface FabricaComponentesProduto {

    public Tela createTela();
    public Display createDisplay();
    public Teclado createTeclado();
    public AltoFalante createAltoFalante();
}
