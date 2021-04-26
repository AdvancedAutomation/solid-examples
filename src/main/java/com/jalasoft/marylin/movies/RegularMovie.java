package com.jalasoft.marylin.movies;

/**
 * RegularMovie Class.
 */
public class RegularMovie extends Movie {

    /**
     * RegularMovie Constructor sets the movie price code to 0.
     *
     * @param title movie
     */
    RegularMovie(final String title) {
        super(title);
        priceCode = 0;
    }
}
