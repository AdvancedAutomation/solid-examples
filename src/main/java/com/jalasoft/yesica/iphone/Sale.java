package com.jalasoft.yesica.iphone;

import com.jalasoft.yesica.iphone.components.camera.ICamera;
import com.jalasoft.yesica.iphone.components.model.IModel;

/**
 * Single responsibility.
 * This class will calculate the total sale based on the device properties, so it can be reused for similar devices.
 */
public class Sale {

    private double totalSale;

    public double calculateTotalSale(final IModel modelName, final ICamera camera, final int memoryRAM) {

        // Implement method to calculate total sale based on the device properties.
        return totalSale;
    }
}
