package com.jalasoft.marco.iphone.components;

/**
 * Defines the Model specifications.
 * Applying Open/Close and Single Responsibility.
 */
public class Model implements IComponents {

    private final String type;
    private final double price;

    /**
     * Constructor o Model class
     * @param type the type of the model
     * @param price the price of the model
     */
    public Model(final String type, final double price) {
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
        return String.format("%s = %s", "Model", type);
    }
}
