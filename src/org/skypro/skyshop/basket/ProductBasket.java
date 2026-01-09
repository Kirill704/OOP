package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Objects;

public class ProductBasket {
    private Product[] basket = new Product[5];

    public void productAdd(Product addProduct) {
        int i = findFreeSpace();
        if (i == -1) {
            System.out.println("невозможно добавить продукт");
        } else {
            basket[i] = new Product(addProduct.getTitle(), addProduct.getCost());
        }
    }

    private int findFreeSpace() {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int totalCost() {
        int sum = 0;
        for (Product product : basket) {
            if (product != null) {
                sum += product.getCost();
            }
        }
        return sum;
    }

    public void printBasket() {
        int countFreeSpace = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                System.out.println(basket[i]);
            } else {
                countFreeSpace++;
            }
            if (countFreeSpace == 5) {
                System.out.println("в корзине пусто");
            }
        }
        System.out.println("ИТОГО: " + totalCost());
    }

    public boolean findProduct(String targetTitle) {
        for (Product product : basket) {
            if (product != null && Objects.equals(product.getTitle(), targetTitle)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
    }

}
