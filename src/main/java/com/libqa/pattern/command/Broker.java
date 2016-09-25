package com.libqa.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 9. 25.
 * @Description :
 */
public class Broker {

    private List<Command> commandList = new ArrayList<>();

    public void takeOrder(Command command) {
        commandList.add(command);
    }

    public void placeOrders() {
        for (Command command : commandList) {
            command.execute();
        }

        commandList.clear();
    }

}
