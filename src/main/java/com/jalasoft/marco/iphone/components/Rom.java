package com.jalasoft.marco.iphone.components;

/**
 * Defines a memory Rom specifications.
 * Applying Open/Close and Single Responsibility.
 */
public class Rom implements IComponents {

    private final String type;
    private final String size;
    private final double price;

    /**
     * Constructor o Rom class
     *
     * @param type the type of memory Rom
     * @param size the size of memory Rom
     * @param price the price of memory Rom
     */
    public Rom(final String type, final String size, final double price) {
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
        return String.format("%s = %s, %s = %s", "ROM", type, "Size", size);
    }
}
