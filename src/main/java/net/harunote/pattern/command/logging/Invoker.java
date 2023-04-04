package net.harunote.pattern.command.logging;

public class Invoker {
    public void executeCommand(Command command) {
        command.execute();
    }
}