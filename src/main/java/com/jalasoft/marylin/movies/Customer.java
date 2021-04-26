package com.jalasoft.marylin.movies;

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
        String itemDetail = "";
        double totalAmount = 0;
        int totalFrequentRenterPoints = 0;
        Enumeration customerRentals = this.rentals.elements();
        String itemMessage = "\t%s\t%s\n";
        String message = "Rental Record for %s\n%sAmount owed is %s\nYou earned %s frequent renter points\n";

        while (customerRentals.hasMoreElements()) {
            Rental each = (Rental) customerRentals.nextElement();
            double thisAmount = each.getAmount();
            totalFrequentRenterPoints += each.getFrequentRenterPoint();
            itemDetail += String.format(itemMessage, each.getMovie().getTitle(), thisAmount);
            totalAmount += thisAmount;
        }
        return String.format(message, getName(), itemDetail, totalAmount, totalFrequentRenterPoints);
    }
}
