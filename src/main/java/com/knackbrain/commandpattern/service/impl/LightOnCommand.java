package com.knackbrain.commandpattern.service.impl;

import com.knackbrain.commandpattern.entity.Light;
import com.knackbrain.commandpattern.service.Command;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
