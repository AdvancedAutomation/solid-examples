package com.jalasoft.veronica.iphone.components;

/**
 * @author Veronica Prado
 */
public abstract class Cpu implements IComponent{
    protected String componentName;
    protected double price;
    protected String cpuName;
    public Cpu(){
        componentName = String.valueOf(ComponentName.ComponentNames.CPU);
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

    public void SetCpuName(String cpuName)
    {
        this.cpuName = cpuName;
    }
}
