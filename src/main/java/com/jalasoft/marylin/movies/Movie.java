package com.jalasoft.marylin.movies;

/**
 * Movie Abstract Class.
 */
public abstract class Movie {
    private String title;
    protected int priceCode;

    /**
     * Movie constructor.
     *
     * @param title movie
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * Gets the movie price code.
     *
     * @return _priceCode
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * Sets the movie price code.
     *
     * @param priceCode
     */
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    /**
     * Gets the movie title.
     *
     * @return _title
     */
    public String getTitle() {
        return title;
    }
}
