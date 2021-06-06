package com.jalasoft.yesica.movies;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Test");

        RentalRecord firstRentalRecord = new RentalRecord(customer);
        firstRentalRecord.addRental(new Rental(new Movie("Zack Snyder's Justice League", MovieCategory.NEW_RELEASE),
                5));
        firstRentalRecord.addRental(new Rental(new Movie("Terminator", MovieCategory.REGULAR), 1));
        firstRentalRecord.addRental(new Rental(new Movie("Soul", MovieCategory.CHILDREN), 3));
        firstRentalRecord.finalizeRecord();

        RentalRecord secondRentalRecord = new RentalRecord(customer);
        secondRentalRecord.addRental(new Rental(new Movie("The Holidays", MovieCategory.REGULAR), 2));
        secondRentalRecord.addRental(new Rental(new Movie("Raya", MovieCategory.CHILDREN), 5));
        secondRentalRecord.finalizeRecord();

        System.out.println(RentalRecordReporter.generateRecordReport(firstRentalRecord));
        System.out.println("-----------------------------------------------");
        System.out.println(RentalRecordReporter.generateRecordReport(secondRentalRecord));
        System.out.println("-----------------------------------------------");
        System.out.println("Customer total frequent renter points: " + customer.getFrequentRenterPoints());
    }
}
