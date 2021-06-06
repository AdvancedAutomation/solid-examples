package com.jalasoft.marco.iphone;

import com.jalasoft.marco.iphone.components.CPU;
import com.jalasoft.marco.iphone.components.Camera;
import com.jalasoft.marco.iphone.components.Disk;
import com.jalasoft.marco.iphone.components.IComponents;
import com.jalasoft.marco.iphone.components.Ram;
import com.jalasoft.marco.iphone.services.Downgrade;
import com.jalasoft.marco.iphone.services.IService;
import com.jalasoft.marco.iphone.services.Upgrade;

/**
 * Main Iphone class.
 */
public final class Iphone {

    /**
     * Private constructor for example program.
     */
    private Iphone() {
        // Default constructor.
    }

    /**
     * Program entry point.
     *
     * @param args program arguments.
     */
    public static void main(final String[] args) {

        // Set the specifications of Iphone
        Specifications specifications = new Specifications();

        IComponents cpu = new CPU("A11 Bionic", Prices.getPrice("A11 Bionic"));
        specifications.setSpecification(cpu);
        IComponents disk = new Disk("SSD", "1 Tera", Prices.getPrice("SSD 1Tera"));
        specifications.setSpecification(disk);
        IComponents camera = new Camera("Dual", "64 Megapixels", Prices.getPrice("Dual"));
        specifications.setSpecification(camera);
        IComponents ram = new Ram("DDR3", "6 GB", Prices.getPrice("6 GB"));
        specifications.setSpecification(ram);

        // Sale the Iphone
        Sale sale = new Sale(specifications);
        sale.saleIphone();

        // Set the type of service
        IService update = new Upgrade("5.0", Prices.getPrice("Upgrade"));
        Service serviceUpgrade = new Service(update);
        serviceUpgrade.updateIphone();

        IService downgrade = new Downgrade("2.0", Prices.getPrice("Downgrade"));
        Service serviceDowngrade = new Service(downgrade);
        serviceDowngrade.updateIphone();

    }
}
