package com.william.myproject.productManager;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class ProductFactory {
    //  private Product product;
    // private Product product;
    private HashMap<Product, List<Review>> products = new HashMap<>();
    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;

    public ProductFactory(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("resources", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
        Product product = new Drink(id, name, price, rating);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, LocalDate bestBefore, Rating rating) {
        Product product = new Food(id, name, price, bestBefore, rating);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }

    public Product findById(int id) {
        Product result = null;

        for (Product product : products.keySet()) {
            if (product.getId() == id) {
                result = product;
                break;
            }
        }
        return result;
    }

    public void printProductReport(int id) {
        printProductReport(findById(id));
    }

    public void printProductReport(Product product) {
        StringBuilder txt = new StringBuilder();

        txt.append(MessageFormat.format(resources.getString("product"),
                product.getName(),
                moneyFormat.format(product.getPrice()),
                product.getRating().getStars(),
                dateFormat.format(product.getBestBefore())));
        txt.append("\n");

        List<Review> reviewList = products.get(product);
        for (Review review : reviewList) {
            txt.append(MessageFormat.format(resources.getString("review"),
                    review.getRating().getStars(),
                    review.getComments()));
            txt.append("\n");
        }
        if (reviewList.size() == 0) {
            txt.append(resources.getString("no.reviews"));
            txt.append("\n");
        }
        System.out.println(txt);
    }


    public void reviewProduct(Product product, Rating rating, String comment) {
        List<Review> prodReviews = products.get(product);
        prodReviews.add(new Review(rating, comment));
        int sum = 0;
        for (Review review : prodReviews) {
            sum += review.getRating().ordinal();
        }
        product = product.applyRating(Rateable.convert(Math.round((float) sum / prodReviews.size())));
        products.putIfAbsent(product, prodReviews);
    }

    public void reviewProduct(int id, Rating rating, String comment) {
        reviewProduct(findById(id), rating, comment);
    }

}