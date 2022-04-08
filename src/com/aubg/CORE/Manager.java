package com.aubg.CORE;

import com.aubg.TEXT.Text_ManagerImplementation;
import com.aubg.UI.ConsoleMessages;
import com.aubg.UI.UI_ManagerImplementation;

public class Manager {

    private final ConsoleMessages msgHelper = new ConsoleMessages ();
    private final Text_ManagerImplementation txtManager = new Text_ManagerImplementation ();

    //Use a zero-parameter constructor to evoke the
    public Manager() {
        startProcess ();
    }

    //Create a private void function to make a call to the corresponding functions for completing the process
    private void startProcess() {

        // Print Welcome Message
        msgHelper.welcomeMsg ();

        //Extract information for JSON File and Generate report
        txtManager.generateReport ();

    }

}
