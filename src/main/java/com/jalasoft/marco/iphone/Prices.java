package com.jalasoft.marco.iphone;

import java.util.Arrays;

/**
 * Enum to specify the prices of components.
 */
public enum Prices {
    CPU_A11("A11 Bionic", 95),
    CPU_A12("A12 Bionic", 115),
    CPU_SD("Snapdragon", 145),
    MODEL_12("iPhone 12", 200),
    MODEL_12MINI("iPhone 12 mini", 210),
    MODEL_12PRO("iPhone 12 Pro", 220),
    MODEL_12PRO_MAX("iPhone 12 Pro Max", 230),
    MODEL_11("iPhone 11", 190),
    CAMERA_DUAL("Dual", 155.6),
    CAMERA_SINGLE("Single", 135),
    DISK_SSD_1TERA("SSD 1Tera", 130),
    DISK_SSD_2TERA("SSD 2Tera", 160),
    RESOLUTION_LOW("Low", 125),
    RESOLUTION_HD("High", 145),
    RESOLUTION_AMOLED("Amoled", 165),
    RAM_2GB("2 GB", 100),
    RAM_4GB("4 GB", 120),
    RAM_6GB("6 GB", 140),
    RAM_8GB("8 GB", 160),
    ROM_A("Rom A", 60),
    ROM_B("Rom B", 80),
    UPGRADE("Upgrade", 50),
    DOWNGRADE("Downgrade", 50);

    private String component;
    private double price;

    /**
     * Private constructor.
     * @param component name.
     * @param price of component.
     */
    Prices(final String component, final double price) {
        this.component = component;
        this.price = price;
    }

    /**
     * Gets the price of components.
     * @param component name.
     * @return price of component.
     */
    public static double getPrice(final String component) {
        Prices priceComponent = Arrays.stream(Prices.values())
                .filter(e -> e.component.equalsIgnoreCase(component))
                .findFirst()
                .orElseThrow();
        return priceComponent.price;
    }
}
