package com.jalasoft.yesica.movies.rentalDetails;

public class NewReleaseRentalDetails implements RentalDetails {

    private final int rentedDays;

    public NewReleaseRentalDetails(final int rentedDays) {
        this.rentedDays = rentedDays;
    }

    @Override
    public double getRentalPrice() {
        return rentedDays * 3;
    }

    @Override
    public int getFrequentRenterPoints() {
        return rentedDays > 1 ? 2 : 1;
    }
}
