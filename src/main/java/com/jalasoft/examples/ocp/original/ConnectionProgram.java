package com.jalasoft.examples.ocp.original;

/**
 * Defines example program for database connection.
 */
public final class ConnectionProgram {

    /**
     * Private constructor for example program.
     */
    private ConnectionProgram() {
        // Default constructor.
    }

    /**
     * Program entry point.
     *
     * @param args program arguments.
     */
    public static void main(final String[] args) {
        // Instantiate database server data.
        DatabaseServer serverData = new DatabaseServer();

        // Instantiate connection url builder.
        ConnectionURLBuilder urlBuilder = new ConnectionURLBuilder();

        // Gets connection URL according to database.
        String connectionURL = urlBuilder.getConnectionURL(serverData, DatabaseType.MYSQL);

        // Rest of the logic to connect database.
//        String connectionURL = urlBuilder.getConnectionURL(serverData, DatabaseType.SQL_SERVER);
//
//        String connectionURL = urlBuilder.getConnectionURL(serverData, DatabaseType.ORACLE);
    }
}
