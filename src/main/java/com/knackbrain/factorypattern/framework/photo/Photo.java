package com.knackbrain.factorypattern.framework.photo;

/**
 * The photo is the class that all other photos will implements and override the methods
 * in the class.
 */
public abstract class Photo {

    protected String name;

    protected int width;

    protected int height;

    protected boolean hasFrame;

    public void prepare() {
        System.out.println("Preparing " + width + " by " + height + " " + name + " photo.");
    }

    public void polish() {
        System.out.println("Polishing " + width + " by " + height + " " + name + " photo.");
    }

    public void frame() {

        if (hasFrame) {
            System.out.println("Framing " + width + " by " + height + " " + name + " photo.");
        }
    }

    public void wrap() {
        System.out.println("Wrapping " + width + " by " + height + " " + name + " photo.");
    }
}
