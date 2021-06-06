package com.jalasoft.marco.movie;

public class ChildrenPrice extends Price {

    public static final double AMOUNTTOMULTIPLY = 1.5;
    public static final int MAXDAYSRENTED = 3;

    double getAmount(int daysRented) {
        double result = AMOUNTTOMULTIPLY;
        if (daysRented > MAXDAYSRENTED) {
            result += (daysRented - MAXDAYSRENTED) * AMOUNTTOMULTIPLY;
        }

        return result;
    }

    int getPriceCode() {
        return Movie.CHILDREN;
    }
}
