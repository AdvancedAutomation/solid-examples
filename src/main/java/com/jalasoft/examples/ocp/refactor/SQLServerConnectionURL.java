package com.jalasoft.examples.ocp.refactor;

/**
 * Defines connection url builder for SQL Server database.
 */
public class SQLServerConnectionURL implements IConnectableURL {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getConnectionURL(final DatabaseServer databaseServer) {
        return String.format("jdbc:sqlserver://%s:%s;databaseName=%s;user=%s;password=%s",
                databaseServer.getHost(),
                databaseServer.getPort(),
                databaseServer.getDatabaseName(),
                databaseServer.getUsername(),
                databaseServer.getPassword());
    }
}
