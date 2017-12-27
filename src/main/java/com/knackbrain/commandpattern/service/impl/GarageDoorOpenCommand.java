package com.knackbrain.commandpattern.service.impl;

import com.knackbrain.commandpattern.entity.GarageDoor;
import com.knackbrain.commandpattern.service.Command;

public class GarageDoorOpenCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
