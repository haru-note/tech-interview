package com.libqa.pattern.command;

/**
 * @Author : yion
 * @Date : 2016. 9. 21.
 * @Description :
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

    }
}
