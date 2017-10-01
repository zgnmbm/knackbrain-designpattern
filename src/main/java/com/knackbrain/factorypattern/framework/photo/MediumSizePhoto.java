package com.knackbrain.factorypattern.framework.photo;

/**
 * The Medium size photo class that extend photo interface and override
 * the required method to make the photo.
 */
public class MediumSizePhoto extends Photo {

    public MediumSizePhoto() {
        name = "Medium size";
        width = 7;
        height = 7;
        hasFrame = false;
    }
}
