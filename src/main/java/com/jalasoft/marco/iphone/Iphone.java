package com.jalasoft.marco.iphone;

import com.jalasoft.marco.iphone.components.CPU;
import com.jalasoft.marco.iphone.components.Camera;
import com.jalasoft.marco.iphone.components.Disk;
import com.jalasoft.marco.iphone.components.IComponents;
import com.jalasoft.marco.iphone.services.IService;
import com.jalasoft.marco.iphone.services.Upgrade;

/**
 * Main Iphone class
 */
public class Iphone {
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

        IComponents cpu = new CPU("A11 Bionic", 120);
        specifications.set_Specification(cpu);
        IComponents disk = new Disk("SSD", "1 Tera", 150);
        specifications.set_Specification(disk);
        IComponents camera = new Camera("Dual", "64 Megapixels", 80.5);
        specifications.set_Specification(camera);

        // Sale the Iphone
        Sale sale = new Sale(specifications);
        sale.saleIphone();

        // Set the type of service
        IService update = new Upgrade("5.0", 50);
        Service serviceUpgrade = new Service(update);
        serviceUpgrade.updateIphone();

        IService downgrade = new Upgrade("2.0", 79.8);
        Service serviceDowngrade = new Service(downgrade);
        serviceDowngrade.updateIphone();

    }
}
