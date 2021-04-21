package com.william.myproject.padraoStrategy;

import com.william.myproject.padraoStrategy.behaviors.VoarComAssas;
import com.william.myproject.padraoStrategy.behaviors.VoarComFoguete;
import com.william.myproject.padraoStrategy.models.Pato;
import com.william.myproject.padraoStrategy.tiposDePato.PatoCabeçaVermelha;
import com.william.myproject.padraoStrategy.tiposDePato.PatoMalhado;

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
