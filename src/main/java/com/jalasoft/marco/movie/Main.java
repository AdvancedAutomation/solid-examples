package com.jalasoft.marco.movie;

public final class Main {

    private Main() {
        // Default constructor.
    }

    public static final int DAYSRENTED1 = 5;
    public static final int DAYSRENTED2 = 1;
    public static final int DAYSRENTED3 = 3;

    public static void main(final String[] args) {

        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("Zack Snyder's Justice League", 1), DAYSRENTED1));
        customer.addRental(new Rental(new Movie("Terminator", 0), DAYSRENTED2));
        customer.addRental(new Rental(new Movie("Soul", 2), DAYSRENTED3));
        System.out.println(customer.statement());
    }
}
