package com.jalasoft.solid.ocp.original;

/**
 * Defines database connection URL builder.
 */
public class ConnectionURLBuilder {

    /**
     * Gets connection URL according to the database server type.
     *
     * @param databaseServer database server connection info.
     * @param databaseType   database server type enum.
     * @return connection URL.
     */
    public String getConnectionURL(final DatabaseServer databaseServer, final DatabaseType databaseType) {
        if (DatabaseType.ORACLE.equals(databaseType)) {
            return String.format("jdbc:oracle:thin:%s/%s@%s:%s:%s",
                    databaseServer.getUsername(),
                    databaseServer.getPassword(),
                    databaseServer.getHost(),
                    databaseServer.getPort(),
                    databaseServer.getDatabaseName());
        } else if (DatabaseType.MYSQL.equals(databaseType)) {
            return String.format("jdbc:mysql://%s:%s@%s:%s/%s",
                    databaseServer.getUsername(),
                    databaseServer.getPassword(),
                    databaseServer.getHost(),
                    databaseServer.getPort(),
                    databaseServer.getDatabaseName());
        } else if (DatabaseType.SQL_SERVER.equals(databaseType)) {
            return String.format("jdbc:sqlserver://%s:%s;databaseName=%s;user=%s;password=%s",
                    databaseServer.getHost(),
                    databaseServer.getPort(),
                    databaseServer.getDatabaseName(),
                    databaseServer.getUsername(),
                    databaseServer.getPassword());
        }
        throw new IllegalArgumentException("Database Server not supported.");
    }
}
