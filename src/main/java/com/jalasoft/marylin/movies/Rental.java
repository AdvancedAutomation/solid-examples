package com.jalasoft.marylin.movies;

/**
 * Rental Abstract class.
 */
abstract class Rental {
    protected Movie movie;
    protected int daysRented;
    protected double partialAmount;

    /**
     * Rental Constructor.
     *
     * @param movie
     * @param daysRented
     */
    Rental(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Gets rented days.
     *
     * @return daysRented
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Gets Movie.
     *
     * @return movie
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Gets Rental Amount.
     *
     * @return amount
     */
    public abstract double getAmount();

    /**
     * Gets the FrequentRenterPoint.
     *
     * @return frequent renter point
     */
    public abstract int getFrequentRenterPoint();

    public double getPartialAmount() {
        return partialAmount;
    }

    public void setPartialAmount(double partialAmount) {
        this.partialAmount = partialAmount;
    }
}
