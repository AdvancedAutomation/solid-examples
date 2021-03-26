package com.jalasoft.solid.srp.original;

import java.util.Map;

/**
 * Defines an order report builder.
 */
public class OrderReport {

    /**
     * Gets order report formatted for report formatted.
     *
     * @param startDate start date to filter order reports.
     * @param endDate   end date to filter order reports.
     * @return order reports formatted.
     */
    public String getOrderReportFormatted(final String startDate, final String endDate) {
        Map<String, String> orders = queryDBForOrders(startDate, endDate);
        return formatToHTML(orders);
    }

    /**
     * Gets report orders from database.
     *
     * @param startDate start date to filter order reports.
     * @param endDate   end date to filter order reports.
     * @return report orders query result.
     */
    private Map<String, String> queryDBForOrders(final String startDate, final String endDate) {
        String ordersQuery = String.format("SELECT * FROM reports WHERE createdDate BETWEEN %s and %s",
                startDate, endDate);
        return DatabaseClient.executeQuery(ordersQuery);
    }

    /**
     * Formats data obtained from database to HTML.
     *
     * @param orders report orders data.
     * @return report orders formatted to HTML.
     */
    private String formatToHTML(final Map<String, String> orders) {
        // Implementation logic to format all order reports should be here.
        return String.format("<h1>Orders: %s<h1>", orders.toString());
    }
}
