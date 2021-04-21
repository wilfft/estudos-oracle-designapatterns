package com.william.myproject.productManager;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Product implements Rateable<Product> {
    private static BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.01);
    private int id;
    private String name;
    private BigDecimal price;

    private Rating rating;


    Product() {
        this(0, "Não nomeado", BigDecimal.ZERO);
    }

    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);

    }

    //metodo abstrato que por obrigaçao, terá nos filhos
    //   public abstract Product applyRating(RatingEnum newRating);


    //metodo para ser sobreescrito pelos filhos
    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product: " +
                id +
                ", name= " + name +
                ", price=" + getDiscount() +
                ", rating=" + rating.getStars() +
                "," + getBestBefore();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, rating);
    }
}
