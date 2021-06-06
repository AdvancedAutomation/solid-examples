package com.jalasoft.marco.iphone;

import com.jalasoft.marco.iphone.components.IComponents;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines the specifications of Iphone.
 * Applying Single Responsibility and Dependency Inversion.
 */
public class Specifications {

    private List<IComponents> specifications = new ArrayList<>();

    /**
     * Adds a component to a list.
     *
     * @param component instance of component.
     */
    public void setSpecification(final IComponents component) {
        specifications.add(component);
    }

    /**
     * Gets the list of components.
     *
     * @return list of specifications
     */
    public List<IComponents> getSpecifications() {
        return specifications;
    }
}
