package jorge.movies.solid;

public abstract class AbstractRentalMovie implements IRentalMovie {

    private IMovie _movie;
    private int _daysRented;

    public AbstractRentalMovie(IMovie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public IMovie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public final boolean isNewReleaseCategory() {
        return MovieCategory.NEW_RELEASE.equals(_movie.getCategory());
    }

    public final boolean isChildrenCategory() {
        return MovieCategory.CHILDREN.equals(_movie.getCategory());
    }

    public final boolean isRegularCategory() {
        return MovieCategory.REGULAR.equals(_movie.getCategory());
    }
}
