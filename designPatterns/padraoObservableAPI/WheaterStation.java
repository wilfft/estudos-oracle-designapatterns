package com.william.myproject.designPatterns.padraoObservableAPI;

public class WheaterStation {
    public static void main(String[] args) {
        DadosTemperatura dadosTemperatura = new DadosTemperatura();
        DisplayGPS displayGPS = new DisplayGPS(dadosTemperatura);
        DisplayMobile displayMobile = new DisplayMobile(dadosTemperatura);
        dadosTemperatura.setMediçoes(2.0f);
    }
}
