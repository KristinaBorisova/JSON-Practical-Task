package com.aubg.CORE;

import com.aubg.TEXT.Text_ManagerImplementation;
import com.aubg.UI.ConsoleMessages;
import com.aubg.UI.UI_ManagerImplementation;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Manager {

    private final ConsoleMessages msgHelper = new ConsoleMessages ();
    private final Text_ManagerImplementation txtManager = new Text_ManagerImplementation ();

    //Use a zero-parameter constructor to evoke the program functionality
    public Manager() throws IOException, ParseException {
        startProcess ();
    }

    //Create a private void function to make a call to the corresponding functions for completing the process
    private void startProcess() throws IOException, ParseException {
        // Print Welcome Message
        msgHelper.welcomeMsg ();

        //Extract information for JSON File and Generate report
        txtManager.generateReport ();
    }
}
