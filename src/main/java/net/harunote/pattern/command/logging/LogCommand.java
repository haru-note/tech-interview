package net.harunote.pattern.command.logging;

public class LogCommand implements Command {
    private Logger logger;
    private String message;

    public LogCommand(Logger logger, String message) {
        this.logger = logger;
        this.message = message;
    }

    @Override
    public void execute() {
        logger.log(message);
    }
}