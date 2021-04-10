package com.jalasoft.marco.iphone.services;

/**
 * Defines service base abstraction.
 * Applying Interface Segregation.
 */
public interface IService {

    /**
     * Gets the price of component.
     *
     * @return the price of component.
     */
    double getPrice();

    /**
     * Gets the details of the service.
     *
     * @return details of components.
     */
    String updateIphone();
}
