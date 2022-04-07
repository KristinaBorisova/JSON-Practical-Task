package com.aubg;

public class Manager {

    //Use a zero-parameter constructor to evoke the
    Manager () {
        startProcess ();
    }

    //Create a private void function to make a call to the corresponding functions for completing the process
    private void startProcess() {

        //TODO: Print Welcome msg
        System.out.println("Program Starts here!");
        //...
        //TODO(1) Create a function specialized in receiving the path to JSON data file (a command-line argument)
        //Receive a command-line argument that is path to JSON data file (format provided below)

        //TODO(2) Report definition file function
        //Receive a command-line argument that is path to JSON report definition file

        //TODO(3) Generate CSV file:
        //Generate CSV (comma separated value) file containing the report results


    }

}
