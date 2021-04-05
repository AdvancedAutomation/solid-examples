package com.jalasoft.marco.iphone.components;

/**
 * Defines the Resolution specifications.
 * Applying Open/Close and Single Responsibility.
 */
public class Resolution implements IComponents {

    private final String type;
    private final String pixels;
    private final double price;

    /**
     * Constructor o Resolution class
     *
     * @param type the type of resolution, e.g.: Low, High, 4k
     * @param pixels the size of the screen, e.g.: 1280x800
     * @param price the price the component
     */
    public Resolution(final String type, final String pixels, final double price) {
        this.type = type;
        this.pixels = pixels;
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
        return String.format("%s = %s, %s = %s", "Resolution", type, "Pixels", pixels);
    }
}
