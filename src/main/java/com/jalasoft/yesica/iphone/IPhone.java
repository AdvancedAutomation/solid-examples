package com.jalasoft.yesica.iphone;

import com.jalasoft.yesica.iphone.components.camera.ICamera;
import com.jalasoft.yesica.iphone.components.cpu.AbstractCPU;
import com.jalasoft.yesica.iphone.components.model.IModel;

public class IPhone {

    public IModel modelName;

    public AbstractCPU processor;

    // Dependency inversion example, depending on the model I could have a single camera or a dual camera
    public ICamera camera;

    public String displayResolution;

    public int memoryRAM;

    public int memoryROM;

    private Sale totalSale;

    private IUpdate update;

    public IPhone(IModel modelName, AbstractCPU processor, ICamera camera) {
        this.modelName = modelName;
        this.processor = processor;
        this.camera = camera;
        this.update = new IPhoneUpdate();
    }

    public double getTotalSale() {
        return totalSale.calculateTotalSale(modelName, camera, memoryRAM);
    }
}
