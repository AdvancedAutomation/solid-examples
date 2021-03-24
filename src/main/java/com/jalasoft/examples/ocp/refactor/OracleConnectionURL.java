package com.jalasoft.examples.ocp.refactor;

/**
 * Defines connection url builder for Oracle database.
 */
public class OracleConnectionURL implements IConnectableURL {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getConnectionURL(final DatabaseServer databaseServer) {
        return String.format("jdbc:oracle:thin:%s/%s@%s:%s:%s",
                databaseServer.getUsername(),
                databaseServer.getPassword(),
                databaseServer.getHost(),
                databaseServer.getPort(),
                databaseServer.getDatabaseName());
    }
}
