package com.jalasoft.yesica.iphone.components.cpu;

/**
 * Liskov's Substitution Principle.
 * Any of the classes that extend this Abstract class can substitute the CPU because all of them are implementing its method.
 */
public abstract class AbstractCPU {

    protected String processor;

    public abstract void setProcessor();
}
