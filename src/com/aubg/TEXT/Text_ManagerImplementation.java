package com.aubg.TEXT;

import java.io.FileReader;
import java.util.ArrayList;

public class Text_ManagerImplementation implements Text_Manager {


    @Override
    public ArrayList<String> getJSONFileInformation(String filePath) {
        //Declare a dynamic data structure to hold file information
        ArrayList<String> fileContent = new ArrayList<String> ();

        //TODO Pass file path to open the file

        //TODO - Read JSON FILE

        //TODO Copy information to a Str array?

        return fileContent;
    }


    @Override
    public void generateCSVFile(ArrayList<String> fileContent1, ArrayList<String> filecontent2) {

        //TODO Generate CSV File

        //TODO Pass Information
    }
}
