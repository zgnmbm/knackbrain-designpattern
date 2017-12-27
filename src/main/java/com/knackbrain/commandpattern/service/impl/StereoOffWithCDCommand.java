package com.knackbrain.commandpattern.service.impl;

import com.knackbrain.commandpattern.entity.Stereo;
import com.knackbrain.commandpattern.service.Command;

public class StereoOffWithCDCommand implements Command {

    private final Stereo stereo;

    public StereoOffWithCDCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
