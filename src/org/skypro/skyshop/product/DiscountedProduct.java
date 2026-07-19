package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discountPercent;

    public DiscountedProduct(String title, int basePrice, int discountPercent) {
        super(title);
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;

    }

    @Override
    public int getPrice() {
        return basePrice * (100 - discountPercent) / 100;
    }

    @Override
    public String toString() {
        return "\n"+contentType()+": "+title + "\nцена: " + getPrice() + " (" + discountPercent + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
