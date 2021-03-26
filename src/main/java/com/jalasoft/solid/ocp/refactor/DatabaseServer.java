package com.jalasoft.solid.ocp.refactor;

/**
 * Defines common database server connection info.
 */
public class DatabaseServer {

    private String username;
    private String password;
    private String host;
    private String port;
    private String database;

    /**
     * Gets username.
     *
     * @return username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username username to be set.
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password password to be set.
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * Gets host.
     *
     * @return host.
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets host.
     *
     * @param host host to be set.
     */
    public void setHost(final String host) {
        this.host = host;
    }

    /**
     * Gets port.
     *
     * @return port.
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets port.
     *
     * @param port port.
     */
    public void setPort(final String port) {
        this.port = port;
    }

    /**
     * Gets database name.
     *
     * @return database name.
     */
    public String getDatabaseName() {
        return database;
    }

    /**
     * Sets database name.
     *
     * @param database database name.
     */
    public void setDatabase(final String database) {
        this.database = database;
    }
}
