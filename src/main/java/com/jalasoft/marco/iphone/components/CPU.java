package com.jalasoft.marco.iphone.components;

/**
 * Defines the CPU specifications.
 * Applying Open/Close and Single Responsibility.
 */
public class CPU implements IComponents {

    private final String type;
    private final double price;

    /**
     * Constructor o CPU class
     *
     * @param type the type of the CPU
     * @param price the price of the CPU
     */
    public CPU(final String type, final double price) {
        this.type = type;
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
        return String.format("%s = %s", "CPU", type);
    }
}
