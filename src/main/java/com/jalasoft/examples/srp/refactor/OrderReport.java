package com.jalasoft.examples.srp.refactor;

import java.util.Map;

/**
 * Defines methods to format report data.
 */
public class OrderReport {

    private final OrderRepository repository;
    private final OrderHTMLFormatter formatter;

    /**
     * Initializes and instance of Order Report class.
     *
     * @param repository order report repository.
     * @param formatter  order report html formatter.
     */
    public OrderReport(final OrderRepository repository, final OrderHTMLFormatter formatter) {
        this.repository = repository;
        this.formatter = formatter;
    }

    /**
     * Gets order report formatted for report formatted.
     *
     * @param startDate start date to filter order reports.
     * @param endDate   end date to filter order reports.
     * @return order reports formatted.
     */
    public String getOrderReportFormatted(final String startDate, final String endDate) {
        Map<String, String> orders = repository.getOrdersFromDB(startDate, endDate);
        return formatter.format(orders);
    }
}
