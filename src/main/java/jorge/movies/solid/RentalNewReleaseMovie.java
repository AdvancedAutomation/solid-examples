package jorge.movies.solid;

public class RentalNewReleaseMovie extends AbstractRentalMovie {
    public RentalNewReleaseMovie(IMovie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double getRentalAmount() {
        return getDaysRented() * getMovie().getCategory().getNormalRentPrice();
    }
}
