package org.skypro.skyshop.product;

import java.util.Arrays;
import java.util.Objects;

public class SearchEngine {

    private Searchable[] checkElements;

    public SearchEngine(int capacity) {
        this.checkElements = new Searchable[capacity];
    }

    public void add(Searchable addElement) {
        int i = findFree();
        if (i != -1) {
            checkElements[i] = addElement;
        }
    }

    private int findFree() {
        for (int i = 0; i < checkElements.length; i++) {
            if (checkElements[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void search(String searchTerm) {
        System.out.println("\nнайти: " + searchTerm);
        Searchable[] results = new Searchable[5];
        int i = 0;
        for (Searchable element : checkElements) {
            if (element != null && element.nameObject().contains(searchTerm) && i < 5) {
                results[i] = element;
                i++;
            }
        }
        System.out.println(Arrays.toString(results));
    }

}