package com.jalasoft.examples.srp.refactor;

import java.util.Map;

/**
 * Defines order repository that gets data from database.
 */
public class OrderRepository {

    /**
     * Gets report orders from database.
     *
     * @param startDate start date to filter order reports.
     * @param endDate   end date to filter order reports.
     * @return report orders query result.
     */
    public Map<String, String> getOrdersFromDB(final String startDate, final String endDate) {
        String ordersQuery = String.format("SELECT * FROM reports WHERE createdDate BETWEEN %s and %s",
                startDate, endDate);
        return DatabaseClient.executeQuery(ordersQuery);
    }
}
