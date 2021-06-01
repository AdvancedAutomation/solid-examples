package com.jalasoft.yesica.iphone.components.model;

public class IPhone12 implements IModel {

    private String modelName;
    private String modelNumber;

    @Override
    public void setModelSpecifications() {
        modelName = "IPhone 12";
        modelNumber = "A2172";
    }
}
