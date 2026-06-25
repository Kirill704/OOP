package org.skypro.skyshop.product;

public interface Searchable {

    default String searchTerm(String searchTerm) {
        return "найти: "+searchTerm;
    }

    String nameObject();

    String contentType();


}
