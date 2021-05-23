package jorge.movies.solid;

public enum MovieCategory {

    REGULAR(0, "Regular", 2, 1.5),
    NEW_RELEASE(1,"New Release", 3),
    CHILDREN(2, "Children", 1.5, 1.5);

    private int code;
    private String categoryName;
    private double normalRentPrice;
    private double specialRentPrice;

    MovieCategory(int code, String categoryName, double normalRentPrice, double specialRentPrice) {
        this.categoryName = categoryName;
        this.normalRentPrice = normalRentPrice;
        this.specialRentPrice = specialRentPrice;
    }

    MovieCategory(int code, String categoryName, double normalRentPrice) {
        this.categoryName = categoryName;
        this.normalRentPrice = normalRentPrice;
        this.specialRentPrice = 0;
    }

    public double getNormalRentPrice() {
        return normalRentPrice;
    }
    public double getSpecialRentPrice() {
        return specialRentPrice;
    }
}
