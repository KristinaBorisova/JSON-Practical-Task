package com.aubg.TEXT;

import com.aubg.UI.UI_ManagerImplementation;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class Text_ManagerImplementation implements Text_Manager {
    private final UI_ManagerImplementation uiManager = new UI_ManagerImplementation ();
    private String dataFileLocation = "";
    private String reportFileLocation = "";


    @Override
    public void generateReport() throws IOException, ParseException {

        // Call a function specialized in receiving the path to JSON Data File (a command-line argument)
        this.dataFileLocation = uiManager.getPath_JSON_File ();

        //Call a function specialized in receiving the path to JSON Report File (a command-line argument)
        this.reportFileLocation = uiManager.getPath_JSON_File ();

        //Data Structures to hold JSON files infomration
        List<String> JSONfileContent = new ArrayList<String> ();
        List<String> JSONreportFileContent = new ArrayList<String> ();

        //Extract JSON Files content and assign them to the dedicated data structures
        JSONfileContent = getJSONFileContent (dataFileLocation);
        JSONreportFileContent = getJSONFileContent (reportFileLocation);

        //Call CSV Generator function
        // TODO - Complete Method
        generateCSVFile (JSONfileContent, JSONreportFileContent);
    }

    //A Method to read JSON file content and copy it to a dynamic data structure
    private List<String> getJSONFileContent(String filePath) throws IOException, ParseException {
        //Declare a dynamic data structure to hold file information
        List<String> fileContent = new ArrayList<String> ();


        //Read JSON file with the help of BufferedReader
        var reader = new BufferedReader (new FileReader (filePath));
        var stringBuilder = new StringBuilder ();
        String line = null;
        String ls = System.getProperty ("line.separator");
        while ((line = reader.readLine ()) != null) {
            stringBuilder.append (line);
            stringBuilder.append (ls);
        }

        // delete the last new line separator
        stringBuilder.deleteCharAt (stringBuilder.length () - 1);
        fileContent.add (stringBuilder.toString ());
        reader.close ();

        String content = stringBuilder.toString ();
        // convert to json array
        JSONArray json = new JSONArray (content);

        //Iterate through JSON Array of objects and print out information about each object
        for (int i = 0; i < json.length (); i++) {
            JSONObject obj = json.getJSONObject (i);
            System.out.println (obj);
        }

        return fileContent;
    }


    //A Method to generate CSV file based on the scraped data from the two JSON files
    private void generateCSVFile(List<String> fileContent1, List<String> filecontent2) {

        //TODO Generate CSV File
        try (PrintWriter writer = new PrintWriter ("report.csv")) {

            StringBuilder sb = new StringBuilder ();
            //Columns required: Name, Score
            sb.append ("Name");
            sb.append (',');
            sb.append ("Score");
            sb.append ('\n');

            writer.write (sb.toString ());
            System.out.println ("CSV report file created!");


            //TODO New Method for Score calculation
            //Score Calculation -  If useExprienceMultiplier is set to true: Score = totalSales/salesPeriod*experienceMultiplier
            //If useExprienceMultiplier is set to false: Score = totalSales/salesPeriod

            //Condition(1): Add only employees that have sales period <= periodLimit property

            //Condition(2) Score is within the top X percent of the results, where X is defined by the top performersTreshold property of the report definition


        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }
    }

}
