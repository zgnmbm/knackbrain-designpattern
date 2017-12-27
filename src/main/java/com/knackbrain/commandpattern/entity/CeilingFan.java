package com.knackbrain.commandpattern.entity;

import java.util.logging.Logger;

public class CeilingFan {

    private static final Logger log = Logger.getLogger(CeilingFan.class.getName());
    private String LIVING_ROOM_FAN_HIGH = " fan is On";
    private String LIVING_ROOM_FAN_OFF = " fan is Off";

    public CeilingFan(final String location) {
        LIVING_ROOM_FAN_HIGH = location + LIVING_ROOM_FAN_HIGH;
        LIVING_ROOM_FAN_OFF = location + LIVING_ROOM_FAN_OFF;
    }


    public void on() {
        log.info(LIVING_ROOM_FAN_HIGH);
    }

    public void off() {
        log.info(LIVING_ROOM_FAN_OFF);
    }
}
