package com.jalasoft.marco.iphone.components;

/**
 * Defines the Camera specifications.
 * Applying Open/Close and Single Responsibility.
 */
public class Camera implements IComponents {

    private final String type;
    private final String megapixels;
    private final double price;

    /**
     * Constructor o Camera class
     *
     * @param type of the Camera
     * @param megapixels the megapixels of the camera
     * @param price the price of the camera
     */
    public Camera(final String type, final String megapixels, final double price) {
        this.type = type;
        this.megapixels = megapixels;
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
        return String.format("%s = %s, %s = %s", "Camera", type, "Resolution", megapixels);
    }
}
