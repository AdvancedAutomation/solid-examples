package jorge.iphone;

import java.util.*;

public class IPhone implements ISaleProduct {

    private String modelName;

    private AbstractProcessor processor;
    private String displayResolution;
    private AbstractCamera camera;
    private AbstractMemory ramMemory;
    private AbstractMemory romMemory;

    public IPhone(String modelName, AbstractProcessor processor, String displayResolution, AbstractMemory ramMemory, AbstractMemory romMemory, AbstractCamera camera) {
        this.modelName = modelName;
        this.processor = processor;
        this.displayResolution = displayResolution;
        this.romMemory = romMemory;
        this.ramMemory = ramMemory;
        this.camera = camera;
    }

    public void printSpecifications() {
        System.out.println(processor.getSpecification());
        System.out.println(camera.getSpecification());
        System.out.println(ramMemory.getSpecification());
        System.out.println(romMemory.getSpecification());
    }

    public double getPrice() {
        return calculateTotalPrice(processor, camera, ramMemory, romMemory);
    }

    private double calculateTotalPrice(IDeviceComponent... deviceComponent) {
        double total = 0;
        for (IDeviceComponent device : deviceComponent) {
            total += device.getPrice();
        }
        return total;
    }
}
