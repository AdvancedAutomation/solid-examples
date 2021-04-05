package com.jalasoft.marco.iphone.services;

/**
 * Defines a downgrade service.
 * Applying Open/Close and Single Responsibility.
 */
public class Downgrade implements IService {

    private final String version;
    private final double price;

    /**
     * Constructor of Downgrade class
     *
     * @param version a version to downgrade
     * @param price the price of the downgrade
     */
    public Downgrade(final String version, final double price) {
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
        return String.format("%s = %s, %s = %s", "Service", "Downgrade", "Version", version);
    }
}
