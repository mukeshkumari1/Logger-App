package src.main.java.controller;

import src.main.java.models.LogLevels;

public abstract class LoggerHandler {
    LoggerHandler nextLoggerHandler;
    public LoggerHandler(LoggerHandler nextLoggerHandler) {
        this.nextLoggerHandler = nextLoggerHandler;
    }
    public abstract void handleRequest(LogLevels level, String msg);

}
