package org.skypro.skyshop.product;

public abstract class Product implements Searchable{

    protected String title;

    public Product(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();
    @Override
    public String nameObject() {
        return title;
    }

    @Override
    public String contentType() {
        return "PRODUCT";
    }

}
