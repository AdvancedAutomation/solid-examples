package com.jalasoft.veronica.iphone.iphoneUpdates;

/**
 * @author Veronica Prado
 */
public class UpgradeSystem implements IUpdateSytem{

    private String version;
    private double price;
    @Override
    public void UpdateSytemToVersion(String newVersion, double price) {
        this.price = price;
        version = newVersion;

    }

    @Override
    public String GetVersion() {
        return version;
    }

    @Override
    public double GetPrice() {
        return price;
    }

    @Override
    public void SetPrice(double price) {
        this.price = price;
    }
}
