package com.william.myproject.designPatterns.padraoAbstractFactory;

public class ComponentesChineses implements FabricaComponentesProduto {
    @Override
    public Tela createTela() {
        return new Tela();
    }

    @Override
    public Display createDisplay() {
        return new Display();
    }

    @Override
    public Teclado createTeclado() {
        return new Teclado();
    }

    @Override
    public AltoFalante createAltoFalante() {
        return new AltoFalante();
    }
}
