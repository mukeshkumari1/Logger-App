package src.main.java;

import src.main.java.controller.LoggerHandler;
import src.main.java.service.ErrorLogHandler;
import src.main.java.service.InfoLogHandler;
import src.main.java.service.WarnLogHandler;

import static src.main.java.models.LogLevels.*;

public class LoggerAppClient {
    public static void main(String[] args) {


        // info -> warn -> error
        LoggerHandler info = new InfoLogHandler(
                new WarnLogHandler(new ErrorLogHandler(null)));

        info.handleRequest(INFO, "Print INFO");
       // info.handleRequest(WARNING, "Print WARNING");
       // info.handleRequest(ERROR, "Print Error");

    }
}
