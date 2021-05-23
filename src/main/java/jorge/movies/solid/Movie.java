package jorge.movies.solid;

public class Movie implements IMovie {

    private String _title;
    private MovieCategory movieCategory;

    public Movie(String title, MovieCategory movieCategory) {
        _title = title;
        this.movieCategory = movieCategory;
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public MovieCategory getCategory() {
        return movieCategory;
    }
}
