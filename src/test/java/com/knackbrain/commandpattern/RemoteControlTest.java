package com.knackbrain.commandpattern;

import com.knackbrain.commandpattern.entity.GarageDoor;
import com.knackbrain.commandpattern.entity.Light;
import com.knackbrain.commandpattern.service.impl.GarageDoorCloseCommand;
import com.knackbrain.commandpattern.service.impl.GarageDoorOpenCommand;
import com.knackbrain.commandpattern.service.impl.LightOffCommand;
import com.knackbrain.commandpattern.service.impl.LightOnCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RemoteControlTest {

    @Test
    public void light_on_command_test() {
        final String LIVING_ROOM_LIGHT = "Living room";
        final int slot = 0;
        final SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        final Light light = new Light(LIVING_ROOM_LIGHT);
        final LightOnCommand lightOn = new LightOnCommand(light);
        final LightOffCommand lightOff = new LightOffCommand(light);

        remoteControl.setCommand(slot, lightOn, lightOff);
        remoteControl.onButtonWasPushed(slot);
    }

    @Test
    public void doorAndLight_openGarageDoorOnLight_doorAndLightTest() {

        final String KITCHEN_ROOM_LIGHT = "Kitchen";
        final int lightSlot = 0;
        final int garageSlot = 3;
        final SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        final Light light = new Light(KITCHEN_ROOM_LIGHT);
        final GarageDoor garageDoor = new GarageDoor(KITCHEN_ROOM_LIGHT);

        final LightOnCommand lightOn = new LightOnCommand(light);
        final LightOffCommand lightOff = new LightOffCommand(light);

        final GarageDoorOpenCommand garageOpen =
                new GarageDoorOpenCommand(garageDoor);
        final GarageDoorCloseCommand garageClose =
                new GarageDoorCloseCommand(garageDoor);


        remoteControl.setCommand(lightSlot, lightOn, lightOff);
        remoteControl.onButtonWasPushed(lightSlot);

        remoteControl.setCommand(garageSlot, garageOpen, garageClose);
        remoteControl.onButtonWasPushed(garageSlot);
    }
}
