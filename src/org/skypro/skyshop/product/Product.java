package org.skypro.skyshop.product;

public class Product {

    private String title;
    private int cost;

    public Product(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return title + ": " + cost;
    }
}
