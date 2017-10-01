package com.knackbrain.factorypattern.framework.photo;

/**
 * The passport size photo class that extend photo interface and override
 * the required method to make the photo.
 */
public class PassportSizePhoto extends Photo {

    public PassportSizePhoto() {
        name = "Passport";
        width = 4;
        height = 4;
        hasFrame = false;
    }
}
