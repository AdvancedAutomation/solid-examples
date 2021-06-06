package com.jalasoft.yesica.movies;

import java.util.ArrayList;
import java.util.List;

public class RentalRecord {

    private final Customer customer;
    private final List<Rental> rentals = new ArrayList<>();
    private double totalAmount = 0;
    private int frequentRenterPoints = 0;

    public RentalRecord(final Customer customer) {
        this.customer = customer;
    }

    public void addRental(final Rental rental) {
        rentals.add(rental);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void calculateTotalAmount() {
        rentals.forEach(rental -> totalAmount += rental.getRentalDetails().getRentalPrice());
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void calculateFrequentRenterPoints() {
        frequentRenterPoints =
                rentals.stream().mapToInt(rental -> rental.getRentalDetails().getFrequentRenterPoints()).sum();
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    public void finalizeRecord() {
        calculateTotalAmount();
        calculateFrequentRenterPoints();
        customer.addFrequentRenterPoints(frequentRenterPoints);
    }
}
