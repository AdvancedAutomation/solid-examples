package jorge.movies.solid;

public class RentalChildrenMovie extends AbstractRentalMovie {

    public RentalChildrenMovie(IMovie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double getRentalAmount() {
        if (getDaysRented() > 3)
            return (getDaysRented() - 3) * getMovie().getCategory().getSpecialRentPrice();
        return getMovie().getCategory().getNormalRentPrice();
    }
}
