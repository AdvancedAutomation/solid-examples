package com.jalasoft.marco.movie;

class Rental {
    private Movie movie;
    private int daysRented;
    private int frequentRenterPoints = 0;

    Rental(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double getAmount() {
        return movie.getAmount(daysRented);
    }

    int getFrequentRenterPoints() {

        // add frequent renter points for Children and New Release
        if (getMovie().getPriceCode() == Movie.NEW_RELEASE || getMovie().getPriceCode() == Movie.CHILDREN) {
            frequentRenterPoints++;
        }
        // add bonus for a two day new release rental
        if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1) {
            frequentRenterPoints++;
        }

        return frequentRenterPoints;
    }
}
