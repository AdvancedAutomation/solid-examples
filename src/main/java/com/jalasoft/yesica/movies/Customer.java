package com.jalasoft.yesica.movies;

public class Customer {

    private final String name;
    private int frequentRenterPoints;

    public Customer(final String name) {
        this.name = name;
        this.frequentRenterPoints = 0;
    }

    public String getName() {
        return name;
    }

    public void addFrequentRenterPoints(final int frequentRenterPoints) {
        this.frequentRenterPoints += frequentRenterPoints;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }
}
