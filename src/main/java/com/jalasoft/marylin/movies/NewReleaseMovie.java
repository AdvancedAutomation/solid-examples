package com.jalasoft.marylin.movies;

/**
 * NewReleaseMovie Class.
 */
public class NewReleaseMovie extends Movie {

    /**
     * NewReleaseMovie Constructor sets the movie price code to 1.
     *
     * @param title movie
     */
    NewReleaseMovie(final String title) {
        super(title);
        priceCode = 1;
    }
}
