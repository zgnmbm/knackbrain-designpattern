package com.knackbrain.factorypattern.framework;

import com.knackbrain.factorypattern.framework.photo.*;

/**
 * KnackBrainStudio studio will use studio to make photo.
 */
public class KnackBrainStudio extends PhotoStudio {

    protected Photo createPhoto(String type) {

        Photo photo = null;

        if (type.equals("passport")) {

            photo = new PassportSizePhoto();

        } else if (type.equals("medium")) {

            photo = new MediumSizePhoto();

        } else if (type.equals("large")) {

            photo = new LargeSizePhoto();

        } else if (type.equals("xlarge")) {

            photo = new ExtraLargeSizePhoto();
        }

        return photo;
    }
}
