package com.jalasoft.solid.srp.refactor;

public final class OrderReportProgram {

    private OrderReportProgram() {
        // Default constructor.
    }

    public static void main(final String[] args) {

        OrderRepository repository = new OrderRepository();
        OrderHTMLFormatter formatter = new OrderHTMLFormatter();

        OrderReport orderReport = new OrderReport(repository, formatter);
        System.out.println(orderReport.getOrderReportFormatted("3/01/2021", "3/24/2021"));

    }

}
