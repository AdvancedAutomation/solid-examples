package com.jalasoft.marco.iphone;

import com.jalasoft.marco.iphone.services.IService;

/**
 * Defines the type of service.
 * Applying Single Responsibility.
 */
public class Service {

    private IService service;

    /**
     * Initializes an instance of Service class.
     *
     * @param service instance of service.
     */
    public Service(final IService service) {
        this.service = service;
    }

    /**
     * Method to print the update details.
     */
    public void updateIphone() {
        System.out.println("=======================================================");
        System.out.println("================= SUMMARY OF SERVICE ==================");
        System.out.println("=======================================================");
        System.out.println(service.updateIphone());
        System.out.println("=======================================================");
        System.out.println("TOTAL = " + service.getPrice());
    }
}
