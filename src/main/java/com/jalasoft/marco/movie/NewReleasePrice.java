package com.jalasoft.marco.movie;

public class NewReleasePrice extends Price {

    public static final int MAXDAYSRENTED = 3;

    double getAmount(int daysRented) {
        return daysRented * MAXDAYSRENTED;
    }

    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
