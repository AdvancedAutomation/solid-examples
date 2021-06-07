package com.jalasoft.danny.iphone;

import com.jalasoft.danny.iphone.components.*;

public class IPhone {

    private Cpu cpu;
    private Resolution displayResolution;
    private Camera camera;
    private Ram ram;
    private Rom rom;

    public void setSpecifications( Cpu cpu, Resolution displayResolution,
                                  Ram ram, Rom rom, Camera camera){
        this.camera = camera;
        this.cpu = cpu;
        this.displayResolution = displayResolution;
        this.ram = ram;
        this.rom = rom;

    }

    public double calculateTotalSale() {
        return cpu.getPrice() + camera.getPrice() + cpu.getPrice() + displayResolution.getPrice() +
                ram.getPrice() + rom.getPrice();
    }
}
