package org.skypro.skyshop.product;

public interface Searchable {

    String nameObject();

    String contentType();

    default String getStringRepresentation() {
        return contentType() + ": " + nameObject();
    }
}
