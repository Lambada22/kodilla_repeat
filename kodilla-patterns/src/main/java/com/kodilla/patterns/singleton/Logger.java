package com.kodilla.patterns.singleton;

public class Logger {

   private static final Logger INSTANCE = new Logger();
    private String lastLog = "";

    public Logger() {
    }

    public static Logger getInstance() {
        return INSTANCE;
    }
    public Logger(String lastLog) {
        this.lastLog = lastLog;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}

//public enum Logger {
//public class Logger {
//   // LOG;
//
//    private String lastLog = "";
//    private String nextLog = "Raz, Dwa, Raz!";
//    private String anotherLog = "A Be Ce De";
//
//
//    public Logger(String lastLog, String nextLog, String anotherLog) {
//        this.lastLog = lastLog;
//        this.nextLog = nextLog;
//        this.anotherLog = anotherLog;
//    }
//
//    public Logger() {
//    }
//
//    public void log(String log, String log2, String log3) {
//        lastLog = log;
//        nextLog = log2;
//        anotherLog = log3;
//        System.out.println("Log: [" + log + "]");
//        System.out.println("Log: [" + log + log2 + "]");
//        System.out.println("Log: [" + log + log2 + log3 + "]");
//    }
//
//    public String getLastLog() {
//        return lastLog;
//    }
//
//    public String getNextLog() {
//        return nextLog;
//    }
//
//    public String getAnotherLog() {
//        return anotherLog;
//    }
//}
