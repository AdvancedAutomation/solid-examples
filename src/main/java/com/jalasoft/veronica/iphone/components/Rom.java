package com.jalasoft.veronica.iphone.components;

/**
 * @author Veronica Prado
 */
public class Rom implements IMemory{
    private String componentName;
    private double price;
    private String amount;
    public Rom(String amount, double price)
    {
        componentName = ComponentName.ComponentNames.ROM.toString();
        this.price = price;
        this.amount = amount;
    }

    @Override
    public void SetPrice(double price) {
        this.price = price;

    }

    @Override
    public String GetComponentName() {
        return componentName;
    }

    @Override
    public double GetPrice() {
        return price;
    }

    @Override
    public void SetAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String GetAmount() {
        return amount;
    }
}
