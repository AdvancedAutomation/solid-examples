package com.jalasoft.marco.iphone;

/**
 * Defines the sale of the Iphone.
 * Applying Single Responsibility.
 */
public class Sale {

    final Specifications specifications;
    final Calculate calculate;

    /**
     * Initializes the Sale class
     *
     * @param specifications instance of Specifications
     */
    public Sale(Specifications specifications) {
        this.specifications = specifications;
        calculate = new Calculate(this.specifications);
    }

    /**
     * Shows the details of the Iphone
     */
    public void saleIphone() {
        System.out.println("=======================================================");
        System.out.println("================= SUMMARY OF IPHONE ===================");
        System.out.println("=======================================================");
        System.out.println("List of specifications:");

        for (var spec: specifications.get_Specifications()) {
            System.out.println(spec.getComponents());
        }

        System.out.println("=======================================================");
        System.out.println("TOTAL = " + calculate.calculateTotalAmount());
    }
}
