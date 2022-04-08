package com.aubg.TEXT;

import java.util.ArrayList;

public interface Text_Manager {
    //A Method to read JSON file content and copy it to a dynamic data structure
    ArrayList<String> getJSONFileInformation(String filePath);

    //A Method to generate CSV file based on the scraped data from the two JSON files
    void generateCSVFile(ArrayList<String> jsonData, ArrayList<String> jsonReport);
}
