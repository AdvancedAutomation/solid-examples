package com.jalasoft.marco.iphone;

/**
 * Defines the sale of the Iphone.
 * Applying Single Responsibility.
 */
public class Sale {

    private final Specifications specifications;
    private final Calculate calculate;

    /**
     * Initializes the Sale class.
     *
     * @param specifications instance of Specifications.
     */
    public Sale(final Specifications specifications) {
        this.specifications = specifications;
        calculate = new Calculate(this.specifications);
    }

    /**
     * Shows the details of the Iphone.
     */
    public void saleIphone() {
        System.out.println("=======================================================");
        System.out.println("================= SUMMARY OF IPHONE ===================");
        System.out.println("=======================================================");
        System.out.println("List of specifications:");

        for (var spec: specifications.getSpecifications()) {
            System.out.println(spec.getComponents());
        }

        System.out.println("=======================================================");
        System.out.println("TOTAL = " + calculate.calculateTotalAmount());
    }
}
