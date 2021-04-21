package com.william.myproject.productManager;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food  extends Product implements Rateable<Product>  {


    private LocalDate bestBefore;

        Food(int id, String name, BigDecimal price, LocalDate bestBefore , Rating rating  ) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",  bestBefore=" + bestBefore;

    }
    @Override
    public BigDecimal getDiscount() {
        return bestBefore.isEqual(LocalDate.now()) ?
                super.getDiscount()  : BigDecimal.ZERO;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Food(getId(), getName(), getPrice(), bestBefore, newRating);
    }
}
