package com.knackbrain.factorypattern.framework;

import com.knackbrain.factorypattern.framework.photo.Photo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PhotoStudioTest {

    @Test
    public void photo_makePhoto_ThrowException() {

        final PhotoStudio photoStudio = new KnackBrainStudio();

        final Photo passport = photoStudio.makePhoto("passport");
        final Photo medium = photoStudio.makePhoto("medium");
        final Photo large = photoStudio.makePhoto("large");
        final Photo xlarge = photoStudio.makePhoto("xlarge");
    }
}
