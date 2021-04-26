package com.william.myproject.designPatterns.AbstractFactoryMeu;

public class FabricaComponentesChineses implements FabricaComponentes {
    @Override
    public Display createDisplay() {
        return new DisplayParalelo();
    }
}
