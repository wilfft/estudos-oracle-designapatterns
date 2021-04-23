package com.william.myproject.productManager.oldversions;

import com.william.myproject.productManager.Drink;
import com.william.myproject.productManager.Food;
import com.william.myproject.productManager.Product;
import com.william.myproject.productManager.Rating;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class ProductFactoryEstudo {
    //  private Product product;

    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;

    public ProductFactoryEstudo(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("resources", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);

    }


    public Food createProduct(int id, String name, BigDecimal price, LocalDate bestBefore, Rating rating) {
        return new Food(id, name, price, bestBefore, rating);

    }

    public Drink createProduct(int id, String name, BigDecimal price, Rating rating) {
        return new Drink(id, name, price, rating);
    }

    public Product findById(int id){

        return null;
    }

}


