package com.william.myproject.designPatterns.padraoStrategy;

import com.william.myproject.designPatterns.padraoStrategy.behaviors.VoarComFoguete;
import com.william.myproject.designPatterns.padraoStrategy.models.Pato;
import com.william.myproject.designPatterns.padraoStrategy.tiposDePato.PatoCabeçaVermelha;

public class mainGame {
    public static void main(String[] args) {
        //         Pato malhado = new PatoMalhado( );
      Pato vermelho = new PatoCabeçaVermelha( );
        //        malhado.fazerQuack();
    vermelho.levantarVoo();
    vermelho.fazerQuack();
    vermelho.setVoarComportamento(new VoarComFoguete());
    vermelho.levantarVoo();
    }




}
