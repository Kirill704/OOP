package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discountPercent;

    public DiscountedProduct(String title, int basePrice, int discountPercent) {
        super(title);
        if (basePrice <= 0 || (discountPercent < 0 || discountPercent > 100)) {
            throw new IllegalArgumentException("недопустимое значение цены или скидки");
        }
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;

    }

    @Override
    public int getPrice() {
        return basePrice * (100 - discountPercent) / 100;
    }

    @Override
    public String toString() {
        return "\n" + contentType() + ": " + title + "\nцена: " + getPrice() + " (" + discountPercent + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }


}
