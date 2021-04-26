package com.jalasoft.unittest.statebased;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Product> products;

    public Invoice() {
        products = new ArrayList<>();
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice();
        }
        return totalAmount;
    }

    public void addProduct(final Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
