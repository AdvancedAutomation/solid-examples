package jorge.movies.solid;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new RentalNewReleaseMovie(new Movie("Zack Snyder's Justice League", MovieCategory.NEW_RELEASE), 5));
        customer.addRental(new RentalRegularMovie(new Movie("Terminator", MovieCategory.REGULAR), 1));
        customer.addRental(new RentalChildrenMovie(new Movie("Soul", MovieCategory.CHILDREN), 3));
        System.out.println(customer.statement());
    }
}
