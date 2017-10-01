package com.knackbrain.factorypattern.framework.photo;

/**
 * The Large size photo class that extend photo interface and override
 * the required method to make the photo.
 */
public class ExtraLargeSizePhoto extends Photo {

    public ExtraLargeSizePhoto() {
        name = "Extra Large size";
        width = 24;
        height = 24;
        hasFrame = true;
    }

    @Override
    public void frame() {
        System.out.println("Framing " + width + " by " + height + " " + name + " photo and adding hook for hanging.");
    }
}

