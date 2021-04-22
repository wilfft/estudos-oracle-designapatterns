package com.william.myproject.shop;

import com.william.myproject.productManager.Product;
import com.william.myproject.productManager.ProductFactory;
import com.william.myproject.productManager.Rating;

import java.math.BigDecimal;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        ProductFactory pm = new ProductFactory(new Locale("en-US"));


        pm.createProduct(101, "Toddynho", new BigDecimal("2.00"), Rating.NOT_RATED);
        pm.createProduct(102, "Arroz", new BigDecimal("4.00"), Rating.NOT_RATED);
        pm.createProduct(103, "Coca cola", new BigDecimal("4.00"), Rating.NOT_RATED);
        pm.createProduct(104, "Leite", new BigDecimal("4.00"), Rating.NOT_RATED);



        pm.reviewProduct(102, Rating.ONE_STAR, "Niicee");
        pm.reviewProduct(102, Rating.ONE_STAR, "Woowww");
        pm.reviewProduct(102, Rating.FOUR_START, "Niicee");

        pm.reviewProduct(102, Rating.FOUR_START, "Niicee");
        pm.reviewProduct(102, Rating.FOUR_START, "Niicee");

        pm.reviewProduct(103, Rating.ONE_STAR, "Niicee");
        pm.reviewProduct(103, Rating.FIVE_START, "Woowww");


pm.printProductReport(102);




    /*    //     Product p1 = pm.createProduct(101, "Toddynho", new BigDecimal("2.00"), Rating.NOT_RATED);
        //   p1 = pm.reviewProduct(p1, Rating.ONE_STAR, "Niicee");
        pm.createProduct(101, "Toddynho", new BigDecimal("2.00"), Rating.NOT_RATED);
        pm.createProduct(102, "Arroz", new BigDecimal("4.00"), Rating.NOT_RATED);
        pm.createProduct(103, "Coca cola", new BigDecimal("4.00"), Rating.NOT_RATED);
        pm.createProduct(104, "Leite", new BigDecimal("4.00"), Rating.NOT_RATED);


        pm.reviewProduct(102, Rating.ONE_STAR, "Niicee");
        pm.reviewProduct(102, Rating.ONE_STAR, "Woowww");
        pm.reviewProduct(102, Rating.FOUR_START, "Niicee");


        pm.reviewProduct(103, Rating.ONE_STAR, "Niicee");
        pm.reviewProduct(103, Rating.FIVE_START, "Woowww");
        pm.reviewProduct(103, Rating.FOUR_START, "Niicee");
        pm.reviewProduct(104, Rating.FOUR_START, "Fucing good");
        pm.reviewProduct(104, Rating.ONE_STAR, "Niicee");
        pm.reviewProduct(101, Rating.ONE_STAR, "Niicee");
        System.out.println(pm.findById(103));
pm.printProductReport(103);
        // pm.printProductReport(p3);
        // a classe productFactory guarda a referencia de reviews do produto que esta recebendo


*/

    }
}
