package com.knackbrain.commandpattern.entity;

import java.util.logging.Logger;

public class Stereo {

    private final static Logger log = Logger.getLogger(Stereo.class.getName());

    private String STEREO_ON = " stereo is On";
    private String STEREO_OFF = " stereo is Off";
    private String SET_STEREO_CD = " set Stereo CD";
    private String SET_STEREO_DVD = " set Stereo DVD";
    private String SET_STEREO_RADIO = " set Radio";
    private String SET_STEREO_VOLUME = " set Volume";


    public Stereo(final String location) {
        STEREO_ON = location + STEREO_ON;
        STEREO_OFF = location + STEREO_OFF;
        SET_STEREO_CD = location + SET_STEREO_CD;
        SET_STEREO_DVD = location + SET_STEREO_DVD;
        SET_STEREO_RADIO = location + SET_STEREO_RADIO;
        SET_STEREO_VOLUME = location + SET_STEREO_VOLUME;
    }

    public void on() {
        log.info(STEREO_ON);
    }

    public void off() {
        log.info(STEREO_OFF);
    }

    public void setCD() {
        log.info(SET_STEREO_CD);
    }

    public void setDVD() {
        log.info(SET_STEREO_DVD);
    }

    public void setRadio() {
        log.info(SET_STEREO_RADIO);
    }

    public void setVolume(final int volume) {
        final String INCREASE_VOLUME = SET_STEREO_VOLUME + volume;
        log.info(INCREASE_VOLUME);
    }
}
