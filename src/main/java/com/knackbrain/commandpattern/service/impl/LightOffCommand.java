package com.knackbrain.commandpattern.service.impl;

import com.knackbrain.commandpattern.entity.Light;
import com.knackbrain.commandpattern.service.Command;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(final Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
