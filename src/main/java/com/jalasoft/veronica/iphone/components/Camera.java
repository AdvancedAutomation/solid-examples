package com.jalasoft.veronica.iphone.components;

/**
 * @author Veronica Prado
 */
public abstract class Camera implements IComponent {
    private String cameraName;
    private String megapixcels;
    private double price;
    private String componentName;

    public Camera() {
        componentName = ComponentName.ComponentNames.CAMERA.name();
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

    public void SetMegapixcels(String pixcelsNumber) {
        this.megapixcels = pixcelsNumber;
    }

    public String GetMegapixcels() {
        return megapixcels;
    }

    public void SetCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public String GetCameraName() {
        return cameraName;
    }
}
