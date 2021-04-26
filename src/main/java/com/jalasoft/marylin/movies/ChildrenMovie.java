package com.jalasoft.marylin.movies;

/**
 * ChildrenMovie Class.
 */
public class ChildrenMovie extends Movie {

    /**
     * ChildrenMovie Constructor sets the movie price code to 2.
     *
     * @param title movie
     */
    ChildrenMovie(final String title) {
        super(title);
        priceCode = 2;
    }
}
