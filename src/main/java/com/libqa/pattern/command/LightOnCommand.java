package com.libqa.pattern.command;

/**
 * @Author : yion
 * @Date : 2016. 9. 21.
 * @Description :
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
