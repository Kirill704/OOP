package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private final int FIX_PRICE = 100;

    public FixPriceProduct(String title) {
        super(title);
    }

    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public String toString() {
        return contentType()+" "+title + ", Фиксированная цена: " + FIX_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
