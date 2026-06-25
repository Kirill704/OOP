package org.skypro.skyshop.product;

import java.util.Objects;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String title, int price) {
        super(title);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return contentType()+" "+title + ", цена: " + price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

}
