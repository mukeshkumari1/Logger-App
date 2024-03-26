package src.main.java.service;

import src.main.java.controller.LoggerHandler;
import src.main.java.models.LogLevels;

public class ErrorLogHandler extends LoggerHandler {
    LoggerHandler nextLoggerHandler;
    public ErrorLogHandler(LoggerHandler nextLoggerHandler){
        super(nextLoggerHandler);
    }
    @Override
    public void handleRequest(LogLevels level, String msg) {
        if (level == LogLevels.ERROR) {
            System.out.println("Error : " + msg);
        } else {
            nextLoggerHandler.handleRequest(level, msg);
        }

    }
}
