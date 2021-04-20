package com.jalasoft.veronica.iphone.components;

/**
 * @author Veronica Prado
 */
public class Ram implements IMemory {
    private String componentName;
    private double price;
    private String cpuName;
    private String amount;

    public Ram(String amount, double price)
    {
        componentName = ComponentName.ComponentNames.RAM.toString();
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

    public void SetCpuName(String cpuName){
        this.cpuName = cpuName;
    }

    public String GetCpuName(){
        return componentName;
    }

}
