package com.jalasoft.marylin.movies;

class RegularRental extends Rental {
    public static final double PARTIAL_AMOUNT = 1.5;

    RegularRental(final Movie movie, int daysRented) {
        super(movie, daysRented);
        partialAmount = 2;
    }

    @Override
    public double getAmount() {
        if (daysRented > 2) {
            return partialAmount + ((daysRented - 2) * PARTIAL_AMOUNT);
        }
        return partialAmount;
    }

    @Override
    public int getFrequentRenterPoint() {
        return 0;
    }
}
