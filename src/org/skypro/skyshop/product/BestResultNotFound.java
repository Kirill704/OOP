package org.skypro.skyshop.product;

public class BestResultNotFound extends Exception {

    private String s;

    public BestResultNotFound(String s) {
        this.s = s;
    }


}
