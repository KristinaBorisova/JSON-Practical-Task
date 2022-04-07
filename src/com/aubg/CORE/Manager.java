package com.aubg.CORE;

import com.aubg.UI.ConsoleMessages;
import com.aubg.UI.UI_ManagerImplementation;

public class Manager {

    ConsoleMessages msgHelper = new ConsoleMessages ();
    private final UI_ManagerImplementation uiManager = new UI_ManagerImplementation ();

    //Use a zero-parameter constructor to evoke the
    Manager() {
        startProcess ();
    }

    //Create a private void function to make a call to the corresponding functions for completing the process
    private void startProcess() {

        // Print Welcome Message
        msgHelper.welcomeMsg ();

        // Create a function specialized in receiving the path to JSON Data File (a command-line argument)
        String dataLocation = uiManager.getJSON_DataFile_Path ();

        //A variable to hold a command-line argument that is path to JSON Report Definition File
        String reportLocation = uiManager.getJSON_ReportFile_Path ();

        //TODO - extract information for JSON File

        //TODO(3) Generate CSV file:
        //Generate CSV (comma separated value) file containing the report results


    }

}
