package src.main.java.service;

import src.main.java.controller.LoggerHandler;
import src.main.java.models.LogLevels;

public class InfoLogHandler extends LoggerHandler {
    LoggerHandler nextLoggerHandler;
    public InfoLogHandler(LoggerHandler nextLoggerHandler){
        super(nextLoggerHandler);
    }
    @Override
    public void handleRequest(LogLevels level, String msg) {
        if (level == LogLevels.INFO) {
            System.out.println("Info : " + msg);
        } else {
            nextLoggerHandler.handleRequest(level, msg);
        }
    }

}

