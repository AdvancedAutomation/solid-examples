package com.jalasoft.veronica.iphone.iphoneUpdates;

/**
 * @author Veronica Prado
 */
public interface IUpdateSytem {
    public void UpdateSytemToVersion(String version, double price);
    public String GetVersion();
    public double GetPrice();
    public void SetPrice(double price);
}
