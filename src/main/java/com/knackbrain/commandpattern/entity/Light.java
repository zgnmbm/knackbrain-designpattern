package com.knackbrain.commandpattern.entity;

import java.util.logging.Logger;

public class Light {

    private final static Logger log = Logger.getLogger(Light.class.getName());

    private String LIGHT_ON = " light is On";
    private String LIGHT_OFF = " light is Off";


    public Light(final String location) {
        LIGHT_ON = location + LIGHT_ON;
        LIGHT_OFF = location + LIGHT_OFF;
    }

    public void on() {
        log.info(LIGHT_ON);
    }

    public void off() {
        log.info(LIGHT_OFF);
    }
}
