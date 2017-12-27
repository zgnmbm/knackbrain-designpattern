package com.knackbrain.commandpattern.service.impl;

import com.knackbrain.commandpattern.entity.CeilingFan;
import com.knackbrain.commandpattern.service.Command;

public class CeilingFanOnCommand implements Command {

    private final CeilingFan ceilingFan;

    public CeilingFanOnCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.on();
    }
}
