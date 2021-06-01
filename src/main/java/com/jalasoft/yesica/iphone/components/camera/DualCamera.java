package com.jalasoft.yesica.iphone.components.camera;

public class DualCamera implements ICamera {

    int numberOfCameras;

    @Override
    public void setCameraProperties() {
        this.numberOfCameras = 2;
    }
}
