package com.aubg.UI;
//import javax.json.Json;
//import javax.json.JsonArray;
//import javax.json.JsonObject;
//import javax.json.JsonReader;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class UI_ManagerImplementation implements UI_Manager {

    private final ConsoleMessages msgManager;
    private final Scanner userInputDataFile;
    private final Scanner userInputReportFile;

    public UI_ManagerImplementation() {
        this.msgManager = new ConsoleMessages ();
        this.userInputDataFile = new Scanner (System.in);
        this.userInputReportFile = new Scanner (System.in);
    }


    //Implementing interface methods to get part to JSON file from user
    //Function aim: Receive a command-line argument that is path to JSON data file (format provided below)
    @Override
    public String getPath_JSON_File() {
        //Display instructions to the user about the required input:
        msgManager.askUserForPath ();
        //Create a variable to hold file location
        //Assign a new value to the string variable - user input
        String fileLocation = userInputDataFile.nextLine ();


        while (!validateFileLocation (fileLocation)) {
        System.out.print (fileLocation);
            try {
                msgManager.printMsg ("Incorrect Data. Please try again!");
                msgManager.askUserForPath ();
                fileLocation = userInputDataFile.next ();
            } catch (IllegalFormatException ex) {
                msgManager.printMsg ("Invalid format for '%s' with parameters '%s'. java.util.Formatter Error: %s");
            }
        }

        return fileLocation;
    }


    //build it method to validate file name
    public static boolean validateFileLocation(String fileLocation) {
        try {
            Paths.get(fileLocation);
        } catch (InvalidPathException ex) {
            System.out.print("File not found. Please try again!");
            return false;
        }
        return true;
    }




}
