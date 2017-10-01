package com.knackbrain.factorypattern.framework.photo;

/**
 * The Large size photo class that extend photo interface and override
 * the required method to make the photo.
 */
public class LargeSizePhoto extends Photo {

    public LargeSizePhoto() {
        name = "Large size";
        width = 12;
        height = 12;
        hasFrame = true;
    }
}
