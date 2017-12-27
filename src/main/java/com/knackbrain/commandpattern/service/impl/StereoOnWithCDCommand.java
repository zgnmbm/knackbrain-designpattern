package com.knackbrain.commandpattern.service.impl;

import com.knackbrain.commandpattern.entity.Stereo;
import com.knackbrain.commandpattern.service.Command;

public class StereoOnWithCDCommand implements Command {

    private final Stereo stereo;

    public StereoOnWithCDCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
