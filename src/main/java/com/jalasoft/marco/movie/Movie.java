package com.jalasoft.marco.movie;

public class Movie {

    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;
    private Price price;
    private String title;

    public Movie(final String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    double getAmount(int daysRented) {
        return price.getAmount(daysRented);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public String getTitle() {
        return title;
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDREN:
                price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Wrong Price Code");
        }
    }

}
