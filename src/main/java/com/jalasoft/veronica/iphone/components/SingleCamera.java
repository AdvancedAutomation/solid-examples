package com.jalasoft.veronica.iphone.components;

/**
 * @author Veronica Prado
 * Applying LSP principle
 */
public class SingleCamera extends Camera {

    public SingleCamera(String cameraName, String megapixcels, double price)
    {
          this.SetCameraName(cameraName);
          this.SetMegapixcels(megapixcels);
          this.SetPrice(price);
    }
}
