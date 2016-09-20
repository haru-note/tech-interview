package com.libqa.pattern.command;

/**
 * @Author : yion
 * @Date : 2016. 9. 21.
 * @Description :
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
