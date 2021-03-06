package com.knackbrain.commandpattern;

import com.knackbrain.commandpattern.entity.NoCommand;
import com.knackbrain.commandpattern.service.Command;

public class SimpleRemoteControlWithUndo {

    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;

    public SimpleRemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        final Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(final int slot,
                           final Command onCommand,
                           final Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(final int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(final int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {

        final StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append(
                    "[slot " + i + "] " + onCommands[i].getClass().getName() +
                            "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
