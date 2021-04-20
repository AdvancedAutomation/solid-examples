package com.jalasoft.veronica;

import com.jalasoft.veronica.iphone.components.*;
import com.jalasoft.veronica.iphone.iphoneModels.IPhone;
import com.jalasoft.veronica.iphone.iphoneModels.IphoneSX;
import com.jalasoft.veronica.iphone.iphoneUpdates.IUpdateSytem;
import com.jalasoft.veronica.iphone.iphoneUpdates.UpgradeSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Veronica Prado
 */
public class IphoneProgram {
    public static void main(final String[] args) {
        IPhone iphoneSX = new IphoneSX();
        List<IComponent> iphoneSXComponents = new ArrayList<IComponent>();
        iphoneSXComponents.add(new A12CPU("A12 Bionic", 12.3));//cpu
        iphoneSXComponents.add(new Ram("4 GB", 12.8));//ram
        iphoneSXComponents.add(new Rom("15 GB", 12.8));//rom
        iphoneSX.SetSpecifications(iphoneSXComponents);
        iphoneSX.AddComponent(new SingleCamera("Single", "1920*1080",40.5));
        IUpdateSytem updateSytem = new UpgradeSystem();
        updateSytem.UpdateSytemToVersion("7.1", 12.8);
        iphoneSX.UpdateSystem(updateSytem);
        System.out.println("Total : "+ iphoneSX.CalculateTotal_Sale());

    }
}
