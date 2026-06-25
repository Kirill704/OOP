package org.skypro.skyshop.product;

public final class Article implements Searchable {

    public String articleTitle;
    public String text;

    public Article(String articleTitle, String text) {
        this.articleTitle = articleTitle;
        this.text = text;
    }
    public String getText() {
        return text;
    }
    @Override
    public String nameObject() {
        return articleTitle;
    }

    @Override
    public String contentType() {
        return "ARTICLE";
    }

    @Override
    public String toString() {
        return contentType() + " название: " + articleTitle + ", текст: " + text;
    }
}