package com.jalasoft.solid.ocp.refactor;

/**
 * Defines connectable URL base abstraction.
 */
public interface IConnectableURL {

    /**
     * Gets connection URL.
     *
     * @param databaseServer database server data.
     * @return connection URL.
     */
    String getConnectionURL(DatabaseServer databaseServer);
}
