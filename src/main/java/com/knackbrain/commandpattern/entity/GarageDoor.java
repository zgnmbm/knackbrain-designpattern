package com.knackbrain.commandpattern.entity;

import java.util.logging.Logger;

public class GarageDoor {

    private static final Logger log = Logger.getLogger(GarageDoor.class.getName());

    private String GARAGE_UP = " is Up";
    private String GARAGE_DOWN = " is Down";
    private String GARAGE_STOP = " Stop";
    private final String location;


    public GarageDoor(final String location) {
        this.location = location;
        GARAGE_UP = location + GARAGE_UP;
        GARAGE_DOWN = location + GARAGE_DOWN;
        GARAGE_STOP = location + GARAGE_STOP;
    }

    public void up() {
        log.info(GARAGE_UP);
    }

    public void down() {
        log.info(GARAGE_DOWN);
    }

    public void stop() {
        log.info(GARAGE_STOP);
    }

    public void lightOn() {
        final Light light = new Light(location);
        light.on();
    }

    public void lightOff() {
        final Light light = new Light(location);
        light.off();
    }
}
