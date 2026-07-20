package org.skypro.skyshop.product;

import java.util.Objects;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String title, int price) {
        super(title);
        if (price <= 0) {
            throw new IllegalArgumentException("недопустимое значение цены");
        }
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n" + contentType() + ": " + title + "\nцена: " + price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }


}
