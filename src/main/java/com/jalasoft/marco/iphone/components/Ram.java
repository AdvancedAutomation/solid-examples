package com.jalasoft.marco.iphone.components;

/**
 * Defines a memory Ram specifications.
 * Applying Open/Close and Single Responsibility.
 */
public class Ram implements IComponents {

    private final String type;
    private final String size;
    private final double price;
    private static final String RAM_NAME = "Ram";

    /**
     * Constructor o Ram class.
     *
     * @param type the type of Ram.
     * @param size the size of Ram.
     * @param price the price of Ram.
     */
    public Ram(final String type, final String size, final double price) {
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
        return String.format("%s = %s, %s = %s", RAM_NAME, type, "Size", size);
    }
}
