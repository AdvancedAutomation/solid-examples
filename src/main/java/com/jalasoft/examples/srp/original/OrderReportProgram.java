package com.jalasoft.examples.srp.original;

public final class OrderReportProgram {

    private OrderReportProgram() {
        // Default constructor.
    }

    public static void main(final String[] args) {

        OrderReport orderReport = new OrderReport();
        System.out.println(orderReport.getOrderReportFormatted("3/01/2021", "3/24/2021"));

    }

}
