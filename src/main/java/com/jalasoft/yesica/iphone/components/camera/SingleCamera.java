package com.jalasoft.yesica.iphone.components.camera;

public class SingleCamera implements ICamera {

    int numberOfCameras;

    @Override
    public void setCameraProperties() {
        this.numberOfCameras = 1;
    }
}
