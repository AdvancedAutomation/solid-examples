package com.jalasoft.marylin.movies;

public final class Runner {
    public static final int NEW_RELEASE_DAYS_RENTED = 5;
    public static final int REGULAR_DAYS_RENTED = 1;
    public static final int CHILDREN_DAYS_RENTED = 3;

    private Runner() {
    }

    public static void main(final String[] args) {
        Customer customer = new Customer("Test");

        Rental newReleaseRental = new NewReleaseRental(new NewReleaseMovie("Zack Snyder's Justice League"), NEW_RELEASE_DAYS_RENTED);
        customer.addRental(newReleaseRental);

        Rental regularRental = new RegularRental(new RegularMovie("Terminator"), REGULAR_DAYS_RENTED);
        customer.addRental(regularRental);

        Rental childrenRental = new ChildrenRental(new ChildrenMovie("Soul"), CHILDREN_DAYS_RENTED);
        customer.addRental(childrenRental);

        System.out.println(customer.statement());
    }
}
