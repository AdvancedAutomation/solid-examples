package com.jalasoft.yesica.iphone.components.model;

public class IPhone12Mini implements IModel {

    private String modelName;
    private String modelNumber;

    @Override
    public void setModelSpecifications() {
        this.modelName = "IPhone 12 mini";
        this.modelNumber = "A2176";
    }
}
