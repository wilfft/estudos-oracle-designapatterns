package com.william.myproject.productManager;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class ProductFactory {

    private HashMap<Product, List<Review>> products = new HashMap<>();
    private Formatter messageFormatter;

    private static Map<String, Formatter> formatters =
            Map.of(
                    "en-GB", new Formatter(Locale.UK),
                    "en-US", new Formatter(Locale.US)
            );

    public ProductFactory(Locale locale) {
        this(locale.toLanguageTag()); //vai chamar o construtor de baixo 'public ProductFactory(String languageTag) '
    }

    public ProductFactory(String languageTag) {
        changeLocale(languageTag);
    }

    public void changeLocale(String languageTag) {
        messageFormatter = formatters.getOrDefault(languageTag, formatters.get(new Locale("pt-BR")));

    }


    public static Set<String> getSupportedLocales() {
        return formatters.keySet();
    }

    public Product createProduct(int id, String name, BigDecimal price, LocalDate bestBefore, Rating rating) {
        Product product = new Food(id, name, price, bestBefore, rating);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
        Product product = new Drink(id, name, price, rating);
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
        List<Review> reviews = products.get(product);

        txt.append(messageFormatter.formatProduct(product));

        txt.append("\n");
        Collections.sort(reviews);
        for (Review review : reviews) {
            txt.append(messageFormatter.formatReviews(review));
            txt.append("\n");
        }
        if (reviews.size() == 0) {
            txt.append(messageFormatter.getText("no.reviews"));
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