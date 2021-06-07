package com.jalasoft.danny.iphone.components;

import com.jalasoft.danny.iphone.interfaces.IComponent;

public class AbstractComponent implements IComponent {
    private String model;
    private double price;


    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }


}
