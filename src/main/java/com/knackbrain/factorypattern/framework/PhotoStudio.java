package com.knackbrain.factorypattern.framework;

import com.knackbrain.factorypattern.framework.photo.Photo;

/**
 * The photo studio is the class that all other studios that want to be members can implement.
 */
public abstract class PhotoStudio {

    public final Photo makePhoto(final String type) {

        final Photo photo = createPhoto(type);

        if (photo == null) {
            throw new RuntimeException("The given photo type was not found.");
        }

        photo.prepare();
        photo.polish();
        photo.frame();
        photo.wrap();

        return photo;
    }

    protected abstract Photo createPhoto(final String type);
}
