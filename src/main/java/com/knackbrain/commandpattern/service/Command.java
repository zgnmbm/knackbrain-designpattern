package com.knackbrain.commandpattern.service;

public interface Command {

    void execute();

    void undo();
}
