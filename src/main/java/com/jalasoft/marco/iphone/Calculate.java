package com.jalasoft.marco.iphone;

/**
 * Calculate the total amount of specifications.
 * Applying Single Responsibility.
 */
public class Calculate {

    private final Specifications specifications;
    private double TOTAL_AMOUNT = 0;

    /**
     * Initialize and instance of Calculate class
     *
     * @param specifications instance of Specifications
     */
    public Calculate(Specifications specifications) {
        this.specifications = specifications;
    }

    /**
     * Calculates the total amount of specifications
     *
     * @return the total amount
     */
    public double calculateTotalAmount() {
        for (var specification: specifications.get_Specifications()) {
            TOTAL_AMOUNT += specification.getPrice();
        }

        return TOTAL_AMOUNT;
    }
}
