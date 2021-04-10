package com.jalasoft.marco.iphone.components;

/**
 * Defines components base abstraction.
 * Applying Interface Segregation.
 */
public interface IComponents {

    /**
     * Method to get the price of component.
     * @return price of component.
     */
    double getPrice();

    /**
     * Method to get the specified components.
     * @return the components.
     */
    String getComponents();
}
