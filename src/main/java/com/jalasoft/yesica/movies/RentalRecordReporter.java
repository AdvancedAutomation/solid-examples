package com.jalasoft.yesica.movies;

import java.util.List;

public class RentalRecordReporter {

    public static String generateRecordReport(final RentalRecord rentalRecord) {
        return formatReportHeader(rentalRecord.getCustomerName())
                + formatRentalDetails(rentalRecord.getRentals())
                + formatAmount(rentalRecord.getTotalAmount())
                + formatFrequentRenterPoints(rentalRecord.getFrequentRenterPoints());
    }

    private static String formatReportHeader(final String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    private static String formatRentalDetails(final List<Rental> rentals) {
        StringBuilder rentalRecordBuilder = new StringBuilder();
        rentals.forEach(rental -> rentalRecordBuilder.append("\t").append(rental.getMovie().getTitle()).append("\t")
                .append(rental.getRentalDetails().getRentalPrice()).append("\n"));
        return rentalRecordBuilder.toString();
    }

    private static String formatAmount(final double totalAmount) {
        return "Amount owed is " + totalAmount + "\n";
    }

    private static String formatFrequentRenterPoints(final int frequentRenterPoints) {
        return "You earned " + frequentRenterPoints + " frequent renter points";
    }
}
