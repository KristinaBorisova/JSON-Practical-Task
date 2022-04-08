package com.aubg.UI;

import com.sun.source.tree.Tree;

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class UI_ManagerImplementation implements UI_Manager {

    private final ConsoleMessages msgManager;
    private final Scanner dataFileInput;
    private final Scanner reportFileInput;

    public UI_ManagerImplementation() {
        this.msgManager = new ConsoleMessages ();
        this.dataFileInput = new Scanner (System.in);
        this.reportFileInput = new Scanner (System.in);
    }


    //Implementing interface methods to gwt part to JSON file from user
    //Function aim: Receive a command-line argument that is path to JSON data file (format provided below)
    @Override
    public String getJSON_DataFile_Path() {
        //Display instructions to the user about the required input:
        msgManager.askUserForPath ();
        //Create a variable to hold file location
        //Assign a new value to the string variable - user input
        String fileLocation = dataFileInput.nextLine ();

        while (!validateStringFileName (fileLocation)) {
            try {
                msgManager.printMsg ("Incorrect Data. Please try again!");
                msgManager.askUserForPath ();
                fileLocation = dataFileInput.next ();
            } catch (IllegalFormatException ex) {
                msgManager.printMsg ("Invalid format for '%s' with parameters '%s'. java.util.Formatter Error: %s");
            }
        }

        return fileLocation;
    }


    //build it method to validate file name
    public static boolean validateStringFileName(String filename) {
        Paths.get (filename);
        return true;
    }

    @Override
    public String getJSON_ReportFile_Path() {
        //Display instructions to the user about the required input:
        msgManager.askUserForReportFilePath ();

        //Create a variable to hold file location
        String fileLocation = reportFileInput.next ();

        //TODO Check if the input value is the right format -> try-catch?

        return fileLocation;
    }

}
