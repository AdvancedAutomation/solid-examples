package com.jalasoft.marco.iphone.components;

/**
 * Defines the Disk specifications.
 * Applying Open/Close and Single Responsibility.
 */
public class Disk implements IComponents {

    private final String type;
    private final String size;
    private final double price;
    private static final String DISK_NAME = "Disk";

    /**
     * Constructor o Disk class.
     *
     * @param type the type of disk.
     * @param size the size of disk.
     * @param price the price of disk.
     */
    public Disk(final String type, final String size, final double price) {
        this.type = type;
        this.size = size;
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
    public String getComponents() {
        return String.format("%s = %s, %s = %s", DISK_NAME, type, "Size", size);
    }
}
