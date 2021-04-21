package com.william.myproject.productManager;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class ProductFactorycopia {
    //  private Product product;
    private Map<Product, List<Review>> products = new HashMap<>();

    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;

    public ProductFactorycopia(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("resources", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);

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

    public Product reviewProduct(int id, Rating rating, String comments) {
        return reviewProduct(findById(id), rating, comments);
    }

    public Product reviewProduct(Product product, Rating rating, String comments) {
        //pegando o value referente a key produto
        List<Review> reviews = products.get(product);
        //removendo do map pois nao consigo alterar a key
        products.remove(product);
        //adicionando a lista de avaliaçoes
        reviews.add(new Review(rating, comments));
      /*  product = product.applyRating(rating);
        if (reviews[reviews.length - 1] != null) {
            reviews = Arrays.copyOf(reviews, reviews.length + 5);
        boolean reviewed = false;
        while (i < reviews.length && reviewed == false) {
            if (reviews[i] == null) {
                reviews[i] = new Review(rating, comments);
                reviewed = true;
        int i = 0, sum = 0;
        sum += reviews[i].getRating().ordinal();  }*/
        //calculando o total dos ratingos e depois aplicando a média
        int sum = 0;
        for (Review review : reviews) {
            sum += review.getRating().ordinal();
        }
        product = product.applyRating(Rateable.convert(Math.round((float) sum / reviews.size())));

        //recolocando o objeto com a lista no map
        products.putIfAbsent(product, reviews);

        return product;
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

        List<Review> reviews = products.get(product);
        Collections.sort(reviews);
        for (Review review : reviews) {
            txt.append(MessageFormat
                    .format(resources.getString("review"),
                            review.getRating().getStars(),
                            review.getComments()));
            txt.append('\n');
        }
        if (reviews.size() == 0) {
            txt.append(resources.getString("no.reviews"));
            txt.append('\n');
        }
        System.out.println(txt);
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

}


