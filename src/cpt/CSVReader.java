package cpt;

import java.io.*;
import java.util.*;

/**
 * This class takes in data from a .csv file and stores the data into an arraylist and a hashmap.
 * @author K.huang
 */


public class CSVReader {

    // Initialize Data Structures
    static HashMap<String, List<Datapoint>> countryData = new HashMap<>();
    static ArrayList<Datapoint> dataSet = new ArrayList<>();
    static ArrayList<String> listCountries = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String filePath = "src\\cpt\\human-development-index-escosura.csv"; // relative path of the .csv file
       
        try (BufferedReader fileRead = new BufferedReader(new FileReader(filePath))) {
            String currentLine = fileRead.readLine();
            currentLine = fileRead.readLine();
            String prevCountry = "";
    
            // Read the .csv line by line with BufferedReader, keep looping until no more data
            while (currentLine != null) {
                String[] values = currentLine.split(","); // seperates the values: name, year etc.
                currentLine = fileRead.readLine(); 
    
                // Assign values to appropriate variable types
                String countryName = values[0];
                String countryCode = values[1];
                int year = Integer.parseInt(values[2]);
                double HIHD = Double.parseDouble(values[3]);
                
                // Create new instance of Datapoint that takes the corresponding values
                Datapoint addDataPoint = new Datapoint(countryName, countryCode, year, HIHD);

                // Add the instance into an arraylist that stores the data
                dataSet.add(addDataPoint);

                // Add the data into hashmap and countryName arraylist
                if (!countryName.equals(prevCountry)) {
                    countryData.putIfAbsent(countryName, new ArrayList<>()); // create a new arraylist for every corresponding country
                    listCountries.add(countryName);
                }
                countryData.get(countryName).add(addDataPoint);
                
            }
            fileRead.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Testing functionality
        System.out.println(countryData.get("Afghanistan"));

       
    }

    
    // Instance variables
    private String dataCollectionName;
    private int size;

    public CSVReader(String theDataCollectionName, int theSize) {
        this.dataCollectionName = theDataCollectionName;
        this.size = theSize;
    }

    public String getDataCollectionName() {
        return dataCollectionName;
    }

    public static int getSize() {
        return countryData.size();
    }

    public static ArrayList<String> getCountryName() {
        return listCountries;
    }


    public static List<Datapoint> getDataSet(String countryName) {
        return countryData.get(countryName);
    }



}


