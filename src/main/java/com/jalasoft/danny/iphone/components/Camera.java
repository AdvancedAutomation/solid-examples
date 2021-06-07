package com.jalasoft.danny.iphone.components;


public class Camera extends AbstractComponent {


    public static String name = "Camera";

    private String kind;
    private String megapixels;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(String megapixels) {
        this.megapixels = megapixels;
    }
}
