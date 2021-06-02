package com.jalasoft.marylin.movies;

class NewReleaseRental extends Rental {
    public static final double PARTIAL_AMOUNT = 1;
    public static final int LIMIT_DAY_QUANTITY = 3;

    NewReleaseRental(final Movie movie, int daysRented) {
        super(movie, daysRented);
        partialAmount = PARTIAL_AMOUNT;
    }

    @Override
    public double getAmount() {
        return (daysRented * LIMIT_DAY_QUANTITY) * partialAmount;
    }

    @Override
    public int getFrequentRenterPoint() {
        int frequentRenterPoint = 1;
        if (this.getDaysRented() > 1) {
            return (frequentRenterPoint + 1);
        }
        return frequentRenterPoint;
    }
}
