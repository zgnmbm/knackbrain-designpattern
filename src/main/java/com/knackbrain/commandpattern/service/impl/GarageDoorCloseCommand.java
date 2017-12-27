package com.knackbrain.commandpattern.service.impl;

import com.knackbrain.commandpattern.entity.GarageDoor;
import com.knackbrain.commandpattern.service.Command;

public class GarageDoorCloseCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }
}
