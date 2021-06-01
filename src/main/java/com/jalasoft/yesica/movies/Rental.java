package com.jalasoft.yesica.movies;

import com.jalasoft.yesica.movies.rentalDetails.RentalDetails;
import com.jalasoft.yesica.movies.rentalDetails.RentalDetailsFactory;

public class Rental {

    private final Movie movie;
    private final RentalDetails rentalDetails;

    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.rentalDetails = RentalDetailsFactory.getRentalDetails(movie.getMovieCategory(), daysRented);
    }

    public Movie getMovie() {
        return movie;
    }

    public RentalDetails getRentalDetails() {
        return rentalDetails;
    }
}
