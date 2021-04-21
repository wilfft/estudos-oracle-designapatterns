package com.william.myproject.productManager;

public enum Rating {
    NOT_RATED("☆☆☆☆☆"),
    ONE_STAR("★☆☆☆☆"),
    TWO_START("★★☆☆☆"),
    THREE_START("★★★☆☆"),
    FOUR_START("★★★★☆"),
    FIVE_START("★★★★★");

    private String stars;

    Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }
}
