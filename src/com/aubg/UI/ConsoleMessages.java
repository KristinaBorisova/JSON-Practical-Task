package com.aubg.UI;

public class ConsoleMessages {

    // A wrapper function for printing in the console
    public void printMsg(String content) {
        System.out.println (content);
    }

    // A wrapper function for printing in the console
    public void welcomeMsg() {
        System.out.println (":::::Mentormate Challenge::::::\n::Monthly Performance Reports::");
    }

    public void askUserForPath() {
        System.out.print ("Please specify the path to the JSON Data File:");
    }

    public void askUserForReportFilePath() {
        System.out.print ("Please specify the path to the JSON Report File:");
    }
}
