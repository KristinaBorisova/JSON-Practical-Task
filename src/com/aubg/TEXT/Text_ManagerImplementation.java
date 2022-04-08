package com.aubg.TEXT;

import com.aubg.UI.UI_ManagerImplementation;
import java.util.ArrayList;
import java.util.List;

public class Text_ManagerImplementation implements Text_Manager {
    private final UI_ManagerImplementation uiManager = new UI_ManagerImplementation ();

    @Override
    public void generateReport() {

       // Call a function specialized in receiving the path to JSON Data File (a command-line argument)
       String dataFileLocation = uiManager.getJSON_DataFile_Path ();

       //Call a function specialized in receiving the path to JSON Report File (a command-line argument)
       String reportFileLocation = uiManager.getJSON_ReportFile_Path ();

       List<String> JSONfileContent = new ArrayList<String> ();
       List<String> JSONreportFileContent = new ArrayList<String> ();

       //Extract JSON Files content and assign them to the dedicated data structures
        // TODO Complete method
       JSONfileContent = getJSONFileInformation (dataFileLocation);
       JSONreportFileContent = getJSONFileInformation (reportFileLocation);


       //Call CSV Generator function
        // TODO - Complete Method
        generateCSVFile (JSONfileContent, JSONreportFileContent);
   }

    //A Method to read JSON file content and copy it to a dynamic data structure
    private List<String> getJSONFileInformation(String filePath) {
        //Declare a dynamic data structure to hold file information
        List<String> fileContent = new ArrayList<String> ();


        //TODO Pass file path to open the file

        //TODO - Read JSON FILE

        //TODO Copy information to a Str array?

        return fileContent;
    }

    //A Method to generate CSV file based on the scraped data from the two JSON files
    private void generateCSVFile(List<String> fileContent1, List<String> filecontent2) {

        //TODO Generate CSV File

        //TODO Pass Information
    }
}
