package com.jalasoft.solid.ocp.refactor;

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

        // Instantiate connection for MySQL database connection.
        IConnectableURL connectableURL = new MySQLConnectionURL();

        // Gets connection URL.
        String connectionURL = connectableURL.getConnectionURL(serverData);

        // Rest of the logic to connect database.

//        IConnectableURL connectableURL = new SQLServerConnectionURL();
//        String connectionURL = connectableURL.getConnectionURL(serverData);
//
//
//        IConnectableURL connectableURL = new OracleConnectionURL();
//        String connectionURL = connectableURL.getConnectionURL(serverData);
    }
}
