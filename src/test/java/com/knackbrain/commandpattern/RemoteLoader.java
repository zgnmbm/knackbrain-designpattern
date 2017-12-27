package com.knackbrain.commandpattern;

import com.knackbrain.commandpattern.entity.CeilingFan;
import com.knackbrain.commandpattern.entity.GarageDoor;
import com.knackbrain.commandpattern.entity.Light;
import com.knackbrain.commandpattern.entity.Stereo;
import com.knackbrain.commandpattern.service.impl.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RemoteLoader {

    @Test
    public void workingRemote_happyPath_executeAllCommands() {

        final String LIVING_ROOM = "Living room";
        final String KITCHEN = "Kitchen";

        final SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        final Light livingRoomLight = new Light(LIVING_ROOM);
        final Light kitchenLight = new Light(KITCHEN);
        final CeilingFan ceilingFan = new CeilingFan(LIVING_ROOM);
        final GarageDoor garageDoor = new GarageDoor("");
        final Stereo stereo = new Stereo(LIVING_ROOM);

        final LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        final LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        final LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        final LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        final CeilingFanOnCommand ceilingOn =
                new CeilingFanOnCommand(ceilingFan);
        final CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        final GarageDoorOpenCommand garageOpen =
                new GarageDoorOpenCommand(garageDoor);
        final GarageDoorCloseCommand garageDoorClose =
                new GarageDoorCloseCommand(garageDoor);

        final StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        final StereoOffWithCDCommand stereoOffWithCD =
                new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
