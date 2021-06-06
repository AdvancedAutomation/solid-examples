package com.jalasoft.yesica.movies.rentalDetails;

public class RegularRentalDetails implements RentalDetails {

    private final int rentedDays;

    public RegularRentalDetails(final int rentedDays) {
        this.rentedDays = rentedDays;
    }

    @Override
    public double getRentalPrice() {
        double rentalPrice = 2;
        if (rentedDays > 2) {
            rentalPrice += (rentedDays - 2) * 1.5;
        }
        return rentalPrice;
    }

    @Override
    public int getFrequentRenterPoints() {
        return 0;
    }
}
