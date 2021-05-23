package jorge.movies.solid;

public class RentalRegularMovie extends AbstractRentalMovie {
    public RentalRegularMovie(IMovie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double getRentalAmount() {
        if (getDaysRented() > 2)
            return (getDaysRented() - 2) * getMovie().getCategory().getSpecialRentPrice();
        return getMovie().getCategory().getNormalRentPrice();
    }
}
