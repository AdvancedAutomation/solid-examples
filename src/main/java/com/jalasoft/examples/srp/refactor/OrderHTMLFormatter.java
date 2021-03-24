package com.jalasoft.examples.srp.refactor;

import java.util.Map;

/**
 * Defines order report HTML formatter.
 */
public class OrderHTMLFormatter {

    /**
     * Formats order report data to HTML.
     *
     * @param orders report orders data.
     * @return report orders formatted to HTML.
     */
    public String format(final Map<String, String> orders) {
        // Implementation logic to format all order reports should be here.
        return String.format("<h1>Orders: %s<h1>", orders.toString());
    }
}
