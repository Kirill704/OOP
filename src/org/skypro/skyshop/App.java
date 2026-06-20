package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        ProductBasket productBasket = new ProductBasket();

        Product product0 = new SimpleProduct("ручка", 100);
        Product product1 = new DiscountedProduct("календарь", 200, 20);
        Product product2 = new FixPriceProduct("блокнот");
        Product product3 = new SimpleProduct("степлер", 400);
        Product product4 = new SimpleProduct("ежедневник", 500);

        //добавление продукта в корзину

        productBasket.productAdd(product0);
        productBasket.productAdd(product1);
        productBasket.productAdd(product2);
        productBasket.productAdd(product3);
        productBasket.productAdd(product4);

        System.out.println("печать корзины и получение общей стоимости, результат:");
        productBasket.printBasket();

        System.out.println();
        System.out.println("попытка добавить продукт в заполненную корзину, результат:");
        Product product = new SimpleProduct("ежедневник", 500);
        productBasket.productAdd(product);

        System.out.println();
        System.out.println("поиск товара в корзине по названию, если товар есть в корзине, результат:");
        String targetTitle = "степлер";
        System.out.println(productBasket.findProduct(targetTitle));

        System.out.println();
        System.out.println("поиск по названию товара, отсутствующего в корзине, результат:");
        String targetTitle1 = "карандаш";
        System.out.println(productBasket.findProduct(targetTitle1));

        System.out.println();
        System.out.println("очистка и печать пустой корзины, результат:");
        productBasket.clearBasket();
        productBasket.printBasket();

        System.out.println();
        System.out.println("поиск товара в пустой корзине, результат:");
        String targetTitle2 = "степлер";
        System.out.println(productBasket.findProduct(targetTitle2));
    }
}