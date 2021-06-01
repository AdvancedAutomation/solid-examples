package com.jalasoft.yesica.movies;

public class Movie {

    private final String title;
    private final MovieCategory movieCategory;

    public Movie(final String title, final MovieCategory movieCategory) {
        this.title = title;
        this.movieCategory = movieCategory;
    }

    public String getTitle() {
        return title;
    }

    public MovieCategory getMovieCategory() {
        return movieCategory;
    }
}
