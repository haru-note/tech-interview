package net.harunote.pattern.command.logging;

/**
 * @author CodeVillains
 */
public class LoggerApp {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Command logCommand = new LogCommand(logger, "Hello, World!");
        Invoker invoker = new Invoker();
        invoker.executeCommand(logCommand);
    }
}
