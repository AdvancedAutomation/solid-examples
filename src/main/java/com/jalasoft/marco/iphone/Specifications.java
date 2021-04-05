package com.jalasoft.marco.iphone;

import com.jalasoft.marco.iphone.components.IComponents;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines the specifications of Iphone.
 * Applying Single Responsibility and Dependency Inversion
 */
public class Specifications {

    List<IComponents> specifications = new ArrayList<>();

    /**
     * Adds a component to a list
     *
     * @param component instance of component
     */
    public void set_Specification(IComponents component) {
        specifications.add(component);
    }

    /**
     * Gets the list of components
     *
     * @return
     */
    public List<IComponents> get_Specifications() {
        return specifications;
    }
}
