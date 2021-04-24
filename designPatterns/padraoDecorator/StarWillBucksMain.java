package com.william.myproject.designPatterns.padraoDecorator;

public class StarWillBucksMain {

    public static void main(String[] args) {
        Bebida bebida = new Expresso();

        System.out.println(bebida.getDescricao() + " R$ " + bebida.custo());
        Bebida bebida2 = new CaféTorrado();
        bebida  = new Mocha(bebida2);
        bebida2  = new Creme(bebida);
        System.out.println(bebida2.getDescricao() + " R$ " + bebida2.custo());
       // bebida = new Creme(bebida);
        System.out.println(bebida.getDescricao() + " R$ " + bebida.custo());

    }
/* Expresso R$ 1.99
Café torrado, Mocha, Creme R$ 3.49
Expresso, Creme R$ 2.29*/

}
