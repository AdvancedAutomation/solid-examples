package com.jalasoft.marco.movie;

public class RegularPrice extends Price {

    public static final double AMOUNTTOMULTIPLY = 1.5;
    public static final int MAXDAYSRENTED = 3;

    double getAmount(int daysRented) {
        double result = MAXDAYSRENTED;
        if (daysRented > MAXDAYSRENTED) {
            result += (daysRented - MAXDAYSRENTED) * AMOUNTTOMULTIPLY;
        }

        return result;
    }

    int getPriceCode() {
        return Movie.REGULAR;
    }
}
