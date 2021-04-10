package com.jalasoft.marco.iphone;

/**
 * Calculate the total amount of specifications.
 * Applying Single Responsibility.
 */
public class Calculate {

    private final Specifications specifications;
    private double totalAmount = 0;

    /**
     * Initialize and instance of Calculate class.
     *
     * @param specifications instance of Specifications.
     */
    public Calculate(final Specifications specifications) {
        this.specifications = specifications;
    }

    /**
     * Calculates the total amount of specifications.
     *
     * @return the total amount.
     */
    public double calculateTotalAmount() {
        for (var specification: specifications.getSpecifications()) {
            totalAmount += specification.getPrice();
        }

        return totalAmount;
    }
}
