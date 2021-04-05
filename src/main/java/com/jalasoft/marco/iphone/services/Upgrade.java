package com.jalasoft.marco.iphone.services;

/**
 * Defines an upgrade service.
 * Applying Open/Close and Single Responsibility.
 */
public class Upgrade implements IService {

    private final String version;
    private final double price;

    /**
     * Constructor of CPU class
     *
     * @param version a version to upgrade
     * @param price the price of the upgrade
     */
    public Upgrade(final String version, final double price) {
        this.version = version;
        this.price = price;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String updateIphone() {
        return String.format("%s = %s, %s = %s", "Service", "Upgrade", "Version", version);
    }
}
