package com.jalasoft.unittest.statebased;

public class Product {

    private String name;
    private double price;

    public Product(final String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
