package com.william.myproject.designPatterns.AbstractFactoryMeu;

public class FabricaComponentesOriginais implements FabricaComponentes{
    @Override
    public Display createDisplay() {
        return new DisplayOriginal();
    }
}
