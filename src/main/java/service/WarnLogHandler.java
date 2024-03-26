package src.main.java.service;

import src.main.java.controller.LoggerHandler;
import src.main.java.models.LogLevels;

public class WarnLogHandler extends LoggerHandler {
    LoggerHandler nextLoggerHandler;
    public WarnLogHandler(LoggerHandler nextLoggerHandler){
        super(nextLoggerHandler);
    }
    @Override
    public void handleRequest(LogLevels level, String msg) {
        if (level == LogLevels.WARNING) {
            System.out.println("Warn : " + msg);
        } else {
            nextLoggerHandler.handleRequest(level, msg);
        }
    }
}
