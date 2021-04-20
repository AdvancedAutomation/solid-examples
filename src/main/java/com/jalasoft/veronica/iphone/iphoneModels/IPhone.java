package com.jalasoft.veronica.iphone.iphoneModels;

import com.jalasoft.veronica.ISmartPhone;
import com.jalasoft.veronica.iphone.components.IComponent;
import com.jalasoft.veronica.iphone.iphoneUpdates.IUpdateSytem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Veronica Prado
 */
public abstract class IPhone implements ISmartPhone {
    private List<IComponent> components;
    private String version;
    private List<IUpdateSytem> updateSystem;
    public IPhone()
    {
        components = new ArrayList<IComponent>();
        updateSystem = new ArrayList<IUpdateSytem>();
    }
    public void SetSpecifications(List<IComponent> iphoneComponents){
        components = new ArrayList<IComponent>();

        for (IComponent iphoneComponent : iphoneComponents)
        {
            components.add(iphoneComponent);
        }
    }

    public void AddComponent(IComponent component)
    {
        this.components.add(component);
    }

    public double CalculateTotal_Sale(){
        double totalSale = 0;
        for (IComponent iphoneComponent : components)
        {
            totalSale += iphoneComponent.GetPrice();
        }
        for (IUpdateSytem update: updateSystem) {
            totalSale += update.GetPrice();
        }

        return totalSale;
    }

    public void UpdateSystem(IUpdateSytem updateSytem)
    {
        updateSystem.add(updateSytem);
        this.version = updateSytem.GetVersion();
    }

    }
