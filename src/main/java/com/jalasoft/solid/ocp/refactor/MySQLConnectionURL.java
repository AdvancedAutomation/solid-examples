package com.jalasoft.solid.ocp.refactor;

/**
 * Defines connection url builder for MySQL database.
 */
public class MySQLConnectionURL implements IConnectableURL {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getConnectionURL(final DatabaseServer databaseServer) {
        return String.format("jdbc:mysql://%s:%s@%s:%s/%s",
                databaseServer.getUsername(),
                databaseServer.getPassword(),
                databaseServer.getHost(),
                databaseServer.getPort(),
                databaseServer.getDatabaseName());
    }
}
