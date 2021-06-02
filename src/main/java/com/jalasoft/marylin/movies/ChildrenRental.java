package com.jalasoft.marylin.movies;

class ChildrenRental extends Rental {
    public static final double PARTIAL_AMOUNT = 1.5;
    public static final int LIMIT_DAY_QUANTITY = 3;

    ChildrenRental(final Movie movie, int daysRented) {
        super(movie, daysRented);
        partialAmount = PARTIAL_AMOUNT;
    }

    @Override
    public double getAmount() {
        if (daysRented > LIMIT_DAY_QUANTITY) {
            return partialAmount + ((daysRented - LIMIT_DAY_QUANTITY) * PARTIAL_AMOUNT);
        }
        return partialAmount;
    }

    @Override
    public int getFrequentRenterPoint() {
        return 1;
    }
}
