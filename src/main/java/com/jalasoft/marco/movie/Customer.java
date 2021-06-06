package com.jalasoft.marco.movie;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String name;
    private Vector rentals = new Vector();

    Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Enumeration rentalsList = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalsList.hasMoreElements()) {
            Rental each = (Rental) rentalsList.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getAmount()) + "\n";
        }
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }

    private double getTotalAmount() {
        double amountResult = 0;
        Enumeration rentalsList = this.rentals.elements();
        while (rentalsList.hasMoreElements()) {
            Rental each = (Rental) rentalsList.nextElement();
            amountResult += each.getAmount();
        }
        return amountResult;
    }

    private int getTotalFrequentRenterPoints() {
        int frequentPointsResult = 0;
        Enumeration rentalsList = this.rentals.elements();
        while (rentalsList.hasMoreElements()) {
            Rental each = (Rental) rentalsList.nextElement();
            frequentPointsResult += each.getFrequentRenterPoints();
        }
        return frequentPointsResult;
    }
}
