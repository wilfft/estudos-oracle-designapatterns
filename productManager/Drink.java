package com.william.myproject.productManager;


import java.math.BigDecimal;
import java.time.LocalTime;

public class Drink extends Product implements Rateable<Product> {


    Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);

    }


    public BigDecimal getDiscount() {

        return (
                LocalTime.now().isAfter(LocalTime.of(16, 30)) &&
                        LocalTime.now().isBefore(LocalTime.of(17, 30)))
                ? super.getDiscount() : BigDecimal.ZERO;
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Drink(getId(), getName(), getPrice(), newRating);
    }

}

