package com.jalasoft.yesica.movies.rentalDetails;

public class ChildrenRentalDetails implements RentalDetails {

    private final int rentedDays;

    public ChildrenRentalDetails(final int rentedDays) {
        this.rentedDays = rentedDays;
    }

    @Override
    public double getRentalPrice() {
        double rentalPrice = 1.5;
        if (this.rentedDays > 3) {
            rentalPrice += (this.rentedDays - 3) * 1.5;
        }
        return rentalPrice;
    }

    @Override
    public int getFrequentRenterPoints() {
        return 1;
    }
}
